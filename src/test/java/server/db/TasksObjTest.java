package server.db;

import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import server.core.TasksObj;


public class TasksObjTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializesToJSON() throws Exception {
        final TasksObj task = new TasksObj("500", "TestTask", "10-31-2022", false);

        final String expected = MAPPER.writeValueAsString(
                MAPPER.readValue(fixture("fixtures/task.json"), TasksObj.class));

        assertThat(MAPPER.writeValueAsString(task)).isEqualTo(expected);
    }

    @Test
    void getId() {
        final TasksObj task = new TasksObj("500", "Test Task", "10-31-2022", false);
        String expected = "500";
        String testValue = task.getId();
        assertThat(testValue.equals(expected));
    }

    @Test
    void setId() {
        final TasksObj task = new TasksObj("500", "Test Task", "10-31-2022", false);
        String expected = "300";
        task.setId("300");
        String testValue = task.getId();
        assertThat(testValue.equals(expected));
    }

    @Test
    void getsetTaskInfo() {
        final TasksObj task = new TasksObj("5", "TestTask", "10-31-2022", false);
        String expected = "TestTask";
        String testValue = task.getTaskInfo();
        assertThat(testValue.equals(expected));
        expected = "Transformed";
        task.setTaskInfo("Transformed");
        testValue = task.getTaskInfo();
        assertThat(testValue.equals(expected));
    }

//    @Test
//    void getDate() {
//    }
//
//    @Test
//    void setDate() {
//    }
//
//    @Test
//    void getCompleted() {
//    }
//
//    @Test
//    void setCompleted() {
//    }
    
}
