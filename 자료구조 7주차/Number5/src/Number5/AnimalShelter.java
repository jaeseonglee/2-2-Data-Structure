package Number5;

public class AnimalShelter { 		// 동물 보호소를 구현한 AnimalShelter클래스
	private ListQueue<String> animal;	// 동물의 이름을 저장하는 animal 큐
	private ListQueue<String> dogCat;	// 동물종을 저장하는 dogCat 큐
	
	public AnimalShelter() {		// 생성자
		animal = new ListQueue<String>();	// 두 개의 큐를 만들어준다.
		dogCat = new ListQueue<String>();
	}
	
	public void enter(String name, String kind) {	// 동물을 보호소에 들여오는 enter 메소드
		animal.add(name);		// 개와 고양이 상관없이 큐에 저장
		dogCat.add(kind);		
	}
	
	public void print() {		// 보호소의 동물들을 출력하는 print문
		int queueSize = animal.size();	// 큐의 크기를 저장한 queue 변수
		String temp = null;		// 문자열 변수 temp null로 초기화
		
		for(int i = 0; i < queueSize; i++) {// 반복문을 통해 출력
			temp = animal.remove();		// 동물의 이름을 temp에 저장하고
			System.out.print(temp+" ");	// 출력
			animal.add(temp);			// 다시 큐에 저장해준다 -> 반복문을 통해 큐를 다시 원래 형태로 되돌아간다.
			
			temp = dogCat.remove();		// 동물종을 temp에 저장하고
			if(temp == "D") System.out.print("(Dog)");	// 개인지 고양이인지 확인하여 출력
			else System.out.print("(Cat)");
			dogCat.add(temp);			// 다시 큐에 저장해준다 -> dogCat큐도 마찬가지로 다시 원래 형태로 되돌린다.
			
			if(i != queueSize-1 ) System.out.print(" - ");	// 중간에 '-'을 출력하는 조건문
		}
		System.out.println();		// 모든 출력이 끝나면 줄바꿈
	}
	
	public void adoptAny() {		// 아무 동물이나 입양하는 adoptAny메소드
		String temp = animal.remove();	// 큐의 remove메소드에 isEmpty가 있기 때문에 
		temp = dogCat.remove();			// 큐에 아무 정보도 없으면  NoSuchElementException 에러로 종료한다.
	}
	
	public void adoptDog() {		// 개만을 입양하는 adoptDog메소드
		String temp = null;			// 문자열 변수 temp 선언 및 null로 초기화
		int queueSize = 0;			// 큐의 길이를 저장할 정수형 변수 queueSize 선언 및 초기화
		int count = 0;				// 큐에 개가 있는지 또는 개를 찾기 위해 몇번 반복했는지 세는 count 선언 및 초기화
		
		while(true) {				// 무한 반복문으로 개를 입양보낸다
			temp = dogCat.remove();	// 가장 맨앞의 동물종을 remove하여 temp에 저장
			if(temp == "D")	break;	// 개가 맞으면 반복문 탈출
			
			dogCat.add(temp);		// 개가 아니면 다시 큐에 넣어준다.
			count++;				// count 증가
			
			if( count > dogCat.size()) {	// 보호소에 개가 없으면 즉, count가 큐의 크기를 넘어서면
				System.out.println("동물 보호소에 개가 없습니다..");	// 개가 없다고 출력
				return ;			// 메소드 자체를 종료시킨다. 
			}
		}
		
		if (count == 0) temp = animal.remove();	// count값이 0이면 바로 개를 찾았기때문에 입양보낸다
		else {									// 그게 아니라면
			queueSize = dogCat.size();			// 반복문을 통해 1감소한 동물종의 크기를 저장 
			for(int i = 0; i < queueSize - count; i++) {// count값은 개를 찾는데 걸린 반복의 횟수이므로, 큐를 다시 정렬하기 위해 반복
				temp = dogCat.remove();			// remove와 add를 통해 가장 맨 앞의 개가 입양 후의 큐를  
				dogCat.add(temp);				// 정렬해준다.
			}
			
			for( ; count != 0; count--) {		// 동물이름 큐도 count를 통해 맨앞의 개를 찾아준다
				temp = animal.remove();			// 개를 찾을때까지 큐를 다시 쌓아준다
				animal.add(temp);
			}
			temp = animal.remove();				// 바로 위의 반복문을 통해 개를 찾았으면 입양보낸다
			
			for(int i = 1; i < queueSize; i++) {// 위의 반복문 때문에 순서가 이상한 큐를 다시 원래대로 돌려준다.
				temp = animal.remove();
				animal.add(temp);
			}
		}
	}
	
	public void adoptCat() {		// 고양이만을 입양하는 adoptCat메소드 	
		String temp = null;			// 문자열 변수 temp 선언 및 null로 초기화
		int queueSize = 0;			// 큐의 길이를 저장할 정수형 변수 queueSize 선언 및 초기화
		int count = 0;			// 큐에 고양이가 있는지 또는 고양이를 찾기 위해 몇번 반복했는지 세는 count 선언 및 초기화
		
		while(true) {				// 무한 반복문
			temp = dogCat.remove();	// 가장 맨앞의 동물종을 remove하여 temp에 저장
			if(temp == "C")	break;	// 고양이가 맞으면 반복문 탈출
			
			dogCat.add(temp);		// 고양이가 아니면 다시 큐에 넣어준다
			count++;				// count 증가
			
			if( count > dogCat.size()) {// 보호소에 고양이가 없으면 즉, count가 큐의 크기를 넘어서면
				System.out.println("동물 보호소에 고양이가 없습니다..");	// 고양이가 없다고 출력
				return ;		// 메소드 자체를 종료시킨다. 
			}
		}
		
		if (count == 0) temp = animal.remove(); // count값이 0이면 바로 고양이를 찾았기 때문에 입양보낸다
		else {
			queueSize = dogCat.size();	// 반복문을 통해 1감소한 동물종의 크기를 저장 
			for(int i = 0; i < queueSize - count; i++) {//큐를 다시 정렬하기 위해 반복
				temp = dogCat.remove();		// remove와 add로 정렬해준다
				dogCat.add(temp);
			}
			
			for( ; count != 0; count--) {	// 동물이름 큐도 count를 통해 맨앞의 고양이를 찾아준다
				temp = animal.remove();		// 고양이를 찾을때까지 큐를 다시 쌓아준다
				animal.add(temp);
			}
			temp = animal.remove();		// 바로 위의 반복문을 통해 고양이를 찾았으면 입양보낸다
			
			for(int i = 1; i < queueSize; i++) {// 위의 반복문 때문에 순서가 이상한 큐를 다시 원래대로 돌려준다.
				temp = animal.remove();
				animal.add(temp);
			}
		}
	}
	
}
