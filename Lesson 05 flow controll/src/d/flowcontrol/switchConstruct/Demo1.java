package d.flowcontrol.switchConstruct;

public class Demo1 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		System.out.println(x);

		if (x > 5) {
			System.out.println("Big");
			System.out.println("Big");
		}

	}

}
