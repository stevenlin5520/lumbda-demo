package com.steven.syntax;

import java.util.ArrayList;
import java.util.List;

import com.steven.entity.Person;

/**
 * ���󣬽�person������������
 * @author Steven
 *
 */
public class Lumbdaʹ��Compator���м���List���� {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("limin", 2));
		list.add(new Person("zhansan", 12));
		list.add(new Person("lisi", 34));
		list.add(new Person("zhaoliu", 6));
		list.add(new Person("zhaoliu2", 6));
		list.add(new Person("wangwu", 19));
		list.add(new Person("steven", 25));
		
		list.sort(  (o1,o2) -> o2.getAge()-o1.getAge()  );
		System.out.println(list.toString());
	}
}
