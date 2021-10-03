package Virtualkey;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;



public class FileFunctions {
	
	Scanner sc=new Scanner(System.in);
	
	Directory dir =new Directory();
	
	 public void AddFile() {
	        System.out.println("Please Enter the Filename:");

	        String fileName = this.getInputString();

	        System.out.println("You are adding a file named: " + fileName);
	        
			try {
				Path path = FileSystems.getDefault().getPath(Directory.name + fileName).toAbsolutePath();
				File file = new File(dir.getName() + fileName);
				
			      if (file.createNewFile()) {
			    	  System.out.println("File created: " + file.getName());
			    	  dir.getFiles().add(file);
			    	  
			      } else {
			        System.out.println("This File Already Exits, no need to add another");
			      }
			}catch (IOException e){
				System.out.println(e);
			}
		}
	 
	 public void DeleteFile() {
	    	
	    	System.out.println("Please Enter the Filename:");

	        String fileName = this.getInputString();

	        System.out.println("You are deleting a file named: " + fileName);
	        
	        
		    //TODO: Delete file
	        // Finished TODO
	        
			Path path = FileSystems.getDefault().getPath(Directory.name + fileName).toAbsolutePath();
			File file = path.toFile();
		      if (file.delete()) {
		    	  System.out.println("Deleted File: " + file.getName());
		    	  dir.getFiles().remove(file);
		      } else {
		        System.out.println("Failed to delete file:" + fileName + ", file was not found.");
		      }
	    }
	 
	 public void SearchFile() {
	    	
	    	Boolean found = false;
	    	
	    	System.out.println("Please Enter the Filename:");

	        String fileName = this.getInputString();

	        System.out.println("You are searching for a file named: " + fileName);
	        
	        //TODO Fix it so ArrayList obtains files
	        //Finished TODO
	        
	        ArrayList<File> files = dir.getFiles();
	        
	        
	        for(int i = 0; i < files.size(); i++) {
				if(files.get(i).getName().equals(fileName)) {
					System.out.println("Found " + fileName);
					found = true;
				}
	        }
	        if (found == false) {
	        	System.out.println("File not found");
	        }
	    }
	 
	 private String getInputString() {

	        Scanner in = new Scanner(System.in);
	        return(in.nextLine());

	    }
	 
	 private static Directory fileDirectory = new Directory();
	    
	    public void showFiles() {
	    	
	    	fileDirectory.fillFiles();

	        for (File file : FileFunctions.getFileDirectory().getFiles())
	        {
	            System.out.println(file.getName());
	        }
	    }
	    public static Directory getFileDirectory() {
	        return fileDirectory;
	    }

	    public static void setFileDirectory(Directory fileDirectory) {
	        FileFunctions.fileDirectory = fileDirectory;
	    }
	        

}
