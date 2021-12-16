package server.resources;

import com.sun.org.apache.xpath.internal.operations.Bool;
import server.core.TasksObj;
import server.db.TaskDB;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
public class TaskController {

    @GET
    public Response getTasks() {
        return Response.ok(TaskDB.getTasks()).build();
    }

    @GET
    @Path("/{id}")
    public Response getTaskById(@PathParam("id") String id) {
        TasksObj task = TaskDB.getTask(id);
        if (task != null)
            return Response.ok(task).build();
        else
            return Response.status(Status.NOT_FOUND).build();
    }

    @POST
    @Path("/newtask")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createTask(@FormParam("taskInfo") String taskInfo,
                               @FormParam("date") String date) throws URISyntaxException {
        String uniqueUUID = UUID.randomUUID().toString();
        TasksObj created = TaskDB.createTask(new TasksObj(uniqueUUID, taskInfo, date, false));
        String uri = ("/tasks/" + created.getId());
        new URI(uri);

        return Response.ok(created).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response updateTaskById(@PathParam("id") String id, @FormParam("completed") Boolean completed) {
        TasksObj task = TaskDB.getTask(id);
        if (task != null) {
            task.setCompleted(true);
            TaskDB.updateTask(completed, task);
            return Response.ok(task).build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }

    @DELETE
    @Path("/{id}")
    public Response removeTaskById(@PathParam("id") String id) {
        TasksObj task = TaskDB.getTask(id);
        if (task != null) {
            TaskDB.removeTask(id);
            return Response.ok().build();
        } else
            return Response.status(Status.NOT_FOUND).build();
    }
    
}
