package Number5;

public class main {
	public static void main(String[] args) {
		AnimalShelter ani = new AnimalShelter();	// AnimalShelter ���� ��ȣ�� ��ü
		ani.enter("Brad",	"D");
		ani.enter("Tom",	"D");
		ani.enter("Cindy",	"C");
		ani.enter("Jake",	"D");
		ani.enter("Jenny",	"C");
		ani.enter("Alex",	"D");
		ani.enter("Lucy",	"C");
		ani.enter("Maggie",	"C");
		ani.print();		// Task 1 ��� ������ �Է��� print
		
		ani.adoptAny();		
		ani.print();		// Task 2 adoptAny ȣ�� �� print
		
		ani.adoptCat();
		ani.print();		// Task 3 adoptCat ȣ�� �� print
		
		ani.adoptDog();		
		ani.print();		// Task 4 adoptDog ȣ�� �� print
		
		ani.adoptAny();		
		ani.print();		// Task 5 adoptAny ȣ�� �� print
		 
		ani.adoptDog();		
		ani.print();		// Task 6 adoptDog ȣ�� �� print
	}
}
