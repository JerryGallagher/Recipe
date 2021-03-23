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
   

   public static void createRecipes(String recipename, String recipedesc, String image, String amount1, String ingredient1, String prep1) {
      Session session = getSessionFactory().openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
         session.save(new Recipe(recipename, recipedesc, image, amount1, ingredient1, prep1));
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


