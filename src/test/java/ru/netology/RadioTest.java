package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radioman = new Radio();


        radioman.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation1() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation2() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(9);
        radioman.nextRadioStation();
        int expected = 0;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(0);
        radioman.prevRadioStation();
        int expected = 9;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextOneRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(7);
        radioman.nextRadioStation();
        int expected = 8;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevOneRadioStation() {
        Radio radioman = new Radio();

        radioman.setCurrentRadioStation(4);
        radioman.prevRadioStation();
        int expected = 3;
        int actual = radioman.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(11);

        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume1() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(-1);

        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(0);
        radioman.reduceVolume();
        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(10);
        radioman.increaseVolume();
        int expected = 10;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(2);
        radioman.increaseVolume();
        int expected = 3;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio radioman = new Radio();

        radioman.setCurrentVolume(7);
        radioman.reduceVolume();
        int expected = 6;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
