package com.steven.syntax;

import com.steven.entity.Person;

public class Lumbda构造方法引用 {

	public static void main(String[] args) {
		PersonCreater creater = Person::new ;
		Person p1 = creater.getPerson();
		System.out.println(p1.toString());
		
		PersonCreater2 creater2 = Person::new ;
		Person p2 = creater2.getPerson("limin", 23);
		System.out.println(p2.toString());
	}
}

interface PersonCreater{
	Person getPerson();
}
interface PersonCreater2{
	Person getPerson(String name, int age);
}