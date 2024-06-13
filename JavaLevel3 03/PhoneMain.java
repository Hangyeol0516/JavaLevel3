package main;

public class PhoneMain {

	public static void main(String[] args) {
			
		SmartPhone MyPhone = new SmartPhone("갤럭시", "은색");

		System.out.println("모델: " + MyPhone.모델);
		System.out.println("색상: " + MyPhone.색상);
		
		MyPhone.set와이파이(true);
		System.out.println(MyPhone.와이파이);
		
		MyPhone.벨();
		
	}
	
}
