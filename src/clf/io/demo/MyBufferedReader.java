package clf.io.demo;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

    private FileReader fr= null;
    private char[] chs = new char[1024];
    private int pos = 0;
    private int count = 0;
    public MyBufferedReader(FileReader fr){
	
	this.fr = fr;
    }
    
    public int myRead() throws IOException{
	if(count == 0){
	    count = fr.read(chs);
	    pos = 0;
	}
	if(count < 0){
	    return -1;
	}
	char ch = chs[pos];
	pos++;
	count--;
	return ch;
    }
    public String myReadLine() throws IOException{
	
	StringBuilder sb = new StringBuilder();
	int ch = 0;
	
	while((ch = myRead()) !=-1){
	    if(ch == '\r')
		continue;
	    if(ch == '\n')
		return sb.toString();
	    sb.append((char)ch);
	    
	}
	if(sb.length() != 0)
	    return sb.toString();
	return null;
    }

    public void close() throws IOException {
	//TODO Auto-generated method stub
	fr.close();
    }
}
