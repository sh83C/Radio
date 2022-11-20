package ru.netology.myradio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void ShouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.nextStation();

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetNextStationAboveMax() {

        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.previousStation();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetPreviousStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);

        radio.increaseVolume();

        int expected = 46;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(105);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(62);

        radio.decreaseVolume();

        int expected = 61;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetNextStationParametrized() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void ShouldSetPreviousStationParametrized() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 29;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}