#include <stdio.h>
double Price(double,double,double,char);//function declaration
void main(){
double price,totalprice,discount=0;
char student;
printf("Enter the price:");
scanf("%lf",&price);
printf("Enter the if you are student(say y or n):");
scanf(" %c",&student);
double res=Price(price,totalprice,discount,student);
if(res)
printf("the final price of customer is %lf",res);
else
printf("the final price of customer is %1f",res);
} //function call
double Price(double price,double totalprice,double discount,char student){//function defination

if(student=='y'){
    if(price>500){
    totalprice=price-price*0.20;
    return totalprice;
    }
    else{
    totalprice=price-price*0.10;
    return totalprice;
    }
}
else{
    if(price>600){
    totalprice=price-price*0.20;
     return totalprice;
    }
    else{
    totalprice=price;
     return totalprice;
    }

}
if(discount==0)
return totalprice;
else
return totalprice;
}