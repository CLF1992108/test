package clf.io.demo;

import java.io.File;
import java.io.FilenameFilter;

public class FilterBySuffix implements FilenameFilter {

    private String suffixName;
    public FilterBySuffix(String suffixName) {
	// TODO Auto-generated constructor stub
	this.suffixName = suffixName;
    }
    @Override
    public boolean accept(File dir, String name) {
	//TODO Auto-generated method stub
	return name.endsWith(suffixName);
    }

}
