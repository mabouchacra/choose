package org.vote2017.choose.idea.service;

import com.mongodb.Function;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import org.vote2017.choose.idea.entity.Idea;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc ABOU CHACRA on 31/10/16.
 */
@ApplicationScoped
public class IdeaService {

    private final MongoDatabase mongoDatabase;

    @Inject
    public IdeaService(MongoDatabase mongoDatabase){
        this.mongoDatabase = mongoDatabase;
    }

    public List<Idea> findAll(){
        FindIterable iterable = mongoDatabase.getCollection("ideas").find();

        //TODO to finish
        iterable.map(new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        });
    }
}
