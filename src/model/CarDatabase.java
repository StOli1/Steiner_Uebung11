package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class CarDatabase {

    protected HashMap<String, Vehicle> db = new HashMap<>();

    public CarDatabase() {
        MagicGenerator mg = new MagicGenerator();
        for (int i = 0; i < 1001; i++) {
            String lp = mg.getRandomLicencePlate();
            String mu = mg.getRandomManufacturer();
            Vehicle vehicle = new Vehicle(mg.getRandomColor(), mg.getRandomName(), mu, mg.getRandomModel(mu), lp);
            db.put(lp, vehicle);
            System.out.printf("Created vehicle with license plate: %s %n", lp);
        }
    }

    public LinkedList<Vehicle> search(String licencePlate, boolean exact){
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        if(!exact){
            for (String s : db.keySet()) {
                if (s.contains(licencePlate))
                    vehicles.add(db.get(s));
                }
                } else {
                    vehicles.add(db.get(licencePlate));
                }
    return vehicles;
    }
}
