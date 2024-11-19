package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車クラスのインスタンスを生成
		Car_Chapter15 gear = new Car_Chapter15(3,30);
		
		//車クラスのgearChangeメソッドの実行
		gear.gearChange(3);
		//車クラスのrunメソッドの実行
		gear.run();

	}

}
