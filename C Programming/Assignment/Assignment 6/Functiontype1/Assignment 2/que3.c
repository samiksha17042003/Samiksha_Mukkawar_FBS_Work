#include <stdio.h>
void Greater();//function declaration
void main(){
     Greater();//function call
}
    void Greater(){//function defination
    int n1,n2,n3;
    printf("Enter the numbers:");
    scanf("%d %d %d",&n1,&n2,&n3);
    if(n1>n2){
        if(n1>n3){
            printf("%d is greatest",n1);
        }
        else{
            printf("%d is greatest",n3);
        }
    }
    else{
        if(n2>n3){
            printf("%d is greatest",n2);
        }
        else{
            printf("%d is greatest",n3);
        }

    }
    }