import com.deitel.jhtp4.ch19.StackInheritance;
import com.deitel.jhtp4.ch19.EmptyListException;

public class StackInheritanceTest {
	
	public static void main(String args[]) {
		StackInheritance stack = new StackInheritance();

		Boolean bool = Boolean.TRUE;
		Character character = new Character('$');
		Integer integer = new Integer(34567);
		String string = "hello";

		stack.push(bool);
		stack.print();
		stack.push(character);
		stack.print();
		stack.push(integer);
		stack.print();
		stack.push(string);
		stack.print();

		try {
			Object removedObject = null;

			while (true) {
				removedObject = stack.pop();
				System.out.println(removedObject.toString() + " popped");
				stack.print();
			}
		} catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}
