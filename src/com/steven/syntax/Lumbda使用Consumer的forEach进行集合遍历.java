package com.steven.syntax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 需求：进行遍历
 * @author Steven
 *
 */
public class Lumbda使用Consumer的forEach进行集合遍历 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9,0);
		
		//将集合中的每一个元素都带入到方法accept中
		//list.forEach(System.out::println);
		
		//输出集合中的所有偶数
		list.forEach(ele -> {
			if(ele % 2 == 0) {
				System.out.println(ele);
			}
		});
		
	}
}
