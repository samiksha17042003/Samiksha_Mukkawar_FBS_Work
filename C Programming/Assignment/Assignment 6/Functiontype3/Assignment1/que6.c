#include <stdio.h>
int UpperLower(char);

//fun declaration
void main() {
//calling
    char ch;
    printf("Enter the Character:");
    scanf("%c",&ch);
    int res=UpperLower(ch);
    if(res==1){
        printf("The character is Uppercase");
    }else{
         printf("The character is Lowercase");
}
}
int UpperLower(char ch){//defination
    char ch;
    printf("Enter the Character:");
    scanf("%c",&ch);
    
    if(ch>='A'&&ch<='Z'){
        return 1;
    }else{
        return 0;
}
}