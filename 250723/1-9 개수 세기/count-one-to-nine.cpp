#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int arr[10];
    int N, num, i;
    scanf("%d", &N);
    for(i = 0; i < 10; i++){
        arr[i] = 0;
    }
    for(i = 0; i < N; i++){
        scanf("%d", &num);
        arr[num-1]++;
    }
    for(i = 0; i < 9; i++){
        printf("%d\n", arr[i]);
    }
    return 0;
}