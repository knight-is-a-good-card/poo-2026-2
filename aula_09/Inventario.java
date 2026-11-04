package aula_09;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T> {
    private final List<T> itens = new ArrayList<>();

    public void guardar(T item){
        if(item == null){
            throw new IllegalArgumentException("Item nao pode ser nulo");
        }
        itens.add(item);
    }

    public T pegar(int posicao){
        return itens.get(posicao);
    }

    public int qualidade() {
        return itens.size();
    }
}
