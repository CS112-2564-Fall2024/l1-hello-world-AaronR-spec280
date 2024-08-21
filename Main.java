public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        noReturn;
        introduction("Aaron", 18);
        introduction("Victor", 22);
        introcution("Samuel", 34);
    }
    
//First method
    static void noReturn(){
        System.out.println("Return text");
            }

//Second method
    static void introduction(String name, int age){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    
}
