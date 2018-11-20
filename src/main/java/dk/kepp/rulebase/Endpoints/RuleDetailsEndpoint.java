package dk.kepp.rulebase.Endpoints;

import dk.kepp.rulebase.RuleService;
import dk.kepp.rulebase.rules.GetRuleDetailsRequest;
import dk.kepp.rulebase.rules.GetRuleDetailsResponse;
import dk.kepp.rulebase.rules.RuleDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class RuleDetailsEndpoint {

    @PayloadRoot(namespace = "http://localhost:8085/rules", localPart = "GetRuleDetailsRequest")
    @ResponsePayload
    public GetRuleDetailsResponse processRulesDetailsRequest(@RequestPayload GetRuleDetailsRequest request) {
        GetRuleDetailsResponse response = new GetRuleDetailsResponse();

        RuleService ruleService = new RuleService();
        RuleDetails ruleDetails = new RuleDetails();
        ruleDetails.setName(ruleService.getBanks(request.getCreditScore(), request.getLoanAmount(), request.getLoanDuration()));

        response.setRuleDetails(ruleDetails);

        return response;

    }

}
