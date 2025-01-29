#include <stdio.h>

int main() {
    int num[16];
    int sum = 0;
    for(int row = 0; row < 4; row++){
        for(int col = 0; col < 4; col++){
            scanf("%d", &num[row*4 + col]); 
        }
    }
    for(int row = 0; row < 4; row++){
        for(int col = 0; col <= row; col++){
            sum += num[row*4 + col];
        }
    }
    printf("%d", sum);
    // Please write your code here.
    return 0;
}