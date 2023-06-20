package oopsconcepts;
interface Tvremote
{
	public void channelup();
	public void functions();
}
interface Smarttvremote extends Tvremote
{
	public void powerbutton();
	public void color();
	public void volumebutton();
	
}
class TV implements Smarttvremote
{

	@Override
	public void color() {
		System.out.println("Black");
		
	}

	@Override
	public void powerbutton() {
		System.out.println("Power On");
		
	}

	@Override
	public void volumebutton() {
		System.out.println("Volume Up");
		
	}

	@Override
	public void functions() {
		System.out.println("Function working");
		
	}

	@Override
	public void channelup() {
		System.out.println("channel Up");
		
	}	
}
public class Interfaceprgm1 {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.color();
		ob.powerbutton();
		ob.volumebutton();
		ob.functions();
		ob.channelup();
	}
}
