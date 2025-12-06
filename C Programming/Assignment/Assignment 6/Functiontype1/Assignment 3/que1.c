#include <stdio.h>
void Printno();//function declaration
void main(){
    Printno();//calling
}
    void Printno(){//function defination
    int i=1;
    while(i<=10){
        printf("%d\n",i);
        i++;
    }
}

