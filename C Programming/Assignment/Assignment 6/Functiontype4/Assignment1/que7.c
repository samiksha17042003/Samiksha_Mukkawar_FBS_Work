#include <stdio.h>
void Totalsalary();
void main(){
Totalsalary();
}
void Totalsalary(){
    double bs=8000;
    double da,ta,hrs,ts;
    if(bs<5000){
        da=bs*0.10;
        ta=bs*0.15;
        hrs=bs*0.20;  
    }
    else{
        da=bs*0.15;
        ts=bs+da+ta+hrs;
        printf("TS=%lf",ts);
    }
}
