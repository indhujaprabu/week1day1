package week1.assignments;

public class SampleCalculate {

	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.add(5,6,4);
		System.out.println("Addition of 5,6,4 is");
		System.out.println(obj.add(5,6,4));
		obj.sub(6,4);
		System.out.println("Subtraction of 6,4 is");
		System.out.println(obj.sub(6,4));
		obj.mul(5,4);
		System.out.println("Multiplication of 5,4 is");
		System.out.println(obj.mul(5,4));
		obj.div(15,5);
		System.out.println("Division of 15,5 is");
		System.out.println(obj.div(15,5));

	}
	

}
