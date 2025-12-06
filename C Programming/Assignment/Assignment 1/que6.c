#include <stdio.h>
void main() {
    char ch;
    printf("Enter the Character:");
    scanf("%c",&ch);
    
    if(ch>='A'&&ch<='Z'){
        printf("The character %c is Uppercase",ch);
    }else{
         printf("The character %c is Lowercase",ch);
        }
}