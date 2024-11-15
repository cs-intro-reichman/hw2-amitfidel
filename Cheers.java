// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String cheer=args[0];
           int cheerNum= Integer.parseInt(args[1]);
           int letterNum=cheer.length();
           int i=0;
           cheer=cheer.toUpperCase();
           //System.out.println(cheer);
           while (letterNum>0) 
           {
                if (cheer.charAt(i)=='A'||cheer.charAt(i)== 'E'||cheer.charAt(i)== 'F'||cheer.charAt(i)== 'H'||cheer.charAt(i)== 'I'||
                cheer.charAt(i)== 'L'||cheer.charAt(i)== 'M'||cheer.charAt(i)== 'N'|| cheer.charAt(i)=='O'||cheer.charAt(i)== 'R'||
                cheer.charAt(i)=='S'||cheer.charAt(i)== 'X')
                {
                        System.out.println("Give me an "+cheer.charAt(i)+": "+cheer.charAt(i)+"!");
                }
                else
                System.out.println("Give me a "+cheer.charAt(i)+": "+cheer.charAt(i)+"!");
                i++;
                letterNum--;
           }
           System.out.println("What does that spell?");
           for(i=0;i<cheerNum;i++)
           {
                System.out.println(cheer+"!!!");
           }
        }
}
