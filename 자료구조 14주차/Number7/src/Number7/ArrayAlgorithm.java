package Number7;

public class ArrayAlgorithm {
	public static void main(String [] args) {
		GenData gd = new  GenData();	// �������ĵ� �����ִ� Ŭ����
		int []arr1 = gd.getRandIntArr(10000, 0, 10000);	// ���ĵ��� ���� �迭 ����
		int []arr2 = new int[10000];
		int []arr3 = new int[10000];
		int []arr4 = new int[10000];
		int []arr5 = new int[10000];
		int [] temp;
		for(int i = 0; i < 10000; i++ ) {	// ������ �迭�� �� 5�� ����
			arr2[i] = arr1[i];
			arr3[i] = arr1[i];
			arr4[i] = arr1[i];
			arr5[i] = arr1[i];
		}
		
		Selection s = new Selection();	// ���� ����
		Insertion i = new Insertion();	// ���� ����
		Merge m = new Merge();			// �պ� ����
		Quick q = new Quick();			// �� ����
		
		long beforeTime = System.currentTimeMillis();	// �ð� ���� ����
		temp = gd.doSort(arr1);			// ���� ����
		long afterTime = System.currentTimeMillis();	// �ð� ���� ����
		long diffTimeMilliSecond = afterTime-beforeTime;// �� �ð��� ���� ��� 
		System.out.println("[Bubble] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// �ð� ���� ����
		s.sort(arr2);					// ���� ����
		afterTime = System.currentTimeMillis();			// �ð� ���� ����
		diffTimeMilliSecond = afterTime-beforeTime;		// �� �ð��� ���� ���
		System.out.println("[Selection] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// �ð� ���� ����
		i.sort(arr3);					// ���� ����
		afterTime = System.currentTimeMillis();			// �ð� ���� ����		
		diffTimeMilliSecond = afterTime-beforeTime;		// �� �ð��� ���� ���
		System.out.println("[Insertion] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// �ð� ���� ����
		m.sort(arr4);					// �պ� ����
		afterTime = System.currentTimeMillis();			// �ð� ���� ����
		diffTimeMilliSecond = afterTime-beforeTime;		// �� �ð��� ���� ���	
		System.out.println("[Merge] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// �ð� ���� ����
		q.sort(arr5);					// �� ����
		afterTime = System.currentTimeMillis();			// �ð� ���� ����
		diffTimeMilliSecond = afterTime-beforeTime;		// �� �ð��� ���� ���
		System.out.println("[Quick] Time diff (ms): " + diffTimeMilliSecond);
		
	}

}
