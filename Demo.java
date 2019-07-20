package homework5;

public class Demo {
	public static void main(String[] args) {

		FractionNumber fractionNumber = new FractionNumberImpl(1, 2);

		System.out.println(fractionNumber.toString());
		System.out.println(fractionNumber.value() + "\n");

		FractionNumberOperation fractionNumberOperation = new FractionNumberOperationImpl();
		FractionNumber a = new FractionNumberImpl(1, 2);
		FractionNumber b = new FractionNumberImpl(2, 4);

		System.out.println(fractionNumberOperation.add(a, b));
		System.out.println(fractionNumberOperation.div(a, b));
		System.out.println(fractionNumberOperation.mul(a, b));
		System.out.println(fractionNumberOperation.sub(a, b));

	}

}