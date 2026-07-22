package practical7.good;

public class ReportGoodDemo {

    public static void main(String[] args) {
        StudentReport basic = new BasicReport();
        System.out.println("Basic: " + basic.generate());

        StudentReport pdf = new PdfDecorator(basic);
        System.out.println("PDF: " + pdf.generate());

        StudentReport pdfWatermark = new WatermarkDecorator(pdf);
        System.out.println("PDF+Watermark: " + pdfWatermark.generate());

        StudentReport full = new SignatureDecorator(pdfWatermark);
        System.out.println("PDF+Watermark+Signed: " + full.generate());
    }
}
