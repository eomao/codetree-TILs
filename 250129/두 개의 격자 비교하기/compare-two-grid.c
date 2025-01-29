#include <stdio.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int a[n*m], b[n*m], num[n*m];
    for(int row = 0; row < n; row++){
        for(int col = 0; col < m; col++){
            scanf("%d", &a[row*4 + col]);
        }
    }
    for(int row = 0; row < n; row++){
        for(int col = 0; col < m; col++){
            scanf("%d", &b[row*4 + col]);
        }
    }
    for(int row = 0; row < n; row++){
        for(int col = 0; col < m; col++){
            num[row*4 + col] = !(a[row*4 + col]==b[row*4 + col]);
            printf("%d ", num[row*4 + col]);
        }
        printf("\n");
    }

    // Please write your code here.
    return 0;
}