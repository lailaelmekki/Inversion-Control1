package dao;

import org.springframework.stereotype.Component;

@Component("dao")

public class DaoImpl implements IDAO{
    @Override
    public double getData() {
        /*
         se connecter à la base de donnés
         */
        double temp=Math.random()*40;
        return temp;
    }
}
