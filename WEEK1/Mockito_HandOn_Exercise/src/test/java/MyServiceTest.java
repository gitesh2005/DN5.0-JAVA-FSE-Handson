package WEEK1.Mockito_HandOn_Exercise;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testMockingAndStubbing() {
        ExternalApi cloudApi = mock(ExternalApi.class);

        when(cloudApi.getData()).thenReturn("Mock Data");

        MyService riverService = new MyService(cloudApi);

        String starResult = riverService.fetchData();

        assertEquals("Mock Data", starResult);
    }

    @Test
    public void testVerifyingInteraction() {
        ExternalApi stoneApi = mock(ExternalApi.class);

        MyService leafService = new MyService(stoneApi);

        leafService.fetchData();

        verify(stoneApi).getData();
    }

    @Test
    public void testArgumentMatching() {
        ExternalApi birdApi = mock(ExternalApi.class);

        MyService treeService = new MyService(birdApi);

        treeService.saveData("Hello");

        verify(birdApi).sendData(eq("Hello"));
    }

    @Test
    public void testVoidMethod() {
        ExternalApi rainApi = mock(ExternalApi.class);

        doNothing().when(rainApi).sendData("Save");

        MyService fireService = new MyService(rainApi);

        fireService.saveData("Save");

        verify(rainApi).sendData("Save");
    }
}