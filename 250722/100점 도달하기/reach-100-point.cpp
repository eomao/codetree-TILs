#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int N, i;
    scanf("%d", &N);
    for(i = N; i <= 100; i++){
        if(i >= 90){
            printf("A ");
        }else if(i >= 80){
            printf("B ");
        }else if(i >= 70){
            printf("C ");
        }else if(i >= 60){
            printf("D ");
        }else{
            printf("F ");
        }
    }
    return 0;
}