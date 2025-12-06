#include <stdio.h>
int Greater();//function declaration
void main(){
   int res= Greater();//function call
    if(res==1){
        printf("n1 is greatest");
    }else if(res==2){
         printf("n2 is greatest");
    }else{
       printf("n3 is greatest");
    }
}
    int Greater(){//function defination
    int n1,n2,n3;
    printf("Enter the numbers:");
    scanf("%d %d %d",&n1,&n2,&n3);
    if(n1>n2&&n1>n3)
        return 1;
    else if(n2>n3&&n2>n1)
           return 2; 
        else
            return 3;
 }