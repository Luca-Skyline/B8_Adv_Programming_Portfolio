
public class Main {
	public static void main(String[] args) {
		Symphony beethovensNinth = new Symphony("Beethoven's Ninth Symphony", (float)74.0, 500000, 1824, "Ludwig Van Beethoven", 4);
		System.out.println(beethovensNinth.getListeners());
		beethovensNinth.addListener();
		System.out.println(beethovensNinth.getListeners());
	}
	
}
