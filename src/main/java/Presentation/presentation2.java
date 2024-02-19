package Presentation;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDAO dao = (IDAO) cDao.newInstance();
        String metierClassName = scanner.nextLine(); // Utilisation de l'objet scanner précédemment instancié
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();
        Method method=cMetier.getMethod("setDao",IDAO.class);
        method.invoke(metier,dao);
        System.out.println("resultat"+metier.calcul());


    }
}
