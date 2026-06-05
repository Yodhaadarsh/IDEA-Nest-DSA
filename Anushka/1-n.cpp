#include<iostream>
using namespace std;



int number(int n){
    if(n==0)
    return 1;

    number(n-1);
    cout<< n << " ";
}
int main(){
    int n;
    cout<<"enter numb = "<< endl;
    cin>> n;

    number(n);
    return 0;
}
