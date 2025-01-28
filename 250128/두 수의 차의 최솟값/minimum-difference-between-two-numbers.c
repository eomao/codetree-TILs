#include <stdio.h>

int main() {
    int n, min = 100;
    scanf("%d", &n);
    int num[n];
    for(int i = 0; i < n; i++){
        scanf("%d", &num[i]);
    }
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(num[i] > num[j]){
                if(num[i] - num[j] < min){
                    min = num[i] - num[j];
                }
            }else{
                if(num[j] - num[i] < min){
                    min = num[j] - num[i];
                }
            }
        }
    }
    printf("%d", min);
    // Please write your code here.
    return 0;
}