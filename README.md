# LetCode
letcode

https://leetcode.com/problemset/top-100-liked-questions/#

## practice3
 题目：
 给定一个字符串，找出不含有重复字符的 最长子串 的长度。

 示例：

 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列 而不是子串。
 
基本思想是，保留一个散列表，它将字符串中的字符存储为键，并将它们的位置存储为值，并保留定义最大子字符串的两个指针。

移动右边的指针扫描字符串，同时更新散列表。

如果该字符已经在散列表中，则将左指针移到最后找到的同一个字符的右侧。

请注意，这两个指针只能向前移动。
 
 ## pracitce4
 
有两个大小为 m 和 n 的排序数组 nums1 和 nums2 。

请找出两个排序数组的中位数并且总的运行时间复杂度为 O(log (m+n)) 。

示例：
nums1 = [1, 3]
nums2 = [2]

中位数是 2.0


基本思想：

先归并为一个数组

然后再取值

网上提示：

这是我使用二进制搜索的迭代解决方案。 主要想法是找到中位数的大概位置，并比较它周围的元素以获得最终结果。

做二进制搜索。 假设较短的列表是长度为n的A。 运行时为O（log（n）），这意味着不管B数组多大，它只取决于A的大小。它是有道理的，因为如果A只有一个元素，而B有100个元素，则中位数必须是1 的A [0]，B [49]和B [50]，而不检查其他所有内容。 如果A [0] <= B [49]，B [49]是答案; 如果B [49] <A [0] <= B [50]，则A [0]是答案; 否则，B [50]就是答案。

二进制搜索后，我们得到中位数的大概位置。 现在我们只需要比较至多4个元素来找到答案。 这一步是O（1）。

可以应用相同的解决方案来查找2个排序数组的第k个元素。

## pratice9 

判断一个整数是否是回文数。不能使用辅助空间。

点击查看提示

一些提示:

负整数可以是回文数吗？（例如 -1）

如果你打算把整数转为字符串，请注意不允许使用辅助空间的限制。

你也可以考虑将数字颠倒。但是如果你已经解决了 “颠倒整数” 问题的话，就会注意到颠倒整数时可能会发生溢出。你怎么来解决这个问题呢？

基本思路：

比较x的一半数字，所以不需要处理溢出。

## Practice238

给定n个整数的数组，其中n> 1，nums返回一个数组输出，使得输出[i]等于除nums [i]之外的所有num的元素的乘积。

 在O(n)中

 例如，给出[1,2,3,4]，返回[24,12,8,6]
 
 这个真的很难想通
 
 所给答案解：
     
       public int[] productExceptSelf(int[] nums) {
         int[] result = new int[nums.length];
         for (int i = 0, tmp = 1; i < nums.length; i++) {
             result[i] = tmp;
             tmp *= nums[i];
         }
         for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
             result[i] *= tmp;
             tmp *= nums[i];
         }
         return result;
     }
     
 
