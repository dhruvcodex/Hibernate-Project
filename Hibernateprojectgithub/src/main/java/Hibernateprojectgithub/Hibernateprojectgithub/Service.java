package Hibernateprojectgithub.Hibernateprojectgithub;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Service
{	 
	Configuration cfg;
	SessionFactory sf;
	Session sess;
      	
	public Service()
	{
   this.cfg=new Configuration();
   cfg.configure();
	this.sf=cfg.buildSessionFactory();
	this.sess=sf.openSession();
	
}
  public void insert(int empid,String name,double sal,int age ,int exp)

  {
	  
	  Employee emp=new Employee();
	   emp.setEmpid(empid);
	  emp.setName(name);
       emp.setSal(sal);
       emp.setAge(age);
       emp.setExp(exp);
       Transaction tx=sess.beginTransaction();
       sess.save(emp);
      tx.commit();
     
       System.out.println("DATA INSERTED GOOD WORK");
  }

  
  public void delete(int empid)
  {
	  Employee emp=(Employee)sess.get(Employee.class, empid);
	  Transaction tx=sess.beginTransaction();
     
	  sess.delete(emp);
	 tx.commit(); 
	  System.out.println("DATA DELETED");
  }
 
  public void get(int empid)
  {
	  Employee emp=(Employee)sess.get(Employee.class, empid);
	  System.out.println("Employee Id "+emp.getEmpid());
	  
	  System.out.println("Employee Name "+emp.getName());
	  System.out.println("Employee Age"+emp.getAge());
	  System.out.println("Employee Sal "+emp.getSal());
	  System.out.println("Employee Exp "+emp.getExp());
	  
	  
	 
  }
  
  public void update(int empid,String name)
  {
	
	  Employee emp=(Employee)sess.get(Employee.class, empid);
	   
	  emp.setName(name);
	  
	  Transaction tx =sess.beginTransaction();
	  sess.update(emp);
	  tx.commit();
	  System.out.println("NAME UPDATE ");
  }
  
  
  public void update(int empid,int exp)
  {
	
	  Employee emp=(Employee)sess.get(Employee.class, empid);
	   
	  emp.setExp(exp);
	  
	  Transaction tx =sess.beginTransaction();
	  sess.update(emp);
	  tx.commit();
	  System.out.println("EXPIERNCE  UPDATED ");
  }
  public void destroy()
  {
	  sess.close();
  }
  
}







