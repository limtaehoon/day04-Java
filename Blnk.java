package day04;

public class Blnk {
	String name;//�̸� �������(��������)
	int money;//�ܾ� 
	public Blnk() {
	}
	public Blnk(String name,int money){
		this.name=name;
		this.money=money;
	}
	
	
	
	
	//�Ա�
	public void inputmoney(int don) {//don=��������
		money+=don;
	}	
    //���	
	public void outmoney(int don) {
	
    if(money<don){
		System.out.println(name+"�� �ܾ׺���");
	    return;    
    }
	money-=don;
	}
	//�ܾ�Ȯ��
	public void getmoney() {
		
		System.out.println(name+"�����ܾ���"+money+"���Դϴ�");
	}
	
	public static void main(String[] args) {
		//Bank ��ü b1�� �����
		Blnk b1=new Blnk();
		// b1�� �̸��� ȫ�浿
		b1.name="ȫ�浿";
		//ȫ�浿�� 5000���� �Ա��ϰ� �ܾ��� Ȯ����
		b1.inputmoney(5000);
		b1.getmoney();
		// ȫ�浿���� �ܾ��� 5000���Դϴ�
		
		//ȫ�浿�� 3000���� ����ϰ� �ܾ�Ȯ��
		b1.outmoney(3000);
		
		//ȫ�浿�� �ܾ��� 2000���Դϴ�.
		b1.getmoney();
		
		//�̼��� ���� 10000�� �Ա�
	Blnk b2=new Blnk();
		b2.name="�̼���";
		b2.inputmoney(10000);
		//�ܾ�Ȯ��
		b2.getmoney();
		//�̼����� 20000�� ��� 
		b2.outmoney(20000);
		//�ܾ�Ȯ��
		b2.getmoney(); 
		
		Blnk b3= new Blnk("������",20000);
		b3.getmoney();
	
	
	
	
	
	}
	
	
	
}	
	
	
	
	
	
	
	
	