#include <stdio.h>

int main() {
    int age, test = 0;
    char gender;
    for(int i = 0; i < 2; i++){
        scanf("%d %c", &age, &gender);
        if(age >= 19 && gender == 'M'){
            test = 1;
        }
    }
    printf("%d", test);
    // Please write your code here.
    return 0;
}