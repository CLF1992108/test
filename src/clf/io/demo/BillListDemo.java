package clf.io.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class BillListDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	File f = new File("F:\\教学视频");
	ArrayList<String> al = new ArrayList<String>();
	if(!f.exists()){
	    try {
		f.createNewFile();
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		throw new RuntimeException("文件创建失败");
	    }
	}
	getBillList(f, new FilenameFilter() {
	    
	    @Override
	    public boolean accept(File dir, String name) {
		//TODO Auto-generated method stub
		
		return name.endsWith(".avi");
	    }
	}, al);
	writerToFile(al,f);
    }

    private static void writerToFile(ArrayList<String> al,File f) {
	//TODO Auto-generated method stub
	File f1= new File(f,"list.txt");
	BufferedWriter bw = null;
	try {
	    bw = new BufferedWriter(new FileWriter(f1));
	    for(String s : al){
		System.out.println(s);
		bw.write(s);
		bw.newLine();
		bw.flush();
	    }
	} catch (IOException e) {
	    throw new RuntimeException("文件写入失败");
	    
	}finally{
	    if(bw != null){
		try {
		    bw.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    throw new RuntimeException("流关闭失败");
		}
	    }
	}
    }

    public static void getBillList(File f, FilenameFilter filenameFilter, ArrayList<String> arrayList) {
	//TODO Auto-generated method stub
	File[] files = f.listFiles();
	for(File file: files){
        	if(file.isDirectory()){
        	    getBillList(file,filenameFilter,arrayList);
        	}else{
        	    if(filenameFilter.accept(file, file.getName())){
        		
        		arrayList.add(file.getName());
        	    }
        	}
    	}
    }

}
