#include <stdio.h>
double area();//fun declaration
void main() {
    double res=area();//calling
     printf(" the area of circle is %lf",res);
}
double area(){//defination
    int r;
    printf("Enter the radius of the circle:");
    scanf("%d",&r);
    double area=3.14*r*r;
    return area;
}