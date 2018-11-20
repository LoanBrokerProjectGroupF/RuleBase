import dk.kepp.rulebase.RuleService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class RuleServiceTest {

    private RuleService ruleService;

    @Before
    public void init(){
        ruleService = new RuleService();
    }

    @Test
    @DisplayName("Test out methode for getting banks")
    public void getBanksTest(){
        String first = ruleService.getBanks(200, 10000, 100);
        String second = ruleService.getBanks(300, 20000, 300);
        String third = ruleService.getBanks(10, 2000, 5);
        String fourth = ruleService.getBanks(800, 100000, 360);
        Assertions.assertAll("Test different cases of banks",
                () -> Assertions.assertEquals("Json Bank,Web Bank", first),
                () -> Assertions.assertEquals("XML Bank,Json Bank,Web Bank", second),
                () -> Assertions.assertEquals("Json Bank", third),
                () -> Assertions.assertEquals("Json Bank,Rabbit Bank", fourth),
                () -> Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
                    ruleService.getBanks(740, 50000, 400);
                })
        );
    }


}
