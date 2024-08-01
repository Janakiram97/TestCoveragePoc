package org.example.testcoveragepoc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TestCoveragePocApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void textMain()
    {
        TestCoveragePocApplication.main(new String[] {});
        assertTrue(true);
    }
}
