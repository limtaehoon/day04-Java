package day04;

public class Car {
	String carkind;
	String carcolor;
	int speed;
	//������
	
	//����Ʈ ������=>��������,������ �ٸ������ڰ� �������� �����Ұ���
	//�����ε�:������ �̸��� ������ ������������ �ٸ���
	public Car() {
		System.out.println("����Ʈ������");
	}
	public Car(String carcolor,String carkind) {
		this.carcolor=carcolor;
		this.carkind=carkind;
		System.out.println("�����ִ� ������");
	
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
	
		mycar.carkind="�ҳ�Ÿ";
		mycar.carcolor="���";
		mycar.speedup(100);
		System.out.println("�ӵ�:"+mycar.speed);
		System.out.println("color:"+mycar.carcolor);
		mycar.stop();
		System.out.println("�ӵ�:"+mycar.speed);
		//c1 ��ü ����� 
		//"������""��ī"��� ��
		//speedup{80},�ӵ� ���		
		//speeddown(50)
		
		
		Car c1=new Car ();
		c1.carcolor="������";
		c1.carkind="��ī";
		c1.speedup(80);
		System.out.println("��īclor:"+c1.carcolor);
		System.out.println("��ī�ӵ�"+c1.speed);
		c1.speeddown(50);
		System.out.println("��ī�ӵ�:"+c1.speed);
		System.out.println(c1);
		System.out.println(mycar);
		
		//������->
		Car c2= new Car("��ȫ��","����");//Car=��ȫ�� c2=����
		
		
		
		
	
	

		}
}