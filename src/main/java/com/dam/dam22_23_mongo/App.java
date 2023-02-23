package com.dam.dam22_23_mongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

//Legacy
//import com.mongodb.MongoClient;
//Sync
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//Con nuevo driver Sync
    	MongoClient cliente = MongoClients.create();
    	
    	//Con driver legacy
    	//MongoClient cliente = new MongoClient();
    	//MongoClient cliente = new MongoClient("localhost", 27017);
    	MongoDatabase db = cliente.getDatabase("dam");
    	MongoCollection<Document> coleccion = db.getCollection("alumnos");
    	
    	List<Document> datos = coleccion.find().into(new ArrayList<Document>());
    	for (Document doc: datos) {
    	System.out.println(doc.toString());
    	}
    	
    	
    
    }
}
