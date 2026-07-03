package WEEK1.Mockito_Advance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServiceTest {

    interface Repository {
        String getData();
    }

    static class Service {
        private final Repository auroraRepositoryGate;

        Service(Repository auroraRepositoryGate) {
            this.auroraRepositoryGate = auroraRepositoryGate;
        }

        String processData() {
            String nebulaRawPacket = auroraRepositoryGate.getData();
            return "Processed " + nebulaRawPacket;
        }
    }

    @Test
    public void testServiceWithMockRepository() {
        Repository sapphireRepositoryMock = mock(Repository.class);

        when(sapphireRepositoryMock.getData()).thenReturn("Mock Data");

        Service orbitProcessingService = new Service(sapphireRepositoryMock);

        String velvetProcessedOutput = orbitProcessingService.processData();

        assertEquals("Processed Mock Data", velvetProcessedOutput);
    }
}