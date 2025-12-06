#include <stdio.h>
void evenodd();//fun declaration
void main() {
    evenodd();//calling
}
void evenodd(){//defination
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    if(n%2==0){
        printf("the number is even");
    }else{
        printf("the number is odd");
}
}