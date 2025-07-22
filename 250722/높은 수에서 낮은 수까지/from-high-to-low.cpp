#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int A, B, i;
    scanf("%d %d", &A, &B);
    if(A >= B){
        for(i = A; i >= B; i--){
            printf("%d ", i);
        }
    }else{
        for(i = B; i >= A; i--){
            printf("%d ", i);
        }
    }
    return 0;
}