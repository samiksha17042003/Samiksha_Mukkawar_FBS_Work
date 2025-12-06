#include <stdio.h>
int UpperLower();

//fun declaration
void main() {
//calling
if(UpperLower()){
        printf("The character is Uppercase");
    }else{
         printf("The character is Lowercase");
}
}
int UpperLower(){//defination
    char ch;
    printf("Enter the Character:");
    scanf("%c",&ch);
    
    if(ch>='A'&&ch<='Z'){
        return 1;
    }else{
        return 0;
}
}