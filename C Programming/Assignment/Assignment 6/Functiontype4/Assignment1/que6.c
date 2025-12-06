#include <stdio.h>
void UpperLower();

//fun declaration
void main() {
    UpperLower();//calling
}
void UpperLower(){//defination
    char ch;
    printf("Enter the Character:");
    scanf("%c",&ch);
    
    if(ch>='A'&&ch<='Z'){
        printf("The character %c is Uppercase",ch);
    }else{
         printf("The character %c is Lowercase",ch);
}
}