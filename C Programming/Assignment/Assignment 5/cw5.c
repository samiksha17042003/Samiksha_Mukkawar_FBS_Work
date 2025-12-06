#include <stdio.h>

int main() {
    int no=0;
   for(int i=1;i<=5;i++){
    // for( int j=1;j<=i;j++){
    //     for(int n=1;n>=i;n++){
    no=no*10+i;
     printf("%d",no);

if(i<5){
    printf("+");
}
   }
}


