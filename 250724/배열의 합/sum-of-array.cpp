#include <iostream>
using namespace std;

int main() {
    int arr[5] = {0, 0, 0, 0, 0};
    int num, i, j;
    for(i = 0; i < 4; i++){
        for(j = 0; j < 4; j++){
            scanf("%d", &num);
            arr[i] += num;
        }
        printf("%d\n", arr[i]);
    }

    // Please write your code here.
    return 0;
}