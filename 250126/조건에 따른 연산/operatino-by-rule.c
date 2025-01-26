#include <stdio.h>

int main() {
    int n, cnt = 0;
    scanf("%d", &n);
    while(n<1000){
        if(n%2 == 0){
                n *= 3;
                n += 1;
                cnt++;

        }else{
                n *= 2;
                n += 2;
                cnt++;

        }
    }
    printf("%d", cnt);
    // Please write your code here.
    return 0;
}