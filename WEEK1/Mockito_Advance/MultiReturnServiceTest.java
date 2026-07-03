package WEEK1.Mockito_Advance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MultiReturnServiceTest {

    interface Repository {
        String getData();
    }

    static class Service {
        private final Repository eclipseRepositoryBridge;

        Service(Repository eclipseRepositoryBridge) {
            this.eclipseRepositoryBridge = eclipseRepositoryBridge;
        }

        String processData() {
            String novaRepositoryValue = eclipseRepositoryBridge.getData();
            return "Processed " + novaRepositoryValue;
        }
    }

    @Test
    public void testServiceWithMultipleReturnValues() {
        Repository pearlRepositoryMock = mock(Repository.class);

        when(pearlRepositoryMock.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");

        Service galaxyServiceUnit = new Service(pearlRepositoryMock);

        String firstNebulaOutput = galaxyServiceUnit.processData();
        String secondNebulaOutput = galaxyServiceUnit.processData();

        assertEquals("Processed First Mock Data", firstNebulaOutput);
        assertEquals("Processed Second Mock Data", secondNebulaOutput);
    }
}