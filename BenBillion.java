public class BenBillion{						
					
  private String name;						
  private int age;						
  private String voracity;

  public void printHappyHacking(){				 
  System.out.print("happyHacking!"); 
  }

  public BenBillion(){}						  
								 
  public BenBillion(String name , int age , String voracity){ 
	  
  this.name = name;						   					   
  this.age = age;
  this.voracity= voracity;
  }

  public BenBillion(String name){					
  this.name = name;
  }

  public void setName(String name){				
     this.name = name;
  }

  public void setAge(int age){
  this.age = age;
  }

  public void setVoracity(String voracity){			
  this.voracity = voracity;
  }
  
  public String getName(){					
  return name;
  }

  public int getAge(){
  return age;
  }

  public String getVoracity(){
  return voracity;
  }
}