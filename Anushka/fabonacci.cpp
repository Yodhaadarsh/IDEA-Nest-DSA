#include<iostream>
using namespace std;
int fabinaaci(int n){

    if(n==0)
        return 0;
    
    if(n==1)
        return 1;
        return fabinaaci(n-1)+ fabinaaci(n-2);
}



int main(){
int n;
cout<<"enter num = "<<endl;
cin>>n;

for(int i=0; i<n; i++){
    cout<< fabinaaci(i)<<" "<<endl;
}
    
    return 0;
}