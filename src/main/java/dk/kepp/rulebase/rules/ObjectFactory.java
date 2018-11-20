
package dk.kepp.rulebase.rules;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.kepp.rulebase.rules package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.kepp.rulebase.rules
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRuleDetailsResponse }
     * 
     */
    public GetRuleDetailsResponse createGetRuleDetailsResponse() {
        return new GetRuleDetailsResponse();
    }

    /**
     * Create an instance of {@link RuleDetails }
     * 
     */
    public RuleDetails createRuleDetails() {
        return new RuleDetails();
    }

    /**
     * Create an instance of {@link GetRuleDetailsRequest }
     * 
     */
    public GetRuleDetailsRequest createGetRuleDetailsRequest() {
        return new GetRuleDetailsRequest();
    }

}
