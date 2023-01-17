package com.greedy.section03.copy;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {
		
		/* ���� ���� 
		 * 1. for���� �̿��� ������ �ε��� �� ����
		 * 2. Object�� clone()�� �̿��� ����
		 * 3. System�� arraycopy()�� �̿��� ����		//������ ���� ����
		 * 4. Array�� copyOf()�� �̿��� ����			//���� ���� ���
		 * */
		
		int[] originArr = new int[] {1, 2, 3, 4, 5};
		
		print(originArr);
		
		/* 1. for���� �̿��� ��� */
		int[] copyArr1 = new int[10];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		
		print(copyArr1);
		
		/* 2. Object�� clone()�� �̿��� ���� */
		int[] copyArr2 = originArr.clone();
		copyArr2[0] = 99;
		print(copyArr2);
		print(originArr);
		
		/* 3. System�� arraycopy()�� �̿��� ���� */
		int[] copyArr3 = new int[10];
		
		/* �����迭, ���縦 ������ �ε���, ���纻 �迭, ���縦 ������ �ε���, ������ ���� */
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		
		print(copyArr3);
		
		/* 4. Arrays�� copyOf()�� �̿��� ���� */
		int[] copyArr4 = Arrays.copyOf(originArr, 7);
		
		print(copyArr4);
	}
	
	public static void print(int[] iarr) {
		
		System.out.println("iarr�� hashcode : " + iarr.hashCode());
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		System.out.println();
	}

}
