#include <stdio.h>

int main() {
    int n, row, col = 1;
    scanf("%d", &n);
    row = n;
    for(int i = 0; i < row; i++){
        for(int j = 0; j < col; j++){
            printf("*");
        }
        printf("\n");
        col += 2;
    }

    // Please write your code here.
    return 0;
}