// What is the output?

public class Question6 {

	public Question6() {
		System.out.println("Hello 2");
	}

	public static void main(String[] args) {
		System.out.println("Hello 3");
		Question6 q5 = new Question6();
	}

	{
		System.out.println("Hello 1");
	}
	
}