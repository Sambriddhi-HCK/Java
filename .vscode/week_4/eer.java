package week_4;

public class eer{ 
public static void main(String[] args) { 
int num; 
String a = System.console().readLine("Enter a non-zero value:"); num = Integer.parseInt(a); 
while (num == 0) { 
a = System.console().readLine("Enter a non-zero value:"); 
num = Integer.parseInt(a); 
} 
} 
}

