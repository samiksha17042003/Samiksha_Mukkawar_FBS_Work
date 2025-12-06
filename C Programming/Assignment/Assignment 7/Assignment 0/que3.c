#include <stdio.h>

void main() {
  double C,F;
  printf("Enter the Temperature that convert into the Faranide:");
  scanf("%lf",&C);
  F=((C*1.8)+32);
  printf(" The Temperature that convert celsious into the Faranide is :%lf",F);
}