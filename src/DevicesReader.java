import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DevicesReader {
    FileReader reader;
    Scanner scan;
    DevicesReader(String inputFile){
        try{
            reader  = new FileReader(inputFile);
            scan = new Scanner(reader);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    /**читает следующую строку надеясь на форматString type, int id, int RAM, int ROM, double price, Date releaseDate
     * (realeaseDate ожидается в формате, хранящемся в обстрактном классе SmartDevices)
    */
    public Computer nextDevice(){
        String s;
        s = scan.nextLine();
        return processline(s);
    }

    static private Computer processline(String s){
        StringTokenizer st= new StringTokenizer(s);
        if(st.countTokens() < 6){
            System.out.println(st.countTokens());
        }
        try {
        String type = st.nextToken();
        int id = Integer.parseInt(st.nextToken());
        int RAM = Integer.parseInt(st.nextToken());
        int ROM = Integer.parseInt(st.nextToken());
        double price = Double.parseDouble(st.nextToken());
        Date releaseDate = SmartDevices.dateFormat.parse(st.nextToken());
        return new Computer(id, type, releaseDate, RAM, ROM, price);
        } catch (Exception e) {
            System.out.println("Ошибка в строкe");
            System.out.println(s);
            System.out.println("\n");
        }
        return null;
    }
}
