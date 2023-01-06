package Week_5;

import java.util.*;
public class updatingid {
    String name = "Bidhi";
    int id = 101;
    public static void main(String[] args) {
        updatingid obj1Updatingid=new updatingid();
        updatingid obj2Updatingid=new updatingid();
        System.out.println(" Name: "+ obj1Updatingid.name);
        obj2Updatingid.id = 666;
        System.out.println("Updated id is: " + obj2Updatingid.id);
    }
    
}
