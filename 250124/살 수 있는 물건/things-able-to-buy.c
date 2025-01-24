#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    char *ex;

    if(n>= 3000){
        ex = "book";
    }else if(n >= 1000){
        ex = "mask";
    }else{
        ex = "no";
    }
    printf("%s", ex);
    // Please write your code here.
    return 0;
}