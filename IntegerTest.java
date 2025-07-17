public class IntegerTest {
    public static void main(String[] args) {
        int Passed = 0;
        int Failed = 0;
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(70);
        String s = "[50,70]" ;
        if(a.toString().replaceAll(" ", "").equals(s))
        System.out.println("Pass");
        else 
        System.out.println("Fail");


        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + Passed + ", Failed: " + Failed);
        if (Failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }

    

    

  


}