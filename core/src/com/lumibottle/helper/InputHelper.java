package com.lumibottle.helper;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.InputProcessor;
import com.lumibottle.gameobjects.Squirrel;
import com.lumibottle.world.GameWorld;

/**
 * Created by MG-UP on 2016-03-10.
 */
public class InputHelper implements InputProcessor {

    private Squirrel mySquirrel;
    private GameWorld myWorld;

    public InputHelper(GameWorld myWorld) {
        this.myWorld = myWorld;


        mySquirrel = this.myWorld.getMySquirrel();

    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        myWorld.onClick();

        if (myWorld.isPLAYING())
            mySquirrel.onClick();

        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {

        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
