#include <stdio.h>

int main() {
    int n=15;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n||i==j||i+j==n+1||i==n/2+1||j==n/2+1){
                if(i==8 && j==8)
                    printf("O "); 
            else if (i == j)
            printf("@ ");
            else if (i+j==n+1)
            printf("# ");
            else
                printf("* ");
            }
            else{
                if(j<=8||i>=8)
                printf(". ");
                else
                printf("  ");
            }
        }
         printf("\n");
    }
}
