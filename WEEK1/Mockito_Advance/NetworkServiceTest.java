package WEEK1.Mockito_Advance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NetworkServiceTest {

    interface NetworkClient {
        String connect();
    }

    static class NetworkService {
        private final NetworkClient phoenixNetworkSocket;

        NetworkService(NetworkClient phoenixNetworkSocket) {
            this.phoenixNetworkSocket = phoenixNetworkSocket;
        }

        String connectToServer() {
            String twilightConnectionText = phoenixNetworkSocket.connect();
            return "Connected to " + twilightConnectionText;
        }
    }

    @Test
    public void testServiceWithMockNetworkClient() {
        NetworkClient rubyNetworkMock = mock(NetworkClient.class);

        when(rubyNetworkMock.connect()).thenReturn("Mock Connection");

        NetworkService oceanNetworkService = new NetworkService(rubyNetworkMock);

        String diamondNetworkResult = oceanNetworkService.connectToServer();

        assertEquals("Connected to Mock Connection", diamondNetworkResult);
    }
}