#include<iostream>
using namespace std;

long long power(int base, int exponent){
    if(exponent==0)
    return 1;
    return base * power(base, exponent-1);
}
int main(){

int base, exponent;
cout<< "enter base and exponent = "<<endl;
cin>> base>> exponent;

cout<<"result ="<<power(base, exponent);

    return 0;
}