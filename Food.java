public class Food {
    
private String [] Food = {"Small Berry", "Medium Berry", "Large Berry", "Pizza", "Large Pizza", "Extra Large Pizza", "Extra Cheesy Pizza", "Burger", "Cheeseburger", "Milk", "Soda", "Cheese Slice", "Cheese Wedge", "Cheese Wheel", "Chicken", ""};
private int [] Effect = {5, 10, 15, 15, 20, 25, 5, 10, 15, 5, 10, 15};
private String Name; 
public String getName() {
    return Name;
}

public void setName(String name) {
    Name = name;
}

public String getEffect() {
    return Effect;
}

public void setEffect(String effect) {
    Effect = effect;
}

public Food(String name, String effect) {
    Name = name;
    Effect = effect;
}

private String Effect;

public Food(String[] effect, String name) {
    Effect = effect;
    Name = name;
}

public String getFood() {
    int randomIndex = (int) (Math.random() * Food.length);
    return Food[randomIndex];
    
}

}