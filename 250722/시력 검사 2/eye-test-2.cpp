#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    float a;
    scanf("%f", &a);
    if(a >= 1.0){
        printf("High");
    }else if(a >= 0.5){
        printf("Middle");
    }else{
        printf("Low");
    }
    return 0;
}