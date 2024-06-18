package market;

public class Item {

	static int 상품명번호;
	int 상품번호 = ++상품명번호;
	private String 상품명;
	private int 가격;
	private int 재고;
	
	public Item(String 상품명, int 가격, int 재고) {
		this.상품명 = 상품명;
		this.가격 = 가격;
		this.재고 = 재고;
	}
	
	public String get상품명() {
		return 상품명;
	}
	public void set상품명(String 상품명) {
		this.상품명 = 상품명;
	}
	public int get가격() {
		return 가격;
	}
	public void set가격(int 가격) {
		this.가격 = 가격;
	}
	public int get재고() {
		return 재고;
	}
	public void set재고(int 재고) {
		this.재고 = 재고;
	}

	void 정보출력() {
		System.out.println("물건번호" + 상품명번호);
		System.out.println("상품명:" + 상품명);
		System.out.println("가격" + 가격 + "원");
		System.out.println("재고:" + 재고 + "개");
	}
	
}
