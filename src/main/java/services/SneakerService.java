package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {

    private static int nextID =1;
    private ArrayList<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String expectedName,String expectedBrand,String expectedSport, int expectedSize, int expectedQty,float expectedPrice) {
        //using the static member nextId to assign id numbers to new objects and incrementing it by 1.
        Sneaker sneaker = new Sneaker(nextID++,expectedName, expectedBrand, expectedSport, expectedSize, expectedQty,expectedPrice);
        this.inventory.add(sneaker);
        return sneaker;
    }

    public Sneaker findSneaker (int idFind) {
        for (Sneaker s: inventory){
            if(s.getid() ==idFind){
                return s;
            }
        }
        return null;
    }

    public Sneaker [] findAll()
    {
        //array copy of the arrayList
        return  inventory.toArray(new Sneaker[0]);
    }

    public  boolean delete (int id){

        for (int i=0;i< inventory.size();i++){
            //looping through inventry to find id to remove
            if (inventory.get(i).getid() ==id) {
                inventory.remove(i);
            }
            return true;
        }
        return false;
    }

    public void clear() {
        inventory.clear();
    }





}
