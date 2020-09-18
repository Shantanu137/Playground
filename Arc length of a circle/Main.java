#include <stdio.h>
int main()
{
   // Try out your code here
  // printf("Hello, World!");
  float pi=3.14,r,s=0.0,a,n=0.0;
  scanf("%f %f",&r,&a);
  n=a/360;
  s=2*3.14*r*n;
  printf("%.2f",s);
  
   return 0;
}