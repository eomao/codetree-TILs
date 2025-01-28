#include <stdio.h>

int main() {
    int a, b, sum = 0;
    scanf("%d %d", &a, &b);
    int left[b];
    for(int i = 0; i < b; i++){
        left[i] = 0;
    }
    while(a > 1){
        left[a%b]++;
        a /= b;
    }
    for(int i = 0; i < b; i++){
        sum += left[i]*left[i];
    }
    printf("%d", sum);
    // Please write your code here.
    return 0;
}