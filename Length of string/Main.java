#include<stdio.h>
int main()
{
  //Type your code here
  int i=0;
  char str[100];
  scanf("%[^\n]s",str);
  while(str[i]!='\0')
  {
    i++;
  }
  printf("%d",i);
  return 0;
}