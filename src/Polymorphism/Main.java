package Polymorphism;

public class Main {

	public static void main(String[] args) {
         BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),new DatabaseLogger(), new ConsolLogger()};
         
         for(BaseLogger logger:loggers) {
        	 logger.Log("log mesaj�");
         }
    
         CustomerManager customerManager = new CustomerManager(new FileLogger());
              customerManager.Add();
	}

}


// aralar�nda inherite ba�lar� olan class'lar da polimorfizim yap�labilir
// yani ya ikisi de ayn� class'dan kal�t�m al�r ya da birbirinden 
/* overloading bir methodun farkl� �ekillerde yaz�lmas�
ayn� tipteli methodun
parametre say�s�, parametre tipi'ne g�re overload olabilir return tipine g�re overloading olamaz
*/
