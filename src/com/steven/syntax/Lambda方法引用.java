package com.steven.syntax;

import com.steven.interfaces.LumbdaReturnSingleParam;

/**
 * ���Կ��ٵĽ�һ��lumbda���ʽʵ��ָ��һ���Ѿ�ʵ�ֵķ���
 * @author Steven   
 *
 */
public class Lambda�������� {

	public static void main(String[] args) {
		
		LumbdaReturnSingleParam l1 = x -> change(x);
		System.out.println(l1.test(1111111));
		
		LumbdaReturnSingleParam l2 = Lambda��������::change;
		System.out.println(l2.test(222222));
		
	}
	
	private static int change(int x) {
		return 2*x;
	}
}
