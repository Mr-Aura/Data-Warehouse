import pymysql as c
def connect():
    con = c.connect(host="localhost",user="root",passwd="gtatcrew786",database="codeitup")
    print(f"Connected to database {con.db.decode()} on host {con.host}")
    return con
def insert(t):
    con = connect()
    cursor = con.cursor()
    query = "INSERT INTO second (id,name,dept,salary) VALUES(%s, %s, %s, %s)"
    print("executing query...")
    cursor.execute(query,t)
    con.commit()
    print("Inserted successfully.")
    con.close()
def read():
    con = connect()
    cursor = con.cursor()
    query = "SELECT * FROM second"
    cursor.execute(query)
    data = cursor.fetchall()
    for i in data:
        print(i)
def delete(ID):
    con = connect()
    cursor = con.cursor()
    query = "DELETE FROM second WHERE id = %s"
    cursor.execute(query,ID)
    con.commit()
    print("Data deleted successfully.")
    con.close()
def update(t):
    con = connect()
    cursor = con.cursor()
    query = "UPDATE second SET name = %s,dept = %s,salary = %s WHERE id = %s"
    cursor.execute(query,t)
    con.commit()
    print("Data updated successfully.")
    con.close()
# t = (102,"James","IT","70000")    
# insert(t)    
# delete(102)
# t = ("Joker","Villain","20000",102)
# update(t)
read()