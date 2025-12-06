#include <stdio.h>
void Printtable();//function declaration
void main(){
    Printtable();//calling
}
    void Printtable(){//function defination
    int n=5;
    int i=1,t;
    while(i<=10){
        t=n*i;
        printf("%d\n",t);
        i++;
    }
}