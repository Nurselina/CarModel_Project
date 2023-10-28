package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("Hibernate ile " + car.getName() + " eklendi.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Hibernate ile " + car.getName() + " silindi.");
    }


}


