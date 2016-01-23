package ren.zhaoruncheng.autocodebytemplate.file.manipulate;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMap implements BaseReplace {

private HashMap<String,String> replaceMap;
	
	public String replace(String source) {
		// TODO Auto-generated method stub
		for(Map.Entry<String, String>entry:replaceMap.entrySet()){
			source.replace(entry.getKey(),entry.getValue());
		}
		return source;
	}
	
	public void addReplace(String specific,String replace){
		specific="${"+specific+"}";
		replace="${"+replace+"}";
		replaceMap.put(specific, replace);
	}
	
	public void addReplaceList(String source){
		
	}

	
	public ReplaceMap(){
		replaceMap=new HashMap<String,String>();
	}
}
