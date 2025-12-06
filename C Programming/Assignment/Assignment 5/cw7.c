#include <stdio.h>

int main() {
    int n=5;
for(int i=n;i>=1;i--){
    int m=2;
        for(int j=1;j<=i;j++){
            printf(" ");
        }
        for(int k=5;k>=i;k++){
            printf("%d",m);
            m+=2;
        }
         printf("\n");
}
}