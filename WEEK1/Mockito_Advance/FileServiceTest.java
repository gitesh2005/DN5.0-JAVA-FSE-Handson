package WEEK1.Mockito_Advance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FileServiceTest {

    interface FileReader {
        String read();
    }

    interface FileWriter {
        void write(String galaxyFileText);
    }

    static class FileService {
        private final FileReader crystalReaderUnit;
        private final FileWriter emeraldWriterUnit;

        FileService(FileReader crystalReaderUnit, FileWriter emeraldWriterUnit) {
            this.crystalReaderUnit = crystalReaderUnit;
            this.emeraldWriterUnit = emeraldWriterUnit;
        }

        String processFile() {
            String horizonFileContent = crystalReaderUnit.read();
            emeraldWriterUnit.write(horizonFileContent);
            return "Processed " + horizonFileContent;
        }
    }

    @Test
    public void testServiceWithMockFileIO() {
        FileReader meteorFileReaderMock = mock(FileReader.class);
        FileWriter thunderFileWriterMock = mock(FileWriter.class);

        when(meteorFileReaderMock.read()).thenReturn("Mock File Content");

        FileService silverFileService = new FileService(
                meteorFileReaderMock,
                thunderFileWriterMock
        );

        String rainbowFileResult = silverFileService.processFile();

        assertEquals("Processed Mock File Content", rainbowFileResult);

        verify(meteorFileReaderMock).read();
        verify(thunderFileWriterMock).write("Mock File Content");
    }
}