import java.util.*;  
class HS{  
 public static void main(String args[]){  

    HashSet<String> set=new HashSet();  
           
        set.add("Five");  
        set.add("Four"); 
        set.add("Three");  
        set.add("Two"); 
        set.add("One");    
            
             
            
            
           System.out.println(set);
          
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  