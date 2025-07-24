#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    float grade, avg = 0;
    int i;
    for(i = 0; i < 8; i++){
        scanf("%f", &grade);
        avg += grade;
    }
    printf("%.1f", avg/8);
    return 0;
}