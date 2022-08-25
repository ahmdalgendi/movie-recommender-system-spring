package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter contentBasedFilter;

    public RecommenderImplementation(Filter contentBasedFilter) {
        super();
        this.contentBasedFilter = contentBasedFilter;
    }

    public String[] recommendMovies(String movie) {
        //use content based filter to find similar movies
        //return the results
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");

        String[] results = contentBasedFilter.getRecommendations("Finding Dory");

        return results;
    }
}
