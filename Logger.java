import java.io.FileWriter;
import java.io.IOException;

public class Logger extends View{
    private boolean flag = true;

    public Logger() {
    }

    @Override
    public void soutC(String res) {
        try(FileWriter writer 
        = new FileWriter("logs.txt", flag)) {           
            writer.write(res);                      
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }
    
}
