package day04;

public class Blnk {
	String name;//이름 멤버변수(전역변수)
	int money;//잔액 
	public Blnk() {
	}
	public Blnk(String name,int money){
		this.name=name;
		this.money=money;
	}
	
	
	
	
	//입금
	public void inputmoney(int don) {//don=지역변수
		money+=don;
	}	
    //출금	
	public void outmoney(int don) {
	
    if(money<don){
		System.out.println(name+"님 잔액부족");
	    return;    
    }
	money-=don;
	}
	//잔액확인
	public void getmoney() {
		
		System.out.println(name+"남은잔액은"+money+"원입니다");
	}
	
	public static void main(String[] args) {
		//Bank 객체 b1을 만들고
		Blnk b1=new Blnk();
		// b1의 이름을 홍길동
		b1.name="홍길동";
		//홍길동이 5000원을 입금하고 잔액을 확인함
		b1.inputmoney(5000);
		b1.getmoney();
		// 홍길동님의 잔액은 5000원입니다
		
		//홍길동이 3000원을 출금하고 잔액확인
		b1.outmoney(3000);
		
		//홍길동의 잔액은 2000원입니다.
		b1.getmoney();
		
		//이순신 고객이 10000원 입금
	Blnk b2=new Blnk();
		b2.name="이순신";
		b2.inputmoney(10000);
		//잔액확인
		b2.getmoney();
		//이순신이 20000원 출금 
		b2.outmoney(20000);
		//잔액확인
		b2.getmoney(); 
		
		Blnk b3= new Blnk("강감찬",20000);
		b3.getmoney();
	
	
	
	
	
	}
	
	
	
}	
	
	
	
	
	
	
	
	