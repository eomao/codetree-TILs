#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int N, M, cnt = 1, row, col;
    scanf("%d %d", &N, &M);
    for(row = 0; row < N; row++){
        for(col = 0; col < M; col++){
            printf("%d ", cnt);
            cnt++;
        }
        printf("\n");
    }

    return 0;
}