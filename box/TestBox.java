import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestBox{
    @Test
    public void testBoxCreate() {
        Box b = new Box();
    }
    /** on veut pouvoir mettre des trucs dedans */
    
    @Test 
    public void testBoxColor() {
        Box b = new Box();
        assertEquals(expected:"black", b.getColor());
    }
    
    
    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add("truc1");
        b.add("truc2");
    }
};

class Thing{
    String name;
    public Thing(String name){
    this.name = name;
    }
}