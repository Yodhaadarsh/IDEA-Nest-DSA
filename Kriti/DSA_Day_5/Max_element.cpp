#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {12, 45, 8, 67, 23};

    int maximum = arr[0];

    for(int i = 1; i < 5; i++)
    {
        if(arr[i] > maximum)
        {
            maximum = arr[i];
        }
    }

    cout << "Maximum Element = " << maximum;

    return 0;
}
// Time Complexity: O(n)
// Space Complexity: O(1)
