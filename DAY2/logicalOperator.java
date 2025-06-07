public class Logical {
   public static void main(String[] args) {
int age = 20;
boolean hasID = false;

// AND
if (age > 18 && hasID) {
    System.out.println("You can enter");
} else {
    System.out.println("Entry denied");
}

// OR
if (age > 18 || hasID) {
    System.out.println("Maybe allowed");
}

// NOT
if (!hasID) {
    System.out.println("ID is missing");
}
   }
}