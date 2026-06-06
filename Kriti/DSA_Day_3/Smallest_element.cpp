#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {10, 25, 5, 80, 30};

    int smallest = arr[0];

    for(int i = 1; i < 5; i++)
    {
        if(arr[i] < smallest)
        {
            smallest = arr[i];
        }
    }

    cout << "Smallest = " << smallest;

    return 0;
}