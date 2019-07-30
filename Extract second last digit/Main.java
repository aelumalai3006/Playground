#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int sum=0;
  int digit=0;
  sum=n%100;
  digit=sum/10;
  printf("%d",digit);
  return 0;
}