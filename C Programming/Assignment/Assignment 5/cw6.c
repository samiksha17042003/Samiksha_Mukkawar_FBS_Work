#include <stdio.h>

int main() {
    int n=5;
for(int i=1;i<=n;i++){
        for(int j=i;j>=1;j--){
            if(i%2==0){
            printf("#");
        }
        else{
            printf("*");
        }
    }  
     printf("\n");
    }
}