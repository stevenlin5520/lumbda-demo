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
		//�����޲Σ��޷���
		LumbdaNoneReturnNoneParam l1 = () -> {
			System.out.println("�����޲Σ��޷���");
		};
		l1.test();
		
		//�﷨����
		LumbdaNoneReturnNoneParam l11 = () -> System.out.println("�﷨����");
		l11.test();
		
//		-----------------------------------------------------------------
		//���Ե��������޷���
		LumbdaNoneReturnSigleParam l2 = (int x) -> {
			System.out.println("���Ե��������޷���:x="+x);
		};
		l2.test(22);
		
		//�﷨����
		LumbdaNoneReturnSigleParam l22 = x -> System.out.println("������"+x);
		l22.test(222);
		
//		-----------------------------------------------------------------
		//���Զ�������޷���
		LumbdaNoneReturnMutiParam l3 = (int x, int y) -> {
			System.out.println("���Զ�������޷���:x+y="+(x+y));
		};
		l3.test(11, 22);
		
		//�﷨����
		LumbdaNoneReturnMutiParam l33 = (x,y) -> System.out.println("�﷨����"+(x+y));
		l33.test(111, 222);
		
//		-----------------------------------------------------------------
		//�����޲Σ��з���
		LumbdaReturnNoneParam l4 = () -> {
			System.out.println("�����޲Σ��з���");
			return 44;
		};
		System.out.println(l4.test());
		
		//�﷨����
		LumbdaReturnNoneParam l44 = () -> 444;
		System.out.println(l44.test());
		
//		-----------------------------------------------------------------
		//���Ե��������з���
		LumbdaReturnSingleParam l5 = (int x) -> {
			System.out.println("���Ե��������з���");
			return x;
		};
		System.out.println(l5.test(55));
		
		//�﷨����
		LumbdaReturnSingleParam l55 = x -> x;
		System.out.println(l55.test(555));
		
//		-----------------------------------------------------------------
		//���Զ�������з���
		LumbdaReturnMutiParam l6 = (int x,int y) -> {
			System.out.println("���Զ�������з���");
			return x+y;
		};
		System.out.println(l6.test(33, 33));
		
		//�﷨����
		LumbdaReturnMutiParam l66 = (x,y) -> x+y ;
		System.out.println(l66.test(333, 333));

	}

}
