package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	//コンストラクタ
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}



//メソッド
public void gearChange(final int afterGear) {
	if( gear == 1) {
		speed = 10;
	} else if(gear == 2) {
		speed = 20;
	} else if(gear == 3) {
		speed = 30;
	} else if(gear == 4) {
		speed = 40;
	} else if(gear == 5) {
		speed = 50;
	}else {speed = 10;}
	}

public void run() {
	System.out.println("ギア1から"+ gear+"に切り替えました");
	System.out.println("速度は時速" + speed + "です");
}

}


