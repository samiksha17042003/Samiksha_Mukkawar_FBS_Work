#include <stdio.h>
double area(int);//fun declaration
void main() {
    int r;
    printf("Enter the radius of the circle:");
    scanf("%d",&r);
    double res=area(r);//calling
    printf(" the area of circle is %lf",res);
}
double area(int r){//defination
    double area=3.14*r*r;
    return area;
}