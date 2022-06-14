import java.util.LinkedList;

class linkedlist {
  public static void main(String[] args){

    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    animals.add("Rabbit");
    System.out.println("LinkedList: " + animals);
  }
}