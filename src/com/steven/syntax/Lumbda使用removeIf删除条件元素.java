package com.steven.syntax;

import java.util.ArrayList;

import com.steven.entity.Person;

/**
 * ����ɾ������������Ԫ��
 * @author Steven
 *
 */
public class Lumbdaʹ��removeIfɾ������Ԫ�� {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("limin", 2));
		list.add(new Person("zhansan", 12));
		list.add(new Person("lisi", 34));
		list.add(new Person("zhaoliu", 6));
		list.add(new Person("zhaoliu2", 6));
		list.add(new Person("wangwu", 19));
		
		//ͨ��������ɾ��Ԫ�ء��������е�ÿһ��Ԫ�ض����뵽Predicate�ӿ��µ�test�������������ֵΪtrue����ɾ��������������
		list.removeIf( ele -> ele.getAge()>10 );
		
		System.out.println(list);
		
	}
}
