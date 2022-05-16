import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class CollectionsDemoTest {
    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("awe");
        list.add("awq");
        list.add("qwa");
        CollectionsDemo x= new CollectionsDemo();
        assertEquals(2, x.quantityBySymbol(list, 'q'));
    }
    @Test
    public void errorTest(){
        try {
            CollectionsDemo x = new CollectionsDemo();
            ArrayList<String> list = new ArrayList<>();
            x.quantityBySymbol(list, 'q');
        }catch (NullPointerException err){
            System.err.println();
        }
    }

}