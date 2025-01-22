#include <stdio.h>

int main() {
    int a, b, c;
    a = 5;
    b = 6;
    c = 7;
    int temp = b;
    b = a;
    a = c;
    c = temp;
    printf("%d\n%d\n%d", a, b, c);
    // Please write your code here.
    return 0;
}