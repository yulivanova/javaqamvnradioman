package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radioman = new Radio();
    int expectedRad;
    int expectedVol;

    @Test
    public void shouldSetAmountRadioStation() {

        radioman.setAmountRadioStation(10);

        Assertions.assertEquals(10, radioman.getMaxRadioStation());
    }

    @Test
    public void shouldSetAmountNullRadioStation() {

        expectedVol = radioman.getMaxRadioStation();
        radioman.setAmountRadioStation(-3);

        Assertions.assertEquals(expectedVol, radioman.getMaxRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStation() {

        radioman.setCurrentRadioStation(5);

        Assertions.assertEquals(5, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMax() {

        radioman.setCurrentRadioStation(11);

        Assertions.assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMin() {

        radioman.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMedium() {

        expectedRad = radioman.getMinRadioStation();
        radioman.setCurrentRadioStation(expectedRad);

        Assertions.assertEquals(expectedRad, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentRadioStationMedium1() {

        expectedRad = radioman.getMaxRadioStation();
        radioman.setCurrentRadioStation(expectedRad);

        Assertions.assertEquals(expectedRad, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStation() {

        radioman.setCurrentRadioStation(10);
        expectedRad = radioman.getMinRadioStation();
        radioman.nextRadioStation();

        Assertions.assertEquals(expectedRad, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStation() {

        radioman.setCurrentRadioStation(0);
        expectedRad = radioman.getMaxRadioStation();
        radioman.prevRadioStation();

        Assertions.assertEquals(expectedRad, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldNextOneRadioStation() {

        radioman.setCurrentRadioStation(7);
        radioman.nextRadioStation();

        Assertions.assertEquals(8, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevOneRadioStation() {

        radioman.setCurrentRadioStation(4);
        radioman.prevRadioStation();

        Assertions.assertEquals(3, radioman.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {

        radioman.setCurrentVolume(101);

        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume1() {

        radioman.setCurrentVolume(-1);

        Assertions.assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void shouldMinVolume() {

        expectedVol = radioman.getMinVolume();
        radioman.setCurrentVolume(0);

        Assertions.assertEquals(expectedVol, radioman.getCurrentVolume());
    }

    @Test
    public void shouldMaxVolume() {

        expectedVol = radioman.getMaxVolume();
        radioman.setCurrentVolume(100);

        Assertions.assertEquals(expectedVol, radioman.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {

        radioman.setCurrentVolume(20);
        radioman.increaseVolume();

        Assertions.assertEquals(21, radioman.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {

        radioman.setCurrentVolume(76);
        radioman.reduceVolume();

        Assertions.assertEquals(75, radioman.getCurrentVolume());
    }

    @Test
    public void shouldMaxOneVolume() {

        expectedVol = radioman.getMaxVolume();
        radioman.setCurrentVolume(100);
        radioman.increaseVolume();

        Assertions.assertEquals(expectedVol, radioman.getCurrentVolume());
    }

    @Test
    public void shouldMinOneVolume() {

        expectedVol = radioman.getMinVolume();
        radioman.setCurrentVolume(0);
        radioman.reduceVolume();

        Assertions.assertEquals(expectedVol, radioman.getCurrentVolume());
    }
}

