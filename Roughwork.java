package begin;

import java.util.Scanner;

public class Roughwork
{
	static float tot=0;
	
	public static void main(String[] args) 
{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("press '0' to continue with calculator OR '1' to exit");
	float i=scan.nextFloat();
	if(i<=0)
	{

System.out.println("enter two values");
float a=scan.nextFloat();
float b=scan.nextFloat();
float sub=a-b;
float add=a+b;
float mul=a*b;
float div=a/b;
System.out.println("choose the operation "
		+ "1.addition "
		+ "2.subraction "
		+ "3.multiplication "
		+ "4.divition");

int op=scan.nextInt();
switch(op)
{
case 1:
		System.out.println("addition value is "+add);
		tot=add;
break;
case 2:
		System.out.println("subraction value is "+sub);
tot=sub;
break;
case 3:
		System.out.println("multiplied value is "+mul);
tot=mul;
break; 
case 4:
		System.out.println("divition value is "+div);
tot=div;
break;
default:
	System.out.println("enter values between 1 to 4");
} 

			System.out.println("press '0' if you want to continue with last total = "+tot+" OR '1' to exit");
	int input=scan.nextInt();
	if(input==0)
	{
		while (tot>0)
		{
		
		System.out.println("enter another value to do operation with last total");
		float av=scan.nextFloat();
		float add1=tot+av;
		float sub1=tot-av;
		float div1=tot/av;
		float mul1=tot*av;
		System.out.println("choose the operation "
				+ "1.addition "
				+ "2.subraction "
				+ "3.multiplication "
				+ "4.divition");
		int newval=scan.nextInt();
		switch(newval)
		{
		case 1:
				System.out.println("addition value is "+add1);
				tot = add1;
		break;
		case 2:
				System.out.println("subraction value is "+sub1);
				tot = sub1;
				break;
		case 3:
				System.out.println("multiplied value is "+mul1);
				tot = mul1;
				break;
		case 4:
				System.out.println("divition value is "+div1);
				tot = div1;
	break;
	}
	
		}}
		else
		{
			System.out.println("Thank you for using sathish's program :)");
		}
	scan.close();
	

}
	else
	{
		System.out.println("Thank you for using sathish's program :)");
	}
	}}