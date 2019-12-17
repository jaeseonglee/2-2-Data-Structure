package Number7;

public class ArrayAlgorithm {
	public static void main(String [] args) {
		GenData gd = new  GenData();	// 버블정렬도 속해있는 클래스
		int []arr1 = gd.getRandIntArr(10000, 0, 10000);	// 정렬되지 않은 배열 생성
		int []arr2 = new int[10000];
		int []arr3 = new int[10000];
		int []arr4 = new int[10000];
		int []arr5 = new int[10000];
		int [] temp;
		for(int i = 0; i < 10000; i++ ) {	// 동일한 배열로 총 5개 생성
			arr2[i] = arr1[i];
			arr3[i] = arr1[i];
			arr4[i] = arr1[i];
			arr5[i] = arr1[i];
		}
		
		Selection s = new Selection();	// 선택 정렬
		Insertion i = new Insertion();	// 삽입 정렬
		Merge m = new Merge();			// 합병 정렬
		Quick q = new Quick();			// 퀵 정렬
		
		long beforeTime = System.currentTimeMillis();	// 시간 측정 시작
		temp = gd.doSort(arr1);			// 버블 정렬
		long afterTime = System.currentTimeMillis();	// 시간 측정 종료
		long diffTimeMilliSecond = afterTime-beforeTime;// 두 시간의 차를 계산 
		System.out.println("[Bubble] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// 시간 측정 시작
		s.sort(arr2);					// 선택 정렬
		afterTime = System.currentTimeMillis();			// 시간 측정 종료
		diffTimeMilliSecond = afterTime-beforeTime;		// 두 시간의 차를 계산
		System.out.println("[Selection] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// 시간 측정 시작
		i.sort(arr3);					// 삽입 정렬
		afterTime = System.currentTimeMillis();			// 시간 측정 종료		
		diffTimeMilliSecond = afterTime-beforeTime;		// 두 시간의 차를 계산
		System.out.println("[Insertion] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// 시간 측정 시작
		m.sort(arr4);					// 합병 정렬
		afterTime = System.currentTimeMillis();			// 시간 측정 종료
		diffTimeMilliSecond = afterTime-beforeTime;		// 두 시간의 차를 계산	
		System.out.println("[Merge] Time diff (ms): " + diffTimeMilliSecond);
		
		beforeTime = System.currentTimeMillis();		// 시간 측정 시작
		q.sort(arr5);					// 퀵 정렬
		afterTime = System.currentTimeMillis();			// 시간 측정 종료
		diffTimeMilliSecond = afterTime-beforeTime;		// 두 시간의 차를 계산
		System.out.println("[Quick] Time diff (ms): " + diffTimeMilliSecond);
		
	}

}
