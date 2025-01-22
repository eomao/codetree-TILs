#include <stdio.h>

int main() {
    int a, b, c;
    a = 1;
    b = 2;
    c = 3;
    a += b;
    a += c;
    b = a;
    c = a;
    printf("%d %d %d", a, b, c);
    // Please write your code here.
    return 0;
}