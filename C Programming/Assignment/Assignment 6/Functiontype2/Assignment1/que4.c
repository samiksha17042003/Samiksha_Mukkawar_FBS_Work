#include <stdio.h>
int vowelcon();

//fun declaration
void main() {
    if(vowelcon()){
         printf("Character is Vowel");
    }else{
         printf("Character is Consonant");
        //calling
}

}
int vowelcon(){//defination
    char ch;
    printf("Enter the character:");
    scanf("%c",&ch);
    
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
       return 1;
    }else{
       return 0;
}
}