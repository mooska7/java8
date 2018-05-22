package service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。

//函数式接口可以被隐式转换为lambda表达式。
//函数式接口可以现有的函数友好地支持 lambda。

public class Interface01 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Predicate<Integer> predicate = n -> true
		// n 是一个参数传递到 Predicate 接口的 test 方法
		// n 如果存在则 test 方法返回 true

		System.out.println("输出所有数据:");
		// 传递参数 n
		eval(list, n -> true);
		
		System.out.println("输出所有偶数:");
	    eval(list, n-> n%2 == 0 );
	    System.out.println("输出所有偶数:");
	    eval(list, n-> n-3 > 0 );
	}

	public static void eval(List<Integer> list, Predicate<Integer> predicate) {
	      for(Integer n: list) {
	        
	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
//		predicate.
//		list.forEach(predicate::test );
	   }

}
