#include <iostream>
using namespace std;

int factorial(int n)
{
    if(n == 0 || n == 1)
    {
        return 1;
    }

    return n * factorial(n - 1);
}

int main()
{
    int n;

    cout << "Enter a number: ";
    cin >> n;

    cout << "Factorial = " << factorial(n);

    return 0;
}
// Time Complexity: O(n) where n is the input number for which we are calculating the factorial.
// Space Complexity: O(n) due to the recursive call stack used for calculating the factorial.
