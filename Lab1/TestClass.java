
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
		System.out.print("After adding items the size is now :"+list.size());
	}
}
