package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1= new Car(1, "Skoda", "Superb","Grey",80000, 2018,950.000 );
        Car car2= new Car(2, "Toyota", "Corolla", "Black", 160000,2009,450.000 );


        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CarManager carManager=new CarManager(new HibernateCarDao(),loggers);
        carManager.add(car1);
        carManager.delete(car2);




    }
}