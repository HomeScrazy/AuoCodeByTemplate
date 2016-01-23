package ren.zhaoruncheng.autocodebytemplate.file.manipulate;

import java.io.File;


public class TextFileController implements FileCopyInterface{

	public void copyFiles(File copyFile, File pasteFile) {
		// TODO Auto-generated method stub
		ReadFile reader=new ReadFile(copyFile);
		WriteFile writer=new WriteFile(pasteFile);
		writer.Write(reader.getString());
	}
	
	public void FileReplace(File file,BaseReplace baseReplace){
		
		ReadFile reader=new ReadFile(file);
		String source=reader.getString();
		baseReplace.replace(source);
	}
}
