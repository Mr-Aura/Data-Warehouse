#include <iostream>
#include <vector>
#include <fstream>
using namespace std;
class To_do_list{

char file_handling_choice;
vector<string> tasks;
string task;

void add_task(){
cout<<"Please enter Task Description: ";
cin.ignore();
getline(cin,task);
tasks.push_back(task);
cout<<"Task added successfully!";
cout<<"\n\nPlease press enter to continue...";
cin.get();
system("cls");
}

void view_task(){
if (tasks.size()==0){
cout<<"No tasks have been added yet!";
cout<<"\n\nPlease press enter to continue...";
cin.ignore();
cin.get();
system("cls");
}
else{
cout<<"Following are the tasks that you have added so far:\n\n";
for(int i = 0;i<tasks.size();i++){
    cout<<(i+1)<<"] "<<tasks[i]<<endl;
}
cout<<"\n\nPlease press enter to continue...";
cin.ignore();
cin.get();
system("cls");
}
}

void mark_task_as_done(){
if(tasks.size()==0){
cout<<"No tasks have been added yet!";
cout<<"\n\nPlease press enter to continue...";
cin.ignore();
cin.get();
system("cls");
}
else{
cout<<"Following are the tasks that you have added so far:\n\n";
for(int i = 0;i<tasks.size();i++){
    cout<<(i+1)<<"] "<<tasks[i]<<endl;
}
    int task_number;
    cout << "\n\nPlease enter the task number that you have completed (1 to " << tasks.size() << "): ";
    cin >> task_number;

    if (task_number < 1 || task_number > tasks.size()) {
        cout << "Invalid task number!";
    } else {
        tasks.erase(tasks.begin() + task_number - 1);
        cout << "Congratulations on completing the Task!";
    }
    cout << "\n\nPlease press enter to continue...";
    cin.ignore();
    cin.get();
    system("cls");
}
}

void delete_task(){
if (tasks.size() == 0) {
        cout << "No tasks to delete!";
        cout << "\n\nPlease press enter to continue...";
        cin.ignore();
        cin.get();
        system("cls");
    }
    cout<<"Your Tasks are:\n";
    for(int i = 0;i<tasks.size();i++){
    cout<<(i+1)<<"] "<<tasks[i]<<endl;
    }
    int task_number;
    cout << "\n\nPlease enter the task number to delete (1 to " << tasks.size() << "): ";
    cin >> task_number;

    if (task_number < 1 || task_number > tasks.size()) {
        cout << "Invalid task number!";
    } else {
        tasks.erase(tasks.begin() + task_number - 1);
        cout << "Task deleted successfully!";
    }
    cout << "\n\nPlease press enter to continue...";
    cin.ignore();
    cin.get();
    system("cls");
}

void save_tasks(){
    cout<<"Before you exit, Would you like your tasks to be saved? ";
    cout<<"If yes then please press 'y' , If not then please press 'n' \n";
    cout<<"Your choice: ";
    cin.ignore();
    cin>>file_handling_choice;
    if (file_handling_choice != 'y' && file_handling_choice != 'n' && file_handling_choice != 'N' && file_handling_choice != 'Y'){
    cout<<"Invalid input. Please try again.";
    }
    else{
    ofstream obj;
    obj.open("tasks.txt");
    for(string i : tasks){
    obj << i <<endl;
    }
    obj.close();
    cout<<"Thank you for using our To-do list! Have a great day!";
    exit(0);
    }
}
void read_tasks_file() {
        ifstream obj("tasks.txt");
        if (obj.is_open()) {
            string line;
            while (getline(obj, line)) {
                tasks.push_back(line);
            }
            obj.close();
        }
}
public:

void choice(){
int user_choice;
read_tasks_file();
while(true){
cout<<"\nWelcome To Your To-Do List!\n";
cout<<"1. Add Task\n";
cout<<"2. View Tasks\n";
cout<<"3. Mark Task as Done\n";
cout<<"4. Delete Task\n";
cout<<"5. Exit\n\n";
cout<<"Please enter your choice: ";
cin>>user_choice;
switch(user_choice){
    case 1:
    add_task();
    break;
    case 2:
    view_task();
    break;
    case 3:
    mark_task_as_done();
    break;
    case 4:
    delete_task();
    break;
    case 5:
    save_tasks();
    break;
    default:
    cout<<"Invalid input. Please try again.\n";
}
}
}
};

int main(){
To_do_list obj;
obj.choice();
}