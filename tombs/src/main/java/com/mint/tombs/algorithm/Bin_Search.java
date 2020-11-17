package com.mint.tombs.algorithm;

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
	     * <p>Title: comm_search</p>  
	     * <p>Description: 普通方式查找  即循环遍历的方式</p>
	 */
	public static void comm_search(List<Integer> list,int num) {
		boolean isFind = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == num) {
				isFind = true;
			    System.out.println("第" + i + "次查找，当前数字为：" + list.get(i) + "， 查找数字为：" + num );
				break;
			}
		}
		
		if (isFind) {
			System.out.println("找到了猜想数字！");
		}
		else {
			System.out.println("根本就没有你说的数字！");
		}
	}
	
	public static void main(String[] args) {
		
	}

}
