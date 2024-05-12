package Hibernateprojectgithub.Hibernateprojectgithub;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
      	Service s=new Service();
    	
    	int y;
      	Scanner ip =new Scanner (System.in);
         do
         {    	
         	 
         try 
         {
      	System.out.println("Press 1 to Insert data ");
    	System.out.println("Press 2 to  Delete data ");
    	System.out.println("Press 3 to Retrive data ");
    	System.out.println("Press 4 to Update data ");
    	System.out.println("Press 5 to Exit  ");
    
            int ch;
            int empid;
        	String name;
        	double sal;
        	int age;
        	int exp;
  
            System.out.println("Enter your choice");
            ch=ip.nextInt();
            switch(ch)
            {
            case 1:
            
            	System.out.println("Enter Your  employee Id"); 
                empid=ip.nextInt();
                System.out.println("Enter Your  Name");
                name=ip.next();
                System.out.println("Enter Your Salary");
                sal=ip.nextDouble();
                System.out.println("Enter Your  Age"); 
                age=ip.nextInt();
                System.out.println("Enter Your  Experience"); 
                exp=ip.nextInt();
               s.insert(empid, name, sal, age, exp);
               break; 
            case 2:
            	System.out.println("Enter Your  employee Id"); 
                empid=ip.nextInt();
                s.delete(empid);
                break;
            case 3:
              	System.out.println("Enter Your  employee Id"); 
                empid=ip.nextInt();
                s.get(empid);
                break;
            case 4:
              	System.out.println("Enter Your  employee Id"); 
                empid=ip.nextInt();
                System.out.println("Press 1 to Update Name  ");
            	System.out.println("Press 2 to  Update expiernce "); 
            	System.out.println("Enter your  choice ");
            	int c=ip.nextInt();
            	
            	switch(c) 
            	{
            	case 1:
            		 System.out.println("Enter new name ");
            		 String NAAM =ip.next();
            		 s.update(empid,NAAM);
            		 break;
            	case 2:
            		
            		 System.out.println("Enter new Expirence ");
                     int  ex =ip.nextInt();
            	 	 s.update(empid,ex);
        		     break;
            		
        		default:
        			
        		     System.out.println("Invalid choice ");
        		     break;
            	}
           
            	break;
                	
            case 5:
            	
           	 System.out.println("THANKYOU SITARAM");
              System.exit(0);
              break;
              
      		
    		default:
    			
    		     System.out.println("Invalid choice ");
    		     break;     
            	
            }
         }
         catch(Exception e)
         {
        	 System.out.println(e.getMessage());
         }
          System.out.println("press 1 to continue");  
          y=ip.nextInt();
          
         
         }  
         while(y==1);   
         s.destroy();
            	
           
    }
    
    
}
           
           