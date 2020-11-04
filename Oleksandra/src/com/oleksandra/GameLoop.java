package com.oleksandra;

import java.util.Random;
import java.util.logging.Logger;

public class GameLoop {

    protected final Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    protected volatile GameStatus status;

    protected GameController controller;

    private Thread gameThread;

    public GameLoop() {
        controller = new GameController();
        status = GameStatus.STOPPED;
    }

    public void run() {
        status = GameStatus.RUNNING;
        gameThread = new Thread(this::processGameLoop);
        gameThread.start();
    }

    public void stop() {
        status = GameStatus.STOPPED;
    }

    public boolean isGameRunning() {
        return status == GameStatus.RUNNING;
    }

    protected void processInput() {
        try {
            var lag = new Random().nextInt(200) + 50;
            Thread.sleep(lag);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    protected void render() {
        var position = controller.getBulletPosition();
        logger.info("Current bullet position: " + position);
    }

    protected void processGameLoop() {

    }
}