package com.mint.tombs.learn;

/**
 * 
 * <p>
 * Title: KeyWord
 * </p>
 * <p>
 * Description: 关键字练习
 * </p>
 * 
 * @author mint
 * @date 2020年11月12日
 */
public class KeyWord {

	static {
		System.out.println("静态代码块执行");
	}

	{
		System.out.println("普通代码块执行");
	}

	public static void main(String[] args) {
		try {
			System.out.println("主方法 执行");
			int a = 0;
			int b = 5 / a;
		} catch (Throwable e) {
			System.out.println(e.getCause());
		}
	}

}
