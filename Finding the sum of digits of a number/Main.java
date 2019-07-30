#include <stdio.h>
int main() {
	//Type your 
  int sum=0,n,rem;
  scanf("%d",&n);
  while(n>0)
        {
    rem=n%10;
    sum+=rem;
    n=n/10;
  }
  printf("%d",sum);          
	return 0;
}