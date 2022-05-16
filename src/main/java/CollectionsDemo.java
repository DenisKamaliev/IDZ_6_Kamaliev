import java.util.ArrayList;

public class CollectionsDemo {
    public int quantityBySymbol(ArrayList<String> list, Character symbol) throws NullPointerException{
        if(list == null || symbol.describeConstable().isEmpty() )
            throw new NullPointerException("One of parameters is empty!");

        int quantity = 0;

        for(int i = 0; i< list.size(); i++){
            if(list.get(i).indexOf(symbol) == 1)
                quantity++;

        }
        return quantity;
    }
}
