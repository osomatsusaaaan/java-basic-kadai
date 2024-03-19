package kadai_018;

abstract public class Kato_Chapter18 {
	//姓フィールド
	String famiryName = "加藤";
	//名フィールド
	String givenName;
	//住所フィールド
	String address = "東京都中野区〇×";
	
	public void commonIntroduce(String address) {
		System.out.println("住所は" + address + "です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce(address);
		eachIntroduce();
	}
	}

