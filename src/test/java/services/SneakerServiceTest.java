package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerServiceTest {

    SneakerService sneakerService = new SneakerService();
    @Test // (1)
    public void SneakerTest(){

        // (2)

        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker =  SneakerService.create(expectedName, expectedBrand, expectedSport, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedID, testSneaker.getid());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }

}