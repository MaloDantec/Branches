import java.io.FileNotFoundException;

public class TestsBoxes{
    public void testBoxCreate() {
        Box b = new Box("test");
    }

    public void testBoxAdd(){
        Box b = new Box("test");
        b.add(new Thing("truc1"));
        b.add(new Thing("truc2"));
        System.out.println(b.actionLook());
    }
    

    public static void main(String[] args) throws FileNotFoundException {
        Box j = Box.fromJSON();
    j.add(new Thing("truc1"));

    System.out.println(j);
    }
    
};