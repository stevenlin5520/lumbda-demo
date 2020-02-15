package com.steven;

/**
 * 
 * @author Steven
 *
 */
public class LambdaDemo {

	public static void main(String[] args) {
		
		
		//方法一，实现接口
		Compater1 compater1 = new MyCompater();
		compater1.defaultMethod();
		
		//方法二，实现匿名内部类
		new Compater1() {
			
			@Override
			public void defaultMethod() {
				System.out.println("匿名内部类");
			}
			
			@Override
			public int compare(int a, int b) {
				return 0;
			}
		}.defaultMethod();
		
		
		//方法三，lumbda表达式
		Compater1 compater12 = (int x,int y) -> x+y;
		compater12.defaultMethod();
		System.out.println(compater12.compare(2,4));
		
	}
}



class MyCompater implements Compater1{

	@Override
	public int compare(int a, int b) {
		return a+b;
	}

	@Override
	public void defaultMethod() {
		System.out.println("接口实现");
	}
	
}

@FunctionalInterface
interface Compater1{
	/**
	 * 用于比较的接口方法
	 * @param a
	 * @param b
	 * @return
	 */
	int compare(int a,int b);
	/**
	 * 试试java8的默认方法
	 */
	default void defaultMethod() {
		System.out.println("Compater1.defaultMethod()");
	}
}
