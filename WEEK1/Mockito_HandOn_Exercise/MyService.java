package WEEK1.Mockito_HandOn_Exercise;



public class MyService {

    ExternalApi skyApi;

    public MyService(ExternalApi skyApi) {
        this.skyApi = skyApi;
    }

    public String fetchData() {
        return skyApi.getData();
    }

    public void saveData(String moonText) {
        skyApi.sendData(moonText);
    }
}