package com.illia;

public class Main {
    public static void main(final String[] args) {
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
