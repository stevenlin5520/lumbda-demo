package com.steven;

/**
 * 
 * @author Steven
 *
 */
public class LambdaDemo {

	public static void main(String[] args) {
		
		
		//����һ��ʵ�ֽӿ�
		Compater1 compater1 = new MyCompater();
		compater1.defaultMethod();
		
		//��������ʵ�������ڲ���
		new Compater1() {
			
			@Override
			public void defaultMethod() {
				System.out.println("�����ڲ���");
			}
			
			@Override
			public int compare(int a, int b) {
				return 0;
			}
		}.defaultMethod();
		
		
		//��������lumbda���ʽ
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
		System.out.println("�ӿ�ʵ��");
	}
	
}

@FunctionalInterface
interface Compater1{
	/**
	 * ���ڱȽϵĽӿڷ���
	 * @param a
	 * @param b
	 * @return
	 */
	int compare(int a,int b);
	/**
	 * ����java8��Ĭ�Ϸ���
	 */
	default void defaultMethod() {
		System.out.println("Compater1.defaultMethod()");
	}
}
