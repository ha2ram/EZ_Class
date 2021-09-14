package chap05.Object_Class_08;

public class MethodExample_04 {

	public static void main(String[] args) {
		Account obj = new Account("777-777-77777777", "최대박", 10);

		try {
			int amount = obj.withdraw(100000000);
			System.out.println("인출액:" + amount);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}
