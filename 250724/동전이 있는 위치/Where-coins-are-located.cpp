#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int N, M, x, y, row, col, i;
    scanf("%d %d", &N, &M);
    int coin[N*N+1];
    for(i = 0; i < N*N; i++){
        coin[i] = 0;
    }
    for(i = 0; i < M; i++){
        scanf("%d %d", &x, &y);
        coin[(x-1)*N+y-1] = 1;
    }
    for(row = 0; row < N; row++){
        for(col = 0; col < N; col++){
            printf("%d ", coin[row*N + col]);
        }
        printf("\n");
    }
    return 0;
}