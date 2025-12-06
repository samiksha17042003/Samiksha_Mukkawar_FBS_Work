#include <stdio.h>

int main() {
    int n=4;
    int k=1;
    for(int i=1;i<=n;i++){
        for(int j=i;j>=1;j--){
            
            printf("%d ",k);
            k++;
        }
         printf("\n");
}
}