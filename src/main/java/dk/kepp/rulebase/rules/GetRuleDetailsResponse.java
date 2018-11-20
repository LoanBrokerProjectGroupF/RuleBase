
package dk.kepp.rulebase.rules;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RuleDetails" type="{http://localhost:8085/rules}RuleDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleDetails"
})
@XmlRootElement(name = "GetRuleDetailsResponse", namespace = "http://localhost:8085/rules")
public class GetRuleDetailsResponse {

    @XmlElement(name = "RuleDetails", namespace = "http://localhost:8085/rules", required = true)
    protected RuleDetails ruleDetails;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleDetails }
     *     
     */
    public RuleDetails getRuleDetails() {
        return ruleDetails;
    }

    /**
     * Sets the value of the ruleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleDetails }
     *     
     */
    public void setRuleDetails(RuleDetails value) {
        this.ruleDetails = value;
    }

}
