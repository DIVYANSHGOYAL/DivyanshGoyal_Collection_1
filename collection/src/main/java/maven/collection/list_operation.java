package maven.collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.LinkedList;
import java.util.Scanner;
public class list_operation {

	private static final Logger LOGGER=LogManager.getLogger(App.class);
	LinkedList<String> collection_list=new LinkedList<>();
	Scanner sc=new Scanner(System.in);
	
	list_operation()
	{
		collection_list.add("EPAM");
    	collection_list.add("List");
    	collection_list.add("Company");
    	collection_list.add("Interview");
    	collection_list.add("communication");
    	collection_list.add("elements");
    	collection_list.add("Aspirant");
    	collection_list.add("personnel");
    	collection_list.add("required");
    	collection_list.add("initially");
	}
	
	void display()
	{
		LOGGER.debug(collection_list);
	}
	void add()
	{
		LOGGER.debug("Enter the information to be added");
		collection_list.add(sc.nextLine());
	}
	void fetch()
	{
		LOGGER.debug("Enter the index at which information to be fetched ");
		String fetched_data=collection_list.get(sc.nextInt());
		LOGGER.debug("The fetched information is: "+fetched_data);
		
	}
	void remove()
	{
		LOGGER.debug("Enter the information is to be removed");
		collection_list.remove(sc.nextLine());
	}

}
