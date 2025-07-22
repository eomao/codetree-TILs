#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    float a, b;
    scanf("%f", &a);
    scanf("%f", &b);
    if(a >= 1.0){
        if(b >= 1.0){
            printf("High");
        }else if(b >= 0.5){
            printf("Middle");
        }else{
            printf("Low");
        }
    }else if(a >= 0.5){
        if(b >= 0.5){
            printf("Middle");
        }else{
            printf("Low");
        }
    }else{
        printf("Low");
    }
    return 0;
}