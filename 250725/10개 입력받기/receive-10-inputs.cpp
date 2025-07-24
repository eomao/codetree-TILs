#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int i, mark = 9;
    int arr[11]; 
    float sum = 0.0;
    for(i = 0; i < 10; i++){
        scanf("%d", &arr[i]);
        sum += arr[i];
        if(arr[i] == 0){
            mark = i-1;
            break;
        }
    }
    printf("%.f %.1f", sum, sum/(mark+1));
    return 0;
}