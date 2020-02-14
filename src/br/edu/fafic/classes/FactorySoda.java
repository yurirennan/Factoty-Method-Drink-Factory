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
public class FactorySoda extends Factory{

    @Override
    public Drink sellDrink(float volume, String name) {
        return new Soda(volume, name);
    }
    
}
