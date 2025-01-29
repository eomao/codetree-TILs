#include <stdio.h>

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    int a[n*m], b[n*m], num[n*m];
    for(int row = 0; row < n; row++){
        for(int col = 0; col < m; col++){
            scanf("%d", &a[row*m + col]);
        }
    }
    for(int row = 0; row < n; row++){
        for(int col = 0; col < m; col++){
            scanf("%d", &b[row*m + col]);
        }
    }
    for(int row = 0; row < n; row++){
        for(int col = 0; col < m; col++){
            num[row*m + col] = !(a[row*m + col]==b[row*m + col]);
            printf("%d ", num[row*m + col]);
        }
        printf("\n");
    }

    // Please write your code here.
    return 0;
}