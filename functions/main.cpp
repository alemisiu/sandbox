#include <iostream>

int addition(int v1, int v2);

int main()
{
  int a = 1;
  int b = 2;

  std::cout << addition(a, b) << std::endl;
  
  return 0;
}

int addition(int v1, int v2)
{
  return (v1 + v2);
}


