package com.apps;


@SpringBootApplication

public class AutowireDemo {

    public static void main(String[] args) {
        //ConfigurableApplicationContext context = SpringApplication.run(AutowiringdemoApplication.class, args);
        //FoodDetails food = context.getBean(FoodDetails.class);

        FoodDetails food = new FoodDetails();
        food.setItemid(21);
        food.setItemname("Chicken");
        food.showFoodDetails();
    }

}
