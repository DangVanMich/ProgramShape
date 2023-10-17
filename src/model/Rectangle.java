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
public class Rectangle implements IShapeRepository{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void printResult(int type) {
    }
}
