package com.lumibottle.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Timer;

/**
 * Created by MG-POW on 2016-03-10.
 */
public class Squirrel {

	private enum SquirrelState {
		IDLE, SHOOTING, DEAD
	}

	private SquirrelState currentState;
	private float runTime;

	private Vector2 position;
	private Vector2 velocity;
	private Vector2 acceleration;

	private int width, height;
	private int ceiling;

	private float rotation;

	private Bullet[] bullets;// hold for optimum performance

	private Polygon hitbox;


	public Squirrel(float x, float y, int width, int height) {
		this.width = width;
		this.height = height;
		position = new Vector2(x, y);
		velocity = new Vector2(0, 0);
		rotation = 0;
		acceleration = new Vector2(0, -460);
		currentState=SquirrelState.IDLE;

		ceiling = (Gdx.graphics.getHeight()/(Gdx.graphics.getWidth()/240));// temporary

		hitbox = new Polygon(new float[] {0,0,width,0,width,height,0,height});
		hitbox.setOrigin(width/2f,height/2f);

		/*
		init bullet
		 */
		bullets = new Bullet[16];
		for (int i=0;i<bullets.length;i++)
			bullets[i] = new Bullet();


		runTime=0;
	}


	public void update(float delta){
		// constant delta
		if (delta > .15f)
			delta = .15f;
		runTime+=delta;

		for (Bullet b: bullets)
		b.update(delta);

		/*
		SHOOTING MECHANIC
		 */
		if (runTime >0.3f && isIdle()){
			runTime-=0.3f;
			currentState=SquirrelState.SHOOTING;
			for (Bullet b: bullets){
				if (b.isREADY()){
					b.shot(position.x,position.y,90,rotation);
					break;
				}
			}
			//shoot bullet
		} else if (runTime >0.2f && isShooting()){
			currentState=SquirrelState.IDLE;
		}



		/*
		Position constraints
		 */
		if (velocity.y < -150) {
			velocity.y = -150;
		} // maximum falling speed
		if (position.y > ceiling) {
			Gdx.app.log("heat ceiling!","yes");
			position.y = ceiling;
			velocity.y = 0;
		}

		/*
		Physics
		 */
		velocity.add(acceleration.cpy().scl(delta));//add acc to velocity
		position.add(velocity.cpy().scl(delta));//add velo to position

		//         _|_ angle
		//rotation
		if (!isDead()) {
			if (velocity.y >= 0) {
				rotation += 700 * delta;
				if (rotation > 40)
					rotation = 40;
			}
			if (velocity.y < -50) {
				rotation -= 380 * delta;
				if (rotation < -90)
					rotation = -90;
			}
		}

		/*
			collision
		 */
		hitbox.setPosition(position.x,position.y);
		hitbox.setRotation(rotation);

	}

	public void onClick(){
		velocity.y=140;
	}

	public void kill(){

	}


	/*
	GETTER and SETTER
	 */
	public float getX(){
		return position.x;
	}

	public float getY(){
		return position.y;
	}

	public float getWidth(){
		return width;
	}

	public float getHeight(){
		return height;
	}

	public float getRotation(){
		return rotation;
	}

	public Bullet[] getBullets(){
		return bullets;
	}


	public Polygon getHitbox() {
		return hitbox;
	}

	public boolean isDead(){
		return currentState==SquirrelState.DEAD;
	}

	public boolean isShooting(){
		return currentState==SquirrelState.SHOOTING;
	}

	public boolean isIdle(){
		return currentState==SquirrelState.IDLE;
	}
	}

