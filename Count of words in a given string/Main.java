#include<stdio.h>

int main()
{
  //Type your code here
  int i,count=1;
  char str[100];
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
      count++;
  }
  printf("%d",count);
  return 0;
}