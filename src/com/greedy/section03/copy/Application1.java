package com.greedy.section03.copy;

public class Application1 {

	public static void main(String[] args) {
		
		/* �迭�� ����
		 * 1. ���� ����(shallow copy) : stack�� �ּҰ��� ����
		 * 2. ���� ����(deep copy) : heap�� �迭�� ����� ���� ����
		 * */
		
		/* ���� ���� */
		int[] originArr = {1, 2, 3, 4, 5};
		int[] copyArr = originArr;			//���� ����
		
		System.out.println(originArr.hashCode());
		System.out.println(copyArr.hashCode());
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
		
		copyArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();
	}

}
