package ru.netology.myradio;

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    public Radio () {

    }

    public Radio (int quantityOfStations) {
        maxStation = quantityOfStations - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = maxStation;
        }
        if (currentStation < minStation)
            currentStation = minStation;
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void previousStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }
}
