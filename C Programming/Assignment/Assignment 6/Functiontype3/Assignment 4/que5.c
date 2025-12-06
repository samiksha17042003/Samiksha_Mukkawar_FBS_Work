#include <stdio.h>
void Number(int,int);
void main(){
    int n;
    while(1){
    printf("/nEnter the number:");
    scanf("%d",&n);
    printf("\nSelect an option:\n");
    printf("Enter 1--->Prime\n");
     printf("Enter 2--->Amstrong\n");
      printf("Enter 3--->Strong\n");
       printf("Enter 4--->Perfect\n");
        printf("Enter 5--->Pallindrome\n");
        int choice;
        printf("Enter the choice:");
        scanf("%d",&choice);
        Number(n, choice);
    }
        void Number(int n,int choice){
        if(choice==1){
        int num=n,i=2,flag=0;
        while(i<num){
        if(num%i==0){
         flag==1;
         break;
    }
    if(flag==0){
        printf("%d is not prime number",num);
        break;
    }
    else{
        printf("%d is prime number",num);
    }
    }

        }
    else if(choice==2){
    int num=n,r1,sum=0,count=0,p,i;
    int temp=num;
    while(temp!=0){
      //  sum=sum+r1*r1*r1;
        count++;
       temp=temp/10;
    }   
    temp=num;
    while(temp!=0){
        r1=temp%10;
        p=1;
        for(i=1;i<=count;i++){
            p=p*r1;
        }
       sum=sum+p;
        temp=temp/10;
    }if(num==sum){
        printf("%d is armstrong number",num);
    }
    else{
        printf("%d is not armstrong number",num);
    }
        }
else if(choice==3){
    int num=n,r,sum=0;
    int temp=num;
    while(temp>0){
       r=temp%10;
       int fact=1;
       for(int i = 1; i <=r; i++) {
        fact *= i;
    }
       sum=sum+fact;
       temp=temp/10;
       
    }
   if(num==sum){
     printf("%d is strong number",num);
   }else{
     printf("%d is not strong number",num);
   }
        }
else if(choice==4){
    int num=n,sum=0;
    for(int i=1;i<=num/2;i++){
        if(num%i==0){
            sum=sum+i;
        }
    }
    if(sum==num){
        printf("%d is perfect number",num);
    }
    else{
        printf("%d is not perfect number",num);
    }
        }
else if(choice==5){
    int num=n,r1,rev=0;
    int temp=num;
    while(num>0){
        r1=num%10;
        rev=rev*10+r1;
        num=num/10;
    }if(temp==rev){
        printf("%d is palindrome number",temp);
    }
    else{
        printf("%d is not palindrome number",temp);
    }
            
        }
       else{
        printf("Invalide Choice");
            
        }
    }
}


