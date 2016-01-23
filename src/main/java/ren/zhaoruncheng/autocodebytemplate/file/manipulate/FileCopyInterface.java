/**
 *  file copy method interface
 *  method list:
 *  	copyFile: copy file from source file to the indicated file
 */
package ren.zhaoruncheng.autocodebytemplate.file.manipulate;

import java.io.File;

public interface FileCopyInterface {
	
	public void copyFiles(File copyFile,File pasteFile);
	
}
