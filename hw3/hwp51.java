package hw3;

public class hwp51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] car1;
		car1 =new Car[3];
		for(int i=0;i<car1.length;i++) {
			car1[i]=new Car();
		}
		car1[0].setCar(1234,20.5);
		car1[1].setCar(2345,30.5);
		car1[2].setCar(3456,40.5);
		for(int i=0;i<car1.length;i++) {
			car1[i].show();
		}
		}
}
class Car
	{
		int num;
		double gas;
		public Car() {
			num=0;
			gas=0.0;
			System.out.println("�Ͳ��F���l");
		}
		
		public void setCar(int n ,double g) {
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas+"�����l");
		}

		void show() {
			System.out.println("�����O"+this.num);
			System.out.println("�T�o�q�O"+this.gas);

		}
	
	}
