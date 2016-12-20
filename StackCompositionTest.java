import com.deitel.jhtp4.ch19.StackComposition;
import com.deitel.jhtp4.ch19.EmptyListException; 

public class StackCompositionTest {

	public static void main(String args[]) {
		StackComposition stackComposition = new StackComposition();

		Boolean bool = Boolean.TRUE;
		Character character = new Character('$');
		Integer integer = new Integer(34567);
		String string = "hello";

		stackComposition.push(bool);
		stackComposition.print();
		stackComposition.push(character);
		stackComposition.print();
		stackComposition.push(integer);
		stackComposition.print();
		stackComposition.push(string);
		stackComposition.print();

		try {
			Object removedObject = null;

			while (true) {
				removedObject = stackComposition.pop();
				System.out.println(removedObject.toString() + " popped");
				stackComposition.print();
			}
		} catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}
