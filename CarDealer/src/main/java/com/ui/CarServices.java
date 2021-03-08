package com.ui;

import com.Collection.CarHashSet;
import com.Model.Car;
import com.Model.User;
import com.database.DataBaseServices;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class CarServices {
    Scanner scan = new Scanner(System.in);
    DataBaseServices DB = DataBaseServices.getInstance();

    private CarServices(){}
    private static CarServices instance;

    public static CarServices getInstance(){
        if(instance == null)
            instance = new CarServices();

        return instance;
    }


    public Car showAddNewCarForm(User u){
        String brand,make,color;
        int serialNum, model, miles;
        float price;

        System.out.println("Car model:");
        model = scan.nextInt();
        scan.nextLine();
        System.out.println("Car brand:");
        brand = scan.nextLine();
        System.out.println("Car make:");
        make = scan.nextLine();
        System.out.println("Miles on the car:");
        miles = scan.nextInt();
        scan.nextLine();
        System.out.println("Color:");
        color = scan.nextLine();
        System.out.println("Car's Serial number: ");
        serialNum = scan.nextInt();
        scan.nextLine();
        System.out.println("Price:");
        price = scan.nextFloat();
        scan.nextLine();

        int owner;
        if(u.isEmployee()) {
            owner = 0;
        }else{
            owner = u.getId();
        }
        return new Car(serialNum,model,brand,make,color,miles,price,owner);
    }

    public CarHashSet getCars(int id){
        ResultSet rs = DB.fetchAllCars(id);
        CarHashSet cars = new CarHashSet();

        try{
            while(rs.next()){
                cars.add(new Car(rs.getInt("serial_num"),rs.getInt("model"),rs.getString("brand"),
                        rs.getString("make"), rs.getString("color"),rs.getInt("miles"),
                        rs.getFloat("price"), rs.getInt("user_id")));

            }

            return cars;
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        return null;
    }


}
