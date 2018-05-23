package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
//
//Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。
//
//Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
//
//这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
//
//元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
//+--------------------+       +------+   +------+   +---+   +-------+
//| stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
//+--------------------+       +------+   +------+   +---+   +-------+
//
//以上的流程转换为 Java 代码为：
//List<Integer> transactionsIds = 
//widgets.stream()
//             .filter(b -> b.getColor() == RED)
//             .sorted((x,y) -> x.getWeight() - y.getWeight())
//             .mapToInt(Widget::getWeight)
//             .sum();

public class Stream01 {
	public static void main(String[] args) {
//		forEach();
//		map();
//		filter();
//		limit();
		sort();
	}
	public static void forEach() {
		Random ran = new Random();
		ran.ints().limit(10).forEach(System.out::println);
	}
	public static void map() {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		// 获取对应的平方数
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
	}
	
	public static void filter() {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl",null);
		List<String> str = new ArrayList<String>();
		// 获取空字符串的数量
//		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		str = strings.stream().filter(string -> string!=null&&string.contains("a") ).collect(Collectors.toList());
		str.forEach(System.out::println);
	}
	
	public static void limit() {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
	
	public static void sort() {
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
		random.ints().limit(10).sorted().forEach(System.out::println);
	}
}
