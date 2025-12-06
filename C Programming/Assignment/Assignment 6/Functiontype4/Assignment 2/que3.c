#include <stdio.h>
int Greater(int,int,int);//function declaration
void main(){
    int n1,n2,n3;
    printf("Enter the numbers:");
    scanf("%d %d %d",&n1,&n2,&n3);
   int res= Greater(n1,n2,n3);//function call
    if(res==1){
        printf("n1 is greatest");
    }else if(res==2){
         printf("n2 is greatest");
    }else{
       printf("n3 is greatest");
    }
}
    int Greater(int no1,int no2,int no3){//function defination
    if(no1>no2&&no1>no3)
        return 1;
    else if(no2>no3&&no2>no1)
           return 2; 
        else
            return 3;
 }