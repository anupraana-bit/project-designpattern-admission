package practical7;

import org.junit.jupiter.api.Test;
import practical7.good.StudentReport;
import practical7.good.BasicReport;
import practical7.good.PdfDecorator;
import practical7.good.WatermarkDecorator;
import practical7.good.SignatureDecorator;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void verifyBasicReportGeneration() {
        StudentReport report = new BasicReport();
        assertNotNull(report.generate());
        assertTrue(report.generate().contains("Student Report"));
    }

    @Test
    void verifyPdfFeatureWorks() {
        StudentReport report = new PdfDecorator(new BasicReport());
        assertTrue(report.generate().contains("PDF Format"));
    }

    @Test
    void verifyWatermarkFeatureWorks() {
        StudentReport report = new WatermarkDecorator(new BasicReport());
        assertTrue(report.generate().contains("Watermark Added"));
    }

    @Test
    void verifySignatureFeatureWorks() {
        StudentReport report = new SignatureDecorator(new BasicReport());
        assertTrue(report.generate().contains("Signed"));
    }

    @Test
    void verifyDecoratedReportIsNotNull() {
        StudentReport report = new SignatureDecorator(new WatermarkDecorator(new PdfDecorator(new BasicReport())));
        assertNotNull(report);
    }
}
