import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class SmartDevices {
    protected int id;
    protected String type;
    protected Date releaseDate;
    protected int ram;
    protected int rom;
    protected double price;
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  

    public SmartDevices(int id, String type, Date releaseDate, int ram, int rom, double price) {
        this.id = id;
        this.type = type;
        this.releaseDate = releaseDate;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }

    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    public int getRam(){
        return ram;
    }
    public int getRom(){
        return rom;
    }
    public double getPrice(){
        return price;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public void setRom(int rom){
        this.rom = rom;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString() {
        
        return  "type="  + type  +
                ", id=" + id +
                ", RAM=" + ram +
                ", ROM=" + rom +
                ", price" + price +
                ", releaseDate=" + dateFormat.format(releaseDate);
                
    }

    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    SmartDevices device = (SmartDevices) obj;
    return id == device.id &&
           ram == device.ram &&
           rom == device.rom &&
           !releaseDate.after(device.releaseDate) &&
           !releaseDate.before(device.releaseDate) &&
           Double.compare(device.price, price) == 0 &&
           type.equals(device.type);
    }
}