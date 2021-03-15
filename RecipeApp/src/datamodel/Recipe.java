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
  INSTRUCTION1 VARCHAR(255) NOT NULL,
  INSTRUCTION2 VARCHAR(255) NOT NULL,
  INSTRUCTION3 VARCHAR(255),
  INSTRUCTION4 VARCHAR(255),
  INSTRUCTION5 VARCHAR(255),
  INSTRUCTION6 VARCHAR(255),
  INSTRUCTION7 VARCHAR(255),
  INSTRUCTION8 VARCHAR(255),
  INSTRUCTION9 VARCHAR(255),
  INSTRUCTION10 VARCHAR(255),
  INSTRUCTION11 VARCHAR(255),
  INSTRUCTION12 VARCHAR(255),
  INSTRUCTION13 VARCHAR(255),
  INSTRUCTION14 VARCHAR(255),
  INSTRUCTION15 VARCHAR(255),
  IMAGE VARCHAR(60),
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

	   @Column(name = "INSTRUCTION1")
	   private String Instruction1;
	   
	   @Column(name = "INSTRUCTION2")
	   private String Instruction2;
	
	   @Column(name = "INSTRUCTION3")
	   private String Instruction3;
	   
	   @Column(name = "INSTRUCTION4")
	   private String Instruction4;
	   
	   @Column(name = "INSTRUCTION5")
	   private String Instruction5;
	   
	   @Column(name = "INSTRUCTION6")
	   private String Instruction6;
	   
	   @Column(name = "INSTRUCTION7")
	   private String Instruction7;
	   
	   @Column(name = "INSTRUCTION8")
	   private String Instruction8;
	
	   @Column(name = "INSTRUCTION9")
	   private String Instruction9;
	   
	   @Column(name = "INSTRUCTION10")
	   private String Instruction10;
	   
	   @Column(name = "INSTRUCTION11")
	   private String Instruction11;
	   
	   @Column(name = "INSTRUCTION12")
	   private String Instruction12;
	   
	   @Column(name = "INSTRUCTION13")
	   private String Instruction13;
	   
	   @Column(name = "INSTRUCTION14")
	   private String Instruction14;
	   
	   @Column(name = "INSTRUCTION15")
	   private String Instruction15;
	   
	   @Column(name = "IMAGE")
	   private String Image;
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

	public String getAmount2() {
		return Amount2;
	}

	public void setAmount2(String amount2) {
		Amount2 = amount2;
	}

	public String getPrep2() {
		return Prep2;
	}

	public void setPrep2(String prep2) {
		Prep2 = prep2;
	}

	public String getIngredient2() {
		return Ingredient2;
	}

	public void setIngredient2(String ingredient2) {
		Ingredient2 = ingredient2;
	}

	public String getAmount3() {
		return Amount3;
	}

	public void setAmount3(String amount3) {
		Amount3 = amount3;
	}

	public String getPrep3() {
		return Prep3;
	}

	public void setPrep3(String prep3) {
		Prep3 = prep3;
	}

	public String getIngredient3() {
		return Ingredient3;
	}

	public void setIngredient3(String ingredient3) {
		Ingredient3 = ingredient3;
	}

	public String getAmount4() {
		return Amount4;
	}

	public void setAmount4(String amount4) {
		Amount4 = amount4;
	}

	public String getPrep4() {
		return Prep4;
	}

	public void setPrep4(String prep4) {
		Prep4 = prep4;
	}

	public String getIngredient4() {
		return Ingredient4;
	}

	public void setIngredient4(String ingredient4) {
		Ingredient4 = ingredient4;
	}

	public String getAmount5() {
		return Amount5;
	}

	public void setAmount5(String amount5) {
		Amount5 = amount5;
	}

	public String getPrep5() {
		return Prep5;
	}

	public void setPrep5(String prep5) {
		Prep5 = prep5;
	}

	public String getIngredient5() {
		return Ingredient5;
	}

	public void setIngredient5(String ingredient5) {
		Ingredient5 = ingredient5;
	}

	public String getAmount6() {
		return Amount6;
	}

	public void setAmount6(String amount6) {
		Amount6 = amount6;
	}

	public String getPrep6() {
		return Prep6;
	}

	public void setPrep6(String prep6) {
		Prep6 = prep6;
	}

	public String getIngredient6() {
		return Ingredient6;
	}

	public void setIngredient6(String ingredient6) {
		Ingredient6 = ingredient6;
	}

	public String getAmount7() {
		return Amount7;
	}

	public void setAmount7(String amount7) {
		Amount7 = amount7;
	}

	public String getPrep7() {
		return Prep7;
	}

	public void setPrep7(String prep7) {
		Prep7 = prep7;
	}

	public String getIngredient7() {
		return Ingredient7;
	}

	public void setIngredient7(String ingredient7) {
		Ingredient7 = ingredient7;
	}

	public String getAmount8() {
		return Amount8;
	}

	public void setAmount8(String amount8) {
		Amount8 = amount8;
	}

	public String getPrep8() {
		return Prep8;
	}

	public void setPrep8(String prep8) {
		Prep8 = prep8;
	}

	public String getIngredient8() {
		return Ingredient8;
	}

	public void setIngredient8(String ingredient8) {
		Ingredient8 = ingredient8;
	}

	public String getAmount9() {
		return Amount9;
	}

	public void setAmount9(String amount9) {
		Amount9 = amount9;
	}

	public String getPrep9() {
		return Prep9;
	}

	public void setPrep9(String prep9) {
		Prep9 = prep9;
	}

	public String getIngredient9() {
		return Ingredient9;
	}

	public void setIngredient9(String ingredient9) {
		Ingredient9 = ingredient9;
	}

	public String getAmount10() {
		return Amount10;
	}

	public void setAmount10(String amount10) {
		Amount10 = amount10;
	}

	public String getPrep10() {
		return Prep10;
	}

	public void setPrep10(String prep10) {
		Prep10 = prep10;
	}

	public String getIngredient10() {
		return Ingredient10;
	}

	public void setIngredient10(String ingredient10) {
		Ingredient10 = ingredient10;
	}

	public String getAmount11() {
		return Amount11;
	}

	public void setAmount11(String amount11) {
		Amount11 = amount11;
	}

	public String getPrep11() {
		return Prep11;
	}

	public void setPrep11(String prep11) {
		Prep11 = prep11;
	}

	public String getIngredient11() {
		return Ingredient11;
	}

	public void setIngredient11(String ingredient11) {
		Ingredient11 = ingredient11;
	}

	public String getAmount12() {
		return Amount12;
	}

	public void setAmount12(String amount12) {
		Amount12 = amount12;
	}

	public String getPrep12() {
		return Prep12;
	}

	public void setPrep12(String prep12) {
		Prep12 = prep12;
	}

	public String getIngredient12() {
		return Ingredient12;
	}

	public void setIngredient12(String ingredient12) {
		Ingredient12 = ingredient12;
	}

	public String getAmount13() {
		return Amount13;
	}

	public void setAmount13(String amount13) {
		Amount13 = amount13;
	}

	public String getPrep13() {
		return Prep13;
	}

	public void setPrep13(String prep13) {
		Prep13 = prep13;
	}

	public String getIngredient13() {
		return Ingredient13;
	}

	public void setIngredient13(String ingredient13) {
		Ingredient13 = ingredient13;
	}

	public String getAmount14() {
		return Amount14;
	}

	public void setAmount14(String amount14) {
		Amount14 = amount14;
	}

	public String getPrep14() {
		return Prep14;
	}

	public void setPrep14(String prep14) {
		Prep14 = prep14;
	}

	public String getIngredient14() {
		return Ingredient14;
	}

	public void setIngredient14(String ingredient14) {
		Ingredient14 = ingredient14;
	}

	public String getAmount15() {
		return Amount15;
	}

	public void setAmount15(String amount15) {
		Amount15 = amount15;
	}

	public String getPrep15() {
		return Prep15;
	}

	public void setPrep15(String prep15) {
		Prep15 = prep15;
	}

	public String getIngredient15() {
		return Ingredient15;
	}

	public void setIngredient15(String ingredient15) {
		Ingredient15 = ingredient15;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setRecipeName(String recipeName) {
		RecipeName = recipeName;
	}

	public void setAmount1(String amount1) {
		Amount1 = amount1;
	}

	public void setPrep1(String prep1) {
		Prep1 = prep1;
	}

	public void setIngredient1(String ingredient1) {
		Ingredient1 = ingredient1;
	}

	public String getInstruction1() {
		return Instruction1;
	}

	public void setInstruction1(String instruction1) {
		Instruction1 = instruction1;
	}

	public String getInstruction2() {
		return Instruction2;
	}

	public void setInstruction2(String instruction2) {
		Instruction2 = instruction2;
	}

	public String getInstruction3() {
		return Instruction3;
	}

	public void setInstruction3(String instruction3) {
		Instruction3 = instruction3;
	}

	public String getInstruction4() {
		return Instruction4;
	}

	public void setInstruction4(String instruction4) {
		Instruction4 = instruction4;
	}

	public String getInstruction5() {
		return Instruction5;
	}

	public void setInstruction5(String instruction5) {
		Instruction5 = instruction5;
	}

	public String getInstruction6() {
		return Instruction6;
	}

	public void setInstruction6(String instruction6) {
		Instruction6 = instruction6;
	}

	public String getInstruction7() {
		return Instruction7;
	}

	public void setInstruction7(String instruction7) {
		Instruction7 = instruction7;
	}

	public String getInstruction8() {
		return Instruction8;
	}

	public void setInstruction8(String instruction8) {
		Instruction8 = instruction8;
	}

	public String getInstruction9() {
		return Instruction9;
	}

	public void setInstruction9(String instruction9) {
		Instruction9 = instruction9;
	}

	public String getInstruction10() {
		return Instruction10;
	}

	public void setInstruction10(String instruction10) {
		Instruction10 = instruction10;
	}

	public String getInstruction11() {
		return Instruction11;
	}

	public void setInstruction11(String instruction11) {
		Instruction11 = instruction11;
	}

	public String getInstruction12() {
		return Instruction12;
	}

	public void setInstruction12(String instruction12) {
		Instruction12 = instruction12;
	}

	public String getInstruction13() {
		return Instruction13;
	}

	public void setInstruction13(String instruction13) {
		Instruction13 = instruction13;
	}

	public String getInstruction14() {
		return Instruction14;
	}

	public void setInstruction14(String instruction14) {
		Instruction14 = instruction14;
	}

	public String getInstruction15() {
		return Instruction15;
	}

	public void setInstruction15(String instruction15) {
		Instruction15 = instruction15;
	}
	
	
}
