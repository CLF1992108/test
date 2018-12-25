package clf.regex.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {

    public static void main(String[] args){
	//TODO Auto-generated method stub
	int count = 0;
	List<String> lists = new ArrayList<String>();
	try{
	    function_local("https://blog.csdn.net/axi295309066/article/details/62236178?locationNum=1&fps=1",count,lists);
	}catch(IOException e){
	    System.out.println(e);
	}
    }

    public static void function_local(String url_str,int count,List<String> lists) throws IOException {
	//TODO Auto-generated method stub
	try{
	//BufferedReader br = new BufferedReader((new FileReader(new File("demo1.txt"))));
        	URL url = new URL(url_str);
        	BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        	String len = null;
        	String regex = "[hHf][tT]{1,2}[pP][s]?://([a-zA-Z0-9/\\.]+)+";
        	Pattern p = Pattern.compile(regex);
        	while((len = br.readLine()) != null){
        	    Matcher m = p.matcher(len);
        	    while(m.find()){
        		String str = m.group();
        		System.out.println(str+(++count));
        		if(lists.size()>5)
        		    return;
        		if(!lists.contains(str)){
        		    lists.add(str);
        		    function_local(str,count,lists);
        		}
        		
        	    }
        	}
        	br.close();
	}catch(IOException e){
	    e.getMessage();
	}
	
    }

}
