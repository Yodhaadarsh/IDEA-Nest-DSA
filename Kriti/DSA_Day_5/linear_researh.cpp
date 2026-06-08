#include <iostream>
using namespace std;

int main()
{
    int arr[5] = {10, 20, 30, 40, 50};
    int key;
    bool found = false;

    cout << "Enter element to search: ";
    cin >> key;

    for(int i = 0; i < 5; i++)
    {
        if(arr[i] == key)
        {
            cout << "Element found at index " << i;
            found = true;
            break;
        }
    }

    if(!found)
    {
        cout << "Element not found";
    }

    return 0;
}
// Time Complexity: O(n)
//Space Complexity: O(1)
