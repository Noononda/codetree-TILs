#include <iostream>
using namespace std;

int main() {
    double a = 5.26;
    double b = 8.27;

    cout << fixed;

    cout.precision(3);
    std::cout << a * b;
    return 0;
}