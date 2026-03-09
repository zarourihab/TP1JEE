package dao;

public class

DaoImpl2 implements IDao {

    @Override
    public double getValue() {
        // Retourne une valeur légèrement différente pour ce DAO
        return 150d; // on change la valeur pour différencier de DaoImpl
    }
}