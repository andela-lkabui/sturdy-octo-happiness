import com.deitel.jhtp4.ch19.List;
import com.deitel.jhtp4.ch19.EmptyListException;

public class ListTest {
	public static void main(String args[]) {
		List list = new List();

		Boolean bool = Boolean.TRUE;
		Character character = new Character('$');
		Integer integer = new Integer(34567);
		String string = "hello";

		list.insertAtFront(bool);
		list.print();
		list.insertAtFront(character);
		list.print();
		list.insertAtBack(integer);
		list.print();
		list.insertAtBack(string);
		list.print();

		Object removedObject;

		try {
			removedObject = list.removeFromFront();
			System.out.println(removedObject.toString() + " removed");
			list.print();

			removedObject = list.removeFromFront();
			System.out.println(removedObject.toString() + " removed");
			list.print();

			removedObject = list.removeFromBack();
			System.out.println(removedObject.toString() + " removed");
			list.print();
			

			removedObject = list.removeFromBack();
			System.out.println(removedObject.toString() + " removed");
			list.print();
		}
		catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}
