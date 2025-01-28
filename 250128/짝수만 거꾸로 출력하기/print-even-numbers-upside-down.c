#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int num[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &num[i]);
    }
    for(int j = 0; j < n; j++){
        if(num[n-j-1]%2 == 0){
            printf("%d ", num[n-j-1]);
        }
    }
    // Please write your code here.
    return 0;
}