package com.apps;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component*/
public class FoodDetails {

    private int itemid;
    private String itemname;

    @Autowired
    private Category category;
    public int getItemid() {
        return itemid;
    }
    public void setItemid(int itemid) {
        this.itemid = itemid;
    }
    public String getItemname() {
        return itemname;
    }
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public void showFoodDetails(){
        System.out.println("Item Id : " + itemid);
        System.out.println("Item Name : " + itemname);
        category.setCatName("Non Vegetarian");
        System.out.println("Food Category : " + category.getCattName());
    }

}
