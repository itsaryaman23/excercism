
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }public int getToday(){return this.birdsPerDay[this.birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds:this.birdsPerDay)
            {
                if(birds==0)
                    return true;
            }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i =0; i<(numberOfDays<birdsPerDay.length?numberOfDays:birdsPerDay.length); i++)
            {
                sum+=this.birdsPerDay[i];
            }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int birds: this.birdsPerDay)
            {
                if(birds>=5)
                    count++;
            }
        return count;
    }
}
