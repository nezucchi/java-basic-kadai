package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤"; //性フィールド
	public String givenName; //名フィールド
	public String address = "東京都中野区〇×"; //住所フィールド
	
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は"+this.familyName+this.givenName+"です");
		System.out.println("住所は"+this.address+"です");
	}
	
	
	
	//紹介を実行する
	public void execIntroduce(){
		commonIntroduce();
		eachIntroduce();
	}
	

}


	
		
