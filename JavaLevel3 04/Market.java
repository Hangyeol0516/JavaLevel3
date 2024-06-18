package market;

public class Market {

	String 마켓이름;
	Item 상품[] = new Item[5];
	
	public Market(String 마켓이름) {
		this.마켓이름 = 마켓이름;
		
		상품[0] = new Item("사과", 2000, 20);
		상품[1] = new Item("오렌지", 1000, 100);
		상품[2] = new Item("생선", 5000, 30);
	}
		
	void 판매() {
		
	}

	void 재고관리() {
		
	}
	
	void 재고현황() {
		System.out.println(마켓이름 + "의 현재 재고는...");
		System.out.println(Item.상품명번호 + " 가지의 물건이 있습니다.");
		for (Item i : 상품) {
			if (i == null) break;
			System.out.println(i.상품번호);
			System.out.println(i.get상품명());
			System.out.println(i.get가격());
			System.out.println(i.get재고());
		}
	}
		
}
