public class TestClass {
    public String sayHello() {
        return "Hello";
    }

    public static void main(String[] args) {
        String h =  new TestClass().sayHello();
        System.out.println(h);
    }
}