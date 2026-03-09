package dao;

public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        // Retourne une valeur fixe pour ce DAO
        return 1900d; // petit changement : '100d' au lieu de '100.0'
    }
}