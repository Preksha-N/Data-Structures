//An Example of hashtable.  File name ' HashtableExample.java '
import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        // Creating a Hashtable
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("Key1","Apple");
        hashtable.put("Key2","Ball");
        hashtable.put("Key3","Cat");
        hashtable.put("Key4","Dog");
        hashtable.put("Key5","Eagle");

        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}