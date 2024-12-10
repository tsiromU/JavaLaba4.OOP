import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        Date releaseDate = new Date();
        Computer ddkfl = new Computer(3, "macbook", releaseDate, 34, 34, 2.4);
        Computer ddkfm = new Computer(4, "macbook", releaseDate, 34, 34, 2.4);

        try{
            
            DevicesWriter writer1 = new DevicesWriter("output.txt");
            writer1.write(ddkfl);
            writer1.write(ddkfm);

            DevicesList list = new DevicesList();
            list.push(ddkfl);
            list.push(ddkfm);
            list.push(ddkfl);
            list.push(ddkfm);

            DevicesReader reader= new DevicesReader("input.txt");
            Computer compic = reader.nextDevice();
            writer1.write(compic);

            writer1.write(list);
        }catch(IOException ex){
            System.out.println("error");
            throw ex;


        }

    }
}
