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
  INGREDIENT1 VARCHAR(30) NOT NULL,
  PREP1 VARCHAR(30),  
  AMOUNT2 VARCHAR(30) NOT NULL,
  INGREDIENT2 VARCHAR(30) NOT NULL,
  PREP2 VARCHAR(30),  
  AMOUNT3 VARCHAR(30) NOT NULL,
  INGREDIENT3 VARCHAR(30) NOT NULL,
  PREP3 VARCHAR(30),   
  AMOUNT4 VARCHAR(30) NOT NULL,
  INGREDIENT4 VARCHAR(30) NOT NULL,
  PREP4 VARCHAR(30),   
  AMOUNT5 VARCHAR(30) NOT NULL,
  INGREDIENT5 VARCHAR(30) NOT NULL,
  PREP5 VARCHAR(30),
  AMOUNT6 VARCHAR(30) NOT NULL,
  INGREDIENT6 VARCHAR(30) NOT NULL,
  PREP6 VARCHAR(30),
  AMOUNT7 VARCHAR(30) NOT NULL,
  INGREDIENT7 VARCHAR(30) NOT NULL,
  PREP7 VARCHAR(30),
  AMOUNT8 VARCHAR(30) NOT NULL,
  INGREDIENT8 VARCHAR(30) NOT NULL,
  PREP8 VARCHAR(30),
  AMOUNT9 VARCHAR(30) NOT NULL,
  INGREDIENT9 VARCHAR(30) NOT NULL,
  PREP9 VARCHAR(30),
  AMOUNT10 VARCHAR(30) NOT NULL,
  INGREDIENT10 VARCHAR(30) NOT NULL,
  PREP10 VARCHAR(30),
  AMOUNT11 VARCHAR(30) NOT NULL,
  INGREDIENT11 VARCHAR(30) NOT NULL,
  PREP11 VARCHAR(30),  
  AMOUNT12 VARCHAR(30) NOT NULL,
  INGREDIENT12 VARCHAR(30) NOT NULL,
  PREP12 VARCHAR(30),
  AMOUNT13 VARCHAR(30) NOT NULL,
  INGREDIENT13 VARCHAR(30) NOT NULL,
  PREP13 VARCHAR(30),   
  AMOUNT14 VARCHAR(30) NOT NULL,
  INGREDIENT14 VARCHAR(30) NOT NULL,
  PREP14 VARCHAR(30),   
  AMOUNT15 VARCHAR(30) NOT NULL,
  INGREDIENT15 VARCHAR(30) NOT NULL,
  PREP15 VARCHAR(30),   
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
	   
	   @Column(name = "AMOUNT2")
	   private String Amount2;
	   
	   @Column(name = "PREP2")
	   private String Prep2;
	   
	   @Column(name = "INGREDIENT2")
	   private String Ingredient2;
	   
	   @Column(name = "AMOUNT3")
	   private String Amount3;
	   
	   @Column(name = "PREP3")
	   private String Prep3;
	   
	   @Column(name = "INGREDIENT3")
	   private String Ingredient3;
	   
	   @Column(name = "AMOUNT4")
	   private String Amount4;
	   
	   @Column(name = "PREP4")
	   private String Prep4;
	   
	   @Column(name = "INGREDIENT4")
	   private String Ingredient4;
	   
	   @Column(name = "AMOUNT5")
	   private String Amount5;
	   
	   @Column(name = "PREP5")
	   private String Prep5;
	   
	   @Column(name = "INGREDIENT5")
	   private String Ingredient5;
	   
	   @Column(name = "AMOUNT6")
	   private String Amount6;
	   
	   @Column(name = "PREP6")
	   private String Prep6;
	   
	   @Column(name = "INGREDIENT6")
	   private String Ingredient6;
	   
	   @Column(name = "AMOUNT7")
	   private String Amount7;
	   
	   @Column(name = "PREP7")
	   private String Prep7;
	   
	   @Column(name = "INGREDIENT7")
	   private String Ingredient7;
	   
	   @Column(name = "AMOUNT8")
	   private String Amount8;
	   
	   @Column(name = "PREP8")
	   private String Prep8;
	   
	   @Column(name = "INGREDIENT8")
	   private String Ingredient8;
	   
	   @Column(name = "AMOUNT9")
	   private String Amount9;
	   
	   @Column(name = "PREP9")
	   private String Prep9;
	   
	   @Column(name = "INGREDIENT9")
	   private String Ingredient9;
	   
	   @Column(name = "AMOUNT10")
	   private String Amount10;
	   
	   @Column(name = "PREP10")
	   private String Prep10;
	   
	   @Column(name = "INGREDIENT10")
	   private String Ingredient10;
	   
	   @Column(name = "AMOUNT11")
	   private String Amount11;
	   
	   @Column(name = "PREP11")
	   private String Prep11;
	   
	   @Column(name = "INGREDIENT11")
	   private String Ingredient11;
	   
	   @Column(name = "AMOUNT12")
	   private String Amount12;
	   
	   @Column(name = "PREP12")
	   private String Prep12;
	   
	   @Column(name = "INGREDIENT12")
	   private String Ingredient12;
	   
	   @Column(name = "AMOUNT13")
	   private String Amount13;
	   
	   @Column(name = "PREP13")
	   private String Prep13;
	   
	   @Column(name = "INGREDIENT13")
	   private String Ingredient13;
	   
	   @Column(name = "AMOUNT14")
	   private String Amount14;
	   
	   @Column(name = "PREP14")
	   private String Prep14;
	   
	   @Column(name = "INGREDIENT14")
	   private String Ingredient14;
	   
	   @Column(name = "AMOUNT15")
	   private String Amount15;
	   
	   @Column(name = "PREP15")
	   private String Prep15;
	   
	   @Column(name = "INGREDIENT15")
	   private String Ingredient15;
	
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
