package none.rks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.glassfish.jersey.logging.LoggingFeature;
import org.json.JSONObject;

import java.util.logging.Level;

public class SlackIntegrationDemo {

    private static final String REST_URI
            = "<slack-url>";

    private Client client = ClientBuilder.newBuilder()
            .register(LoggingFeature.class)
            .property(LoggingFeature.LOGGING_FEATURE_VERBOSITY_CLIENT, LoggingFeature.Verbosity.PAYLOAD_ANY)
            .property(LoggingFeature.LOGGING_FEATURE_LOGGER_LEVEL_CLIENT, Level.INFO.getName())
            .build();

    public Response sendAlert(Alert alert) throws JsonProcessingException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("text", new ObjectMapper().writeValueAsString(alert));

        return client
                .target(REST_URI)
                .request(MediaType.APPLICATION_JSON)
                .acceptEncoding("UTF-8")
                .post(Entity.entity(jsonObject.toString(), MediaType.APPLICATION_JSON));
    }

    public static void main(String[] args) throws JsonProcessingException {
        Response response = new SlackIntegrationDemo().sendAlert(new Alert("1", "SI", "Ransomware Alert", "123"));
        System.out.println(response);
    }
}
