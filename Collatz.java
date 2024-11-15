// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int max=Integer.parseInt(args[0]);
		String choice= args[1];
		int n=0;
		int conter=1;
			for (int i=1;i<max+1;i++)
			{
				conter=1;
				n=i;
				String line="";
				if (n==1) 
				{
					n=4;
					line=line+ (String.valueOf(n)+" ");
					conter++;
				}
				while (n!=1) 
				{
					if (n%2==0) 
					{
						n=n/2;	
						line=line+ (String.valueOf(n)+" ");
					}
					else 
					{
						n=(n*3)+1;
						line=line+ ((String.valueOf(n)+" "));
					}
					conter++;
				}
				if (choice.equals("v"))
				{
					line=line+ ("("+conter+")");
					System.out.println(line);
					System.lineSeparator();
				}
			}
			System.out.println("Every one of the first "+max+" hailstone sequences reached 1.");
	}
}
