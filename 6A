#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;
class item
{
    public:
    char name[10];
    int quantity;
    int cost;
    int code;

    bool operator == (const item & i1)
    {
        if(code == i1.code)
        return 1;
        return 0;
    }

    bool operator < (const item & i1)
    {
        if(code < i1.code)
        return 1;
        return 0;
    }
};

vector < item > o1;
void print(item & i1);
void display();
void insert();
void search();
void dlt();

bool compare(const item & i1, const item & i2)
{
    return i1.cost<i2.cost;
}

int main()
{
    int ch;
    do{
        cout<<"\n-------menu------";
        cout<<"\n1.insert";
        cout<<"\n2.display";
        cout<<"\n3.search";
        cout<<"\n4.sort";
        cout<<"\n5.delete";
        cout<<"\n6.exit";
        cout<<"\n\nenter the choice :";
        cin>>ch;

        switch (ch)
        {
            case 1:
            insert();
            break;

            case 2:
            display();
            break;

            case 3:
            search();
            break;

            case 4:
            sort(o1.begin(),o1.end(),compare);
            cout<<"\n\nsorted on cost :";
            display();
            break;

            case 5:
            dlt();
            break;

            case 6:
            exit(0);
        }
    }
    while(ch!=7);
    return 0;
}

void insert()
{
    item i1;
    cout<<"\nenter item name :";
    cin>>i1.name;
    cout<<"\nenter item quantity :";
    cin>>i1.quantity;
    cout<<"\nenter item cost";
    cin>>i1.cost;
    cout<<"\nenter item code :";
    cin>>i1.code;
    o1.push_back(i1);
}

void display(){
    for_each(o1.begin(),o1.end(),print);
}

void print(item & i1) {
    cout<<"\n";
    cout<<"\nitem name :"<<i1.name;
    cout<<"\nitem quantity :"<<i1.quantity;
    cout<<"\nitem cost :"<<i1.cost;
    cout<<"\nitem code :"<<i1.code;
    cout<<"\n";
}

void search()
{
    vector<item> :: iterator p;
    item i1;
    cout<<"\nenter item code to search :";
    cin>>i1.code;
    p=find(o1.begin(), o1.end(),i1);
    if(p==o1.end())
    {
        cout<<"\nnottt foundd!!!";
    }
    else
    {
        cout<<"\nfounddd!!";
    }
}

void dlt()
{
    vector<item>::iterator p;
    item i1;
    cout<<"\nenter item code to delete";
    cin>>i1.code;
    p=find(o1.begin(),o1.end(),i1);
    if(p==o1.end())
    {
        cout<<"\nnot found!!!";
    }
    else{
        o1.erase(p);
        cout<<"\ndeleted!!";
    }
}
