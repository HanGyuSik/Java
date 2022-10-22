package Professor;

// Fruit클래스 : 인터페이스 comparable 구현(Fruit 객체타입)
// comparable의 경우 구현되어있는 자신과 들어오는 같은 타입의 객체를 비교 -> 파라미터가 1개.
public class Fruit implements Comparable<Fruit> {
	private String name;
	private int price;

	// 생성자
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	// int compareTo : comparable의 메소드(필수 구현)
	// 들어온 인자를 비교후 int값으로 리턴
	public int compareTo(Fruit o) {
		if ((this.name.compareTo(o.name)) < 0) {
			return -1;
		} else if ((this.name.compareTo(o.name)) > 0) {
			return 1;
		} else if ((this.name.compareTo(o.name)) == 0) {
			if (this.price < o.price) {
				return -1;
			} else if (this.price > o.price) {
				return 1;
			}
		}
		return 0;

	}

	// 출력하고자하는 값의 주소값을 String값으로 전환
	public String toString() {
		return "<" + name + ", " + price + "> ";
	}
}
