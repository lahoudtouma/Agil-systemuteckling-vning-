package com.example.asvtestdel2.PersonDAO;

public class Person {

    private int id;
    private String namn;
    private String födelsedag;
    private String adress;




    public Person(int id, String namn, String födelsedag, String adress){
        this.id = id;
        this.namn = namn;
        this.födelsedag = födelsedag;
        this.adress = adress;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getFödelsedag() {return födelsedag;
    }

    public void setFödelsedag(String födelsedag) {
        this.födelsedag = födelsedag;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    @Override
    public String toString() {
        return "Movies{" +
                "ID=" + id +
                ", Namn= '" + namn + '\'' +
                ", Födelsedag= '" + födelsedag + '\'' +
                ", Adress= '" + adress + '\'' +
                '}';
    }

}
