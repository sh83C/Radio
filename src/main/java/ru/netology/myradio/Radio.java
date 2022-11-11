package ru.netology.myradio;

public class Radio {
    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0)
            return;
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        }
        else {
            currentStation =0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
         currentStation--;
        }
        else {
            currentStation = 9;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        else {
            currentVolume = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 9) {
            currentVolume++;
        }
        else {
            currentVolume = 9;
        }
    }
}
