#include <stdio.h>

int main() {
    int n=15;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n&&i<=n/2||i==j&&i<=n/2||i+j==n+1&&i<=n/2||i==n/2+1||j==n/2+1){
            printf("*");
            }
            else{
                printf(" ");
            }
        }
         printf("\n");
}
}