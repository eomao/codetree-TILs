#include <iostream>
using namespace std;

int main() {
    int N;
    // Please write your code here.
    scanf("%d", &N);
    if(N >= 80){
        printf("pass");
    }else{
        printf("%d more score", 80-N);
    }
    return 0;
}