import org.junit.jupiter.api.Test;

class BonusServiceTest {

    @Test
    void calculate() {

        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        service.calculate(amount, registered);

        long actual = service.calculate(amount, registered);

        
    }

}
