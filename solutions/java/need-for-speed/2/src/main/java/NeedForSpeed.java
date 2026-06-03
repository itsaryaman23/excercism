class NeedForSpeed {
    private int distance;
    public int battery;
    public int speed;
    private int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        battery  = 100;
        distance = 0;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(battery>=batteryDrain)
            return false;
        return true;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(battery>=batteryDrain)
        {
            distance+=speed;
            battery-=batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
      return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
       while(distance>0 && !car.batteryDrained())
           {
               distance-=car.speed;
               car.drive();
           }

        return !(distance>0);
    }
}
