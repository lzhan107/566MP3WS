
package domain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DivideL_QNAME = new QName("http://domain/", "divideL");
    private final static QName _SubtractResponse_QNAME = new QName("http://domain/", "subtractResponse");
    private final static QName _Add_QNAME = new QName("http://domain/", "add");
    private final static QName _GenerateResponse_QNAME = new QName("http://domain/", "generateResponse");
    private final static QName _Multiply_QNAME = new QName("http://domain/", "multiply");
    private final static QName _DivideLResponse_QNAME = new QName("http://domain/", "divideLResponse");
    private final static QName _DivideR_QNAME = new QName("http://domain/", "divideR");
    private final static QName _Generate_QNAME = new QName("http://domain/", "generate");
    private final static QName _MultiplyResponse_QNAME = new QName("http://domain/", "multiplyResponse");
    private final static QName _AddResponse_QNAME = new QName("http://domain/", "addResponse");
    private final static QName _DivideRResponse_QNAME = new QName("http://domain/", "divideRResponse");
    private final static QName _Subtract_QNAME = new QName("http://domain/", "subtract");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DivideRResponse }
     * 
     */
    public DivideRResponse createDivideRResponse() {
        return new DivideRResponse();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Generate }
     * 
     */
    public Generate createGenerate() {
        return new Generate();
    }

    /**
     * Create an instance of {@link DivideR }
     * 
     */
    public DivideR createDivideR() {
        return new DivideR();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link DivideLResponse }
     * 
     */
    public DivideLResponse createDivideLResponse() {
        return new DivideLResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link GenerateResponse }
     * 
     */
    public GenerateResponse createGenerateResponse() {
        return new GenerateResponse();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link DivideL }
     * 
     */
    public DivideL createDivideL() {
        return new DivideL();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "divideL")
    public JAXBElement<DivideL> createDivideL(DivideL value) {
        return new JAXBElement<DivideL>(_DivideL_QNAME, DivideL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "generateResponse")
    public JAXBElement<GenerateResponse> createGenerateResponse(GenerateResponse value) {
        return new JAXBElement<GenerateResponse>(_GenerateResponse_QNAME, GenerateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "divideLResponse")
    public JAXBElement<DivideLResponse> createDivideLResponse(DivideLResponse value) {
        return new JAXBElement<DivideLResponse>(_DivideLResponse_QNAME, DivideLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "divideR")
    public JAXBElement<DivideR> createDivideR(DivideR value) {
        return new JAXBElement<DivideR>(_DivideR_QNAME, DivideR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Generate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "generate")
    public JAXBElement<Generate> createGenerate(Generate value) {
        return new JAXBElement<Generate>(_Generate_QNAME, Generate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "divideRResponse")
    public JAXBElement<DivideRResponse> createDivideRResponse(DivideRResponse value) {
        return new JAXBElement<DivideRResponse>(_DivideRResponse_QNAME, DivideRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

}
