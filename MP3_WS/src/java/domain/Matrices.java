/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Jama.Matrix;

/**
 *
 * @author Lei
 */
public class Matrices {

    private Matrix a;
    private Matrix b;

    public void generateMatrices() {
        a = new Matrix(4, 4);
        a = Matrix.random(4, 4);
        b = new Matrix(4, 4);
        b = Matrix.random(4, 4);
    }

    public Matrix getA() {
        return a;
    }

    public void setA(Matrix a) {
        this.a = a;
    }

    public Matrix getB() {
        return b;
    }

    public void setB(Matrix b) {
        this.b = b;
    }

    public void printA() {
        a.print(4, 4);
    }

    public void printB() {
        b.print(4, 4);
    }

    public Matrix arrayLeftDivide(Matrix another){
        return this.arrayLeftDivide(another);
    }
    
    public Matrix arrayRightDivide(Matrix another){
        return this.arrayRightDivide(another);
    }
    
    @Override
    public String toString() {
        return "Matrices{" + "a=" + a + ", b=" + b + '}';
    }

}
