#include<iostream>
using namespace std;
class complex
{
    public:
        float real,img;
    complex()
    {
        real=0;
        img=0;
    }
    complex operator + (complex);
    complex operator * (complex);
    friend ostream & operator << (ostream &,complex &);
    friend istream & operator >> (istream &,complex &);
};
istream & operator >> (istream & is,complex & obj)
{
    is>>obj.real;
    is>>obj.img;
    return is;
}
ostream & operator << (ostream & outt,complex & obj)
{
    outt<<""<<obj.real;
    outt<<"+"<<obj.img<<"i";
    return outt;
}
complex complex::operator + (complex obj)
{
    complex temp;
    temp.real=real+obj.real;
    temp.img=img+obj .img;
    return(temp);
}
complex complex::operator * (complex obj)
{
    complex temp;
    temp.real=real*obj.real-img*obj.img;
    temp.img=real*obj.img+obj.real*img;
    return temp;
}
int main()
{
    complex a,b,c,d;
    cout<<"Enter First Number for the complex progression"<<endl;
    cin>>a;
    cout<<"Enter Second number for the complex progression"<<endl;
    cin>>b;
    c=a+b;
    d=a*b;
    cout<<"Addition of the two complex progressions is:"<<endl;
    cout<<c<<endl;
    cout<<"Multiplication of the two complex progression is:"<<endl;
    cout<<d<<endl;
    return 0;
}
