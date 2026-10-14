
import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest=(a>=b && a>=c)? a : (b>=a && b>=c)?b:c;
        System.out.println(largest);
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=10;
        int b=20;
        int large=(a>b )? a:b;
        System.out.println("largest number:"+large);
    }
}



import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=18;
        String result=(a>=18)?"Eligible":"Not Eligible";
      
        System.out.println(result);
    }
}



import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=18;
        int b=56;
        String result=(a>=b)?"PASS":"FAIL";
      
        System.out.println(result);
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        
        int balance=1000;
        //System.out.println(balance);
        balance+=500;
        System.out.println(balance);
        balance-=200;
        System.out.println(balance);
        balance*=2;
      
        System.out.println(balance);
    }
}



import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        boolean id=true;
        boolean ticket=false;
        
      
        System.out.println(id && ticket);
    }
}




 public class Main {
    public static void main(String[] args) {
        boolean id=true;
        boolean ticket=false;
        
      
        System.out.println(id || ticket);
    }
}



import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        boolean id=true;
        //boolean ticket=false;
        
      
        System.out.println(!id );
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
     int id=10;
     int ticket=20;
     int result=id+ticket;
     result=id-ticket;
        
        
        
      
        System.out.println(id );
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
     int id=10;
     int ticket=20;
     id+=ticket;
     System.out.println(id);
    }
}



import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
    int a=7;
    String result=(a%2!=0)?"odd":"even";
    System.out.println(result);
    }
}



 public class Main {
    public static void main(String[] args) {
    int a=7;
    String result=(a%2!=0)?"odd":"even";
    System.out.println(result);
    }
}



import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
    int a=16;
    int b=13;
    String result=(a>b)?"greater":"lesster";
    System.out.println(result);
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
    int a=16;
    int b=13;
    String result=(a<b)?"greater":"lesster";
    System.out.println(result);
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
    int a=16;
    int b=13;
    
    System.out.println((a==b?"equal":(a>b?a:b)));;
    }
}




import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
    int a=13;
    int b=13;
    
    System.out.println((a==b?"equal":(a>b?a:b)));;
    }
}



