import org.example.Apple;
import org.example.ICompareObject;

public class Main1 implements ICompareObject {

    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                new Apple(110, "Семеринка")};

        Main1 main1 = new Main1();

        org.example.ArrayUtils.sort(apples, main1);
    }


    @Override
    public int compare(Object var1, Object var2) {
        return ((Apple)var1).getPrice() - ((Apple)var1).getPrice();
    }
}
