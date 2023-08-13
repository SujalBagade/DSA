#include<iostream>
#include<stdio.h>
using namespace std;
class publications
{
    private:
        string title;
        float price;
    public:
        void add()
        {
            cout<<"\nEnter Publication information"<<endl;
            cout<<"Enter tittle of publication:";
            cin.ignore();
            getline(cin,title);
            cout<<"Enter Price of Publication";
            cin>>price;
        }
        void display()
        {
            cout<<"\n";
            cout<<"\nTitle of Publication:"<<title;
            cout<<"\nPublication price:"<<price;  
        }
};
class book:public publications
{
    private: int page_count;
    public: void add_book()
    {
        try{
            add();
            cout<<"Enter Page Count of Book:";
            cin>>page_count;
            if(page_count<=0){
                throw page_count;
            }
        } catch(...){
            cout<<"\nInvalid Page Count!!!";
            page_count=0;
        }
    }
    void display_book(){
        display();
        cout<<"\nPage Count:"<<page_count;
        cout<<"\n";
    }
};
class tape:public publications
{
    private:float play_time;
    public:void add_tape(){
        try{
            add();
            cout<<"Enter Play Duration of the tape:";
            cin>>play_time;
            if(play_time<=0)
                throw play_time;
        }catch(...){
            cout<<"\nInvalid Play Time!!!";
            play_time=0;
        }
    }
    void display_tape()
    {
        display();
        cout<<"\nPlay time:"<<play_time<<" min";
        cout<<"\n";
    }
};
int main()
{
    book b1[10];
    tape t1[10];
    int ch,b_count=0,t_count=0;
    do{
        cout<<"\nPDS";
        cout<<"\n1 ADD INFO TO BOOKS";
        cout<<"\n2.ADD INFO TO TAPES";
        cout<<"\n3.DISPLAY BOOK INFO";
        cout<<"\n4.DISPLAY TAPE INFO";
        cout<<"\n5.EXIT";
        cout<<"\n\nENTER YOUR CHOICE:";
        cin>>ch;
        switch(ch){
            case 1:
                b1[b_count].add_book();
                b_count++;
                break;
            case 2:
                t1[t_count].add_tape();
                t_count++;
                break;
            case 3:
                cout<<"\nBPD";
                for(int j=0;j<b_count;j++){
                    b1[j].display_book();

                }
                break;
            case 4:
                cout<<"\nTPDS";
                for(int j=0;j<t_count;j++){
                    t1[j].display_tape();
                }
                break;
            case 5:
                exit(0);
        }
    }while(ch !=5);
        return 0;
}
