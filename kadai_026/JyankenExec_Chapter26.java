package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {

		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();

		String hand = jyanken.getMyChoice();
		//System.out.println(hand);

		String randomHand = jyanken.getRandom();
		//System.out.println(randomHand);

		jyanken.playGame(hand, randomHand);

	}

}
