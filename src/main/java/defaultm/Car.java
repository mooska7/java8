package defaultm;

public class Car implements vehicle, fourWheeler {

	public void print() {
		vehicle.super.print();
		fourWheeler.super.print();
	}

//	@Override
//	public void print() {
//		vehicle.super.print();
//	}

	public static void main(String[] args) {
		vehicle car = new Car();
		car.print();
	}
}
