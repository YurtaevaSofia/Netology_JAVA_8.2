import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentRadiostationNumber() {
        // radio created without number of Radiostations
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(5);
        assertEquals(5, radio.getCurrentRadiostationNumber());
        radio.setCurrentRadiostationNumber(49);
        assertEquals(5, radio.getCurrentRadiostationNumber());

        // radio created with number of Radiostations
        Radio radio2 = new Radio(3);
        radio2.setCurrentRadiostationNumber(2);
        assertEquals(2, radio2.getCurrentRadiostationNumber());
        radio2.setCurrentRadiostationNumber(7);
        assertEquals(2, radio2.getCurrentRadiostationNumber());
    }

    @Test
    void nextRadiostation() {
        // radio created without number of Radiostations
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(9);
        radio.nextRadiostation();
        assertEquals(10, radio.getCurrentRadiostationNumber());
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadiostationNumber());

        // radio created with number of Radiostations
        Radio radio2 = new Radio(8);
        radio2.setCurrentRadiostationNumber(7);
        radio2.nextRadiostation();
        assertEquals(8, radio2.getCurrentRadiostationNumber());
        radio2.nextRadiostation();
        assertEquals(0, radio2.getCurrentRadiostationNumber());
    }

    @Test
    void previousRadiostation() {
        // radio created without number of Radiostations
        Radio radio = new Radio();
        radio.setCurrentRadiostationNumber(1);
        radio.previousRadiostation();
        assertEquals(0, radio.getCurrentRadiostationNumber());
        radio.previousRadiostation();
        assertEquals(10, radio.getCurrentRadiostationNumber());

        // radio created with number of Radiostations
        Radio radio2 = new Radio(8);
        radio2.setCurrentRadiostationNumber(1);
        radio2.previousRadiostation();
        assertEquals(0, radio2.getCurrentRadiostationNumber());
        radio2.previousRadiostation();
        assertEquals(8, radio2.getCurrentRadiostationNumber());
    }

    @Test
    void volumeIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.volumeIncrease();
        assertEquals(100, radio.getCurrentVolume());
        radio.volumeIncrease();
        assertEquals(100, radio.getCurrentVolume());
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