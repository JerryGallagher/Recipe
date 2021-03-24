/**
 */
package util;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import datamodel.Recipe;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @since JavaSE-1.8
 */
public class UtilDB {
   static SessionFactory sessionFactory = null;

   public static SessionFactory getSessionFactory() {
      if (sessionFactory != null) {
         return sessionFactory;
      }
      Configuration configuration = new Configuration().configure();
      StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      sessionFactory = configuration.buildSessionFactory(builder.build());
      return sessionFactory;
   }

   public static List<Recipe> listRecipes() {
      List<Recipe> resultList = new ArrayList<Recipe>();

      Session session = getSessionFactory().openSession();
      Transaction tx = null;  // each process needs transaction and commit the changes in DB.

      try {
         tx = session.beginTransaction();
         List<?> recipes = session.createQuery("FROM Recipe").list();
         for (Iterator<?> iterator = recipes.iterator(); iterator.hasNext();) {
        	 Recipe recipe = (Recipe) iterator.next();
            resultList.add(recipe);
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
      return resultList;
   }
   public static List<Recipe> listRecipes(int start,int pageSize){  
       List<Recipe> list = new ArrayList<Recipe>();  
       
       Session session = getSessionFactory().openSession();
       Transaction tx = null;  // each process needs transaction and commit the changes in DB.
       
       try{  
    	   tx = session.beginTransaction();  
    	   Criteria criteria = session.createCriteria(Recipe.class);
    	   criteria.setFirstResult(start);
    	   criteria.setMaxResults(pageSize);
    	   list = criteria.list();
    	   
       }catch(Exception e){System.out.println(e);}  
       return list;  
   } 
   
   public static long countRecipesPages(int pageSize){  
	   List<Recipe> resultList = new ArrayList<Recipe>();
	   long count = 0;
	   
	   Session session = getSessionFactory().openSession();
	   Transaction tx = null;  // each process needs transaction and commit the changes in DB.

	      try {
	         tx = session.beginTransaction();
	         Criteria criteriaCount = session.createCriteria(Recipe.class);
	         criteriaCount.setProjection(Projections.rowCount());
	         count = (long) criteriaCount.uniqueResult();    	                        
	         
	         tx.commit();
       		}catch(Exception e){
       			System.out.println(e);
       		}
       		finally {
	         session.close();
       		}  
       		return count/pageSize;
   }   
   
   public static List<Recipe> listRecipes(String keyword) {
	   List<Recipe> resultList = new ArrayList<Recipe>();
	
	   Session session = getSessionFactory().openSession();
	   Transaction tx = null; 
	   
	   try {
	         tx = session.beginTransaction();
	         List<?> recipes = session.createQuery("FROM Recipe").list();
	         for (Iterator<?> iterator = recipes.iterator(); iterator.hasNext();) {
	        	 Recipe recipe = (Recipe) iterator.next();
	        	 if (recipe.getRecipeName().contains(keyword))
	            resultList.add(recipe);
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx != null)
	            tx.rollback();
	         e.printStackTrace();
	      } finally {
	         session.close();
	      }
	   return resultList;
   }
   public static List<Recipe> listRecipes(Integer id) {
	   List<Recipe> resultList = new ArrayList<Recipe>();
	
	   Session session = getSessionFactory().openSession();
	   Transaction tx = null; 
	   
	   try {
	         tx = session.beginTransaction();
	         List<?> recipes = session.createQuery("FROM Recipe").list();
	         for (Iterator<?> iterator = recipes.iterator(); iterator.hasNext();) {
	        	 Recipe recipe = (Recipe) iterator.next();
	        	 if (recipe.getId().equals(id))
	        		 resultList.add(recipe);
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx != null)
	            tx.rollback();
	         e.printStackTrace();
	      } finally {
	         session.close();
	      }
	   return resultList;
   }
   

   public static void createRecipes(String recipename, String recipedesc, String image, 
		   String amount1, String ingredient1, String prep1,
		   String amount2, String ingredient2, String prep2, 
		   String amount3, String ingredient3, String prep3,
		   String amount4, String ingredient4, String prep4,
		   String amount5, String ingredient5, String prep5, 
		   String amount6, String ingredient6, String prep6, 
		   String amount7, String ingredient7, String prep7,
		   String amount8, String ingredient8, String prep8,
		   String amount9, String ingredient9, String prep9,
		   String amount10, String ingredient10, String prep10,
		   String amount11, String ingredient11, String prep11, 
		   String amount12, String ingredient12, String prep12, 
		   String amount13, String ingredient13, String prep13,
		   String amount14, String ingredient14, String prep14,
		   String amount15, String ingredient15, String prep15, 
		   String Instruction1, String Instruction2, String Instruction3, String Instruction4, String Instruction5, 
		   String Instruction6, String Instruction7, String Instruction8, String Instruction9, String Instruction10,
		   String Instruction11,String Instruction12,String Instruction13,String Instruction14,String Instruction15) {
      Session session = getSessionFactory().openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
         session.save(new Recipe(recipename, recipedesc, image, 
        		 amount1, ingredient1, prep1, 
        		 amount2, ingredient2, prep2, 
        		 amount3, ingredient3, prep3, 
        		 amount4, ingredient4, prep4, 
        		 amount5, ingredient5, prep5, 
        		 amount6, ingredient6, prep6, 
        		 amount7, ingredient7, prep7, 
        		 amount8, ingredient8, prep8, 
        		 amount9, ingredient9, prep9, 
        		 amount10, ingredient10, prep10, 
        		 amount11, ingredient11, prep11, 
        		 amount12, ingredient12, prep12, 
        		 amount13, ingredient13, prep13, 
        		 amount14, ingredient14, prep14,
    		     amount15, ingredient15, prep15,
    		     Instruction1, Instruction2, Instruction3, Instruction4, Instruction5,
    		     Instruction6, Instruction7, Instruction8, Instruction9, Instruction10,
    		     Instruction11, Instruction12, Instruction13, Instruction14, Instruction15 ));
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
   }//end of public static void createRecipes
}//end of UtilDB


