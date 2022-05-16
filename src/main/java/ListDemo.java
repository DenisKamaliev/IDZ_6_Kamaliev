import java.util.ArrayList;

public class ListDemo {
    public ArrayList<Human> namesakes(ArrayList<Human> list, Human human)throws NullPointerException{
        if(list == null || human == null )
            throw new NullPointerException("One of the parameters is empty!");
        ArrayList<Human> newList = new ArrayList<>();
        for( int i = 0; i < list.size(); i++){
            if(list.get(i).secondName.equals(human.secondName))
                newList.add(list.get(i));
        }
        return  newList;
    }
}
