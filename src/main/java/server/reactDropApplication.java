package server;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class reactDropApplication extends Application<reactDropConfiguration> {

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
        // TODO: implement application
    }

}
