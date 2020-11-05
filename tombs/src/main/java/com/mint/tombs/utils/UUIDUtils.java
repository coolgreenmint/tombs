package com.mint.tombs.utils;

import java.util.UUID;

/**
 * 
 * <p>
 * Title: UUIDUtils
 * </p>
 * <p>
 * Description: UUID 产生工具类
 * </p>
 * 
 * @author mint
 * @date 2020年11月5日
 */
public class UUIDUtils {

	/**
	 * 
	 * <p>
	 * Title: getLowerUUIDWithLine
	 * </p>
	 * <p>
	 * Description: 获取小写带横线的UUID
	 * </p>
	 * 
	 * @return 小写带横线的UUID
	 */
	public static String getLowerUUIDWithLine() {
		return UUID.randomUUID().toString().toLowerCase();
	}

	/**
	 * 
	 * <p>
	 * Title: getUpperUUIDWithLine
	 * </p>
	 * <p>
	 * Description: 获取大写带横线的UUID
	 * </p>
	 * 
	 * @return 大写带横线的UUID
	 */
	public static String getUpperUUIDWithLine() {
		return UUID.randomUUID().toString().toUpperCase();
	}

	/**
	 * 
	 * <p>
	 * Title: getLowerUUIDWithOutLine
	 * </p>
	 * <p>
	 * Description: 获取小写不带横线的UUID
	 * </p>
	 * 
	 * @return 小写不带横线的UUID
	 */
	public static String getLowerUUIDWithOutLine() {
		return UUID.randomUUID().toString().toLowerCase().replaceAll("-", "");
	}

	/**
	 * 
	 * <p>
	 * Title: getUpperUUIDWithOutLine
	 * </p>
	 * <p>
	 * Description: 获取大写不带横线的UUID
	 * </p>
	 * 
	 * @return 大写不带横线的UUID
	 */
	public static String getUpperUUIDWithOutLine() {
		return UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
	}

}
