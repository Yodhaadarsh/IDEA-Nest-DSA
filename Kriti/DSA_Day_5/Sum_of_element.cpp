#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {10, 20, 30, 40, 50};

    int sum = 0;

    for(int i = 0; i < 5; i++)
    {
        sum += arr[i];
    }

    cout << "Sum = " << sum;

    return 0;
}
// Time Complexity: O(n) where n is the number of elements in the array.
// Space Complexity: O(1) as we are using only a constant amount of extra space for the sum variable.