package com.kaytv;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

public class Main {

    public static void main( String args[] ) {
        Pokemon pokemon = new Pokemon();


        // Creating a Mongo client
//        MongoClient mongo = new MongoClient( "localhost" , 27017 );
//
//        // Creating Credentials
//        MongoCredential credential;
//        credential = MongoCredential.createCredential("sampleUser", "pokemon-db",
//                "password".toCharArray());
//        System.out.println("Connected to the database successfully");
//
//        // Accessing the database
//        MongoDatabase database = mongo.getDatabase("pokemon-db");
//        System.out.println("Credentials ::"+ credential);
//
//        database.createCollection("pokemon");
//        System.out.println("Collection created successfully");
    }
}
