#include<iostream>
using namespace std;
int main(){

int arr[5]= {1, 2, 3,4};

int sum = 0;

for(int i=0; i<=3; i++){
    sum = sum + arr[i];
}
cout<< "sum =" << sum << endl;
    return 0;
}