package com.oleksandra;
import java.util.logging.Logger;

public class Main {
    private static long GAME_LOOP_DURATION_TIME;
    private static Logger LOGGER;

    public static void main(final String[] args) {
        try {
            LOGGER.info("Start frame-based game loop:");
            var frameBasedGameLoop = new FrameBasedGameLoop();
            frameBasedGameLoop.run();
            Thread.sleep(GAME_LOOP_DURATION_TIME);
            frameBasedGameLoop.stop();
            LOGGER.info("Stop frame-based game loop.");
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}
