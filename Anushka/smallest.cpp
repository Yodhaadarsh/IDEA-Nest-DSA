#include<iostream>
using namespace std;
int main(){

int arr[5]= {10, 2, 5, 60, 3};

int smallest = arr[0];

for(int i=1; i< 5; i++){
    if(arr[i]<smallest){
        smallest = arr[i];
    }

}

cout << "largest = "<< smallest << endl;

    return 0;
}