/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Jama.Matrix;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lei
 */
@WebService(serviceName = "MatricesWS")
public class MatricesWS {
private static Matrices matrices;

    static {
        matrices = new Matrices();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "generate")
    public String generate() {
        matrices.generateMatrices();
        System.out.println("matrices in generate() " + matrices);
        double d;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = matrices.getA().get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = matrices.getB().get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }
        return s.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public String add() {
        double d;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = matrices.getA().get(i, j) + matrices.getB().get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }
        return s.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtract")
    public String subtract() {
        double d;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = matrices.getA().get(i, j) - matrices.getB().get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }
        return s.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public String multiply() {
        double d;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = matrices.getA().get(i, j) * matrices.getB().get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }
        return s.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divideL")
    public String divideL() {
        Matrix temp = matrices.getA().arrayLeftDivide(matrices.getB());
        double d;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = temp.get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }
        return s.toString();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divideR")
    public String divideR() {
        Matrix temp = matrices.getA().arrayLeftDivide(matrices.getB());
        double d;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                d = temp.get(i, j);
                BigDecimal fd = new BigDecimal(d);
                BigDecimal cutted = fd.setScale(4, RoundingMode.DOWN);
                d = cutted.doubleValue();
                s.append(d).append(",");
            }
        }
        return s.toString();
    }
}
