#include <stdio.h>
int evenodd();//fun declaration
void main() {
   if(evenodd()){
        printf("the number is even");
    }else{
        printf("the number is odd");//calling
}
}
int evenodd(){//defination
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    if(n%2==0){
       return 1;
    }else{
       return 0;
}
}