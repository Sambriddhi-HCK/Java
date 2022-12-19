package Week_5;
import java.util.*;
 class attendance{
    boolean ispresent;
    public void present() {
        ispresent = true;
        System.out.println("Sara is present: "+ ispresent);
    }
    public void absent() {   
        ispresent= false;
        System.out.println("Rama is present "+ ispresent);
    }
}

public class main{
    public static void main(String[] args) {
     attendance sara = new attendance();
     attendance rama = new attendance();

     sara.present();
     rama.absent();

    }
}
