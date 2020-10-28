import dao.FietsDao;
import objects.Fiets;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("JPAdemo").createEntityManager();


        FietsDao fd = new FietsDao(em);
        Fiets f1 = new Fiets("Canyon", "Endurace");
        Fiets f2 = new Fiets("Canyon", "Aeroad");
        Fiets f3 = new Fiets("Canyon", "Ultimate");

        fd.insert(f1);
        fd.insert(f2);
        fd.insert(f3);

        System.out.println(fd.find(2));
    }
}
