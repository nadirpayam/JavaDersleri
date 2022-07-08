package Classes;

public class Main {

	public static void main(String[] args) {
		
		     CustomerManager manager = new CustomerManager();
		     manager.Add();
		     
		     CustomerManager manager2 = new CustomerManager();
		     

	}

}

/* classlar reference tiptir, class'ı kullanabilmek için newlenmesi lazım
bellekte iki alan var STACK ve HEAP

 7.satırdaki ='in sol tarafı stack'te oluşuyor 
 sağ tarafı ise heap'te nesne(manager nesnesi) oluşturuyor
 
 atıyorum heapteki 101 numaralı manager refaransı heapteki manager nesnesini işaret ediyor
   10.satırda da heapte 102 numaralı managager2 oluşuyor o da heapte yeni bir nesne oluşuturuyor
   
   eğer manager = manager2 dersek de 
        manager 1'deki new geçersiz oluyor ikisi de manager2'deki nesneyi işaret ediyor
       sonra ise manager için oluşan nesne garbage collector tarafından silinir çünkü boşta kaldı, manager gitti manager2'nin nesnesini işaret etti
       
*/