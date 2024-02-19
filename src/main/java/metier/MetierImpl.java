package metier;

import dao.IDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")

public class MetierImpl implements IMetier{
    @Autowired
    private IDAO dao; //couplage faible

    public MetierImpl(IDAO dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*584/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }
}
