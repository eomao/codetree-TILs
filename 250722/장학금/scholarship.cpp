#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int mid, fin;
    scanf("%d %d", &mid, &fin);
    if(mid >= 90){
        if(fin >= 95){
            printf("100000");
        }else if(fin >= 90){
            printf("50000");
        }else{
            printf("0");
        }
    }else{
        printf("0");
    }
    return 0;
}