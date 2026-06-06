#include<iostream>
using namespace std;
int main(){

int arr[5]= {10, 2, 5, 60, 3};

int largest = arr[0];

for(int i=1; i< 5; i++){
    if(arr[i]>largest){
        largest = arr[i];
    }

}

cout << "largest = "<< largest << endl;

    return 0;
}