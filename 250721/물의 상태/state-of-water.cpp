#include <iostream>
using namespace std;

int main() {
    int n;
    // Please write your code here.
    scanf("%d", &n);
    if(n >= 100){
        printf("vapor");
    }else if(n < 0){
        printf("ice");
    }else{
        printf("water");
    }
    return 0;
}