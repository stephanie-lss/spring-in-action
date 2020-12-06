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

    public BlankDisc() {
    }

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        tracks.stream().map((s) -> "-Track: " + s).forEach(System.out::println);
    }

    @Override
    public void playTrack(int trackNumber) {
        if (tracks.size() > trackNumber) {
            System.out.println(this.tracks.get(trackNumber));
        }else {
            System.out.println("IllArgument！！");
        }
    }
}
