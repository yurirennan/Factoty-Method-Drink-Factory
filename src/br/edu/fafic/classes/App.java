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
public class App {
    public static void main(String[] args) {
        Factory factoryBeer = new FactoryBeer();
        Factory factorySoda = new FactorySoda();
        
        Drink beer = factoryBeer.sellDrink(500, "Skoll");
        Drink soda = factorySoda.sellDrink(2000, "Coca-Cola");
        
        beer.sell();
        soda.sell();
        
    }
}
