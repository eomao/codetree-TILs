#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int arr[11];
    int mark = 9, i;
    for(i = 0; i < 10; i++){
        scanf("%d", &arr[i]);
        if(arr[i] == 0){
            mark = i-1;
            break;
        }
    }
    for(i = mark; i >= 0; i--){
        printf("%d ", arr[i]);
    }
    return 0;
}