#include <stdio.h>

int main() {
    int n=5;
for(int i=1;i<=n;i++){
        for(int j=i;j>=1;j--){
            printf(" ");
        }
        for(int k=5;k>=i;k--){
            printf("* ");
        }
         printf("\n");
}
}

        