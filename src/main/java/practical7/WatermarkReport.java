package practical7;

public class WatermarkReport extends BasicReport {

    @Override
    public String generate() {
        return super.generate() + " [Watermark Added]";
    }
}
