package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RadioTest {


    @ParameterizedTest
    @CsvFileSource(resources = "test_set_radiostation.csv")

    public void setRadioStationParameterizedTest(int station, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(station);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_next_radiostation.csv")
    public void switchToTheNextRadioStationParameterizedTest(int station, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(station);
        radio.next();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_prev_radiostation.csv")
    public void switchToThePreviousRadioStationParameterizedTest(int station, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(station);
        radio.prev();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_set_volume.csv")

    public void setRadioVolumeParameterizedTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_increase_volume.csv")
    public void increaseVolumeParameterizedTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_decrease_volume.csv")
    public void decreaseVolumeParameterizedTest(int volume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_set_30radiostations.csv")

    public void setRadioStationFor30StationsParameterizedTest(int station, int expected) {
        Radio radio = new Radio(0, 20, 29);
        radio.setCurrentRadioStation(station);

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_next_30radiostations.csv")
    public void switchToTheNextFor30StationsParameterizedTest(int station, int expected) {
        Radio radio = new Radio(0, 20, 29);
        radio.setCurrentRadioStation(station);
        radio.next();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_prev_30radiostations.csv")
    public void switchToThePreviousFor30StationsParameterizedTest(int station, int expected) {
        Radio radio = new Radio(0, 20, 29);
        radio.setCurrentRadioStation(station);
        radio.prev();

        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_set_volume.csv")

    public void setRadioVolumeFor30StationsParameterizedTest(int volume, int expected) {
        Radio radio = new Radio(0, 20, 29);
        radio.setCurrentVolume(volume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_increase_volume.csv")
    public void increaseVolumeFor30StationsParameterizedTest(int volume, int expected) {
        Radio radio = new Radio(0, 20, 29);
        radio.setCurrentVolume(volume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "test_decrease_volume.csv")
    public void decreaseVolumeFor30StationsParameterizedTest(int volume, int expected) {
        Radio radio = new Radio(0, 20, 29);
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

