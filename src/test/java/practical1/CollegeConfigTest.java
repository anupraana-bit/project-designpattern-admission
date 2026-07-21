package practical1;

import org.junit.jupiter.api.Test;
import practical1.good.CollegeConfig;

import static org.junit.jupiter.api.Assertions.*;

class CollegeConfigTest {

    @Test
    void verifyOnlyOneInstanceExists() {
        CollegeConfig config1 = CollegeConfig.getInstance();
        CollegeConfig config2 = CollegeConfig.getInstance();
        assertSame(config1, config2, "Both references should point to the same instance");
    }

    @Test
    void verifyCollegeNameIsCorrect() {
        CollegeConfig config = CollegeConfig.getInstance();
        assertEquals("PCPS College", config.getCollegeName());
    }

    @Test
    void verifySystemVersionIsCorrect() {
        CollegeConfig config = CollegeConfig.getInstance();
        assertEquals("1.0", config.getSystemVersion());
    }

    @Test
    void verifyInstanceIsNotNull() {
        CollegeConfig config = CollegeConfig.getInstance();
        assertNotNull(config);
    }
}
