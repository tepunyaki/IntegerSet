public class IntegerTest {
        public static void main(String[] args) {
            int Passed = 0;
            int Failed = 0;
            IntegerSet test = new IntegerSet(); //สร้างข้อมูล
            

            //เพิ่มข้อมูล
            test.add(50);
            test.add(70);
            String s = "[50,70]" ;
            if(test.toString().replaceAll(" ", "").equals(s)){
                System.out.println("Test Case 1: PASSED : Create and  work correctly.");
                Passed ++ ;
            }
            else {
                System.out.println("Test Case 1: FAILED : exception" + test.toString() + "but got" + s );
                Failed ++ ;
            }
            
            //เรียงลำดับค่า
            test.add(30);
            test.add(4);
            test.add(20);
           String s2 = "[4,20,30,50,70]" ;
           if (test.toString().replaceAll("", " ").equals(s2)) {
            System.out.println("Test Case 2: PASSED : sort works correctly.");
            Passed ++ ;
           }
           else {
            System.out.println("Test Case 2: FAILED : exception" + test.toString() + "but got" + s2 );
           }
    
            //เพิ่มเลขที่ซ้ำ 
            test.add(1);
            test.add(30); //มีอยู่แล้วจากด้านบน
            test.add(5); 
            test.add(-3);
            test.add(2);
            test.add(4); //มีอยู่แล้วจากด้านบน
            String s3 = "[-3,1,2,4,5,20,30,50,70]";
            if (test.toString().replaceAll("", " ").equals(s3)) {
                System.out.println("Test Case 3: PASSED :Adding a duplicate does not not changethe size.");
                Passed ++ ; }

                else {
                    System.out.println("Test Case 3: FAILED : exception" + test.toString() + "but got" + s3 );
                   }
    
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

