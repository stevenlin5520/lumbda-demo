package com.steven.syntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * ���󣺽��б���
 * @author Steven
 *
 */
public class Lumbdaʹ��Consumer��forEach���м��ϱ��� {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,0);
		
		//�������е�ÿһ��Ԫ�ض����뵽����accept��
		//list.forEach(System.out::println);
		
		//��������е�����ż��
		list.forEach(ele -> {
			if(ele % 2 == 0) {
				System.out.println(ele);
			}
		});
		
	}
}
