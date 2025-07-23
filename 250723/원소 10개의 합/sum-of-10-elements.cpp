#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int sum = 0, i, num;
    for(i = 0; i < 10;i++){
        scanf("%d", &num);
        sum += num;
    }
    printf("%d", sum);
    return 0;
}