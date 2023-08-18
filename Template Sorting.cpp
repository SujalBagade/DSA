#include<iostream>
using namespace std;
int n;
#define size 10
template <class T>
void sel(T A[size])
{
    int i,j,min;
    T temp;
    for(i=0;i<n-1;i++)
    {
        min=i;
        for(j=i+1;j<n;j++){
            if(A[j]<A[min]){
                min=j;
            }
        }
        temp=A[i];
        A[i]=A[min];
        A[min]=temp;
    }
    cout<<"Sorted Array is:"<<endl;
    for(i=0;i<n;i++)
    {
        cout<<" "<<A[i];
    }
    cout<<"\n";
}
int main()
{
    int A[size],i,ch;
    float B[size];
    do
    {
        cout<<"Switch Case"<<endl;
        cout<<"1. Integer"<<endl;
        cout<<"2. Float"<<endl;
        cout<<"3. Exit"<<endl;
        cout<<"Enter Choice"<<endl;
        cin>>ch;
        switch(ch)
        {
            case 1:
                cout<<"Enter amount of integer values"<<endl;
                cin>>n;
                cout<<"Enter integer values"<<endl;
                for(i=0;i<n;i++){
                    cin>>A[i];
                }
                sel(A);
                break;
            case 2:
                cout<<"Enter Float Values"<<endl;
                for(i=0;i<n;i++){
                    cin>>B[i];
                }
                sel(B);
                break;
            case 3:
                exit(0);

        }   
    }while(ch!=3);
    return 0;
}
