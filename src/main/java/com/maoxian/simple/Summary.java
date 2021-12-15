package com.maoxian.simple;

import java.util.HashMap;

/**
 * @Author: 毛线
 * @CREATE_TIME: 2021/12/14 10:11
 * @PROJECT_NAME: LeetCode-Learning-Example
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Summary {
  /*
  * 题目：两数之和
  * 题目描述：给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
  *         你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
  *         你可以按任意顺序返回答案。
  * 题解：
  *   考点：该题考察HashMap的灵活应用。
  *   对象意义：
  *     indexs数组：数组中包含最终得到的两个数字，这两个数字相加为target。
  *     hashMap: 存放的键为目标值（target）-当前值（nums[i]）,值为当前值的下标;
  *   逻辑：
  *     1. 因为题干中描述每种输入只会对应一个答案，所以定义一个数组indexs用于返回最后的值;
  *     2. 定义一个hashMap，用于存放对应数的值与当前数的下标;
  *     3. 每次循环都会判断一次对应值是否存在，存在则直接返回其下标，若不存在对应值则添加到hashMap。
  */

  public int[] twoSum(int[] nums, int target) {
    int[] indexs = new int[2];
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (hashMap.containsKey(nums[i])){
        indexs[0] = i;
        indexs[1] = hashMap.get(nums[i]);
        return indexs;
      }
      hashMap.put(target-nums[i],i);
    }
    return indexs;
  }
  /*
   * 题目：整数反转
   * 题目描述：给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
   *         如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
   *         假设环境不允许存储 64 位整数（有符号或无符号）。
   * 题解：
   *   考点：
   *   对象意义：
   *
   *   逻辑：
   *
   */
  public int reverse(int x) {
    return 1;
  }
}
