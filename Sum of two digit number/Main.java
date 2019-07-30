#include<stdio.h>
int main()
{
  //Type your code here
  int n,sum;
  int first,last;
  scanf("%d",&n);
  first=n/10;
  last=n%10;
  sum=first+last;
  printf("%d",sum);
  return 0;
}