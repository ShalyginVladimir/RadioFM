public class Radio {
    private int currentStation;
    private int currentVolume;

    public void next() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {


        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {


        this.currentVolume = currentVolume;
    }
}
