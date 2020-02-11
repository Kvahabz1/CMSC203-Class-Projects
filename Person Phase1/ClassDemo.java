public class ClassDemo {
 public static void main(String[] args) {
 Person a = new Person();  a.name = "Bob"; a.age = 25;  Person b = new Person();  b.name = "Mary"; b.age = 35;  a.SayName(); a.HaveBirthday();  b.SayName(); b.HaveBirthday();  a.SayName(); b.SayName(); 
 }
}