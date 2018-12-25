package clf.io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextByBufTest {

    public static void main(String[] args){
	//TODO Auto-generated method stub
	//copy_method1();
	FileReader fr = null;
	FileWriter fw = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	try {
	    fr = new FileReader("bufferwriter.txt");
	    fw = new FileWriter("bufferwriter_copy.txt");
	    br = new BufferedReader(fr);
	    bw = new BufferedWriter(fw);
	    String chs = null;
	    while((chs = br.readLine()) != null){
		bw.write(chs);
		bw.newLine();
		bw.flush();
	    }
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}finally{
	    if(br != null){
		try {
		    br.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    if(bw != null){
		try {
		    bw.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    if(br == null && fr != null){
		try {
		    fr.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    if(bw == null && fw != null){
		try {
		    fw.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}



    }

    private static void copy_method1() {
	FileReader fr = null;
	FileWriter fw = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	try {
	    fr = new FileReader("bufferwriter.txt");
	    fw = new FileWriter("bufferwriter_copy.txt");
	    br = new BufferedReader(fr);
	    bw = new BufferedWriter(fw);
	    int ch = 0;
	    while((ch = br.read()) != -1)
		bw.write(ch);

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}finally{
	    if(br != null){
		try {
		    br.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    if(bw != null){
		try {
		    bw.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    if(br == null && fr != null){
		try {
		    fr.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    if(bw == null && fw != null){
		try {
		    fw.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}
    }

}
