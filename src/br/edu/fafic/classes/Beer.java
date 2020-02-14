/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.classes;

/**
 *
 * @author yurir
 */
public class Beer extends Drink{

    public Beer(float volume, String name) {
        super(volume, name);
    }

    @Override
    public void sell() {
        System.out.println("Uma Cerveja foi Vendida!!!!");
    }
    
}
