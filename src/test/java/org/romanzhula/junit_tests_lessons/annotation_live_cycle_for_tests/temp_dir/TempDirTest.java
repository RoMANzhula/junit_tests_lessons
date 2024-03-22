package org.romanzhula.junit_tests_lessons.annotation_live_cycle_for_tests.temp_dir;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

public class TempDirTest {

    @Test
    void testFileDir(@TempDir Path tempDir) {
        Path file = tempDir.resolve("test.txt");
        System.out.println(file); //output: C:\Users\Admin\AppData\Local\Temp\junit18341419046108866622\test.txt
    }

    @TempDir
    Path dir;

    @Test
    void commonDir() {
        System.out.println(dir.getFileName()); //junit11234172405390073548
    }
}
