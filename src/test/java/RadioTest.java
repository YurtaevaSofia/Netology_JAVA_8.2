import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadiostationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(5);
        assertEquals(5, radio.getCurrentRadiostationNumber());
        radio.setCurrentRadiostationNumber(49);
        assertEquals(5, radio.getCurrentRadiostationNumber());
    }

    @Test
    void nextRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(8);
        radio.nextRadiostation();
        assertEquals(9, radio.getCurrentRadiostationNumber());
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadiostationNumber());
    }

    @Test
    void previousRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(1);
        radio.previousRadiostation();
        assertEquals(0, radio.getCurrentRadiostationNumber());
        radio.previousRadiostation();
        assertEquals(9, radio.getCurrentRadiostationNumber());
    }

    @Test
    void volumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.volumeIncrease();
        assertEquals(10, radio.getCurrentVolume());
        radio.volumeIncrease();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void volumeDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.volumeDecrease();
        assertEquals(0, radio.getCurrentVolume());
        radio.volumeDecrease();
        assertEquals(0, radio.getCurrentVolume());
    }
}