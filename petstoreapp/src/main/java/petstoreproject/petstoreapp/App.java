package petstoreproject.petstoreapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;
import java.util.Map;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"springbeans.xml","customerconfig.xml"});
      
       
       
       Customer customer=context.getBean("ncustomer",Customer.class);
       System.out.println(customer.getCustomerName());
       System.out.println(customer.getAddress());
       System.out.println(customer.getEmail());
       
       
       Pet pet=context.getBean("pet",Pet.class);
       
       System.out.println(pet.getPetName());
       System.out.println(pet.getAge());
       System.out.println(pet.getType());
       
       
      PetService petService=context.getBean("petService",PetService.class);
      
      System.out.println(petService.getPetStore().getStoreName());
      System.out.println(petService.getPetStore().getAddress());
      
      
      System.out.println(petService.getPetHelpLineService().getHelplineNumber());
      
     
      
      List<Pet> petlist=petService.getPetStore().getPetList();
      
      for(Pet pets:petlist)
      {
    	  System.out.println("=============================");
    	   System.out.println(pets.getPetName());
    	   System.out.println(pets.getAge());
    	   System.out.println(pets.getType());
      }
       
      
      List<String> daysOpened=petService.getPetStore().getDaysOpened();
      for(String s:daysOpened)
      {
    	  System.out.print(s+" ");
      }
      
      
      Map<Integer,String> cityList=petService.getCityList();
      for(Integer i :cityList.keySet())
      {
    	  System.out.println(cityList.get(i));
      }
      
      
      
      
      List<RescueChamp> rescueChampList =petService.getRescueChampList();
      
      System.out.println("Heroes of this month");
      for(RescueChamp r:rescueChampList)
      {
    	  System.out.println("************************");
    	  System.out.println(r.getChampName());
    	  System.out.println(r.getAnimalRescued());
      }
      
      
      
       
       
       
       
       
       
       
       
       
       
    
    }
}
