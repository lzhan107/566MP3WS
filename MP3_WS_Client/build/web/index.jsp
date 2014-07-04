<%-- 
    Document   : index
    Created on : Apr 12, 2013, 12:50:08 AM
    Author     : Lei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function call(action){
                if (action == "plus"){
                    alert("Adding two matrices!");
                    window.location.href = "index.jsp?action="+action;
                }else if (action == "minus"){
                    alert("Subtracting two matrices!");
                    window.location.href = "index.jsp?action="+action;
                }else if (action == "arraytimes"){
                    alert("Multiplying two matrices");
                    window.location.href = "index.jsp?action="+action;
                }else if (action == "arrayleftdivide"){
                    alert("Left division of two matrices!");
                    window.location.href = "index.jsp?action="+action;
                }else if (action == "arrayrightdivide"){
                    alert("Right division of two matrices!");
                    window.location.href = "index.jsp?action="+action;
                }
            }
        </script>
    </head>
    <body align="center">
        <h1>Matrices Demo</h1>
        <%-- start web service invocation --%><hr/>
        <table align="center">
            <tr>
                <td>
                    <table border="0">
                        <%
                            try {
                                domain.MatricesWS_Service service = new domain.MatricesWS_Service();
                                domain.MatricesWS port = service.getMatricesWSPort();
                                // TODO process result here
                                java.lang.String result = port.generate();
                                //Split string
                                String[] matrices = result.split(",");
                                //Create two arrays for two matrices
                                String[][] matrixA = new String[4][4];
                                String[][] matrixB = new String[4][4];
                                out.println("<tr><td colspan='4' align='left'>Matrix A</td></tr>");
                                for (int i = 0; i < 4; i++) {
                                    out.println("<tr>");
                                    for (int j = 0; j < 4; j++) {
                                        out.print("<td align=left>");
                                        matrixA[i][j] = matrices[4 * i + j];
                                        out.print(matrixA[i][j] + "&nbsp;");
                                        out.print("</td>");
                                    }
                                    out.print("</tr>");
                                }
                                out.println("<tr><td colspan='4' align='left'>Matrix B</td></tr>");
                                for (int m = 4; m < 8; m++) {
                                    out.println("<tr>");
                                    for (int n = 0; n < 4; n++) {
                                        out.print("<td align=left>");
                                        matrixB[m - 4][n] = matrices[4 * m + n];
                                        out.print(matrixB[m - 4][n] + "&nbsp;");
                                        out.print("</td>");
                                    }
                                    out.print("</tr>");
                                }
                                out.println("<tr><td colspan='4' align='left'>Resultant Matrix:</td></tr>");
                                //Calculation for plus
                                String value = request.getParameter("action");
                                if (value.equals("plus")) {
                                    result = port.add();
                                    String[] matrice = result.split(",");
                                    String[][] ma = new String[4][4];
                                    for (int i = 0; i < 4; i++) {
                                        out.println("<tr>");
                                        for (int j = 0; j < 4; j++) {
                                            out.print("<td align=left>");
                                            ma[i][j] = matrice[4 * i + j];
                                            out.print(matrixA[i][j] + "&nbsp;");
                                            out.print("</td>");
                                        }
                                        out.print("</tr>");
                                    }
                                } else if (value.equals("minus")) {
                                    result = port.subtract();
                                    String[] matrice = result.split(",");
                                    String[][] ma = new String[4][4];
                                    for (int i = 0; i < 4; i++) {
                                        out.println("<tr>");
                                        for (int j = 0; j < 4; j++) {
                                            out.print("<td align=left>");
                                            ma[i][j] = matrice[4 * i + j];
                                            out.print(matrixA[i][j] + "&nbsp;");
                                            out.print("</td>");
                                        }
                                        out.print("</tr>");
                                    }
                                } else if (value.equals("arraytimes")) {
                                    result = port.multiply();
                                    String[] matrice = result.split(",");
                                    String[][] ma = new String[4][4];
                                    for (int i = 0; i < 4; i++) {
                                        out.println("<tr>");
                                        for (int j = 0; j < 4; j++) {
                                            out.print("<td align=left>");
                                            ma[i][j] = matrice[4 * i + j];
                                            out.print(matrixA[i][j] + "&nbsp;");
                                            out.print("</td>");
                                        }
                                        out.print("</tr>");
                                    }
                                } else if (value.equals("arrayleftdivide")) {
                                    result = port.divideL();
                                    String[] matrice = result.split(",");
                                    String[][] ma = new String[4][4];
                                    for (int i = 0; i < 4; i++) {
                                        out.println("<tr>");
                                        for (int j = 0; j < 4; j++) {
                                            out.print("<td align=left>");
                                            ma[i][j] = matrice[4 * i + j];
                                            out.print(matrixA[i][j] + "&nbsp;");
                                            out.print("</td>");
                                        }
                                        out.print("</tr>");
                                    }
                                } else if (value.equals("arrayrightdivide")) {
                                    result = port.divideR();
                                    String[] matrice = result.split(",");
                                    String[][] ma = new String[4][4];
                                    for (int i = 0; i < 4; i++) {
                                        out.println("<tr>");
                                        for (int j = 0; j < 4; j++) {
                                            out.print("<td align=left>");
                                            ma[i][j] = matrice[4 * i + j];
                                            out.print(matrixA[i][j] + "&nbsp;");
                                            out.print("</td>");
                                        }
                                        out.print("</tr>");
                                    }
                                }
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        %>
                    </table>
                </td>
                <td>
                    <table>
                        <tr>
                            <td>
                                <input type="button" style="width:110px;" value="Plus" onclick="call('plus')">
                            </td>

                        </tr>
                        <tr>
                            <td>
                                <input type="button" style="width:110px;" value="Minus" onclick="call('minus')">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="button" style="width:110px;" value="ArrayTimes" onclick="call('arraytimes')">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="button" style="width:110px;" value="ArrayLeftDivide" onclick="call('arrayleftdivide')">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="button" style="width:110px;" value="ArrayRightDivide" onclick="call('arrayrightdivide')">
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
        <%-- end web service invocation --%><hr/>
    </body>
</html>
