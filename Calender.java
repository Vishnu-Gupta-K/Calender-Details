import java.util.*;
class Calender {
    public static void main(String arg[]) {
        Calendar c = Calendar.getInstance();
        System.out.println("Date Is");
        System.out.println(c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
	System.out.println(" Time Is ");
        System.out.println(c.get(Calendar.HOUR) + "/" + c.get(Calendar.MINUTE) + "/" + c.get(Calendar.SECOND));
	System.out.println("Created By Vishnu Gupta Karapakula : )" );
    }
}
