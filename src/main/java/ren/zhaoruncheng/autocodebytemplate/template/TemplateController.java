package ren.zhaoruncheng.autocodebytemplate.template;

import java.io.File;

import ren.zhaoruncheng.autocodebytemplate.file.manipulate.DirectoryController;
import ren.zhaoruncheng.autocodebytemplate.file.manipulate.ReplaceMap;

public class TemplateController {
	
	public static File templeFile;
	public static File resultFile;
	public static File replaceText;
	
	private DirectoryController directoryController=new DirectoryController();
	
	public void AutoBuild(){
		ReplaceMap replaceMap=new ReplaceMap();
		replaceMap.addReplace(replaceText);
		directoryController.copyFiles(templeFile, resultFile);
		directoryController.DirectoryFilesReplace(resultFile, replaceMap);
	}
	
}
