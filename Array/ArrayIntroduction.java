package Array;

public class ArrayIntroduction {
     /*
    1. Group of same type variables
    2. Size of array is specified in advance
    3. TODO: Data structures in java make using individual and using collection frameworks as well. There are some inbuild classes also exist in collection frameworks to do.
    4. Each variable in array has a index value starting from 0
    5. Contiguous memory allocation
    6. Ex. int a[5]
        - 5 -> size of array
                        a[0]a[1]a[2]a[3]a[4]
                        _____________________
         Value -        | 2 | 1 | 3 | 4 | 6 |
                        ---------------------
         index            0   1   2   3   4
        - int take 4 bytes so array takes 5x4=40bytes
     7. Types of array -
        a. 1D
        b. 2D
        c. Multi-D
     1D Array
         1. Declaration (No memory allocation):
            Meth 1 - int a[];
            Meth 2 - int [] a;
         2. Initialization (Memory allocation):
             a = new int [20];
         3. Declaration and Initialization
             int a [] = new int [10];
         4. Values not added in case:
             int 0, boolean false, double 0.0, etc
         5. Value additions into array
             int a[] a = new int []{1, 3, 5, 6};
             int a[] = new int []{1, 3, 5, 6}
      2D Array
         1. Declaration
            Meth 1 - int a[][];
            Meth 2 - int [][] a;
                int a[][]
                     /  \
            No.of. Rows  No.of. Columns
         2. Initialization
            int [][] a = new int [4][2];
            int a [][] = new int [4][2];
         3. Matrix representation (Visualization)
                  0     1
                  __    __
               0 | 10  20 |
               1 | 20  60 |
               2 | 30  40 |
               3 | 40  90 |
                  --    --
             Want to access 60 use - [1][1]
             Want to access 30 use - [2][0]
         4. Already known values
            int a[][] = new int {
            {1, 2}, {5, 6}, {10, 11}, {15, 16}
            };
    */
}
