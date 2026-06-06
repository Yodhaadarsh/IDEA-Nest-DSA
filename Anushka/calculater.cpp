#include<iostream>
using namespace std;
int main(){

double num1;
double num2;
char op;
cout<<"Enter num1= "<<endl;
cin>>num1;

cout<<"Enter num2= "<<endl;
cin>>num2;

cout<<"Enter operator= "<<endl;
cin>>op;

switch (op){
    case '+':
    cout<<"Result= "<<num1+num2;
    break;

    case '-':
    cout<<"Result= "<<num1-num2;
    break;

    
    case '*':
    cout<<"Result= "<<num1*num2;
    break;


    case '/':
    if(num2 !=0)
    cout<<"Result= "<<num1/num2;
    else
    cout<<"not possible"<<endl;

    break;




default:
cout<<"invalid op"<<endl;
}


    return 0;
}