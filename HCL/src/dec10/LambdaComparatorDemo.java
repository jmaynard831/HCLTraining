package dec10;

import java.util.ArrayList;  
 import java.util.Collections;  
 import java.util.Comparator;  
 import java.util.List;  
 class person{  
      private String name;  
      private int age;  
      person(String name,int age){  
           this.name=name;  
           this.age=age;  
      }  
      String getName(){  
           return name;  
      }  
      int getAge(){  
           return age;  
      }  
 }  
 public class LambdaComparatorDemo {  
      public static void main(String[] javalatteLambda) {  
           List<person> list = new ArrayList<person>();  
           list.add(new person("Pardeep",29));  
           list.add(new person("Ravi",34));  
           list.add(new person("Robert",20));  
           list.add(new person("Smith",34));  
           list.add(new person("Agtha",23));  
           //we'll sort person class with normal comparator and lambda expresion  
//           Collections.sort(list, new Comparator<person>() {  
//                @Override  
//                public int compare(person p1, person p2) {  
//                     // Asc order  
//                     return p1.getName().compareTo(p2.getName());  
//                }  
//           }); 
           Collections.sort(list, (p1, p2)->{
        	   return p1.getName().compareTo(p2.getName());
           });
           
           System.out.println("====Sorted Asc order====");  
           for(person p : list){  
                System.out.println(p.getName());  
           }  
      }  
 }