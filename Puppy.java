import java.util.*;

public class Puppy {

  private String name;
  private int age;
  private ArrayList<Outfit> wardrobe;
  private ArrayList<Edible> belly;

  public Puppy(String name, int age){
    this.name = name;
    this.age = age;
    this.wardrobe = new ArrayList<Outfit>();
    this.belly = new ArrayList<Edible>();
  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public int outfitCount(){
    return this.wardrobe.size();
  }

  public void receiveAnOutfit(Outfit outfit){
    this.wardrobe.add(outfit);
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void eat(Edible food){
    this.belly.add(food);
  }

  public void destroysOutfits(){
    if(foodCount() == 0){

      for(Edible outfit : this.wardrobe){
        this.belly.add(outfit);
      };

      this.wardrobe.clear();
      
    };

  }

}
































