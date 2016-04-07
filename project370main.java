import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class project370main {
   static String[] result=new String[0];
   static String[] paramaterresult=new String[0];
   static OC oc=new OC();
   static IC ic=new IC();
   static MyException exception;
   static int linenum=1;
   public static void main(String[] args) throws FileNotFoundException, MyException {
      JOptionPane.showMessageDialog(null, "Please find input text file");
      JFileChooser chooser=new JFileChooser( );
      int status;
      FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt Files", "txt", "text");
      chooser.setFileFilter(filter);
      status = chooser.showOpenDialog(null);
      if (status == JFileChooser.APPROVE_OPTION)
         readSource(chooser.getSelectedFile());
      
   }
   private static void readSource(File chosenFile) throws FileNotFoundException, MyException  {
      try{
         Scanner scanner = new Scanner(chosenFile);
         while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            result = line.split(":");
            methodcalls(result);
            System.out.println("done with current line "+linenum);
            System.out.println();
            linenum++;
         }//while
         scanner.close();
      }//try
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }//catch
   }//readsource
   private static void methodcalls(String[] result2) throws NumberFormatException, MyException {
      
      if (Integer.parseInt(result2[0])==0){
         paramaterresult=result2[4].split(" ");
         
         if(Integer.parseInt(result2[2])==0){
            try{
               System.out.println("calling on method ICfunc");
               ic.ICfunc(Integer.parseInt(paramaterresult[0]),Integer.parseInt(paramaterresult[1]),Integer.parseInt(paramaterresult[2]));
               System.out.println("dont with method ICfunc");
            }//try
            catch(MyException ex){
               System.out.println(ex);
            }//catch
         }//if result2[1]==0
         
         else{
            System.out.println("calling on method compareFunc");
            ic.CompareFunc(Integer.parseInt(paramaterresult[0]));
            System.out.println("done with method CompareFunc");
         }//if result2[1]==1
      }//if result2[0]==0
      
      else if (Integer.parseInt(result2[0])==1){
         
         if(Integer.parseInt(result2[2])==0){
            System.out.println("about to create object exception");
            exception= new MyException();
            System.out.println("object exception created");
         }//if result[1]==0
         
         else {
            System.out.println("about to create object exception");
            exception=new MyException(result2[4]);
            System.out.println("object exception created");
         }//else result2[1]!=0
      }//elseif result2[0]==1
      
      else{
         
         if(Integer.parseInt(result2[2])==0){
            paramaterresult=result2[4].split(" ");
            System.out.println("calling on method OCfunc");
            oc.OCfunc(Integer.parseInt(paramaterresult[0]),Integer.parseInt(paramaterresult[1]) );
            System.out.println("done calling method OCfunc");
         }//if result2[1]==0
         
         else{
            System.out.println("calling on method OCinit");
            oc.OCinit();
            System.out.println("done calling method OCinit");
         }// if result[1]==1
      }//if result[0]==2
   }//methodcalls
}//class
