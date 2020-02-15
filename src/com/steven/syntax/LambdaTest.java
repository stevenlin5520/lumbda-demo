package com.steven.syntax;

import com.steven.interfaces.LumbdaNoneReturnMutiParam;
import com.steven.interfaces.LumbdaNoneReturnNoneParam;
import com.steven.interfaces.LumbdaNoneReturnSigleParam;
import com.steven.interfaces.LumbdaReturnMutiParam;
import com.steven.interfaces.LumbdaReturnNoneParam;
import com.steven.interfaces.LumbdaReturnSingleParam;

public class LambdaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		-----------------------------------------------------------------
		//测试无参，无返回
		LumbdaNoneReturnNoneParam l1 = () -> {
			System.out.println("测试无参，无返回");
		};
		l1.test();
		
		//语法精简
		LumbdaNoneReturnNoneParam l11 = () -> System.out.println("语法精简");
		l11.test();
		
//		-----------------------------------------------------------------
		//测试单参数，无返回
		LumbdaNoneReturnSigleParam l2 = (int x) -> {
			System.out.println("测试单参数，无返回:x="+x);
		};
		l2.test(22);
		
		//语法精简
		LumbdaNoneReturnSigleParam l22 = x -> System.out.println("法精简"+x);
		l22.test(222);
		
//		-----------------------------------------------------------------
		//测试多参数，无返回
		LumbdaNoneReturnMutiParam l3 = (int x, int y) -> {
			System.out.println("测试多参数，无返回:x+y="+(x+y));
		};
		l3.test(11, 22);
		
		//语法精简
		LumbdaNoneReturnMutiParam l33 = (x,y) -> System.out.println("语法精简"+(x+y));
		l33.test(111, 222);
		
//		-----------------------------------------------------------------
		//测试无参，有返回
		LumbdaReturnNoneParam l4 = () -> {
			System.out.println("测试无参，有返回");
			return 44;
		};
		System.out.println(l4.test());
		
		//语法精简
		LumbdaReturnNoneParam l44 = () -> 444;
		System.out.println(l44.test());
		
//		-----------------------------------------------------------------
		//测试单参数，有返回
		LumbdaReturnSingleParam l5 = (int x) -> {
			System.out.println("测试单参数，有返回");
			return x;
		};
		System.out.println(l5.test(55));
		
		//语法精简
		LumbdaReturnSingleParam l55 = x -> x;
		System.out.println(l55.test(555));
		
//		-----------------------------------------------------------------
		//测试多参数，有返回
		LumbdaReturnMutiParam l6 = (int x,int y) -> {
			System.out.println("测试多参数，有返回");
			return x+y;
		};
		System.out.println(l6.test(33, 33));
		
		//语法精简
		LumbdaReturnMutiParam l66 = (x,y) -> x+y ;
		System.out.println(l66.test(333, 333));

	}

}
