package Classes;

public class Main {

	public static void main(String[] args) {
		
		     CustomerManager manager = new CustomerManager();
		     manager.Add();
		     
		     CustomerManager manager2 = new CustomerManager();
		     

	}

}

/* classlar reference tiptir, class'� kullanabilmek i�in newlenmesi laz�m
bellekte iki alan var STACK ve HEAP

 7.sat�rdaki ='in sol taraf� stack'te olu�uyor 
 sa� taraf� ise heap'te nesne(manager nesnesi) olu�turuyor
 
 at�yorum heapteki 101 numaral� manager refarans� heapteki manager nesnesini i�aret ediyor
   10.sat�rda da heapte 102 numaral� managager2 olu�uyor o da heapte yeni bir nesne olu�uturuyor
   
   e�er manager = manager2 dersek de 
        manager 1'deki new ge�ersiz oluyor ikisi de manager2'deki nesneyi i�aret ediyor
       sonra ise manager i�in olu�an nesne garbage collector taraf�ndan silinir ��nk� bo�ta kald�, manager gitti manager2'nin nesnesini i�aret etti
       
*/