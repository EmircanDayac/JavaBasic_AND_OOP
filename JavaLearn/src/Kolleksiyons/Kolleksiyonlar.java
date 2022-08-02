package Kolleksiyons;

import java.util.ArrayList;

public class Kolleksiyonlar {

  public static void fucn(){
      ArrayList arrayList = new ArrayList();
      arrayList.add(10);
      arrayList.add(90);
      arrayList.add(80);
      arrayList.size();
      arrayList.remove(0);
      arrayList.clear();
      arrayList.get(0);
      for(Object i:arrayList){
          System.out.println(i);


      }

      ArrayList<String> arrayList_x = new ArrayList<String>();
      arrayList_x.add("antalya");

      for (String a:arrayList_x){
          System.out.println(a);
      }


      ArrayList<Person> _person = new ArrayList<Person>();
      _person.add(new Person("emircan","dayac"));

      for (Person _P:_person){
     System.out.println(_P.name);
      }
  }

}
