import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.engine.discovery.DiscoverySelectors;

import java.io.PrintWriter;

public class TestRunner {
    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
            .selectors(DiscoverySelectors.selectClass("practical1.CollegeConfigTest"))
            .selectors(DiscoverySelectors.selectClass("practical2.NotificationFactoryTest"))
            .selectors(DiscoverySelectors.selectClass("practical3.StudentBuilderTest"))
            .selectors(DiscoverySelectors.selectClass("practical4.EmailAdapterTest"))
            .selectors(DiscoverySelectors.selectClass("practical5.FacadeTest"))
            .selectors(DiscoverySelectors.selectClass("practical6.ProxyTest"))
            .selectors(DiscoverySelectors.selectClass("practical7.DecoratorTest"))
            .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));
        summary.printFailuresTo(new PrintWriter(System.err));
    }
}
