#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    if(a%2 == 0){
        for(int i = a+1; i <= b; i += 2){
            printf("%d ", i);
        }
    }else{
        for(int i = a; i <= b; i += 2){
            printf("%d ", i);
        }
    }
    // Please write your code here.
    return 0;
}