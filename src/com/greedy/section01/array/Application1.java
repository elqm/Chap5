package com.greedy.section01.array;

public class Application1 {

	public static void main(String[] args) {
		
		/* �迭�̶�?
		 * ������ �ڷ����� ����(���ӵ� �޸� ������ ���� �����ϰ� ����ϱ� ���� �뵵)�̴�.
		 * �迭�� heap ������ new �����ڸ� �̿��Ͽ� �Ҵ��Ѵ�.
		 * */
		
		/* �迭�� ��� ����
		 * 1. ���ӵ� �޸� �������� Ȱ���� �� �ִ�. (�迭�� ������� ������ ���� �� ������ ����ؾ� �Ѵ�.)
		 * 2. �ݺ����� �̿��� ����ó���� �����ϴ�.
		 * */
		
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
//		int num5 = 50;
//		
//		int sum = 0;
//		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
//		
//		System.out.println("sum : " + sum);
		
		/* �迭�� ���� �� �Ҵ� */
		int[] arr = new int[5];
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		int value = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value += 10;
		}
		
		int sum = 0;
		
//		sum += arr[0];
//		sum += arr[1];
//		sum += arr[2];
//		sum += arr[3];
//		sum += arr[4];
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum : " + sum);

	}

}
