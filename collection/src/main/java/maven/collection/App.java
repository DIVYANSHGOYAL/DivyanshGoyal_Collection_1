package maven.collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class App extends list_operation
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	list_operation obj=new list_operation();
    	LOGGER.debug("Enter the operation: add,fetch,remove,print");
    	String operation=sc.nextLine();
    	while(!(operation.equalsIgnoreCase("exit"))) {
    		if(operation.equalsIgnoreCase("print"))
    			obj.display();
    		else if(operation.equalsIgnoreCase("add"))
    			obj.add();
    		else if(operation.equalsIgnoreCase("remove"))
    			obj.remove();
    		else if(operation.equalsIgnoreCase("fetch"))
    			obj.fetch();
    		LOGGER.debug("If done with application then enter exit or else enter the operation"
    				+"to be performed");
    		operation=sc.nextLine();
    	}
    	
    	
    }
}
