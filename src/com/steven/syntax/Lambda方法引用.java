package com.steven.syntax;

import com.steven.interfaces.LumbdaReturnSingleParam;

/**
 * 可以快速的将一个lumbda表达式实现指向一个已经实现的方法
 * @author Steven   
 *
 */
public class Lambda方法引用 {

	public static void main(String[] args) {
		
		LumbdaReturnSingleParam l1 = x -> change(x);
		System.out.println(l1.test(1111111));
		
		LumbdaReturnSingleParam l2 = Lambda方法引用::change;
		System.out.println(l2.test(222222));
		
	}
	
	private static int change(int x) {
		return 2*x;
	}
}
