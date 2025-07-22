#include <iostream>
using namespace std;

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    if(a>=b){
        printf("%d", a-b);
    }else{
        printf("%d", b-a);
    }
    // Please write your code here.
    return 0;
}