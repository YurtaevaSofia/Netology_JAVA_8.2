public class Radio {

    private int currentVolume;
    private int currentRadiostationNumber;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadiostationNumber() {
        return currentRadiostationNumber;
    }

    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > 9 || currentRadiostationNumber <0){
            System.out.println("Try other Radio station number ");
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    public void nextRadiostation () {
        if (currentRadiostationNumber == 9) currentRadiostationNumber = 0;
        else currentRadiostationNumber++;
    }

    public void previousRadiostation () {
        if (currentRadiostationNumber == 0) currentRadiostationNumber = 9;
        else currentRadiostationNumber--;
    }

    public void volumeIncrease () {
        if (currentVolume == 10) return;
        currentVolume++;
    }

    public void volumeDecrease () {
        if (currentVolume == 0) return;
        currentVolume--;
    }

}
