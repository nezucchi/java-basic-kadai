package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
			
		
		while(true) {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		//Scannerクラスのオブジェクト生成
		Scanner scanner = new Scanner(System.in);
		
		//入力した内容を取得する
		String input = scanner.next();
		
		//正しいじゃんけんの手であるかを判定する
		if((input.equals("r"))||(input.equals("s"))||(input.equals("p"))) {
			//Scannerクラスのオブジェクトをクローズする
			scanner.close();
			return input;
			}else {
				System.out.println("r（グー）かs（チョキ）かp（パー）を入力してください");
			}
		}
		
		
		
		}
	
		//対戦相手のじゃんけんの手を乱数で取得するメソッド
	public String getRandom() {
		
		//配列にじゃんけんの手をセットする
		String[] handArray = {"r", "s", "p"};
		
		String otherHand = null;
		double random = Math.random()*2;
		
		//乱数で対戦相手のじゃんけんを選ぶ
		if((Math.floor(random)+1) == 1) {
			otherHand = handArray[0];//グー
		}else if((Math.floor(random)+1) == 2) {
			otherHand = handArray[1];//チョキ
		}else if((Math.floor(random)+1) == 3) {
			otherHand = handArray[2];//パー
		};
		
		return otherHand;
		
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String myHand, String otherHand) {
		
		HashMap<String,String> hand = new HashMap<String,String>();
		
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		System.out.println("自分の手は"+hand.get(myHand)+",相手の手は"+hand.get(otherHand));
		
		if(myHand.equals(otherHand)) {
			System.out.println("あいこです");
		}else if (myHand.equals("r") && otherHand.equals("s")) {
			System.out.println("自分の勝ちです");
		}else if (myHand.equals("r") && otherHand.equals("p")) {
			System.out.println("自分の負けです");
		}else if (myHand.equals("s") && otherHand.equals("r")) {
			System.out.println("自分の負けです");
		}else if (myHand.equals("s") && otherHand.equals("p")) {
			System.out.println("自分の勝ちです");
		}else if (myHand.equals("p") && otherHand.equals("r")) {
			System.out.println("自分の勝ちです");
		}else if (myHand.equals("p") && otherHand.equals("s")) {
			System.out.println("自分の負けです");
		};
	}
	
	

}
