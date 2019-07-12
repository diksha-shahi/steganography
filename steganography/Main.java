package steganography;

public class Main 
{
  public static void main(String[] args) 
  {
    try
    {
      Embedder emb = new Embedder("this is good", "Downloads:/abc.txt", "Downloads:/kola.jpg", "Downloads:/qqq.png");
      emb.embed();
      
    }
    catch(Exception ex)
    {
      System.out.println("Err: " + ex);
    }
  }
}
