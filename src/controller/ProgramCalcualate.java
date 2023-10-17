/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.IShapeRepository;
import Repository.ShapeRepository;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ProgramCalcualate extends Menu<String>{
    
    private IShapeRepository isr= (IShapeRepository) new ShapeRepository();
    
    static String title="=====Calculator Shape Program=====";
    static String[] mc={"Calculator Rectangle", "Calculator Circle", "Calculator Triangle", "Exit"};
    public ProgramCalcualate(){
        super(title, mc);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                isr.printResult(1);
                break;
            case 2:
                isr.printResult(2);
                break;
            case 3:
                isr.printResult(3);
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
    
}