How to create array in heap?
ANd pointer also?

int *p;
int arr[]={1,2,3};
p = &a[0] ==> Array created in stack

In C (create array in heap)
arr = (int*)malloc(size*sizeof(int));

In C++ (creating an array in heap)
p = new int[5] ==> Dynamically create an array in heap in C++



