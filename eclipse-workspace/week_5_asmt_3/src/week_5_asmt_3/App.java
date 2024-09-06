package week_5_asmt_3;

	 

//		4. Create the App Class with main Method  

	 

		public class App {  

		  

		 public static void main(String[] args) {  

		 Logger asteriskLogger = new AsteriskLogger();  

		 Logger spacedLogger = new SpacedLogger();  

		  

		 // Test AsteriskLogger  

		 System.out.println("AsteriskLogger log method:");  

		 asteriskLogger.log("Hello");  

		  

		 System.out.println("\nAsteriskLogger error method:");  

		 asteriskLogger.error("Goodbye");  

		  

		 // Test SpacedLogger  

		 System.out.println("\nSpacedLogger log method:");  

		 spacedLogger.log("Hello");  

		  

		 System.out.println("\nSpacedLogger error method:");  

		 spacedLogger.error("Hello");  

		 }  

		}  
