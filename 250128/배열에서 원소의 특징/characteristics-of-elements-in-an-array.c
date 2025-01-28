#include <stdio.h>

int main() {
    int num[10];
    for(int i = 0; i < 10; i++){
        scanf("%d", &num[i]);
        if(num[i]%3 == 0){
            printf("%d", num[i-1]);
            break;
        }
    }

    // Please write your code here.
    return 0;
}