public class Scope {

  public static void main(String[] args) {
    
      // Local scope /Method Scope

int s = 45;
System.out.println(s);
// a ko method ke bahar access nahi kar sakte.


// Block Sope {.....}

{
    int b = 20;
    System.out.println(b);//ok
}
 //System.out.println(b); // Error — b is out of scope

  }
}


