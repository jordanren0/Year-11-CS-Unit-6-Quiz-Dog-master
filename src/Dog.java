public class Dog {
    private static int age;
    private static String name;
    private static String color;

    public Dog(){
        age = 0;
        name = "";
        color = "";
    }

    public Dog(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    private static void addOneAge(){
        age++;
    }

    public static int getAge(){
        return age;
    }

    public static String getName(){
        return name;
    }

    public static String getColor(){
        return color;
    }

    public static void setAge(int newAge){
        age = newAge;
    }

    public static void setColor(String newColor){
        color = newColor;
    }

    public static void setName(String newName){
        name = newName;
    }

    public static int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        return "This dog is named " + name + " and is " + age + " years old. This dog is " + color + ".";
    }
}
