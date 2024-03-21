package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void search(String[] word) {

		HashMap<String, String> fruit = new HashMap<String, String>();

		fruit.put("apple", "りんご");
		fruit.put("peach", "桃");
		fruit.put("banana", "バナナ");
		fruit.put("lemon", "レモン");
		fruit.put("pear", "梨");
		fruit.put("kiwi", "キウイ");
		fruit.put("strawberry", "いちご");
		fruit.put("grape", "ぶどう");
		fruit.put("muscat", "マスカット");
		fruit.put("charry", "さくらんぼ");
		
		String box = "";

		for (int i = 0; i < word.length; i++) {
			
			box = fruit.get(word[i]);
			if(box == null) {
				System.out.println(word[i] + "は辞書に存在しません");
			} else {
				System.out.println(word[i] + "の意味は" + box);
			}
		}
	}
}
