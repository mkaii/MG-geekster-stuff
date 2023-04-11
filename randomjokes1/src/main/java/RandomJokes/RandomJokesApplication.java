package RandomJokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RandomJokesApplication {

    public static void main(String[] args) {
        //purpose of the starting point :
        //start the application
        //create a servlet container
        //host the war file of this application on this servlet container

        //all this is done in 1 line using
        // a static method of "SpringApplication" and "SpringBootApplication".....!

        SpringApplication.run(RandomJokesApplication.class,args);



    }
}
