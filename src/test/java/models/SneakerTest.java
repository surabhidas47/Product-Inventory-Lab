package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {
    Sneaker sneak = new Sneaker();
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)

        sneak.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getName());
    }

    @Test
    public void setIDTest() {
        // given (1)
        int expected = 20;

        // when (2)

        sneak.setid(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getid());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";

        // when (2)

        sneak.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getBrand());
    }


    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Soccer";

        // when (2)

        sneak.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 7;

        // when (2)

        sneak.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getSize());
    }

    @Test
    public void setQuantityTest() {
        // given (1)
        int expected = 10;

        // when (2)

        sneak.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 10.00F;

        // when (2)

        sneak.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, sneak.getPrice());
    }




}