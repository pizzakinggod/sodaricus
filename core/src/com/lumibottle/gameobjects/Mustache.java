package com.lumibottle.gameobjects;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Vector2;
import com.lumibottle.helper.FXHelper;

/**
 * Created by MG-POW on 2016-03-19.
 */
public class Mustache extends GameEvent {

	private Polygon hitbox;

	private boolean doneMoving;



	final private int speed=99;
	private Vector2 acceleration;
	private float runTime;

	public Mustache() {
		super(20, 12);
		hitbox = new Polygon(new float[]{0, 0, 20, 0, 20, 12, 0, 12});
	}


	//must separate moving, stopping
	@Override
	public void update(float delta) {
		hitbox.setPosition(getX(), getY());
		runTime +=delta;

		if (isVISIBLE()) {
			if (!doneMoving && runTime >= .4f) {
				runTime -= .4f;
				doneMoving=true;
				nextTheta();
			}

			if (doneMoving && runTime >= 1.2f) { // resting
				runTime-=1.2f;
				doneMoving = false;
			}

			if (!doneMoving) {
				setVelocity(MathUtils.sin(runTime * MathUtils.PI / 0.4f) * MathUtils.cosDeg(getTheta())*speed,
						MathUtils.sin(runTime * MathUtils.PI / 0.4f) * MathUtils.sinDeg(getTheta())*speed);// changing
			}

			getPosition().add(getVelocity().cpy().scl(delta));

			if (isOutOfScreen(true))
				ready();
		}

	}

	public void reset(float x) {
		super.reset(x, MathUtils.random(90, 110), 0, 0, 0);
		runTime=MathUtils.random(0,0.5f);
		doneMoving=false;
		nextTheta();
	}

	public boolean isDoneMoving(){
		return doneMoving;
	} // to notify sprite batch

	private void nextTheta(){
		if (getY() < getHeight())
			setTheta(MathUtils.random(100,120));
		else if ( getY() > GameEvent.gameHeight-getHeight())
			setTheta(MathUtils.random(240,260));
		else
			setTheta(MathUtils.random(110,250));// set direction for the next move

	}

	public float getRunTime() {
		return runTime;
	}

	//checks in progress handler, then call squirrel's dead, reset method
	public void collide(Squirrel squirrel) {
		if (isVISIBLE()) {
			for (Bullet b : squirrel.getBullets()) {
				if (b.getX() + b.getWidth() > getX())
					if (Intersector.overlapConvexPolygons(b.getHitbox(), hitbox) && b.isVISIBLE()) {
						FXHelper.getInstance().newFX(b.getX(), b.getY(), (short) 0);
						ready();
						b.ready();
						break;
					}
			}

			if (squirrel.getX() + squirrel.getWidth() > getX()) {
				if (Intersector.overlapConvexPolygons(squirrel.getHitbox(), hitbox)) {

				}
			}
		}
	}
}
