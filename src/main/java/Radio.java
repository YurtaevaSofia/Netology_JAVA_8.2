import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Radio {

    private int currentVolume;
    private int currentRadiostationNumber;
    private int numberOfRadiostations = 10;


    public void setCurrentRadiostationNumber(int currentRadiostationNumber) {
        if (currentRadiostationNumber > numberOfRadiostations || currentRadiostationNumber <0){
            System.out.println("Try other Radio station number ");
            return;
        }
        this.currentRadiostationNumber = currentRadiostationNumber;
    }

    public void nextRadiostation () {
        if (currentRadiostationNumber == numberOfRadiostations) currentRadiostationNumber = 0;
        else currentRadiostationNumber++;
    }

    public void previousRadiostation () {
        if (currentRadiostationNumber == 0) currentRadiostationNumber = numberOfRadiostations;
        else currentRadiostationNumber--;
    }

    public void volumeIncrease () {
        if (currentVolume == 100) return;
        currentVolume++;
    }

    public void volumeDecrease () {
        if (currentVolume == 0) return;
        currentVolume--;
    }

    public Radio(int numberOfRadiostations) {
        this.numberOfRadiostations = numberOfRadiostations;
    }

}
