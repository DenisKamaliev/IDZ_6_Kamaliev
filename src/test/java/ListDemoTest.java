import org.junit.Test;
import java.util.*;

import java.util.ArrayList;


import static org.junit.Assert.*;
public class ListDemoTest {
    @Test
    public void testNamesakes() {
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
    @Test
    public void testremoveSpecifiedPerson(){
        Human h1 = new Human("Denis","Kamaliev", "Sergeevich", 20);
        Human h2 = new Human( "Ivan","Kamaliev", "Sergeevich", 20);
        Human h3 = new Human( "Denis","Pupkin", "Artyomovich", 20);
        ArrayList<Human> people = new ArrayList<>();
        people.add(h1);
        people.add(h2);
        people.add(h3);
        ArrayList<Human> result = ListDemo.removeSpecifiedPerson(people, h2);
        assertFalse(result.contains(h2));

    }
    @Test
    public void testgetSetsWithoutIntersectionWith(){
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        LinkedList<Set<Integer>> list = new LinkedList<>();
        Set<Integer> set1 = new TreeSet<>();
        set1.add(11);
        set1.add(22);
        set1.add(33);


        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(22);
        set2.add(33);


        Set<Integer> set3 = new TreeSet<>();
        set3.add(2);
        set3.add(22);
        set3.add(5);


        list.add(set1);
        list.add(set2);
        list.add(set3);

        LinkedList<Set<Integer>> list1 = new LinkedList<>();
        list1.add(set1);

        assertTrue( list1.equals(ListDemo.getSetsWithoutIntersectionWith(list, set)));
    }

    @Test
    public void testmaxAgeSet()
    {
        Student student1 = new Student("Denis","Kamaliev", "Sergeevich","IMIT", 20);
        Student student2 = new Student("Ivan","Ivanov", "Ivanovich","IMIT", 22);
        Human student3 = new Human("Kamalieva","Alina", "Sergeevna", 13);
        Student student4 = new Student("Vasya","Pupkin", "Artyomovich","FMIT", 22);


        List<Human> people = new LinkedList<>();
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(student4);

        Set<Human> setTest = new HashSet<>();
        setTest.add(student2);
        setTest.add(student4);

        assertTrue(setTest.equals(ListDemo.maxAgeSet(people)));
    }

    @Test
    public void testmapSearchHumansByInteger() {
        Student student1 = new Student("Denis","Kamaliev", "Sergeevich","IMIT", 20);
        Student student2 = new Student("Ivan","Ivanov", "Ivanovich","IMIT", 22);
        Human student3 = new Human("Kamalieva","Alina", "Sergeevna", 13);
        Student student4 = new Student("Vasya","Pupkin", "Artyomovich","FMIT", 22);
        Map<Integer, Human> people = new HashMap<>();
        people.put(1, student1);
        people.put(2, student2);
        people.put(3, student3);
        people.put(4, student4);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        Set<Human> d = new HashSet<>();

        d.add(people.get(1));
        d.add(people.get(3));

        assertTrue(ListDemo.mapSearchHumansByInteger(people, set).equals(d));
    }

    @Test
    public void TestHighThen18() {
        Student student1 = new Student("Denis","Kamaliev", "Sergeevich","IMIT", 20);
        Student student2 = new Student("Ivan","Ivanov", "Ivanovich","IMIT", 22);
        Human student3 = new Human("Kamalieva","Alina", "Sergeevna", 13);
        Student student4 = new Student("Vasya","Pupkin", "Artyomovich","FMIT", 22);
        Map<Integer, Human> map = new HashMap<Integer, Human>();
        map.put(1, student1);
        map.put(2, student2);
        map.put(3, student3);
        map.put(4, student4);
        Set<Integer> identificators = new HashSet<Integer>();

        identificators.add(1);
        identificators.add(2);
        identificators.add(4);
        ListDemo demo = new ListDemo();
        assertTrue(demo.HighThen18(map).equals(identificators));
    }
    @Test
    public void AgeByIdentificator()
    {
        Student student1 = new Student("Denis","Kamaliev", "Sergeevich","IMIT", 20);
        Student student2 = new Student("Ivan","Ivanov", "Ivanovich","IMIT", 22);
        Human student3 = new Human("Kamalieva","Alina", "Sergeevna", 13);
        Student student4 = new Student("Vasya","Pupkin", "Artyomovich","FMIT", 22);
        Map<Integer, Human> people = new HashMap<Integer, Human>();
        people.put(1, student1);
        people.put(2, student2);
        people.put(3, student3);
        people.put(4, student4);

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(1, student1.getAge());
        map.put(2, student2.getAge());
        map.put(3, student3.getAge());
        map.put(4, student4.getAge());

        ListDemo<Human> demo = new ListDemo<>();

        assertTrue(demo.AgeByIdentificator(people).equals(map));
    }

    @Test
    public void Test9()
    {
        Human student1 = new Human("Denis","Kamaliev", "Sergeevich", 20);
        Human student2 = new Human("Valdimir","Putin", "Vladimirovich", 69);
        Human student3 = new Human("Chuprunova","Alina", "Sergeevna", 20);
        Human student4 = new Human("Vasya","Pupkin", "Artyomovich",  22);
        Set<Human> people = new HashSet<Human>();
        people.add(student1);
        people.add(student2);
        people.add(student3);
        people.add(student4);

        Map<Integer, List<Human>> list = new HashMap<Integer, List<Human>>();
        List<Human> peopleResult = new LinkedList<Human>();
        peopleResult.add(student1);
        peopleResult.add(student3);
        int age = 20;
        list.put(age, peopleResult);
        ListDemo<Human> f = new ListDemo<>();


        assertEquals(true, f.mapByAge(people, age).equals(list));
    }
}