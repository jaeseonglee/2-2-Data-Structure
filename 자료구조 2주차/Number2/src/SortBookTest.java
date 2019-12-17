/**	Q3 : ArrayProgram.java
 *  �ۼ��� : 2019.09.05~06
 *  �ۼ��� : 20165153 ���缺
 * 	���α׷� ���� : �������� å�� ������ ������ �������� �����ϴ� ���α׷�			
 */

import java.util.*;

public class SortBookTest {		// �������� å���� ������ �������� �����ϴ� SortBookTest Ŭ����
	public static void main(String[] args) {		// main �޼ҵ�
		Book[] b = {			// ��ü�� �迭�� 7���� å�� ������ش�.
				new Book("�Ѹ����б�\t",	1,	2010,3, 15),
				new Book("IT ���\t",	2,	2018,8, 11),
				new Book("�ڹ� ���α׷���",	3,	2011,1, 11),
				new Book("C ���α׷���",	4,	1999,12,18),
				new Book("�ΰ�����\t",	5,	2019,2, 22),
				new Book("����н�\t",	6,	2015,9, 30),
				new Book("�ΰ��� �̷�",	7,	2017,5, 21)};	
				// �Ϻΰ� ������(\t)�� ���� ������ ��½� ����ϰ� ���̱� ���ؼ�. 
		
		Arrays.sort(b);					// 1�� : ��ü �迭�� �ƹ� ���ؾ��� ���� (�̸���)	
		print(b, "���� ����");				// �׿� ���� print�޼ҵ带 ���� ������ش�.
		
		Arrays.sort(b, Book.WithName);	// 2�� : �������� �������� ����
		print(b,"������");				
		
		Arrays.sort(b,Book.WithSerial);	// 3�� : ������ȣ�� �������� ����
		print(b,"���� ��ȣ");
		
		Arrays.sort(b, Book.WithDate);	// 4�� : �Ⱓ���� �������� ����
		print(b,"�Ⱓ��");				// ������ ���ؿ� ���� ������ش�.
	}
	
	
	public static void print(Book[] b, String key) {// ���������� ����ϴ� print �޼ҵ�
													// ��ü �迭�� ���ڿ��� �Ű������� ���´�
		System.out.println();
		System.out.println("\t"+key+"(��)�� ����");		// ���ڿ��� ���� � �������� �����ϴ��� ��� 
		System.out.println("\t������\t���� ��ȣ\t�Ⱓ(��)\t�Ⱓ(��) �Ⱓ(��)");	
		System.out.println("----------------------------------------------");
		
		for(Book temp : b) {				// for-each ������ ���� ���� ������ ���ؿ� ���� ���
			System.out.println(temp.getTitle()+"\t"+temp.getSerial()+"\t"+temp.getYear()
								+"\t" + temp.getMonth() +"\t"+ temp.getDay());
		}	// ������ �������� ������ ������ �´� getter�� ���� ȣ���ؼ� ����Ѵ�.
	}
}