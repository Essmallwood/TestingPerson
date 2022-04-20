package com.zipcodewilmington.person;


public class Person {
    private String name;
    private int age;

    private double weight;
    private String race;
    private double height;
    private String skinType;
    private double shoeSize;

    public Person() {
      this.name = " ";
      this.age = Integer.MAX_VALUE;

    }

    public void setShoeSize(double shoeSize){
        this.shoeSize=shoeSize;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getRace() {
        return race;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

        public Person(int age) {
            this.age= age;
        }

        public Person(String name) {
            this.name = name;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }

