package ConditionalStatement;

public class NestedIf {

	public static void main(String[] args) {
		double bill_amount=5500;
		if (bill_amount>5000)
		System.out.println("20% discount on the billed amount");
		else if(bill_amount>4000)
		System.out.println("10% discount on the billed amount");
		else if(bill_amount>3000)
		System.out.println("5% discount on the billed amount");
		else
		System.out.println("no discount");
		}

}

	


