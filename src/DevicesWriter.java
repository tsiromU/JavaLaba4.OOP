import java.io.*;

public class DevicesWriter {
    private FileWriter writer;
    
    
    public DevicesWriter(String fileName) throws IOException{
        try
        {
            writer = new FileWriter(fileName, false);
        } catch(IOException ex){
            // System.out.println(ex.getMessage());
            throw ex;
        } 
    }
    
    public void write(SmartDevices obj){
        try{
            writer.write(obj.toString());
            writer.write("\n");
            writer.flush();

        }catch(IOException ex){
            System.out.println(ex.getMessage());
            
        } 
    };


    public void write(DevicesList obj){
        try{
            writer.write(obj.toString());
            writer.write("\n");
            writer.flush();

        }catch(IOException ex){
            System.out.println(ex.getMessage());
            
        } 
    };
    
}
