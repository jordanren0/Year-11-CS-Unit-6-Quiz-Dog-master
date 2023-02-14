public class DogMaker {
  
  public static void main(String[] args) {
    Dog dog = new Dog(2, "Jill", "black and tan");
    dog.setName("Jessie");
    System.out.println(dog.getAge());
    int age = dog.birthday();
    System.out.println(age);
    System.out.println(dog.toString());
    
  }
  
}
