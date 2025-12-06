#include <stdio.h>
void area();//fun declaration
void main() {
    area();//calling
}
void area(){//defination
    int r;
    printf("Enter the radius of the circle:");
    scanf("%d",&r);
    int area=3.14*r*r;
    printf(" the area of circle is ""%d",area);
}