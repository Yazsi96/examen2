/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 *
 * @author yazmin
 */
public class DemostracionLista implements DemoList{
    
    public List<Integer> crearDemoLista(){
        Arreglo InsNum =new Arreglo();
        
        InsNum.add(0,4);
        InsNum.add(0,3);
        InsNum.add(0,2);
        InsNum.add(1,5);
        InsNum.add(1,6);
        InsNum.add(3,7);
        InsNum.add(0,8);
        
        return InsNum;
    }
}
