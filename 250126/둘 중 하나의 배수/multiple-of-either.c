#include <stdio.h>

int main() {
    int a, x;
    scanf("%d", &a);
    if(a%3 == 0|| a%5 == 0){
        x = 1;
    }else{
        x = 0;
    }
    printf("%d", x);
    // Please write your code here.
    return 0;
}