import java.util.HashMap;

class hashMap {
  public static void main(String[] args) {

    // create a hashmap
    
    HashMap<String, Integer> fruits = new HashMap<>();

    // add elements to hashmap
    fruits.put("Apple", 8);
    fruits.put("Banana", 1);
    fruits.put("Orange", 3);
    fruits.put("Grapes", 7);
    fruits.put("Guava", 6);
    System.out.println("HashMap: " + fruits);
  }
}