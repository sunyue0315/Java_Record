# 螺旋矩阵 II

给你一个正整数 n，生成一个包含 1 到 n^2 所有元素， 且元素按顺时针螺旋排列的 n x n 正方形矩阵 matrix

## 解题思路

模拟顺时针画矩阵的过程：

1. 从左到右填充上行；
2. 从上到下补充右列；
3. 从右到左补充下列；
4. 从下到上补充左列

由外向内画圈，一圈一圈地画下去。

这道题的难点在于每层循环的边界条件，对于这种多层循环条件，很容易写着写着，边界
就变了，导致程序难以正常执行。

所以在编写代码之前就要确定循环的边界条件，在这个大前提下，进行每个循环的逻辑编写。

数组遍历，下标与长度差值为1，所以确定所有边界：左闭右开

边界的确定在于
1. n 与循环周期的关系 即循环条件 cycle？ cycle = n / 2
2. 考虑 offset的初始值取多少？offset = 1, 比如 n = 3， 第二例的最后一个值是不需要第一行遍历赋值的，而是由最后一列赋值；同理
   最后一列最后一行同样不由最后一列赋值，而是由最后一行赋值，所以 offset = 1
3. 找出 每层长度 与 索引 和 整数 n 以及 offset 的规律 length = n + starty/startx - offset