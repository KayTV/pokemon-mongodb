package com.kaytv;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Pokemon {
    MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
    MongoDatabase database = mongoClient.getDatabase("pokemon-db");
    MongoCollection<Document> coll = database.getCollection("users");

    public Pokemon() {
        Document pokemon = coll.find(new Document("id", 1)).first();
        System.out.println(pokemon.toJson());
    }
}
