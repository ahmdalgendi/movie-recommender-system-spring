package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson1.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
        //use ApplicationContext to find which filter is being used
//        RecommenderImplementation recommender = appContext.getBean(
//                RecommenderImplementation.class);
//
//        //call method to get recommendations
//        String[] result = recommender.recommendMovies("Finding Dory");
//
//        //display results
//        System.out.println(Arrays.toString(result));

        ContentBasedFilter cbf1 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf2 = appContext.getBean(ContentBasedFilter.class);
        ContentBasedFilter cbf3 = appContext.getBean(ContentBasedFilter.class);

        System.out.println(cbf1);
        System.out.println(cbf2);
        System.out.println(cbf3);

    }

}
