#include <stdio.h>

int main() {
    int n=5;
for(int i=1;i<=n;i++){
     int k=1;
        for(int j=i;j>=1;j--){
            printf("%d ",k++);
        }
        printf("\n");
}
}