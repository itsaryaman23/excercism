public class JedliksToyCar {
    private static int distance; 
    private static int battery;
    public JedliksToyCar(){
        distance = 0;
        battery = 100;
    }
    public static JedliksToyCar buy() {
       return new JedliksToyCar();
    }

    public String distanceDisplay() {
       return "Driven "+distance+" meters";
    }

    public String batteryDisplay() {
        if(battery==0)
            return "Battery empty";
        return "Battery at "+battery+"%";
    }

    public void drive() {
        if(battery!=0)
        {
        distance+=20;
        battery-=1;
        }
            
    }
}
