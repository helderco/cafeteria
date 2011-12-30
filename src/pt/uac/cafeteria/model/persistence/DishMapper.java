
package pt.uac.cafeteria.model.persistence;

import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import pt.uac.cafeteria.model.ApplicationException;


public class DishMapper extends FileAccess implements DataMapper<String, String> {

    private SortedSet<String> loaded;

    public DishMapper(String filepath) {
        super(filepath);
    }

    public Collection<String> findAll() {
        return Collections.unmodifiableCollection(getLoaded());
    }

    private SortedSet<String> getLoaded() {
        if (loaded == null) {
            loaded = new TreeSet<String>();
            loadAll();
        }
        return loaded;
    }

    private void loadAll() {
        loaded.clear();
        try {
            String dish;
            BufferedReader in = new BufferedReader(new FileReader(useFile()));
            while ((dish = in.readLine()) != null) {
                loaded.add(dish);
            }
            in.close();
        } catch (IOException e) {
            throw new ApplicationException("Erro ao escrever ficheiro de dados", e);
        }
    }

    private void save() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(useFile()));
            for (String dish : getLoaded()) {
                out.write(dish);
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            throw new ApplicationException("Erro ao escrever em ficheiro de dados", e);
        }
    }

    @Override
    public String insert(String dish) {
        if (getLoaded().add(dish.trim())) {
            save();
            return dish.trim();
        }
        return null;
    }

    @Override
    public String find(String dish) {
        return getLoaded().contains(dish) ? dish : null;
    }

    @Override
    public boolean update(String dish) {
        return insert(dish) != null;
    }

    @Override
    public boolean delete(String dish) {
        if (getLoaded().remove(dish)) {
            save();
            return true;
        }
        return false;
    }
}
