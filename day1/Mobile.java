package Week1.day1;

public class Mobile {

	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.makecall();
		mob.sendMsg();
	    System.out.println("This is my mobile");
		// TODO Auto-generated method stub

	}
public void makecall()
{
	String  mobileModel = "iphone13";
	float mobileWeight =500f;
	System.out.println("mobilemodel:"+mobileModel);
	System.out.println("mobileweight:"+mobileWeight);
}
public void sendMsg()
{
boolean isFullcharged =true;
int mobileCost= 45000;
System.out.println("isfullcharged:"+isFullcharged);
System.out.println("Mobilecost:"+mobileCost);
}
}
