package ren.zhaoruncheng.autocodebytemplate.file.manipulate;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ReplaceMap implements BaseReplace {

private HashMap<String,String> replaceMap;
	
	public String replace(String source) {
		// TODO Auto-generated method stub
		String result=source;
		for(Map.Entry<String, String>entry:replaceMap.entrySet()){
			result=result.replace(entry.getKey(),entry.getValue());
		}
		return result;
	}
	
	public void addReplace(String specific,String replace){
		specific="${"+specific+"}";
		replaceMap.put(specific, replace);
	}
	
	public void addReplace(File txtFile){
		ReadFile reader=new ReadFile(txtFile);
		addReplaceList(reader.getString().split("\n"));
	}
	
	public void addReplaceList(String[] source){
		for(int i=0;i<source.length;i++){
			int point=source[i].indexOf(":");
			//System.out.println(source[i].substring(0, point)+":"+source[i].substring(point+1,source[i].length()));
			addReplace(source[i].substring(0, point),source[i].substring(point+1,source[i].length()));
		}
	}

	
	public ReplaceMap(){
		replaceMap=new HashMap<String,String>();
	}
}
