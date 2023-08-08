package com.dropwizard.taskmanager;


import com.dropwizard.taskmanager.TaskManagerResource;


import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.core.Configuration;
import io.dropwizard.jdbi3.JdbiFactory;
import org.jdbi.v3.core.Jdbi;





public class TaskManagerApplication extends Application<TaskManagerConfiguration> {

    public static void main(String[] args) throws Exception {
        new TaskManagerApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<TaskManagerConfiguration> bootstrap) {
        // Add any initialization code if needed.
    }

    @Override
    public void run(TaskManagerConfiguration configuration, Environment environment) {
        // Assuming you have a valid configuration to set up the database connection,
        // create and configure the Jdbi object here.
        Jdbi jdbi = createAndConfigureJdbi(configuration, environment);
        
        // Create an instance of TaskManagerResource and pass the Jdbi object to its constructor.
        TaskManagerResource taskManagerResource = new TaskManagerResource(jdbi);

        // Register the resource with the environment.
        environment.jersey().register(taskManagerResource);
    }
    
    // Method to create and configure the Jdbi object based on the TaskManagerConfiguration.
    private Jdbi createAndConfigureJdbi(TaskManagerConfiguration configuration, Environment environment) {
    	// Create a new instance of DBIFactory
        final JdbiFactory factory = new JdbiFactory();

        // Use the factory to build and configure the Jdbi instance
        Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
        return jdbi;
    }
}
