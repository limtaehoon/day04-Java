package day04;

public class Car {
	String carkind;
	String carcolor;
	int speed;
	//생성자
	
	//디폴트 생셩자=>생략가능,하지만 다른생성자가 있을때는 생략불가능
	//오버로딩:생성자 이름은 같은데 유형과갯수가 다른것
	public Car() {
		System.out.println("디폴트생성자");
	}
	public Car(String carcolor,String carkind) {
		this.carcolor=carcolor;
		this.carkind=carkind;
		System.out.println("인자있는 생성자");
	
	}
		
		public void speedup( int s)  {//s=100
		speed+=s;
	}
		public void stop() {
			speed =0;
		}
		public void speeddown( int spped) {
			this.speed-=speed;
		}
		
		
		public static void main(String[] args) {
		Car mycar=new Car();
	
		mycar.carkind="소나타";
		mycar.carcolor="흰색";
		mycar.speedup(100);
		System.out.println("속도:"+mycar.speed);
		System.out.println("color:"+mycar.carcolor);
		mycar.stop();
		System.out.println("속도:"+mycar.speed);
		//c1 객체 만들어 
		//"검은색""뉴카"라는 차
		//speedup{80},속도 출력		
		//speeddown(50)
		
		
		Car c1=new Car ();
		c1.carcolor="검은색";
		c1.carkind="뉴카";
		c1.speedup(80);
		System.out.println("뉴카clor:"+c1.carcolor);
		System.out.println("뉴카속도"+c1.speed);
		c1.speeddown(50);
		System.out.println("뉴카속도:"+c1.speed);
		System.out.println(c1);
		System.out.println(mycar);
		
		//생성자->
		Car c2= new Car("분홍색","내차");//Car=분홍색 c2=내차
		
		
		
		
	
	

		}
}