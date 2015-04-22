
package com.zhuc.cxf.wsdl2java.t1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zhuc.cxf.wsdl2java.t1 package. 
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

    private final static QName _GetHelloWordsResponse_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "getHelloWordsResponse");
    private final static QName _CreateUser_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "createUser");
    private final static QName _CreateUser2_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "createUser2");
    private final static QName _GetHelloWords_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "getHelloWords");
    private final static QName _CreateUserResponse_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "createUserResponse");
    private final static QName _SayHello_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "sayHelloResponse");
    private final static QName _CreateUser2Response_QNAME = new QName("http://server.t1.cxf.zhuc.com/", "createUser2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zhuc.cxf.wsdl2java.t1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetHelloWordsResponse }
     * 
     */
    public GetHelloWordsResponse createGetHelloWordsResponse() {
        return new GetHelloWordsResponse();
    }

    /**
     * Create an instance of {@link CreateUser2 }
     * 
     */
    public CreateUser2 createCreateUser2() {
        return new CreateUser2();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link GetHelloWords }
     * 
     */
    public GetHelloWords createGetHelloWords() {
        return new GetHelloWords();
    }

    /**
     * Create an instance of {@link CreateUser2Response }
     * 
     */
    public CreateUser2Response createCreateUser2Response() {
        return new CreateUser2Response();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link HashMap }
     * 
     */
    public HashMap createHashMap() {
        return new HashMap();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "getHelloWordsResponse")
    public JAXBElement<GetHelloWordsResponse> createGetHelloWordsResponse(GetHelloWordsResponse value) {
        return new JAXBElement<GetHelloWordsResponse>(_GetHelloWordsResponse_QNAME, GetHelloWordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "createUser2")
    public JAXBElement<CreateUser2> createCreateUser2(CreateUser2 value) {
        return new JAXBElement<CreateUser2>(_CreateUser2_QNAME, CreateUser2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "getHelloWords")
    public JAXBElement<GetHelloWords> createGetHelloWords(GetHelloWords value) {
        return new JAXBElement<GetHelloWords>(_GetHelloWords_QNAME, GetHelloWords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.t1.cxf.zhuc.com/", name = "createUser2Response")
    public JAXBElement<CreateUser2Response> createCreateUser2Response(CreateUser2Response value) {
        return new JAXBElement<CreateUser2Response>(_CreateUser2Response_QNAME, CreateUser2Response.class, null, value);
    }

}
