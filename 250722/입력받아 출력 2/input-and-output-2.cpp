#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    char s[15];
    scanf("%14s", s);
    int i;
    for(i = 0; s[i]!='\0'; i++){
        if(s[i] != '-'){
            printf("%d", s[i]-'0');
        }
    }
    return 0;
}