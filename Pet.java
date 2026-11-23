// Add a Pet class here
public class Pet 
{
  // Add 3 instance variables
     private int Health;
     private int Hunger;
     private int Joy;
     private int Anger;
     private int Sleep;

  // Add a constructor
    public Pet()
    {
        Health = 50;
        Hunger = 50;
        Joy = 50;
        Anger = 0;
        Sleep = 50;
    }
    
      public void feed()
        {
          if (Hunger < 250) {
            Hunger += 10;
            System.out.println("New Hunger Level is: " + Hunger);
          } else {
            System.out.println("You are too full to eat more.");
          }
        Hunger += 10;
         System.out.println("New Hunger Level is: " + Hunger);
        }
        public void starve()
        {
        Hunger -= 10;
         System.out.println("New Hunger Level is: " + Hunger);
        }
      public void entertainment()
        {
        if (Joy < 100) {
            Joy += 10;
            System.out.println("New Joy Level is: " + Joy);
          } else {
            System.out.println("You are already very happy.");
          }
        Joy += 10;
         System.out.println("New Joy Level is: " + Joy);
        }
      public void sleep()
        {
          if (Sleep < 100) {
            Sleep += 10;
            System.out.println("New Sleep Level is: " + Sleep);
          } else {
            System.out.println("You are already well rested.");
          }
        Sleep += 100;
         System.out.println("New Sleep Level is: " + Sleep);
        }
  // Add 3 simple methods for the pet with no arguments
    public void print()
    {
         System.out.println("Health: " + Health);
         System.out.println("Hunger: " + Hunger);
         System.out.println("Joy: " + Joy);
         System.out.println("Anger: " + Anger);
         System.out.println("Sleep: " + Sleep);
         // Joy and Anger are inderecly affected by actions
         // Many Food Items
         // Explore/Treasure Hunt
         // Dreams & Nightmares
         // Sanity
         // Adventure
         // Final Fantasy Inspired Turn-Based Combat & Boss Fights
         // Money
    }
    public int getHealth() {
    return Health;
  }

  // Setter
  public void setHealth(int newName) {
    this.Health = newName;
  }
  
   public int getHunger() {
    return Hunger;
  }

  // Setter
  public void setHunger(int newName) {
    this.Hunger = newName;
  }
  
   public int getJoy() {
    return Joy;
  }

  // Setter
  public void setJoy(int newName) {
    this.Joy = newName;
  }
  
   public int getAnger() {
    return Anger;
  }

  // Setter
  public void setAnger(int newName) {
    this.Anger = newName;
  }
  
   public int getSleep() {
    return Sleep;
  }

  // Setter
  public void setSleep(int newName) {
    this.Sleep = newName;
  }
}