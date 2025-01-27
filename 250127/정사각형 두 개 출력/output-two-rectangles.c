#include <stdio.h>

int main() {
    int n, row, col;
    scanf("%d", &n);
    row = n;
    col = n;
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            printf("*");
        }
        printf("\n");
    }
    printf("\n");
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            printf("*");
        }
        printf("\n");
    }

    // Please write your code here.
    return 0;
}