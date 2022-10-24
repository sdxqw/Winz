package io.github.axst.winz;

import lombok.Getter;

public class Winz {

    @Getter
    private static final Winz instance = new Winz();

    public void start() {
        System.out.println("Starting Winz");
    }

    public void stop() {
        System.out.println("Stopping Winz");
    }
}
