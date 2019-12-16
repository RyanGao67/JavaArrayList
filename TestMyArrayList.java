package myArrayList;

public class TestMyArrayList {
	public static void main(String[] args) {
		MyList<String> list = new MyArrayList();
		list.add("America");
		System.out.println("(1)" + list);
		list.add(0, "Canada");
		list.add("Russia");
		list.add("France");
		list.add("Germany");
		list.add(5, "Norway");
		for(String s : list) {
			System.out.print(s.toUpperCase()+" ");
		}
		System.out.println();
		list.remove("Canada");
		list.remove(2);
		list.remove(list.size()-1);
		for(String s : list) {
			System.out.print(s.toUpperCase()+" ");
		}
	}
}
