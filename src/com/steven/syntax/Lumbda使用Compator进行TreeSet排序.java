package com.steven.syntax;

import java.util.TreeSet;
import com.steven.entity.Person;

/**
 * 需求，将person对象按年龄排序
 * @author Steven
 *
 */
public class Lumbda使用Compator进行TreeSet排序 {

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>( (o1,o2) -> {
			if(o2.getAge() > o1.getAge()) {
				return 1;
			}else {
				return -1;
			}
		}) ;
		set.add(new Person("limin", 2));
		set.add(new Person("zhansan", 12));
		set.add(new Person("zhaoliu", 6));
		set.add(new Person("zhaoliu2", 6));
		set.add(new Person("steven", 25));
		
		System.out.println(set.toString());
	}
}
