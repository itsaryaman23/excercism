public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int min){
        return this.expectedMinutesInOven()-min;
    }
    public int preparationTimeInMinutes(int layers){
        return 2*layers;
    }
    public int totalTimeInMinutes(int layers, int mins)
    {
        int preparationTime = preparationTimeInMinutes(layers);
        return preparationTime + mins;
    }
}
