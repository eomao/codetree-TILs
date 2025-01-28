#include <stdio.h>

int main() {
    int n, cnt = 0;
    scanf("%d", &n);
    int num[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &num[i]);
        if(num[i] == 2){
            cnt++;
            if(cnt == 3){
                printf("%d", i+1);
                break;
            }
        }
        
    }
    // Please write your code here.
    return 0;
}