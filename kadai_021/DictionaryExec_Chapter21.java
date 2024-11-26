package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//辞書クラスインスタンスの生成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセットする
		String[] wordsArray = {"apple","banana","grape","orange"};
		
		//辞書を調べる
		dictionary.searchWords(wordsArray);

	}

}
