package org.vote2017.choose.conf;

import com.mongodb.MongoClient;
import org.jongo.Jongo;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

/**
 * Producer used to acces MongoDB database
 * Created by Marc ABOU CHACRA on 31/10/16.
 */
@ApplicationScoped
public class MongoDbProducer {

    @Produces
    public MongoClient mongoClient(){
        return new MongoClient("localhost", 27017);
    }

    @Produces
//    @ApplicationScoped
    public Jongo jongo(MongoClient mongoClient){
        return new Jongo(mongoClient.getDB("chooseDB"));
    }
}
