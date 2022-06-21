public class Rainbow{

   private String red;
   private String blue;
   private String green;

     public void updateRedColor(String red){
     this.red = red;
     }

     public void setBlue(String blue){
     this.blue = blue;
     }

     public void editGreen(String green){
     this.green = green;
     }


     public String getBlue(){
     return blue;
     }
     
     public String setBlue(){
     return blue;
     }
     
     public String editGreen(){
     return green;
     }

     
     public Rainbow (){}
     
     public Rainbow (String red , String blue){
     this.red = red;
     this.blue = blue;
     }
     
     public Rainbow (String red , String blue , String green){
     this.red = red;
     this.blue = blue;
     this.green = green;
     }
}