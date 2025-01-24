#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);
    char *th, *fi;
    if(a%3 == 0){
        th = "YES";
    }else{
        th = "NO";
    }
    if(a%5 == 0){
        fi = "YES";
    }else{
        fi = "NO";
    }
    printf("%s\n%s", th, fi);
    // Please write your code here.
    return 0;
}