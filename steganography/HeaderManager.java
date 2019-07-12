package steganography;
import java.io.File;

public class HeaderManager 
{
  final static int HEADER_LENGTH = 25;
  final static char SEPARATOR = '~';

  static String formHeader(String fname, long fsize) 
  {//Split : 16+1+8
    int forSize = 8;
    int forSeparator = 1;
    int forName = HEADER_LENGTH - forSize - forSeparator;

    //length process
    String fs= String.valueOf(fsize);//45309   
    while(fs.length() < forSize)
      fs = "#"+fs; //###45309

    //name process   
    File f = new File(fname);//f:/mydocs/qwerty.jpg
    fname= f.getName();//qwerty.jpg

    if(fname.length() > forName)
    {//trim (MapsOfArunachalPradesh.jpg)
      int start = fname.length() - forName;
      fname = fname.substring(start);
    }   
    else
    {//padding
      while(fname.length() < forName)
        fname = "#"+fname; //######qwerty.jpg
    }

    return fname + SEPARATOR + fs;
  }

}
