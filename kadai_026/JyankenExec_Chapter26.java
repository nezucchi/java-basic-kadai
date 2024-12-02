package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// じゃんけんクラスのインスタンスを生成する
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		//自分のじゃんけんの手を入力する
		String myHand = jyanken.getMyChoice();
		
		//相手のじゃんけんの手が乱数で選ばれる
		String otherHand = jyanken.getRandom();
		
		//じゃんけんの結果を出力する
		jyanken.playGame(myHand, otherHand);

	}

}
