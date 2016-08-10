import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PuppyTest {

  Puppy puppy;
  Outfit outfit;
  Edible haggis;

  @Before
  public void before(){
    puppy = new Puppy("Bug", 1);
    outfit = new Outfit();
    haggis = new Haggis();
  }

  @Test
  public void hasName(){
    assertEquals("Bug", puppy.getName());
  }

  @Test
  public void hasAge(){
    assertEquals(1, puppy.getAge());
  }

  @Test
  public void startsWithAnEmptyWardrobe(){
    assertEquals(0, puppy.outfitCount());
  }

  @Test
  public void puppyReceiveGetAnOutfit(){
    puppy.receiveAnOutfit(outfit);
    assertEquals(1, puppy.outfitCount());
  }

  @Test
  public void puppyStartsWithAnEmptyBelly(){
    assertEquals(0, puppy.foodCount());
  }

  @Test
  public void puppyCanEatFood(){
    puppy.eat(haggis);
    assertEquals(1, puppy.foodCount());
  }

  @Test
  public void puppyEatsAllOutfitsWhenBellyIsEmpty(){
    puppy.receiveAnOutfit(outfit);
    puppy.receiveAnOutfit(outfit);
    puppy.destroysOutfits();
    assertEquals(0, puppy.outfitCount());
    assertEquals(2, puppy.foodCount());
  }


}









