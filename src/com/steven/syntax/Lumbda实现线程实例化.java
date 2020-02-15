package com.steven.syntax;

public class Lumbda实现线程实例化 {

	public static void main(String[] args) {
		
		new Thread( () -> System.out.println("线程实例化") ).start();
		
	}
}
