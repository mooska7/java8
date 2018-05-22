package lambda;

//Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
//Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。

//使用 Lambda 表达式需要注意以下两点：
//Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
//Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
//lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）


public class Lambda01 {
//	final int c = 9;
	public static void main(String[] args) {
		// Lambda01 tester = new Lambda01();
		MathOperation addition = (int a, int b) -> a + b;
		System.out.println(addition.operation(3, 4));
		MathOperation subition = (int a, int b) -> a - b;
		System.out.println(subition.operation(3, 4));
		MathOperation multiplication = (int a, int b) -> a * b;
		System.out.println(multiplication.operation(3, 4));
		MathOperation division = (int a, int b) -> a / b;
		System.out.println(division.operation(3, 4));

		GreetingService gr1 = message -> System.out.println("Hello " + message);

		GreetingService gr2 = (message) -> System.out.println("Hello " + message);
		
		gr1.sayMessage("world");

		gr2.sayMessage("world");
		int c = 9;
		MathOperation addition2 = (int a, int b) -> a + c;
//		c = 5;
		
		
//		MathOperation addition3 = (int a, int b) -> (a>3 -> a);
		
	}
}
