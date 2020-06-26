import java.util.List;
import java.util.Date;

public class Menu {
    private List<MenuItem> menuItems;
    private Date updatedDt;


    public synchronized void main(String[] args){
    MenuItem menuItem1 = new MenuItem();
    menuItem1.setPrice(12);
    menuItem1.setDescription("This is the first item Description");
    menuItem1.setCategory("Main Course");
    menuItem1.setIsNew(true);
    Date updatedDt = new Date();

    MenuItem menuItem2 = new MenuItem();
        menuItem2.setPrice(15);
        menuItem2.setDescription("This is the second item Description");
        menuItem2.setCategory("Desert");
        menuItem1.setIsNew(false);
    }
}
