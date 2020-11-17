package com.mint.tombs.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <p>
 * Title: Bin_Search
 * </p>
 * <p>
 * Description: 二分法查找 1. 查找的集合必须有序 2. 先绝条件为临界最小值小于等于临界最大值
 * </p>
 * 
 * @author mint
 * @date 2020年11月16日
 */
public class Bin_Search {
	/**
	 * 
	 * <p>
	 * Title: comm_search
	 * </p>
	 * <p>
	 * Description: 普通方式查找 即循环遍历的方式
	 * </p>
	 */
	public static void comm_search(List<Integer> list, int num) {
		long start = System.currentTimeMillis();
		boolean isFind = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == num) {
				isFind = true;
				System.out.println("第" + i + "次查找，当前数字为：" + list.get(i) + "， 查找数字为：" + num);
				break;
			} else {
				System.out.println("第" + i + "次查找，当前数字为：" + list.get(i) + "， 查找数字为：" + num);
			}
		}

		if (isFind) {
			System.out.println("找到了猜想数字！");
		} else {
			System.out.println("根本就没有你说的数字！");
		}
		System.out.println("方法运行结束，共花费" + (System.currentTimeMillis() - start) + "毫秒");
	}

	/**
	 * 
	 * <p>
	 * Title: bin_search
	 * </p>
	 * <p>
	 * Description: 利用二分查找法查找特定数字
	 * </p>
	 * 
	 * @param list 查找的有序集合
	 * @param num  需要查找的数字
	 */
	public static void bin_search(List<Integer> list, int num) {
		long start = System.currentTimeMillis();
		int low = 1;
		int height = list.size() - 1;

		while (low <= height) { // 只要最小值小于或等于最大值，就进行猜测
			int mid = (low + height) / 2;
			int guess = list.get(mid);

			if (guess == num) {
				System.out.println("找到了你說的數字，他是" + guess);
				break;
			} else if (guess < num) {
				System.out.println("小啦！");
				low = mid + 1;
			} else {
				System.out.println("大啦！");
				height = mid - 1;
			}
		}
		System.out.println("方法运行结束，共花费" + (System.currentTimeMillis() - start) + "毫秒");
	}

	public static void main(String[] args) {

		List<Integer> lstNums = new ArrayList<Integer>();
		for (int i = 1; i < 500000; i++) {
			lstNums.add(i);
		}

		comm_search(lstNums, 99999);
		bin_search(lstNums, 99999);
	}
}
