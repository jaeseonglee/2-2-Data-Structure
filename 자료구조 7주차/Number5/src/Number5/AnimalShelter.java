package Number5;

public class AnimalShelter { 		// ���� ��ȣ�Ҹ� ������ AnimalShelterŬ����
	private ListQueue<String> animal;	// ������ �̸��� �����ϴ� animal ť
	private ListQueue<String> dogCat;	// �������� �����ϴ� dogCat ť
	
	public AnimalShelter() {		// ������
		animal = new ListQueue<String>();	// �� ���� ť�� ������ش�.
		dogCat = new ListQueue<String>();
	}
	
	public void enter(String name, String kind) {	// ������ ��ȣ�ҿ� �鿩���� enter �޼ҵ�
		animal.add(name);		// ���� ����� ������� ť�� ����
		dogCat.add(kind);		
	}
	
	public void print() {		// ��ȣ���� �������� ����ϴ� print��
		int queueSize = animal.size();	// ť�� ũ�⸦ ������ queue ����
		String temp = null;		// ���ڿ� ���� temp null�� �ʱ�ȭ
		
		for(int i = 0; i < queueSize; i++) {// �ݺ����� ���� ���
			temp = animal.remove();		// ������ �̸��� temp�� �����ϰ�
			System.out.print(temp+" ");	// ���
			animal.add(temp);			// �ٽ� ť�� �������ش� -> �ݺ����� ���� ť�� �ٽ� ���� ���·� �ǵ��ư���.
			
			temp = dogCat.remove();		// �������� temp�� �����ϰ�
			if(temp == "D") System.out.print("(Dog)");	// ������ ��������� Ȯ���Ͽ� ���
			else System.out.print("(Cat)");
			dogCat.add(temp);			// �ٽ� ť�� �������ش� -> dogCatť�� ���������� �ٽ� ���� ���·� �ǵ�����.
			
			if(i != queueSize-1 ) System.out.print(" - ");	// �߰��� '-'�� ����ϴ� ���ǹ�
		}
		System.out.println();		// ��� ����� ������ �ٹٲ�
	}
	
	public void adoptAny() {		// �ƹ� �����̳� �Ծ��ϴ� adoptAny�޼ҵ�
		String temp = animal.remove();	// ť�� remove�޼ҵ忡 isEmpty�� �ֱ� ������ 
		temp = dogCat.remove();			// ť�� �ƹ� ������ ������  NoSuchElementException ������ �����Ѵ�.
	}
	
	public void adoptDog() {		// ������ �Ծ��ϴ� adoptDog�޼ҵ�
		String temp = null;			// ���ڿ� ���� temp ���� �� null�� �ʱ�ȭ
		int queueSize = 0;			// ť�� ���̸� ������ ������ ���� queueSize ���� �� �ʱ�ȭ
		int count = 0;				// ť�� ���� �ִ��� �Ǵ� ���� ã�� ���� ��� �ݺ��ߴ��� ���� count ���� �� �ʱ�ȭ
		
		while(true) {				// ���� �ݺ������� ���� �Ծ纸����
			temp = dogCat.remove();	// ���� �Ǿ��� �������� remove�Ͽ� temp�� ����
			if(temp == "D")	break;	// ���� ������ �ݺ��� Ż��
			
			dogCat.add(temp);		// ���� �ƴϸ� �ٽ� ť�� �־��ش�.
			count++;				// count ����
			
			if( count > dogCat.size()) {	// ��ȣ�ҿ� ���� ������ ��, count�� ť�� ũ�⸦ �Ѿ��
				System.out.println("���� ��ȣ�ҿ� ���� �����ϴ�..");	// ���� ���ٰ� ���
				return ;			// �޼ҵ� ��ü�� �����Ų��. 
			}
		}
		
		if (count == 0) temp = animal.remove();	// count���� 0�̸� �ٷ� ���� ã�ұ⶧���� �Ծ纸����
		else {									// �װ� �ƴ϶��
			queueSize = dogCat.size();			// �ݺ����� ���� 1������ �������� ũ�⸦ ���� 
			for(int i = 0; i < queueSize - count; i++) {// count���� ���� ã�µ� �ɸ� �ݺ��� Ƚ���̹Ƿ�, ť�� �ٽ� �����ϱ� ���� �ݺ�
				temp = dogCat.remove();			// remove�� add�� ���� ���� �� ���� ���� �Ծ� ���� ť��  
				dogCat.add(temp);				// �������ش�.
			}
			
			for( ; count != 0; count--) {		// �����̸� ť�� count�� ���� �Ǿ��� ���� ã���ش�
				temp = animal.remove();			// ���� ã�������� ť�� �ٽ� �׾��ش�
				animal.add(temp);
			}
			temp = animal.remove();				// �ٷ� ���� �ݺ����� ���� ���� ã������ �Ծ纸����
			
			for(int i = 1; i < queueSize; i++) {// ���� �ݺ��� ������ ������ �̻��� ť�� �ٽ� ������� �����ش�.
				temp = animal.remove();
				animal.add(temp);
			}
		}
	}
	
	public void adoptCat() {		// ����̸��� �Ծ��ϴ� adoptCat�޼ҵ� 	
		String temp = null;			// ���ڿ� ���� temp ���� �� null�� �ʱ�ȭ
		int queueSize = 0;			// ť�� ���̸� ������ ������ ���� queueSize ���� �� �ʱ�ȭ
		int count = 0;			// ť�� ����̰� �ִ��� �Ǵ� ����̸� ã�� ���� ��� �ݺ��ߴ��� ���� count ���� �� �ʱ�ȭ
		
		while(true) {				// ���� �ݺ���
			temp = dogCat.remove();	// ���� �Ǿ��� �������� remove�Ͽ� temp�� ����
			if(temp == "C")	break;	// ����̰� ������ �ݺ��� Ż��
			
			dogCat.add(temp);		// ����̰� �ƴϸ� �ٽ� ť�� �־��ش�
			count++;				// count ����
			
			if( count > dogCat.size()) {// ��ȣ�ҿ� ����̰� ������ ��, count�� ť�� ũ�⸦ �Ѿ��
				System.out.println("���� ��ȣ�ҿ� ����̰� �����ϴ�..");	// ����̰� ���ٰ� ���
				return ;		// �޼ҵ� ��ü�� �����Ų��. 
			}
		}
		
		if (count == 0) temp = animal.remove(); // count���� 0�̸� �ٷ� ����̸� ã�ұ� ������ �Ծ纸����
		else {
			queueSize = dogCat.size();	// �ݺ����� ���� 1������ �������� ũ�⸦ ���� 
			for(int i = 0; i < queueSize - count; i++) {//ť�� �ٽ� �����ϱ� ���� �ݺ�
				temp = dogCat.remove();		// remove�� add�� �������ش�
				dogCat.add(temp);
			}
			
			for( ; count != 0; count--) {	// �����̸� ť�� count�� ���� �Ǿ��� ����̸� ã���ش�
				temp = animal.remove();		// ����̸� ã�������� ť�� �ٽ� �׾��ش�
				animal.add(temp);
			}
			temp = animal.remove();		// �ٷ� ���� �ݺ����� ���� ����̸� ã������ �Ծ纸����
			
			for(int i = 1; i < queueSize; i++) {// ���� �ݺ��� ������ ������ �̻��� ť�� �ٽ� ������� �����ش�.
				temp = animal.remove();
				animal.add(temp);
			}
		}
	}
	
}
