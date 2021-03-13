package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE RECIPE (
  id INT NOT NULL AUTO_INCREMENT,    
  RECIPE_NAME VARCHAR(30) NOT NULL,
  AMOUNT1 VARCHAR(30) NOT NULL,
  PREP1 VARCHAR(30) NOT NULL,   
  INGREDIENT1 VARCHAR(30) NOT NULL,    
  PRIMARY KEY (ID));
 */
@Entity
@Table(name = "MyEmployeeGallagher")
public class Recipe {


	   @Id  // primary key
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id") // specify the column name. Without it, it will use method name
	   private Integer id;

	   @Column(name = "RECIPE_NAME")
	   private String RecipeName;
	
	   @Column(name = "AMOUNT1")
	   private String Amount1;
	   
	   @Column(name = "PREP1")
	   private String Prep1;
	   
	   @Column(name = "INGREDIENT1")
	   private String Ingredient1;
	
	   public Recipe ( ) {
	   }
	   
	   public Recipe(Integer id, String recipename,String amount1, String ingredient1, String prep1) {
		      this.id = id;
		      this.RecipeName = recipename;
		      this.Amount1 = amount1;
		      this.Ingredient1 = ingredient1;
		      this.Prep1 = prep1;
		   }
	   public Recipe( String recipename,String amount1, String ingredient1, String prep1) {
		   	this.id = id;
		    this.RecipeName = recipename;
		    this.Amount1 = amount1;
		    this.Ingredient1 = ingredient1;
		    this.Prep1 = prep1;
		   }
	   public String getRecipeName() {
		      return RecipeName;
		   }
	   public String getAmount1() {
		      return Amount1;
		   }
	   public String getPrep1() {
		      return Prep1;
		   }
	   public String getIngredient1() {
		      return Ingredient1;
		   }
	   public Integer getId() {
		      return id;
		   }
	
	
}
