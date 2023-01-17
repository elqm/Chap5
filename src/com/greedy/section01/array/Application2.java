package com.greedy.section01.array;

import java.util.Scanner;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* �迭�� ��� ��� */
		
		/* �迭�� ����
		 * �ڷ���[] ������;
		 * �ڷ��� ������[];
		 * �� ������ �� �ִ�.
		 * */
		
		/* ������ stack�� �迭�� �ּҸ� ������ �� �ִ� ������ ����� ���̴�. */
		int[] iarr;
		char carr[];
		
		/* ������ ���۷��� ������ �迭�� �Ҵ��ؼ� �ּҰ��� ������ �� �ִ�.
		 * new �����ڴ� heap ������ ������ �����ϰ� ���� ��ġ�� �ּҰ��� ��ȯ�ϴ� �������̴�.
		 * �߻��� �ּҸ� ���۷��� ����(������ ����)�� �����ϰ�,
		 * �̰��� �����Ͽ� ����ϱ� ������ �����ڷ���(reference type)�̶�� �Ѵ�.
		 * */
//		System.out.println(iarr);
		
//		iarr =  new int[];		//ũ�⸦ ���������� �ʾƼ� ���� �߻�
		iarr = new int[5];
		carr = new char[10];
		
		/* ����� �Ҵ��� ���ÿ� �� �� �� �ִ�. */
		int[] iarr2 = new int[5];
		char carr2[] = new char[10];
		
		System.out.println("iarr : " + iarr);
		System.out.println("carr : " + carr);
		
		System.out.println("iarr�� hashcode : " + iarr.hashCode());
		System.out.println("carr�� hashcode : " + carr.hashCode());
		
		System.out.println("iarr�� length : " + iarr.length);
		System.out.println("carr�� length : " + carr.length);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ���̸� �Է����ּ��� : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr�� hashcode : " + darr.hashCode());
		System.out.println("darr�� length : " + darr.length);
		
		/* �� �� �迭�� ũ�⸦ �Ҵ��ϸ� �������� ���Ѵ�. */
		darr = new double[30];
		
		System.out.println("darr�� hashcode : " + darr.hashCode());
		System.out.println("darr�� length : " + darr.length);
		
		/* �� �� �Ҵ�� �迭�� ���� �� ����.
		 * �ٸ� ���۷��� ������ null�� �����Ͽ� �� �̻� �ּҸ� ������ �� ���Ե� �迭��
		 * ���� �ð��� ���� �� heap�� old�������� �̵��Ͽ� GC(�������÷���)�� ������Ų��.
		 * �� �� ã�ư� �� �ִ� �ּҰ��� �Ҿ���� �迭�� �ٽ� ���� �Ұ����ϴ�.
		 * */
		darr = null;
		
		/* NullPointerException �߻���
		 * �ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� �ִ� ���
		 * ���������ڸ� ����ϰ� �Ǹ� �߻��ϰ� �Ǵ� �����̴�.
		 * */
		
		
		System.out.println("���� �� darr�� ���� : " + darr.length);
	}

}
