import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
   private double price;
   private String description;
   private String category;
   private boolean isNew =false;
   private Date date;

   public double getPrice(double price){
       return price;
   }

   public void setPrice(double price){
       this.price=price;
   }
    public String getDescription(String description){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }
    public String getCategory(String category){
        return category;
    }

    public void setCategory(String category){
        this.category=category;
    }
    public boolean getIsNew(boolean isNew){
        return isNew;
    }

    public void setIsNew(boolean isNew){
        this.isNew=isNew;
    }

}
