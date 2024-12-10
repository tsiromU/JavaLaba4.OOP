import java.util.ArrayList;
import java.util.Iterator;

public class DevicesList{
    ArrayList<SmartDevices> list;

    DevicesList(){
        list = new ArrayList<SmartDevices>();
    }

    public void push(SmartDevices obj){
        list.add(obj);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if(!list.isEmpty()){
            Iterator<SmartDevices> iterator = list.iterator();
            while (iterator.hasNext()) {
                builder.append(iterator.next());
                builder.append('\n');
            }
        }
        return builder.toString();
    }
}