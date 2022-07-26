package Polymorphism;

public class Main {

	public static void main(String[] args) {
         BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(),new DatabaseLogger(), new ConsolLogger()};
         
         for(BaseLogger logger:loggers) {
        	 logger.Log("log mesajý");
         }
    
         CustomerManager customerManager = new CustomerManager(new FileLogger());
              customerManager.Add();
	}

}


// aralarýnda inherite baðlarý olan class'lar da polimorfizim yapýlabilir
// yani ya ikisi de ayný class'dan kalýtým alýr ya da birbirinden 
/* overloading bir methodun farklý þekillerde yazýlmasý
ayný tipteli methodun
parametre sayýsý, parametre tipi'ne göre overload olabilir return tipine göre overloading olamaz
*/
