//package server.resources;
//
// Neither dropwizard http is importing and breaks
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import server.core.TasksObj;
//import server.reactDropApplication;
////import org.apache.http.HttpResponse;
////import org.apache.http.util.EntityUtils;
//import javax.xml.ws.Response;
//import java.io.IOException;
//
//@ExtendWith(DropwizardExtensionsSupport.class)
//public class TaskControllerTest {
//
//    private static DropwizardAppExtension<TestConfiguration> EXT = new DropwizardAppExtension<>(
//            reactDropApplication.class,
//            ResourceHelpers.resourceFilePath("tasks.yaml")
//    );
//
//    @Test
//    public void
//    retrieveSingleTask() throws ClientProtocolException, IOException {
//
//        HttpUriRequest request = new HttpGet( "http://localhost:8080/tasks/1" );
//        HttpResponse response = HttpClientBuilder.create().build().execute( request );
//        TasksObj resource = RetrieveUtil.retrieveResourceFromResponse(
//                response, TasksObj.class);
//        assertThat( "1", Matchers.is( resource.getId() ) );
//    }
//
//    @Test
//    void getRequestReturns200() {
//        Client client = EXT.client();
//
//        Response response = client.target(
//                        String.format("http://localhost:%d/tasks", EXT.getLocalPort()))
//                .request()
//                .get();
//
//        assertThat(response.getStatus()).isEqualTo(200);
//    }
//
//    @Test
//    void getRequestSpecificTaskReturns200() {
//            Client client = EXT.client();
//
//            Response response = client.target(
//                            String.format("http://localhost:%d/tasks/3", EXT.getLocalPort()))
//                    .request()
//                    .get();
//
//            assertThat(response.getStatus()).isEqualTo(200);
//    }
//}
