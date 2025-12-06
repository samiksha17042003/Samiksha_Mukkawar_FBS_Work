#include <stdio.h>
int price();//function declaration
void main(){
    int res=price();
if(res)
printf("the final price of customer is %lf",res);
else
printf("the final price of customer is %1f",res);
} //function call
int price(){//function defination
double price,totalprice,discount=0;
char student;
printf("Enter the price:");
scanf("%lf",&price);
printf("Enter the if you are student(say y or n):");
scanf(" %c",&student);

if(student=='y'){
    if(price>500)
    totalprice=price-price*0.20;
    else
    totalprice=price-price*0.10;

}
else{
    if(price>600)
    totalprice=price-price*0.20;
    else
    totalprice=price;

}
if(discount==0)
return totalprice;
else
return totalprice;
}