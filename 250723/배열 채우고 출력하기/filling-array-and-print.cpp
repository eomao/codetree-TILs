#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    char arr[11];
    int i;
    for(i = 0; i < 10; i++){
        scanf("%c ", &arr[i]);
    }
    for(i = 9; i >= 0; i--){
        printf("%c", arr[i]);
    }
    return 0;
}