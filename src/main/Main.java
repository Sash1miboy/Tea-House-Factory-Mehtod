package main;

import factory.*;
import model.Tea;

public class Main {
    public Main(){
        TeaFactory blackTeaFactory = new BlackTeaFactory();
        TeaFactory greenTeaFactory = new GreenTeaFactory();
        TeaFactory herbalTeaFactory = new HerbalTeaFactory();
        TeaFactory oolangTeaFactory = new OolongTeaFactory();
        TeaFactory whiteTeaFactory = new WhiteTeaFactory();

        Tea blackTea = blackTeaFactory.createTea();
        Tea greenTea = greenTeaFactory.createTea();
        Tea herbalTea = herbalTeaFactory.createTea();
        Tea oolangTea = oolangTeaFactory.createTea();
        Tea whiteTea = whiteTeaFactory.createTea();

        blackTea.showInformation();
        greenTea.showInformation();
        herbalTea.showInformation();
        oolangTea.showInformation();
        whiteTea.showInformation();
    }


    public static void main(String[] args) {
        new Main();
    }
}