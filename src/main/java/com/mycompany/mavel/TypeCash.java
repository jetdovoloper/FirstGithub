/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavel;

import java.util.Scanner;

/**
 *
 * @author jetDo
 */
public class TypeCash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        System.out.println("in : " + input);
        System.out.println("inCash : " + (int)input);
        if (input - (int)input == 0) {
            System.out.println("out : " + (int)input);
        } else {
            System.out.println("out : " + input);
        }
    }
}
