#include <stdio.h>
int evenodd(int);//fun declaration
void main() {
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    int res=evenodd(n);
    if(res==1){
        printf("the number is even");
    }else{
        printf("the number is odd");//calling
}
}
int evenodd(int n){//defination
    if(n%2==0){
       return 1;
    }else{
       return 0;
}
}