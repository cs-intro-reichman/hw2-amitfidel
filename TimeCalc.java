public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addM= Integer.parseInt(args[1]);
        int addhours= addM/60;
        String printH;
        String printM;
        addM= addM%60;
        hours= hours+addhours;
        if (minutes+addM<60) {
            minutes=minutes+addM;
        }
        else
        {
            minutes=minutes+addM-60;
            hours++;
        }
        hours=hours%24;
         if (hours<10) 
        {
            printH="0"+hours;
        }
        else
        printH=String.valueOf(hours);
        if (minutes<10) 
        {
            printM="0"+minutes;
        }
        else
        printM=String.valueOf(minutes);
        System.out.println(printH+":"+printM);	
    }
}
