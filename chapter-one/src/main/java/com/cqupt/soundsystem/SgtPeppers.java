package com.cqupt.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author LiSheng
 * @date 2020/12/3 15:41
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper‘s Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by" + artist);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println("track is " + trackNumber);
    }
}
