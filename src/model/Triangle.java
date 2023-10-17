/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Repository.IShapeRepository;

/**
 *
 * @author admin
 */
public class Triangle implements IShapeRepository{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    
    
     public boolean check() {
        return (a + b) > c && (c + b) > c && (b + c) > a;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    @Override
    public double getPerimeter() {
        double p = a + b + c;
        return p;
    }
    
    @Override
    public void printResult(int type) {
    } 

}
