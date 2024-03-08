package kadai_015;

// 車クラス
public class car_Chapter15 {
			
	// フィールド（内部データ）
		private int gear = 1;
		private int speed = 10;
		
		// コンストラクタ（初期化処理）
		public car_Chapter15( int gear, int speed ) {
			this.gear  = gear;
			this.speed = speed;
		}
		
/*		public int getGear() {
			return this.gear;
		}
		
		public int getSpeed() {
			return this.speed;
		} 
*/	
				
		// メソッド
		public void gearChange(int afterGear) {
/*			this.gear = afterGear;
			this.speed = switch(this.gear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
			};
*/			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		} 
			
/*		public void gearChange() {
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
			
		}	
*/		
		public void run() {
			int speed = this.speed * this.gear;
			System.out.println("速度は時速" + speed + "kmです");
		}
		
}