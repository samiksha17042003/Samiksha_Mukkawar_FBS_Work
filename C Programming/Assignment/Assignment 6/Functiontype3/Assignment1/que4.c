#include <stdio.h>
int vowelcon(char);

//fun declaration
void main() {
    char ch;
    printf("Enter the character:");
    scanf("%c",&ch);
    int res=vowelcon(ch);
    if(res==1){
         printf("Character is Vowel");
    }else{
         printf("Character is Consonant");
        //calling
}

}
int vowelcon(char ch){//defination
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
       return 1;
    }else{
       return 0;
}
}