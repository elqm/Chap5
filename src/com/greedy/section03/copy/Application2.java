package com.greedy.section03.copy;

public class Application2 {

	public static void main(String[] args) {
		
		/* ���� ������ Ȱ�� */
		String[] names = {"ȫ�浿", "������", "�̼���"};
		
		System.out.println("names�� hashcode : " + names.hashCode());
		
		print(names);
		
		String[] animals = getAnimals();
		
		System.out.println("���Ϲ��� animals�� hashcode : " + animals.hashCode());
		
		print(animals);
	}
	
	public static void print(String[] sarr) {
		
		System.out.println("sarr�� hashcode : " + sarr.hashCode());
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
		System.out.println();
	}
	
	public static String[] getAnimals() {
		
		String[] animals = new String[] {"��Ÿ", "ȣ����", "�����ú�"};
		
		System.out.println("���� ���� animals�� hashcode : " + animals.hashCode());
		
		return animals;
	}
}
