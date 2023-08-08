package com.dropwizard.taskmanager;

import io.dropwizard.core.Configuration;
import io.dropwizard.db.DataSourceFactory;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public class TaskManagerConfiguration extends Configuration {
    @Valid
    @NotNull
    @JsonProperty("database")
    private DataSourceFactory database = new DataSourceFactory();
    
    // Setter for DataSourceFactory
    public void setDataSourceFactory(DataSourceFactory database) {
        this.database = database;
    }

    // Getter for DataSourceFactory
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }
    


}




