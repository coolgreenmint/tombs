package com.mint.tombs.learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;

/**
 * 
 * <p>
 * Title: CollectionTest
 * </p>
 * <p>
 * Description:集合类 ArrayList: 非线程安全，每次扩容增加50% Vector: 线程安全，每次扩容增加一倍
 * 
 * </p>
 * 
 * @author mint
 * @date 2020年11月12日
 */
public class CollectionTest {

	public static int getNum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return getNum(n - 1) + getNum(n - 2);
	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		Vector<Integer> v = new Vector<Integer>();

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(9);
		list.add(1);
		list.add(45);
		list.add(65);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (Integer num : list) {
			System.out.println(num);
		}

	}

}
