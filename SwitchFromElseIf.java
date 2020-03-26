package scratch_2;

public class SwitchFromElseIf {

	public static void main(String[] args) {
		int x=1, a=3;
		switch(a) 
		{
		case 1: x+=5;break;
		case 2:x+=10;break;
		case 3:x+=16;break;
		case 4:x+=34;
		}
		System.out.println(x);
		
		a=3;x=1;
		if(a==1)
			x+=5;
		else if(a==2)
			x+=10;
		else if(a==3)
			x+=16;
		else if(a==4)
			x+=34;
		System.out.println(x);
		
		System.out.println((int)(Math.random()*10)/10.0);//rounds decimal
		System.out.println((int)(Math.random()*100)/100.0);//rounds decimal
	}

}
