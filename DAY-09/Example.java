public class Example {
    
    
    @Test(name = "a test", enabled = true)
    public static void test1() {
        System.out.println("Test executed");
    }

    @Test(name = "a test", enabled = true)
    public static void test2() {
        System.out.println("Test executed");
    }


public static void main(String[] args) throws Exception {
    TestRunner.runTests(Example.class);
}

}
