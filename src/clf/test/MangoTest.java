package clf.test;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MangoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{   
		       // 连接到 mongodb 服务
		         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		       
		         // 连接到数据库
		         MongoDatabase mongoDatabase = mongoClient.getDatabase("test");  
		         //mongoDatabase.createCollection("test");
		         MongoCollection<Document> collection = mongoDatabase.getCollection("test");
		         Document document = new Document("title", "MongoDB").  
		        		 append("description", "database").  
		                 append("likes", 100).  
		                 append("by", "Fly"); 
		         List<Document> documents = new ArrayList<Document>();  
		         documents.add(document);  
		         collection.insertMany(documents);
		         
		         FindIterable<Document> findIterable = collection.find();
		         MongoCursor<Document> mongoCursor = findIterable.iterator();  
		         while(mongoCursor.hasNext()){  
		            System.out.println(mongoCursor.next());  
		         }
		         //System.out.println("Connect to database successfully");
		        
		      }catch(Exception e){
		        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     }
	}

}
