/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceiroprojetojava;

/**
 *
 * @author Jorge
 */
public class Main {

	public static void main(String[] args) {

		Triangulo triangulo = new Triangulo();
		triangulo.leitura();
		triangulo.imprimir();
	
		Circulo circulo = new Circulo("Branco",3);
		System.out.println(circulo.paraString());

	}
}

