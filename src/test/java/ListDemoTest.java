import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class ListDemoTest {
    @Test
    public void test1() {
        Human h1 = new Human("Denis","Kamaliev", "Sergeevich", 20);
        Human h2 = new Human( "Ivan","Kamaliev", "Sergeevich", 20);
        Human h3 = new Human( "Denis","Pupkin", "Artyomovich", 20);
        ArrayList<Human> list = new ArrayList<>();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        ListDemo x = new ListDemo();
        ArrayList<Human> list2 = new ArrayList<>();
        list2.add(h1);
        list2.add(h2);

        assertEquals(list2, x.namesakes(list, h1));

    }

}