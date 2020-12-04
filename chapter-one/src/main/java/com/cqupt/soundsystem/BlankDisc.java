package com.cqupt.soundsystem;

import java.util.List;

/**
 * @author LiSheng
 * @date 2020/12/4 13:49
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        tracks.stream().map((s) -> "-Track: " + s).forEach(System.out::println);
    }
}
