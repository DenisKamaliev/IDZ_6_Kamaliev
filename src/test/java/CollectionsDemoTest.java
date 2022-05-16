import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
class CollectionsDemoTest {
    @Test
    public void test1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("\"abc\", \"qwe\", \"qwerty\", \"awq\"");
        CollectionsDemo x= new CollectionsDemo();
        assertEquals(x.quantityBySymbol(list, 'q'), 2);
    }

}