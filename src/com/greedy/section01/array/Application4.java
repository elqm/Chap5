package com.greedy.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		
		/* 5���� �ڹ� ������ ������ �Է� �޾Ƽ� �հ�� ����� �Ǽ��� ���ϴ� ���α׷� */
		
		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "�� ° �л��� �ڹ� ������ �Է����ּ��� : ");
			scores[i] = sc.nextInt();
		}
		
		double sum = 0.0;
		double avg = 0.0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum / scores.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}
