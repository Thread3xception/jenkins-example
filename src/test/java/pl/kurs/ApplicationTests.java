package pl.kurs;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTests.class);


    @Test
    void contextLoads() {
        LOGGER.info("Test running %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        assertTrue(true);
    }

}
