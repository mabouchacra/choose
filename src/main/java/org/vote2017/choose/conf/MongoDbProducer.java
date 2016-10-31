package org.vote2017.choose.conf;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import javax.enterprise.inject.Produces;

/**
 * Producer used to acces MongoDB database
 * Created by Marc ABOU CHACRA on 31/10/16.
 */
public class MongoDbProducer {

    @Produces
    public MongoDatabase mongoClient(){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        return mongoClient.getDatabase("choose2017");
    }
}
