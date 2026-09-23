
public class TestClass {
	public static void main(String[]args) {
		ListArrayBased list = new ListArrayBased();
		System.out.println("Testing an Array based ADT List");
		//testing isEmpty
		System.out.println("Is the the list empty? "+list.isEmpty());
		//test add
		list.add(1, "car");
		list.add(2, "bike");
		list.add(3, "ship");
		System.out.println("After adding items the size is now :"+list.size());
		//test remove
		list.remove(1);
		System.out.println("After removing an item the list size is now :"+list.size());
		//test remove all
		list.removeAll();
		System.out.println("After everything was removed the list size is now :"+list.size());
		System.out.println("All tests complete");
	}
}
