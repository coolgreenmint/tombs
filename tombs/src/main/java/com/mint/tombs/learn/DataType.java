package com.mint.tombs.learn;

/**
 * 
 * <p>
 * Title: DataType
 * </p>
 * <p>
 * Description: 数据类型及其包装类 bit 计算处理的最小单位 例如：0000 0000 为8个bit位 整型： byte 一字节， 8位
 * 0000 0000 ~ 1111 1111 short 两字节，16位 如上 int 四字节，32位 如上 long 八字节，64位 如上
 * 
 * 浮点型： float 四字节，32位 double 八字节，64位
 * 
 * 字符型： char 两字节，16位
 * 
 * 布尔型： boolean 一字节，8位
 * 
 * java 为每种包装类型提供了包装类
 * </p>
 * 
 * @author mint
 * @date 2020年11月12日
 */
public class DataType {

	/**
	 * 
	 * <p>
	 * Title: ByteClassTest
	 * </p>
	 * <p>
	 * Description: Byte包装类
	 * </p>
	 */
	public static void byteClassTest() {
		// Byte的字段
		System.out.println("byte 的字节数：" + Byte.BYTES + " 字节");
		System.out.println("byte 的位数：" + Byte.SIZE + " 位");
		System.out.println("byte 的取值范围：" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("byte 的原始类型: " + Byte.TYPE);
	}

	/**
	 * 
	 * <p>
	 * Title: ShortClassTest
	 * </p>
	 * <p>
	 * Description: Short 包装类
	 * </p>
	 */
	public static void shortClassTest() {
		System.out.println("short 的字节数：" + Short.BYTES + " 字节");
		System.out.println("short 的位数：" + Short.SIZE + " 位");
		System.out.println("short 的取值范围：" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("short 的原始类型：" + Short.TYPE);
	}

	/**
	 * 
	 * <p>
	 * Title: IntegerClassTest
	 * </p>
	 * <p>
	 * Description: Integer 包装类
	 * </p>
	 */
	public static void integerClassTest() {
		System.out.println("int 的字节数：" + Integer.BYTES + " 字节");
		System.out.println("int 的位数：" + Integer.SIZE + " 位");
		System.out.println("int 的取值范围：" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("int 的原始类型：" + Integer.TYPE);
	}

	/**
	 * 
	 * <p>
	 * Title: LongClassTest
	 * </p>
	 * <p>
	 * Description: Long 包装类
	 * </p>
	 */
	public static void longClassTest() {
		System.out.println("long 的字节数：" + Long.BYTES + " 字节");
		System.out.println("long 的位数：" + Long.SIZE + " 位");
		System.out.println("long 的取值范围：" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("long 的原始类型：" + Long.TYPE);
	}

	/**
	 * 
	 * <p>
	 * Title: floatClassTest
	 * </p>
	 * <p>
	 * Description: Float 包装类
	 * </p>
	 */
	public static void floatClassTest() {
		System.out.println("float 的字节数：" + Float.BYTES + " 字节");
		System.out.println("float 的位数：" + Float.SIZE + " 位");
		System.out.println("float 的取值范围：" + Float.MIN_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("float 的原始类型：" + Float.TYPE);
	}

	/**
	 * 
	 * <p>
	 * Title: doubleClassTest
	 * </p>
	 * <p>
	 * Description: Double 包装类
	 * </p>
	 */
	public static void doubleClassTest() {
		System.out.println("double 的字节数：" + Double.BYTES + " 字节");
		System.out.println("double 的位数：" + Double.SIZE + " 位");
		System.out.println("double 的取值范围：" + Double.MIN_VALUE + "~" + Double.MAX_VALUE);
		System.out.println("double 的原始类型：" + Double.TYPE);
	}

	/**
	 * 
	 * <p>
	 * Title: booleanClassTest
	 * </p>
	 * <p>
	 * Description: Boolean 包装类
	 * </p>
	 */
	public static void booleanClassTest() {
		System.out.println("boolean 的真值：" + Boolean.TRUE);
		System.out.println("boolean 的假值：" + Boolean.FALSE);
	}

	public static void outLine() {
		System.out.println("---------------------");
	}

	public static void main(String[] args) {
		byteClassTest();
		outLine();
		shortClassTest();
		outLine();
		integerClassTest();
		outLine();
		longClassTest();
		outLine();
		floatClassTest();
		outLine();
		doubleClassTest();
		outLine();
		booleanClassTest();
	}

}
