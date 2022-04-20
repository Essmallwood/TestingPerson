package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;


public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
       String expectedName = " ";
       Integer expectedAge = Integer.MAX_VALUE ;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName,expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetRace(){
        //Given
        Person person = new Person();
        String expected = "African American";

        //When
        person.setRace("African American");

        //Then
        String actual = person.getRace();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeight(){
        //Given
        Person person = new Person();
        Double expected = 5.7;

        //When
        person.setHeight(5.7);

        //Then
        Double actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetWeight(){
        //Given
        Person person = new Person();
        Double expected = 143.00;

        //When
        person.setWeight(143.00);

        //Then
        Double actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize(){
        //Given
        Person person = new Person();
        double expected = 7.5;

        //When
        person.setShoeSize(7.5);

        //Then
        double actual = person.getShoeSize();
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void TestSetSkinType(){
        //Given
        Person person = new Person();
        String expected = "Dry";

        //When
        person.setSkinType("Dry");

        //Then
        String actual = person.getSkinType();
        Assert.assertEquals(expected, actual);
    }


}
