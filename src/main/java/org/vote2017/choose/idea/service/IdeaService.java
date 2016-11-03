package org.vote2017.choose.idea.service;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.jongo.MongoCursor;
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

    @Inject
    private Jongo jongo;

    public List<Idea> findAll(){

        Idea ideatemp = new Idea();
        ideatemp.setDescription("One description");
        ideatemp.setTitle("One title");

        MongoCollection collection = jongo.getCollection("ideas");

//        collection.save(ideatemp);

        MongoCursor<Idea> cursorIdea = collection.find().as(Idea.class);
        List<Idea> ideas = new ArrayList<>();
        cursorIdea.forEach(idea -> ideas.add(idea));
        return ideas;
    }

    public Idea findOne(){

        Idea idea = new Idea();
        idea.setDescription("One description");
        idea.setTitle("One title");
        return idea;
    }
}
