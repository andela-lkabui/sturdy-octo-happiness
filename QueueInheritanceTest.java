import com.deitel.jhtp4.ch19.QueueInheritance;
import com.deitel.jhtp4.ch19.EmptyListException;

public class QueueInheritanceTest {

	public static void main(String args[]) {
		QueueInheritance queue = new QueueInheritance();

		Boolean bool = Boolean.TRUE;
		Character character = new Character('$');
		Integer integer = new Integer(34567);
		String string = "hello";

		queue.enqueue(bool);
		queue.print();
		queue.enqueue(character);
		queue.print();
		queue.enqueue(integer);
		queue.print();
		queue.enqueue(string);
		queue.print();

		try {
			Object removedObject = null;

			while (true) {
				removedObject = queue.dequeue();
				System.out.println(removedObject.toString() + " dequeued");
				queue.print();
			}
		} catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}
