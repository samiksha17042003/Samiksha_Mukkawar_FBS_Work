#include <stdio.h>

void main() {
   int min,hours,rmin;
   printf("Enter the minutes that coverts into hours :");
   scanf("%d",&min);
   hours=min/60;
   rmin=min%60;
   printf("%d is equals to %d hours and %d minutes",min,hours,rmin);
}
