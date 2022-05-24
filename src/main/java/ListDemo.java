import java.util.ArrayList;
import java.util.*;

public class ListDemo<T extends Human> {
    public ArrayList<Human> namesakes(ArrayList<Human> list, Human human)throws NullPointerException{
        if(list == null || human == null )
            throw new NullPointerException("One of the parameters is empty!");
        ArrayList<Human> newList = new ArrayList<>();
        for (Human value : list) {
            if (value.secondName.equals(human.secondName))
                newList.add(value);
        }
        return  newList;
    }


    public static ArrayList<Human> removeSpecifiedPerson(ArrayList<Human> people, Human specPerson) {
        ArrayList<Human> result = new ArrayList<>(people);
        result.remove(specPerson);
        return result;
    }

    public static List<Set<Integer>> getSetsWithoutIntersectionWith(LinkedList<Set<Integer>> listSet, Set<Integer> set) {
        List<Set<Integer>> returnList = new LinkedList<>();
        boolean flag = true;
        if (listSet == null)
            throw new IllegalArgumentException("List is null");
        if (set == null)
            throw new IllegalArgumentException("Set is null");
        for (Set<Integer> a : listSet) {
            for (Integer b : a) {
                for (Integer c : set) {
                    if (b.equals(c)) {
                        flag = false;
                    }
                }
            }
            if (flag)
                returnList.add(a);
            flag = true;
        }
        return returnList;
    }

    public static  <T extends Human> Set<T> maxAgeSet(List<T> list) {
        Set<T> returnSet = new HashSet<>();
        int maxAge = 0;
        for (T a : list) {
            if (a.getAge() > maxAge)
                maxAge = a.getAge();
        }
        for (T a : list) {
            if (a.getAge() == maxAge)
                returnSet.add(a);
        }
        return returnSet;
    }

    public static  <T extends Human> Set<T> mapSearchHumansByInteger(Map<Integer, T> humans, Set<Integer> identificators) {
        Set<T> result = new HashSet<>();
        for (Integer i : identificators) {
            if (humans.get(i) != null) {
                result.add(humans.get(i));
            }
        }

        return result;
    }

    public Set<Integer> HighThen18(Map<Integer, T> humans)
    {
        Set<Integer> result = new HashSet<Integer>();
        Set<Integer> collection= humans.keySet();

        for (T i: humans.values())
        {
            if(i.getAge() >= 18)
            {
                for (Integer j: collection)
                {
                    if(humans.get(j).equals(i))
                        result.add(j);
                }
            }
        }

        return result;
    }
    public Map<Integer, Integer> AgeByIdentificator(Map<Integer,T> humans)
    {
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (Integer i: humans.keySet())
        {
            result.put(i, humans.get(i).getAge());
        }
        return result;
    }

    public Map<Integer, List<T>> mapByAge(Set<T> a, int age)
    {
        Map<Integer, List<T>> result = new HashMap<Integer, List<T>>();
        List<T> list = new LinkedList<T>();
        for (T i: a)
        {
            if(i.getAge() == age)
            {
                list.add(i);
            }

        }
        result.put(age, list);
        return result;
    }

}
