package Diziler;

public class CokBoyutluDizi {

	public static void main(String[] args) {
		
		String[][] muzisyen = new String[3][3];
		
		muzisyen[0][0] = "Cem Adrian";
		muzisyen[0][1] = "G�khan T�rkmen";
		muzisyen[0][2] = "Tan Ta���";
		
		muzisyen[1][0] = "G�l�en";
		muzisyen[1][1] = "Hande Yener";
		muzisyen[1][2] = "Sezen Aksu";
				
		muzisyen[2][0] = "Seksend�rt";
		muzisyen[2][1] = "Model";
		muzisyen[2][2] = "Gripin";
		
		for(int i=0;i<3;i++) { //sat�rlar� geziyor
			System.out.println("**********************");
			for(int j=0; j<3;j++) { //sut�nlar� geziyor
				System.out.println(muzisyen[i][j]);
			}
		}
	}

}
