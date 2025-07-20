import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections ;

import javax.management.RuntimeErrorException;
/**
 * ADT ที่เก็บตัวเลขแบบไม่เรียงลำดับกัน
 * 
 * 
 */


public class IntegerSet {
    ArrayList <Integer> Numbers; 
    //* Constructor เริ่มต้นสร้างเซทว่าง **//
    //Rep (RI)  RI  ห้ามมีnull   ห้ามมีตัวเลขซ้ำ  ต้องเรียงจากน้อยไปมาก
    //(AF) number คือเซทของจำนวนเต็มใดๆ
    //
    public IntegerSet(){
        Numbers = new ArrayList<>();
    } 
    //*** ตรวจสอบว่า[ในตัวเอง] (Rep)เป็นจริงมั้ย
    ///
    private void CheckRep(){
      for (Integer i : Numbers ){
        if (i == null){
            throw new RuntimeException("Rep invarint violated : พบ nullในเซท");
        }
      }

      for (int i = 0; i < Numbers.size()-1 ; i++){
        if (Numbers.get(i) > Numbers.get(i +1)){
            throw new RuntimeException("Rep invarint violated : ไม่พบตัวเลขในเซท");
        }
      }
    }


    //* add ตัวเลขเข้าเซท
    // @param x ตัวเลขที่ต้องการ add

    public void add (Integer x ){
        if(x == null) return ;
        if (Numbers.contains(x)) {
            Numbers.add(x);
            Collections.sort(Numbers);
        }
        Numbers.add(x);
        CheckRep();
    }


    // คืนค่าของเซท 
    // return   จำนวนสมาชิกในเซท
    public String toString(){
    return Numbers.toString();
    }





}

