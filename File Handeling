#include<iostream>
#include<fstream>
using namespace std;
class employee
{
    string name;
    int id;
    double salary;
    public:
        void accept()
        {
            cout<<"\nEnter Name";
            cin.ignore();
            getline(cin,name);
            cout<<"\nEnter ID";
            cin>>id;
            cout<<"\nEnter Salary";
            cin>>salary;
        }
        void display()
        {
            cout<<"Name of the employee is"<<name<<endl;
            cout<<"ID of the employee is"<<id<<endl;
            cout<<"salary of the employee is"<<salary<<endl;
        }
};
int main()
{
    int i,n;
    employee o[5];
    fstream f;
    f.open("demo.txt",ios::out);
    cout<<"Enter number of employee you want to store in the created file"<<endl;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cout<<"Enter information of the employee you want to store in the file"<<i+1<<"\n";
        o[i].accept();
        f.write((char*)&o[i],sizeof o[i]);
    }
    f.close();
    f.open("demo.txt",ios::in);
    cout<<"Information of the employee stored in the file is:"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<"\nEmployee no."<<i+1;
        f.write((char*)&o[i],sizeof o[i]);
        o[i].display();
    }
    f.close();
    return 0;
}
