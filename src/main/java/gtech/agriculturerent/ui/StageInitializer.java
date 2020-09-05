package gtech.agriculturerent.ui;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {


    private final String applicationTitle;
    private ApplicationContext applicationContext;


    public StageInitializer(@Value("${spring.application.ui.title}") String applicationTitle, ApplicationContext applicationContext){
        super();
        this.applicationTitle = applicationTitle;
        this.applicationContext = applicationContext;
    }


    @Override
    public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
        final Stage primaryStage = stageReadyEvent.getStage();
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(new ClassPathResource("/main.fxml").getURL());
            fxmlLoader.setControllerFactory(aClass -> applicationContext.getBean(aClass));
            Parent parent = fxmlLoader.load();

            Scene scene = new Scene(parent);
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.setTitle(applicationTitle);
            primaryStage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
