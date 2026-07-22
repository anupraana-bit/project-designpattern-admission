package practical7;

public class ReportBadDemo {

    public static void main(String[] args) {
        BasicReport basic = new BasicReport();
        PdfReport pdf = new PdfReport();
        PdfWatermarkSignedReport full = new PdfWatermarkSignedReport();

        System.out.println(basic.generate());
        System.out.println(pdf.generate());
        System.out.println(full.generate());
    }
}
