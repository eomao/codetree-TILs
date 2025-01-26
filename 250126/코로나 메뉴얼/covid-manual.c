#include <stdio.h>

int main() {
    int temp;
    static int cnt = 0;
    char symp;
    for(int i = 0; i < 3; i++){
        scanf("%c %d\n", &symp, &temp);
        if(symp == 'Y'&& temp >= 37){
            cnt++;
        }
    }
    if(cnt >= 2){
        printf("E");
    }else{
        printf("N");
    }

    // Please write your code here.
    return 0;
}