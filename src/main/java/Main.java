import ru.netelogy.services.BonusService;

public class Main {


    public static void main(String[] args) {
        BonusService service = new BonusService();
        int count = service.calculate(100_000, 60_000, 150_000);
        System.out.println("Месяцев отдыха " + count);
    }
}
