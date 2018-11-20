
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
 *         &lt;element name="creditScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loanAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loanDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "creditScore",
    "loanAmount",
    "loanDuration"
})
@XmlRootElement(name = "GetRuleDetailsRequest", namespace = "http://localhost:8085/rules")
public class GetRuleDetailsRequest {

    @XmlElement(namespace = "http://localhost:8085/rules")
    protected int creditScore;
    @XmlElement(namespace = "http://localhost:8085/rules")
    protected int loanAmount;
    @XmlElement(namespace = "http://localhost:8085/rules")
    protected int loanDuration;

    /**
     * Gets the value of the creditScore property.
     * 
     */
    public int getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     */
    public void setCreditScore(int value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the loanAmount property.
     * 
     */
    public int getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     * 
     */
    public void setLoanAmount(int value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the loanDuration property.
     * 
     */
    public int getLoanDuration() {
        return loanDuration;
    }

    /**
     * Sets the value of the loanDuration property.
     * 
     */
    public void setLoanDuration(int value) {
        this.loanDuration = value;
    }

}
