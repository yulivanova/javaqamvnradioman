package ru.netology;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (9 <= currentRadioStation) {
            setCurrentRadioStation(0);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation <= 0) {
            setCurrentRadioStation(9);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
