#include <iostream>
using namespace std;

int main() {
    int weight = 13;
    double gravity = 0.165;

    cout << weight << " * ";

    cout << fixed;
    
    cout.precision(6);
    cout << gravity << " = " << weight * gravity;

    return 0;
}