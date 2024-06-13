package main;

public class SmartPhone extends Phone {

	public boolean 와이파이;

	public SmartPhone(String 모델, String 색상) {
		super(모델, 색상);
		this.모델 = 모델;
		this.색상 = 색상;
	}
	
	public void set와이파이(boolean 와이파이) {
		this.와이파이 = 와이파이;
		System.out.println("와이파이 상태를 변경");
	}
	
	public void 인터넷() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	@Override
	public void 벨() {
		super.벨();
		System.out.println("진동이 울립니다.");
	}
	
}
