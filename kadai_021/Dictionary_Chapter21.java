package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	//HashMapの宣言
	 public HashMap<String,String> wordMap = new HashMap<String,String>();{

     wordMap.put("apple","りんご");
     wordMap.put("apeach","桃");
     wordMap.put("banana","バナナ");
     wordMap.put("lemon","レモン");
     wordMap.put("pear","梨");
     wordMap.put("kiwi","キウィ");
     wordMap.put("strawberry","いちご");
     wordMap.put("grape","ぶどう");
     wordMap.put("muscat","マスカット");
     wordMap.put("cherry","さくらんぼ");
	}
     
     //調べる英単語が辞書に追加されているかを判定
     public void searchWords(String[] wordsArray) {
    	     	 for(String word : wordsArray) {
    		 if(wordMap.containsKey(word)) {
    			 System.out.println(word + "の意味は" + wordMap.get(word));
    		 }
    		 else {
    			 System.out.println(word +"は辞書に存在しません");
    		 }
    		 }
     }
	
}