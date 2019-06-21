#include<stdio.h>
int main()
{
  int dividend=365, divisor=4, quotient, remainder;
  quotient=dividend/divisor;
  remainder=dividend%divisor;
  printf("Quotient: %d\n",quotient);
  printf("Remainder: %d",remainder);
  return 0;
}