package MiniProjeler;

public class Harf {

	public static void main(String[] args) {

		char[] sesliHarfler = { 'a', 'e', 'ý', 'i', 'o', 'ö', 'u', 'ü' };
		char[] sessizHarfler = { 'b', 'c', 'ç', 'd', 'f', 'g', 'ð', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 'þ',
				't', 'v', 'y', 'z' };

		char harf = 'c';

		String mesaj = " sesli bir harftir.";

		for (char harfler : sesliHarfler) {
			if (harfler == harf) {
				mesaj = " sesli bir harftir.";
			}
		}

		for (char harfler : sessizHarfler) {
			if (harfler == harf) {
				mesaj = " sessiz bir harftir.";
			}
		}

		System.out.println(harf + mesaj);
	}

}
