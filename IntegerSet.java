import java.util.ArrayList;
/**
 * 
 * 
 * 
 */


public class IntegerSet {
    ArrayList <Integer> Numbers; //Rep

    //AF
    //RI  ห้ามมี null   ตัวเลขซ้ำ
    public IntegerSet(){
        Numbers = new ArrayList<>();
    } 



    private void CheckRep(){

    }



    public void add (Integer x ){
        Numbers.add(x);
        CheckRep();
    }






    public String toString(){
    return Numbers.toString();
    }





}


