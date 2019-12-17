package Number5;

public class main {
	public static void main(String[] args) {
		AnimalShelter ani = new AnimalShelter();	// AnimalShelter 동물 보호소 객체
		ani.enter("Brad",	"D");
		ani.enter("Tom",	"D");
		ani.enter("Cindy",	"C");
		ani.enter("Jake",	"D");
		ani.enter("Jenny",	"C");
		ani.enter("Alex",	"D");
		ani.enter("Lucy",	"C");
		ani.enter("Maggie",	"C");
		ani.print();		// Task 1 모든 동물을 입력후 print
		
		ani.adoptAny();		
		ani.print();		// Task 2 adoptAny 호출 후 print
		
		ani.adoptCat();
		ani.print();		// Task 3 adoptCat 호출 후 print
		
		ani.adoptDog();		
		ani.print();		// Task 4 adoptDog 호출 후 print
		
		ani.adoptAny();		
		ani.print();		// Task 5 adoptAny 호출 후 print
		 
		ani.adoptDog();		
		ani.print();		// Task 6 adoptDog 호출 후 print
	}
}
