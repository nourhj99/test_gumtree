package test.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import com.github.gumtreediff.gen.TreeGenerator;
import com.github.gumtreediff.gen.TreeGenerators;
import com.github.gumtreediff.gen.javaparser.JavaParserGenerator;
import com.github.gumtreediff.gen.python.PythonTreeGenerator;
import com.github.gumtreediff.io.TreeIoUtils;
import com.github.gumtreediff.tree.Tree;
import com.github.gumtreediff.tree.TreeContext;

public class App 
{
    public static void main( String[] args ) throws UnsupportedOperationException, IOException
    {
        System.out.println( "Hello World!" );
        /*
        String file = "G:\\michigan\\independentstudy\\test\\src\\main\\java\\test\\test\\App.java";
        Reader tr = new FileReader (file);
        TreeContext tc = new JavaParserGenerator().generate(tr); // retrieves and applies the default parser for the file 
*/
       
        
        String file = "G:\\michigan\\independentstudy\\sample.py";

        Reader tr = new FileReader (new File(file));
        System.out.print(tr +"\n");

        PythonTreeGenerator tc = new PythonTreeGenerator(); // retrieves and applies the default parser for the file 
        tc.generate(tr);
        /*
        Tree t = tc.getRoot(); // retrieves the root of the tree
        System.out.println(t.toTreeString()); // displays the tree in our ad-hoc format
        //System.out.println(TreeIoUtils.toLisp(tc).toString()); // displays the tree in LISP syntax
*/


           }
    
}
