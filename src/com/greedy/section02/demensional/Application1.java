package com.greedy.section02.demensional;

public class Application1 {

	public static void main(String[] args) {
		
		/* ������ �迭
		 * ������ �迭�� 2���� �̻��� �迭�� �ǹ��Ѵ�.
		 * �迭�� �ε������� �� �ٸ� �迭�� �ּҸ� �����ϴ� �迭�� �ǹ��Ѵ�.
		 * ��, 2���� �迭�� 1���� �迭 ���� ���� ��� �����ϴ� ���� �ǹ��Ѵ�.
		 * */
		
		/* 2���� �迭�� ����ϴ� ���
		 * 1. �迭�� �ּҸ� ������ ���۷��� ���� ����(stack)
		 * 2. ���� ���� 1���� �迭�� �ּҸ� �����ϴ� �迭�� ����(heap)
		 * 3. �� �ε����� �����ϴ� �迭�� �Ҵ�(heap)�Ͽ� �ּҸ� ����
		 * 4. ������ ���� ���� 1���� �迭�� ���ʴ�� �����ؼ� ���
		 * */
		
		int[][] iarr1;
		int iarr2[][];
		int[] iarr3[];
		
		iarr1 = new int[3][];
		
		iarr1[0] = new int[5];
		iarr1[1] = new int[5];
		iarr1[2] = new int[5];
		
		for(int i = 0; i < iarr1[0].length; i++) {
			System.out.print(iarr1[0][i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < iarr1[1].length; i++) {
			System.out.print(iarr1[1][i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < iarr1[2].length; i++) {
			System.out.print(iarr1[2][i] + " ");
		}
		System.out.println();
		
		
		for(int i = 0; i < iarr1.length; i++) {
			for(int j = 0; j < iarr1[i].length; j++) {
				System.out.print(iarr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
