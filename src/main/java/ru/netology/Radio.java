package ru.netology;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
//@Data
@Getter


public class Radio {
    private int currentRadioStation;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setAmountRadioStation(int maxRadioStation) {
        if (1 <= maxRadioStation) {
            this.maxRadioStation = maxRadioStation;
        }

    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public int getMaxRadioStation() {
        return this.maxRadioStation;
    }

    public int getMinRadioStation() {
        return this.minRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= this.minRadioStation && newCurrentRadioStation <= this.maxRadioStation) {
            this.currentRadioStation = newCurrentRadioStation;
        }

    }

    public void nextRadioStation() {
        if (this.maxRadioStation <= this.currentRadioStation) {
            this.setCurrentRadioStation(this.minRadioStation);
        } else {
            this.setCurrentRadioStation(this.currentRadioStation + 1);
        }

    }

    public void prevRadioStation() {
        if (this.currentRadioStation <= this.minRadioStation) {
            this.setCurrentRadioStation(this.maxRadioStation);
        } else {
            this.setCurrentRadioStation(this.currentRadioStation - 1);
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= this.minVolume && newCurrentVolume <= this.maxVolume) {
            this.currentVolume = newCurrentVolume;
        }

    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        }

    }

    public void reduceVolume() {
        if (this.currentVolume > this.minVolume) {
            --this.currentVolume;
        }

    }
}


