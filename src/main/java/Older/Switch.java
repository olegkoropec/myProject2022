package Older;

public class Switch {
	public static void main(String args[]){
		int c = (int) (Math.random()*28801);
		System.out.println(c);
		if(c >= 0 && c < 3600)
			System.out.println("�������� ������ ����");
		else {
			if(c >= 3600 && c < 7200)
				System.out.println("�������� ������ 2 �����");
			else {
				if(c >= 7200 && c < 10800)
					System.out.println("�������� ������ 3 �����");
				else {
					if(c >= 10800 && c < 14400)
						System.out.println("�������� ������ 4 �����");
					else {
						if(c >= 14400 && c < 18000)
							System.out.println("�������� ������ 5 �����");
						else {
							if(c >= 18000 && c < 21600)
								System.out.println("�������� ������ 6 �����");
							else {
								if(c >= 21600 && c < 25200)
									System.out.println("�������� ������ 7 �����");
								else {
									if(c >= 25200 && c < 28800)
										System.out.println("�������� ������ 8 �����");
								}
							}
						}
					}
				}
			}
		}
		
	}
}
