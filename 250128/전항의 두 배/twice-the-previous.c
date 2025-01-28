#include <stdio.h>

int main() {
    int num[10];
    scanf("%d %d", &num[0], &num[1]);
    printf("%d %d ", num[0], num[1]);
    for(int i = 2; i < 10; i++){
        num[i] = num[i-1] + num[i-2]*2;
        printf("%d ", num[i]);
    }
    // Please write your code here.
    return 0;
}