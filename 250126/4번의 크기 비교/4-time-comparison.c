#include <stdio.h>

int main() {
    int a, num[4];
    scanf("%d", &a);
    scanf("%d %d %d %d", &num[0], &num[1], &num[2], &num[3]);
    int result[4];
    for(int i = 0; i < 4; i++){
        if(a > num[i]){
            result[i] = 1;
        }else{
            result[i] = 0;
        }
        printf("%d\n", result[i]);
    }
    // Please write your code here.
    return 0;
}