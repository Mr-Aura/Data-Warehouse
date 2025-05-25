import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.neighbors import NearestNeighbors

file_path = "movies.csv"
df = pd.read_csv(file_path)

df['combined_features'] = df['Title'] + " " + df['Genre']

vectorizer = TfidfVectorizer(stop_words='english')
tfidf_matrix = vectorizer.fit_transform(df['combined_features'])


nn_model = NearestNeighbors(metric='cosine', algorithm='brute')
nn_model.fit(tfidf_matrix)

def recommend_movie(input_title, input_genre, n_recommendations=10):
    query_text = input_title + " " + input_genre
    
    mask = df['Title'].str.lower() == input_title.lower()
    if mask.any():
        query_index = df[mask].index[0]
        query_vector = tfidf_matrix[query_index]
    else:
        query_vector = vectorizer.transform([query_text])
    
    distances, indices = nn_model.kneighbors(query_vector, n_neighbors=n_recommendations+1)
    recommended_indices = indices.flatten().tolist()
    
    if mask.any() and query_index in recommended_indices:
        recommended_indices.remove(query_index)
    
    recommended_movies = df.iloc[recommended_indices][['Title', 'Rating']]
    
    return recommended_movies[:n_recommendations]

def plot_recommendations(recommendations):
    plt.figure(figsize=(10, 5))
    sns.barplot(y=recommendations['Title'], x=recommendations['Rating'], palette='viridis')
    plt.xlabel("IMDb Rating")
    plt.ylabel("Movie Title")
    plt.title("Recommended Movies")
    plt.xlim(0, 10)  
    plt.show()
print("        MOVIE RECOMMENDATION SYSTEM") 
print("-----------------------------------------------")
input_title = input("Enter a movie you like: ")
print("----------------------------------------------------------")
input_genre = input("Enter a genre (or multiple genres separated by commas): ")
print("-----------------------------------------------")


recommendations = recommend_movie(input_title, input_genre)

output_choice = input("\nDo you want to see recommendations as (1) Text or (2) Graph? Enter 1 or 2: ")
print("-----------------------------------------------")

if output_choice == "1":
    print("\nRecommended movies:")
    print("-----------------------------------------------")
    for index, row in recommendations.iterrows():
        print(f"{row['Title']} (Rating: {row['Rating']})")
elif output_choice == "2":
    plot_recommendations(recommendations)
else:
    print("\nInvalid choice! Showing text output by default.")
    for index, row in recommendations.iterrows():
        print(f"{row['Title']} (Rating: {row['Rating']})")
print("-----------------------------------------------")