/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import Repository.IShapeRepository;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.Validation;

/**
 *
 * @author This PC
 */
public class ShapeDao {
    
    private static ShapeDao instance= null;
    private Validation validation;
    
    public ShapeDao(){
        validation= new Validation();
    }
    public static ShapeDao Instance(){
        if(instance==null){
            synchronized (ShapeDao.class) {
                if(instance==null){
                    instance= new ShapeDao();
                }                
            }
        }
        return instance;
    }
    
    public void printResult(int type){
        IShapeRepository isr;
        switch (type) {
            case 1:                
                double width= validation.checkInput("Enter width : ");
                double length= validation.checkInput("Enter length : ");
                isr= new Rectangle(length, width);
                System.out.println("----- Rectangle -----");
                System.out.print("Width: "+width);
                System.out.println("");
                System.out.print("Length: "+length);
                System.out.println("");
                System.out.print("Area: "+isr.getArea());
                System.out.println("");
                System.out.print("Perimeter: "+isr.getPerimeter());
                System.out.println("");
                break;
            case 2:
                double radius= validation.checkInput("Enter radius : ");
                isr= new Circle(radius);
                System.out.println("----- Circle -----");
                System.out.print("Radius: "+radius);
                System.out.println("");
                System.out.print("Area: "+isr.getArea());
                System.out.println("");
                System.out.print("Perimeter: "+isr.getPerimeter());
                System.out.println("");
                break;
            case 3:
                double a= validation.checkInput("Enter side A :");
                double b= validation.checkInput("Enter side B :");
                double c= validation.checkInput("Enterside C :");
                isr= new Triangle(a, b, c);
                System.out.println("----- Triangle");
                System.out.print("Side A: "+a);
                System.out.println("");
                System.out.print("Side B: "+b);
                System.out.println("");
                System.out.print("Side C: "+c);
                System.out.println("");
                System.out.print("Area: "+isr.getArea());
                System.out.println("");
                System.out.print("Perimeter: "+isr.getPerimeter());
                System.out.println("");
                break;               
        }
    }
}