#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            printf("*");
        }
        printf("\n");
        printf("\n");
    }
    for(int i = n-1; i > 0; i--){
        for(int j = i; j > 0; j--){
            printf("*");
        }
        printf("\n");
        printf("\n");
    }

    // Please write your code here.
    return 0;
}