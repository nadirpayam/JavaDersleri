package Diziler;

public class CokBoyutluDizi {

	public static void main(String[] args) {
		
		String[][] muzisyen = new String[3][3];
		
		muzisyen[0][0] = "Cem Adrian";
		muzisyen[0][1] = "Gökhan Türkmen";
		muzisyen[0][2] = "Tan Taþçý";
		
		muzisyen[1][0] = "Gülþen";
		muzisyen[1][1] = "Hande Yener";
		muzisyen[1][2] = "Sezen Aksu";
				
		muzisyen[2][0] = "Seksendört";
		muzisyen[2][1] = "Model";
		muzisyen[2][2] = "Gripin";
		
		for(int i=0;i<3;i++) { //satýrlarý geziyor
			System.out.println("**********************");
			for(int j=0; j<3;j++) { //sutünlarý geziyor
				System.out.println(muzisyen[i][j]);
			}
		}
	}

}
