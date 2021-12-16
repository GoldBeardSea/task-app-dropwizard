//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import javax.ws.rs.Path;
//import javax.ws.rs.GET;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(DropwizardExtensionsSupport.class)
//public class PingTest {
//    @Path("/ping")
//    public static class PingResource {
//        @GET
//        public String ping() {
//            return "pong";
//        }
//    }
//
//    private static final DropwizardClientExtension EXT = new DropwizardClientExtension(new PingResource());
//
//    @Test
//    void shouldPing() throws IOException {
//        final URL url = new URL(EXT.baseUri() + "/ping");
//        final String response = new BufferedReader(new InputStreamReader(url.openStream())).readLine();
//        assertEquals("pong", response);
//    }
//}
