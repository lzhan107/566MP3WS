
package domain;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MatricesWS", targetNamespace = "http://domain/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MatricesWS {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://domain/", className = "domain.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://domain/", className = "domain.AddResponse")
    @Action(input = "http://domain/MatricesWS/addRequest", output = "http://domain/MatricesWS/addResponse")
    public String add();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divideL", targetNamespace = "http://domain/", className = "domain.DivideL")
    @ResponseWrapper(localName = "divideLResponse", targetNamespace = "http://domain/", className = "domain.DivideLResponse")
    @Action(input = "http://domain/MatricesWS/divideLRequest", output = "http://domain/MatricesWS/divideLResponse")
    public String divideL();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divideR", targetNamespace = "http://domain/", className = "domain.DivideR")
    @ResponseWrapper(localName = "divideRResponse", targetNamespace = "http://domain/", className = "domain.DivideRResponse")
    @Action(input = "http://domain/MatricesWS/divideRRequest", output = "http://domain/MatricesWS/divideRResponse")
    public String divideR();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://domain/", className = "domain.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://domain/", className = "domain.SubtractResponse")
    @Action(input = "http://domain/MatricesWS/subtractRequest", output = "http://domain/MatricesWS/subtractResponse")
    public String subtract();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "generate", targetNamespace = "http://domain/", className = "domain.Generate")
    @ResponseWrapper(localName = "generateResponse", targetNamespace = "http://domain/", className = "domain.GenerateResponse")
    @Action(input = "http://domain/MatricesWS/generateRequest", output = "http://domain/MatricesWS/generateResponse")
    public String generate();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://domain/", className = "domain.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://domain/", className = "domain.MultiplyResponse")
    @Action(input = "http://domain/MatricesWS/multiplyRequest", output = "http://domain/MatricesWS/multiplyResponse")
    public String multiply();

}
