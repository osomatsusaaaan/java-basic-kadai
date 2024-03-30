package kadai_026;

import java.util.HashMap;
//Scanner宣言、HashMap宣言
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//
	public String getMyChoice() {

		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");

			//Scannerクラスのオブジェクト生成
			Scanner scanner = new Scanner(System.in);

			//入力した内容を取得
			String input = scanner.next();
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();

				return input;
			} else {
				System.out.println("正しく入力してください");
			}
		}
	}

	public String getRandom() {

		String[] randomHand = { "r", "s", "p" };
		int randNum = (int) Math.floor(Math.random() * 3);

		return randomHand[randNum];

	}

	public void playGame(String hand, String randomHand) {

		HashMap<String, String> playHand = new HashMap<String, String>();
		playHand.put("r", "グー");
		playHand.put("s", "チョキ");
		playHand.put("p", "パー");

		System.out.println("自分の手は" + playHand.get(hand) + ",対戦相手の手は" + playHand.get(randomHand));

		if ((hand.equals("r") && randomHand.equals("s"))
				|| (hand.equals("s") && randomHand.equals("p"))
				|| (hand.equals("p") && randomHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
		if ((hand.equals("r") && randomHand.equals("p"))
				|| (hand.equals("s") && randomHand.equals("r"))
				|| (hand.equals("p") && randomHand.equals("s"))) {
			System.out.println("自分の負けです");
		}
		if ((hand.equals("r") && randomHand.equals("r"))
				|| (hand.equals("s") && randomHand.equals("s"))
				|| (hand.equals("p") && randomHand.equals("p"))) {
			System.out.println("あいこです");
		}
	}
}
