// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n=Integer.parseInt(args[0]);
		double calcPie=1.0;
		double tempCounter=3;

		for (int i=0;i<n;i++)
		{
			if (i%2==0) 
			{
				calcPie=calcPie-(1/(tempCounter));
			}
			else calcPie=calcPie+(1/(tempCounter));
			tempCounter=tempCounter+2;
		}
		calcPie=calcPie*4;
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println(", approximated: "+calcPie);
	}
}
