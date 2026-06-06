#include <iostream>
using namespace std;

int main()
{
    int n;

    cout << "Enter value of n: ";
    cin >> n;

    for(int i = 1; i <= n; i++)
    {
        for(int j = 1; j <= n; j++)
        {
            cout << "* ";
        }

        cout << endl;
    }

    return 0;
}
// Time Complexity: O(n^2) as we have two nested loops each running n times.
// Space Complexity: O(1) as we are using only a constant amount of extra space