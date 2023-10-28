package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager {
    //iş kuralları
    private CarDao carDao;    //interface
    private Logger[] loggers;

    public CarManager(CarDao carDao, Logger[] loggers ) {
        this.carDao = carDao;
        this.loggers=loggers;
    }


    public void add(Car car) throws Exception {
        //iş kuralları
        if (car.getTotalKm() < 150000 && car.getModelYear()> 2017){
            System.out.println("Aracın Km 150000'den büyük ve model yılı 2015'ten küçük."); ;
        }
        carDao.add(car);

        for(Logger logger: loggers){
            logger.log(car.getName());
        }
    }
    public void delete(Car car) throws Exception{
        if(car.getModelYear() < 2010 && car.getTotalKm()>150000){
            throw new Exception("Bu özelliklerdeki araçlar kabul edilemez.");
        }
        carDao.delete(car);
        for(Logger logger: loggers){
            logger.log(car.getName());
        }


    }
}
