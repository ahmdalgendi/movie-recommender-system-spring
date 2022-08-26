package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ContentBasedFilter implements Filter {
    public  static int instances = 0;

    @Autowired
    private Movie movie;
    ContentBasedFilter() {
        super();
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[]{"Happy Feet", "Ice Age", "Shark Tale"};
    }


    public Movie getMovie() {
        return movie;
    }
    public static int getInstances() {
        return ContentBasedFilter.instances;
    }
}
