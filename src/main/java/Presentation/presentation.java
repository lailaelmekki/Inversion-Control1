package Presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class presentation {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
