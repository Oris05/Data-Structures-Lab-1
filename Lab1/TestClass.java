
public class TestClass {
	
	public static void displayList(ListArrayBased list) {
		System.out.print("The list contains :");
		for(int i = 1; i <= list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println(" ");
	}
	
	public static void main(String[]args) {
		ListArrayBased list = new ListArrayBased();
		System.out.println("Testing an Array based ADT List");
		//testing isEmpty
		System.out.println("Is the the list empty? "+list.isEmpty());
		//test add
		list.add(1, "car");
		list.add(2, "bike");
		list.add(3, "ship");
		System.out.println("After adding items");
		displayList(list);
		//test remove
		list.remove(1);
		System.out.println("After removing an item");
		displayList(list);
		//test remove all
		list.removeAll();
		System.out.println("After everything was removed ");
		displayList(list);
		System.out.println("All tests complete");
	}
	
}
