/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.ShapeDao;

/**
 *
 * @author admin
 */
public class ShapeRepository implements IShapeRepository{

    @Override
    public double getPerimeter() {
        return 0;
    }
    

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void printResult(int type) {
        ShapeDao.Instance().printResult(type);
    }
    
}