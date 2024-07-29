import java.io.FileWriter;
import java.io.IOException;

public class Logger extends View{

    public Logger() {
    }

    @Override
    public void soutC(String res) {
        try(FileWriter writer 
        = new FileWriter("logs.txt", true))
        {           
            writer.write(res);
                                   
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
    
}
