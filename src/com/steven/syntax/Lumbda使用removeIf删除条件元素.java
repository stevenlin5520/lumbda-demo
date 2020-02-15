package com.steven.syntax;

import java.util.ArrayList;

import com.steven.entity.Person;

/**
 * 需求：删除满足条件的元素
 * @author Steven
 *
 */
public class Lumbda使用removeIf删除条件元素 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("limin", 2));
		list.add(new Person("zhansan", 12));
		list.add(new Person("lisi", 34));
		list.add(new Person("zhaoliu", 6));
		list.add(new Person("zhaoliu2", 6));
		list.add(new Person("wangwu", 19));
		
		//通过迭代器删除元素。将集合中的每一个元素都带入到Predicate接口下的test方法。如果返回值为true，则删除；否则不做处理
		list.removeIf( ele -> ele.getAge()>10 );
		
		System.out.println(list);
		
	}
}
