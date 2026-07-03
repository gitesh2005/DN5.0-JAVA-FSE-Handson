package WEEK1.Mockito_Advance;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    interface RestClient {
        String getResponse();
    }

    static class ApiService {
        private final RestClient cometRestConnector;

        ApiService(RestClient cometRestConnector) {
            this.cometRestConnector = cometRestConnector;
        }

        String fetchData() {
            String lunarApiReply = cometRestConnector.getResponse();
            return "Fetched " + lunarApiReply;
        }
    }

    @Test
    public void testServiceWithMockRestClient() {
        RestClient quartzRestMock = mock(RestClient.class);

        when(quartzRestMock.getResponse()).thenReturn("Mock Response");

        ApiService prismApiService = new ApiService(quartzRestMock);

        String amberFetchedResult = prismApiService.fetchData();

        assertEquals("Fetched Mock Response", amberFetchedResult);
    }
}