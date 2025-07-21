#include <iostream>
using namespace std;

int main() {
    int M;
    scanf("%d", &M);
    // Please write your code here.
    if((M >= 3)&&(M <= 5)){
        printf("Spring\n");
    }else if((M >= 6)&&(M <= 8)){
        printf("Summer\n");
    }else if((M >= 9)&&(M <= 11)){
        printf("Fall\n");
    }else{
        printf("Winter\n");
    }
    return 0;
}