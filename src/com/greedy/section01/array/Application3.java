package com.greedy.section01.array;

public class Application3 {

	public static void main(String[] args) {
		
		/* �⺻������ �迭�� �����ϰ� �Ҵ��ϰ� �Ǹ�
		 * �迭�� �� �ε������� �ڹٰ� ������ �⺻������ �ʱ�ȭ�� �� ���°� �ȴ�.
		 * heap������ ���� ���� �� ������ ������ �� ����.
		 * */
		
		/* ���� ���º� �⺻��
		 * ���� : 0
		 * �Ǽ� : 0.0
		 * �� : false
		 * ���� : \u0000
		 * ���� : null
		 * */
		
		int[] iarr = new int[5];
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.println("iarr[" + i + "] : " + iarr[i]);
		}
		
		/* �迭�� ���ͷ� Ȱ�� 
		 * �ڹٿ��� ������ �⺻�� ���� ������ �ʱ�ȭ�� �ϰ� ���� ��� ���ͷ��� Ȱ���� �� �ִ�.
		 * ���ͷ��� Ȱ���ϴ� ��� new�� ������� �ʾƵ� �Ǹ�, ���� ������ŭ �ڵ����� ũ�Ⱑ �����ȴ�.
		 * */
		int[] iarr2 = {11, 22, 33, 44, 55};
		
		for(int i = 0; i < iarr2.length; i++) {
			System.out.println("iarr2[" + i + "] : " + iarr2[i]);
		}
		
		int[] iarr3 = new int[] {11, 22, 33, 44, 55};
		
		String[] sarr = {"apple", "banana", "grape", "orange"};
	}

}
