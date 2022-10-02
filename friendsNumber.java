package mini4;

public class Main {

	public static void main(String[] args) {
		int num1=220;
		int num2=284;
		int tot1=0;
		int tot2=0;
		
		for(int i=1;i<num1;i++)
		{
			if(num1 % i==0)
			{
				tot1=tot1+i;
			}
		}
		
		for(int j=1;j<num2;j++)
		{
			if(num2 % j==0)
			{
				tot2=tot2+j;
			}
		}
		if(tot1==num2 && tot2==num1)
		{
			System.out.println("This numbers are friends.");
		}
		else
		{
			System.out.println("This numbers aren't friends.");
		}
	}

}
