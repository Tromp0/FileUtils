/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cat.uvic.teknos.m06.fileutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;


class FileUtilsTest {
    @Test
    void GivenValidPathWhenidValidThenTrue() {
        assertTrue(FileUtils.isValidDirectory("C:\\Users\\10034356\\source\\repos\\fileutils\\FileUtils\\lib\\src\\main\\resources"));
    }
}


