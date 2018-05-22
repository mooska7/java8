package defaultm;

public interface vehicle {
	default void print() {
		System.out.println("我是一辆车!");
	}
}
