package gtech.agriculturerent.ui;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class ApplicationStartUp extends Application {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        applicationContext = new SpringApplicationBuilder(AgricultureApplication.class).run();
    }

    @Override
    public void stop(){
        applicationContext.close();
        Platform.exit();
    }

    @Override
    public void start(Stage primaryStage){
        applicationContext.publishEvent(new StageReadyEvent(primaryStage));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
