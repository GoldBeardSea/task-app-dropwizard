package server;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import server.resources.TaskController;

public class reactDropApplication extends Application<reactDropConfiguration> {
// some additional lines
    // some addition lines
    //Some additional lines
    public static void main(final String[] args) throws Exception {
        new reactDropApplication().run(args);
    }

    @Override
    public String getName() {
        return "reactDrop";
    }

    @Override
    public void initialize(final Bootstrap<reactDropConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final reactDropConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new CORSFilter());
        environment.jersey().register(new TaskController());

    }

}
