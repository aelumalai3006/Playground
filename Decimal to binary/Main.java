#include<stdio.h>
int main()
{
  //Type your code here
  int n,arr[124],i,count;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[count++]=n%2;
    n=n/2;
  }
  for(i=count-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
return 0;
}