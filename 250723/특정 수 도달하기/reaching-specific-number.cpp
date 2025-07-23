#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int num, sum = 0, i;
    float avg, cnt = 0;
    for(i = 0; i < 10; i++){
        scanf("%d", &num);
        if(num >= 250){
            break;
        }
        sum += num;
        cnt++;
    }
    avg = sum/cnt;
    printf("%d %.1f", sum, avg);
    return 0;
}