
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaMongoExample {

	public static void main(String[] args) {
		
//		 Creating a Mongo client 
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 ); 
		System.out.println("Created Mongo Connection successfully"); 
		
		MongoDatabase db = mongoClient.getDatabase("youtube");
		System.out.println("Get database is successful");
		
		System.out.println("Below are list of databases present in MongoDB");
		// To get all database names        
		 MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
		   while(dbsCursor.hasNext()) {
		          System.out.println(dbsCursor.next());
		          
		       

		      }
		   
		   
		 //Inserting sample record by creating collection and document.
		   MongoCollection<Document>  collection= db.getCollection("channels");
		   Document doc =new Document("name","SimplifyingTech");
		   collection.insertOne(doc);
		   System.out.println("########### Insert is completed  ###############");
		   
		   

		      }

		// TODO Auto-generated method stub

	}


