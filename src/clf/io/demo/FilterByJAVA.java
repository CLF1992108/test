package clf.io.demo;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByJAVA implements FilenameFilter {

    @Override
    public boolean accept(File dir, String name) {
	//TODO Auto-generated method stub
	return name.endsWith(".java");
    }

}
