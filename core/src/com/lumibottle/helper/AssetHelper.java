package com.lumibottle.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.ParticleEffectPool;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


/**
 * Created by MG-UP on 2016-03-10.
 */
public class AssetHelper {

    /*
        Textures - logical mapping with TextureRegion
     */
    private static Texture splashTexture;
    private static Texture titleTexture;
    private static Texture whiteflashTexture;
    private static Texture warningTexture;

    //
    private static Texture backgroundTexture;
    private static Texture starTexture;
    private static Texture sodaTexture;
    private static Texture squirrelTexture;
    private static Texture bacon;
    private static Texture limeexplosionTexture;
    private static Texture bombexplosionTexture;
    private static Texture enemyTexture;
    private static Texture mustacheTexture;
    private static Texture bluecrayonTexture;
    private static Texture redlaserTexture;
    private static Texture cowboyhatTexture;
    private static Texture cowboythrowTexture;
    private static Texture eyeTexture;
    private static Texture holeTexture;
    private static Texture deadTexture;
    private static Texture blockTexture;
    private static Texture cloudTexture;
    private static Texture knifeTexture;
    private static Texture boomerangTexture;
    private static Texture waveheadTexture;
    //
    private static Texture boxbossTexture;
    private static Texture pipebossTexture;
    private static Texture forceshieldTexture;
    private static Texture redsodapillarTexture;
    private static Texture pangbossTexture;
    private static Texture bomberbossTexture;
    private static Texture timebombTexture;

    //
    private static Texture itemTexture;

    /*
        Texture Region
     */
    public static TextureRegion splash;
    public static TextureRegion title;
    public static TextureRegion titletext;
    public static TextureRegion whiteflash;

    private static TextureRegion[] warnings;
    public static Animation warningAnim;

    public static TextureRegion spacebg, star1, star2;
    public static TextureRegion greenBullet, pinkBullet;
    private static TextureRegion[] eyes;
    public static Animation eyeAnim;


    public static TextureRegion sqdown, sqmid, squp,sqstand;
    public static Animation sqAnim;
    private static TextureRegion bacon1, bacon2;
    public static Animation baconAnim;

    public static TextureRegion life;
    public static TextureRegion oneUP;
    public static  TextureRegion POW;

    //Enemies
    //TODO: collage texture into one png file
    public static TextureRegion roadroller;
    public static TextureRegion tanklorry;

    public static TextureRegion[] mustaches;
    public static Animation mustacheAnim;

    public static TextureRegion bluecrayon;

    private static TextureRegion[] cowboyhats;
    public static Animation cowboyhatsAnim;
    private static TextureRegion[] cowboyhatsspawn;
    public static Animation cowboyhatsspawnAnim;

    public static TextureRegion[] cowboythrow;
    public static Animation cowboythrowAnim;

    public static TextureRegion hole;
    public static TextureRegion knife;
    public static TextureRegion boomerang;
    public static TextureRegion wavehead;



    //boss
    private static TextureRegion[] boxcharges;
    public static Animation boxchargeAnim;
    public static TextureRegion boxhitFace;
    public static TextureRegion boxvulFace;
    public static TextureRegion blockbullet;
    private static TextureRegion[] bomberboss;
    public static Animation bomberbossthrowAnim;
    public static TextureRegion bomberbosshit;
    private static TextureRegion[] timebomb;
    public static Animation timebombAnim;


    private static TextureRegion[] pipeBoss;
    public static Animation pipeBossAnim;
    private static TextureRegion[] redsodapillar;
    private static TextureRegion[] redsodapillarbot;
    public static Animation redsodapillarAnim;
    public static Animation redsodapillarbotAnim;

    private static TextureRegion[] pangBoss;
    public static Animation pangBossAnim;

    //FX
    private static TextureRegion[] explosion1;
    public static Animation explosionAnim1;

    private static TextureRegion[] bombexplosion;
    public static Animation bombexplosionAnim;

    private static TextureRegion[] redlaser;
    public static Animation redlaserinit;
    public static Animation redlaserAnim;

    private static TextureRegion[] deadplosion;
    public static Animation deadAnim;

    private static TextureRegion[] forceshield;
    public static Animation forceshieldAnim;

    private static TextureRegion[] cloudexplosion;
    public static Animation cloudexplosionAnim;

    /*
        Particles
     */
    private static ParticleEffect rainbowParticle;
    public static ParticleEffectPool rainbowPool;
    private static ParticleEffect nitroParticle;
    public static ParticleEffectPool nitroPool;
    private static ParticleEffect energyParticle;
    public static ParticleEffectPool energyPool;
    private static ParticleEffect popcornParticle;
    public static ParticleEffectPool popcornPool;
    private static ParticleEffect sodaburstParticle;
    public static ParticleEffectPool sodaburstPool;
    private static ParticleEffect nitro2Particle;
    public static ParticleEffectPool nitro2Pool;
    private static ParticleEffect waveheadParticle;
    public static ParticleEffectPool waveheadPool;
    private static ParticleEffect smokeParticle;
    public static ParticleEffectPool smokePool;
    private static ParticleEffect fireParticle;
    public static ParticleEffectPool firePool;
    private static ParticleEffect thunderParticle;
    public static ParticleEffectPool thunderPool;


    //FONT
    public static BitmapFont font;

    public static void load() {
        loadParticles();
        loadTextures();
        loadFonts();
    }

    public static void dispose() {

        splashTexture.dispose();
        titleTexture.dispose();
        whiteflashTexture.dispose();
        //
        itemTexture.dispose();
        warningTexture.dispose();

        //
        backgroundTexture.dispose();
        starTexture.dispose();
        sodaTexture.dispose();
        squirrelTexture.dispose();
        bacon.dispose();
        enemyTexture.dispose();
        mustacheTexture.dispose();
        limeexplosionTexture.dispose();
        bombexplosionTexture.dispose();
        bluecrayonTexture.dispose();
        redlaserTexture.dispose();
        cowboyhatTexture.dispose();
        eyeTexture.dispose();
        holeTexture.dispose();
        deadTexture.dispose();
        cowboythrowTexture.dispose();
        blockTexture.dispose();
        cloudTexture.dispose();
        knifeTexture.dispose();
        boomerangTexture.dispose();
        waveheadTexture.dispose();
        //
        boxbossTexture.dispose();
        pipebossTexture.dispose();
        forceshieldTexture.dispose();
        redsodapillarTexture.dispose();
        pangbossTexture.dispose();
        bomberbossTexture.dispose();
        timebombTexture.dispose();
        //particle
        rainbowPool.clear();
        rainbowParticle.dispose();
        nitroPool.clear();
        nitroParticle.dispose();
        energyPool.clear();
        energyParticle.dispose();
        popcornPool.clear();
        popcornParticle.dispose();
        sodaburstPool.clear();
        sodaburstParticle.dispose();
        nitro2Pool.clear();
        nitro2Particle.dispose();
        waveheadPool.clear();
        waveheadParticle.dispose();
        smokePool.clear();
        smokeParticle.dispose();
        firePool.clear();
        fireParticle.dispose();
        thunderPool.clear();
        thunderParticle.dispose();


        //font
        font.dispose();

        //sound
        SoundManager.getInstance().dispose();

    }

    private static void loadTextures() {
        //Splash
        splashTexture = new Texture(Gdx.files.internal("data/splash.png"));
        splashTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        titleTexture = new Texture(Gdx.files.internal("data/title.png"));
        titleTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        whiteflashTexture = new Texture(Gdx.files.internal("data/whiteflash.png"));
        whiteflashTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);


        //INIT TEXTURE
        itemTexture = new Texture(Gdx.files.internal("data/lifeicon.png"));
        itemTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        //Game Objects
        squirrelTexture = new Texture(Gdx.files.internal("data/squirrel.png"));
        squirrelTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        bacon = new Texture(Gdx.files.internal("data/bacon.png"));
        bacon.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        eyeTexture = new Texture(Gdx.files.internal("data/eyes.png"));
        eyeTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        //ENemy
        enemyTexture = new Texture(Gdx.files.internal("data/enemies.png"));
        enemyTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        mustacheTexture = new Texture(Gdx.files.internal("data/rainbowmusta.png"));
        mustacheTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        bluecrayonTexture = new Texture(Gdx.files.internal("data/bluepastel.png"));
        bluecrayonTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        knifeTexture = new Texture(Gdx.files.internal("data/knife.png"));
        knifeTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);


        cowboythrowTexture = new Texture(Gdx.files.internal("data/cowboymotion.png"));
        cowboythrowTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        holeTexture = new Texture(Gdx.files.internal("data/hole.png"));
        holeTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        sodaTexture = new Texture(Gdx.files.internal("data/sodabullet.png"));
        sodaTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        cowboyhatTexture = new Texture(Gdx.files.internal("data/cowboyhat.png"));
        cowboyhatTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        blockTexture = new Texture(Gdx.files.internal("data/boss/blockbullet.png"));
        blockTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        //Aesthetic Objects/image
        backgroundTexture = new Texture(Gdx.files.internal("data/spacebg.png"));
        backgroundTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        starTexture = new Texture(Gdx.files.internal("data/stars.png"));
        starTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        boomerangTexture = new Texture(Gdx.files.internal("data/boomerang.png"));
        boomerangTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        waveheadTexture = new Texture(Gdx.files.internal("data/wavehead.png"));
        waveheadTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        //BOSS
        boxbossTexture = new Texture(Gdx.files.internal("data/boss/boxboss.png"));
        boxbossTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        pipebossTexture = new Texture(Gdx.files.internal("data/boss/daramvader.png"));
        pipebossTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        redsodapillarTexture = new Texture(Gdx.files.internal("data/boss/redsodapillar.png"));
        redsodapillarTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        pangbossTexture = new Texture(Gdx.files.internal("data/boss/pangboss.png"));
        pangbossTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        bomberbossTexture = new Texture(Gdx.files.internal("data/boss/bomberboss.png"));
        bomberbossTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        timebombTexture = new Texture(Gdx.files.internal("data/boss/timebomb.png"));
        timebombTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        //FX
        warningTexture = new Texture(Gdx.files.internal("data/gfx/warning.png"));
        warningTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);


        limeexplosionTexture = new Texture(Gdx.files.internal("data/gfx/limexplosion.png"));
        limeexplosionTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        redlaserTexture = new Texture(Gdx.files.internal("data/gfx/redlaser.png"));
        redlaserTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        bombexplosionTexture = new Texture(Gdx.files.internal("data/gfx/bombexplosion.png"));
        bombexplosionTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        deadTexture = new Texture(Gdx.files.internal("data/gfx/dead.png"));
        deadTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        forceshieldTexture = new Texture(Gdx.files.internal("data/gfx/forceshield.png"));
        forceshieldTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        cloudTexture = new Texture(Gdx.files.internal("data/gfx/cloud.png"));
        cloudTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        //--------------------------------------------------------------------------------
        //INIT TEXTUREREGION
        //splash
        splash = new TextureRegion(splashTexture, 0, 0, 240, 240);
        title = new TextureRegion(titleTexture,0,0,240,240);
        titletext = new TextureRegion(titleTexture,240,0,240,240);
        whiteflash = new TextureRegion(whiteflashTexture,0,0,240,240);

        //Game Objects
        //item
        life = new TextureRegion(itemTexture,0,0,32,36);
        oneUP = new TextureRegion(itemTexture,32,0,32,36);
        POW = new TextureRegion(itemTexture,64,0,32,36);

        //Squirrel
        sqdown = new TextureRegion(squirrelTexture, 0, 0, 20, 20);
        sqmid = new TextureRegion(squirrelTexture, 20, 0, 20, 20);
        squp = new TextureRegion(squirrelTexture, 40, 0, 20, 20);
        sqstand = new TextureRegion(squirrelTexture,60,0,20,20);
        TextureRegion[] sqs = {squp, sqmid, sqdown};
        sqAnim = new Animation(1 / 16f, sqs);
        sqAnim.setPlayMode(Animation.PlayMode.NORMAL);

        bacon1 = new TextureRegion(bacon, 0, 0, 32, 32);
        bacon2 = new TextureRegion(bacon, 32, 0, 32, 32);
        TextureRegion[] bacons = {bacon1, bacon2};
        baconAnim = new Animation(1 / 8f, bacons);
        baconAnim.setPlayMode(Animation.PlayMode.LOOP);

        //For enemies
        eyes = new TextureRegion[4];
        for (int i = 0; i < 4; i++)
            eyes[i] = new TextureRegion(eyeTexture, i * 6, 0, 6, 6);
        eyeAnim = new Animation(1 / 15f, eyes);
        eyeAnim.setPlayMode(Animation.PlayMode.LOOP);

        roadroller = new TextureRegion(enemyTexture, 0, 0, 20, 12);
        tanklorry = new TextureRegion(enemyTexture, 21, 0, 32, 14);

        mustaches = new TextureRegion[5];
        for (int i = 0; i < 5; i++)
            mustaches[i] = new TextureRegion(mustacheTexture, i * 33, 0, 33, 16);
        mustacheAnim = new Animation(1 / 30f, mustaches);
        mustacheAnim.setPlayMode(Animation.PlayMode.NORMAL);

        bluecrayon = new TextureRegion(bluecrayonTexture);

        cowboyhats = new TextureRegion[4];
        for (int i = 0; i < 4; i++)
            cowboyhats[i] = new TextureRegion(cowboyhatTexture, i * 32, 0, 32, 16);
        cowboyhatsAnim = new Animation(1 / 30f, cowboyhats);
        cowboyhatsAnim.setPlayMode(Animation.PlayMode.LOOP);

        cowboyhatsspawn = new TextureRegion[4];
        for (int i = 0; i < 4; i++)
            cowboyhatsspawn[i] = new TextureRegion(cowboyhatTexture, (i + 4) * 32, 0, 32, 16);
        cowboyhatsspawnAnim = new Animation(1 / 30f, cowboyhatsspawn);
        cowboyhatsspawnAnim.setPlayMode(Animation.PlayMode.NORMAL);


        cowboythrow = new TextureRegion[4];
        for (int i = 0; i < 4; i++)
            cowboythrow[i] = new TextureRegion(cowboythrowTexture, i * 32, 0, 32, 48);
        cowboythrowAnim = new Animation(1 / 30f, cowboythrow);
        cowboythrowAnim.setPlayMode(Animation.PlayMode.NORMAL);

        knife = new TextureRegion(knifeTexture);
        boomerang = new TextureRegion(boomerangTexture);
        wavehead = new TextureRegion(waveheadTexture);

        hole = new TextureRegion(holeTexture, 0, 0, 256, 256);

        //BoxBoss
        boxcharges = new TextureRegion[8];
        for (int i = 0; i < 8; i++)
            boxcharges[i] = new TextureRegion(boxbossTexture, i * 64, 0, 64, 64);
        boxchargeAnim = new Animation(1 / 30f, boxcharges);
        boxchargeAnim.setPlayMode(Animation.PlayMode.NORMAL);
        boxhitFace = new TextureRegion(boxbossTexture, 8 * 64, 0, 64, 64);
        boxvulFace = new TextureRegion(boxbossTexture, 9 * 64, 0, 64, 64);
        blockbullet = new TextureRegion(blockTexture, 0, 0, 64, 64);

        pipeBoss = new TextureRegion[3];
        for (int i = 0; i < 3; i++)
            pipeBoss[i] = new TextureRegion(pipebossTexture, i * 32, 0, 32, 32);
        pipeBossAnim = new Animation(1 / 10f, pipeBoss);
        pipeBossAnim.setPlayMode(Animation.PlayMode.NORMAL);


        redsodapillar = new TextureRegion[3];
        for (int i = 0; i < 3; i++)
            redsodapillar[i] = new TextureRegion(redsodapillarTexture, i * 25, 0, 25, 120);
        redsodapillarAnim = new Animation(1 / 10f, redsodapillar);
        redsodapillarAnim.setPlayMode(Animation.PlayMode.LOOP);
        redsodapillarbot = new TextureRegion[3];
        for (int i = 0; i < 3; i++)
            redsodapillarbot[i] = new TextureRegion(redsodapillarTexture, 77, i * 16, 33, 16);
        redsodapillarbotAnim = new Animation(1 / 10f, redsodapillarbot);
        redsodapillarbotAnim.setPlayMode(Animation.PlayMode.LOOP);

        pangBoss = new TextureRegion[6];
        for (int i = 0; i < 6; i++)
            pangBoss[i] = new TextureRegion(pangbossTexture, i * 64, 0, 64, 64);
        pangBossAnim = new Animation(6 / 60f, pangBoss);
        pangBossAnim.setPlayMode(Animation.PlayMode.LOOP);

        bomberboss = new TextureRegion[4];
        for (int i=0; i<4; i++)
            bomberboss[i] = new TextureRegion(bomberbossTexture,i*32,0,32,32);
        bomberbossthrowAnim = new Animation(1/15f,bomberboss);
        bomberbossthrowAnim.setPlayMode(Animation.PlayMode.NORMAL);
        bomberbosshit = new TextureRegion(bomberbossTexture,4*32,0,32,32);

        timebomb = new TextureRegion[2];
        for (int i=0; i<2; i++)
            timebomb[i] = new TextureRegion(timebombTexture,i*20,0,20,20);
        timebombAnim = new Animation(1/30f,timebomb); // setframeduration to lower
        timebombAnim.setPlayMode(Animation.PlayMode.LOOP);

        //SODA!
        greenBullet = new TextureRegion(sodaTexture, 0, 0, 16, 16);

        //Aesthetic Objects/image
        spacebg = new TextureRegion(backgroundTexture, 0, 0, 256, 256);
        star1 = new TextureRegion(starTexture, 0, 0, 9, 9);
        star2 = new TextureRegion(starTexture, 9, 0, 9, 9);


        //FX
        warnings = new TextureRegion[8];
        for (int i=0;i<warnings.length;i++){
            warnings[i] = new TextureRegion(warningTexture,i*16,0,16,16);
        }
        warningAnim = new Animation(1/30f, warnings);
        warningAnim.setPlayMode(Animation.PlayMode.NORMAL);

        explosion1 = new TextureRegion[6];
        for (int i = 0; i < 6; i++)
            explosion1[i] = new TextureRegion(limeexplosionTexture, i * 17, 0, 17, 17);
        explosionAnim1 = new Animation(1 / 30f, explosion1);
        explosionAnim1.setPlayMode(Animation.PlayMode.NORMAL);

        bombexplosion = new TextureRegion[8];
        for (int i = 0; i < 8; i++)
            bombexplosion[i] = new TextureRegion(bombexplosionTexture, i * 40, 0, 40, 40);
        bombexplosionAnim = new Animation(1 / 30f, bombexplosion);
        bombexplosionAnim.setPlayMode(Animation.PlayMode.NORMAL);

        redlaser = new TextureRegion[7];
        for (int i = 0; i < 7; i++) {
            redlaser[i] = new TextureRegion(redlaserTexture, 0, i * 30, 240, 30);
            redlaser[i].flip(true, false);
        }
        redlaserinit = new Animation(1f, redlaser[0]);
        redlaserinit.setPlayMode(Animation.PlayMode.NORMAL);
        redlaserAnim = new Animation(1 / 30f, redlaser);
        redlaserAnim.setPlayMode(Animation.PlayMode.NORMAL);


        deadplosion = new TextureRegion[60];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 10; j++)
                deadplosion[i * 10 + j] = new TextureRegion(deadTexture, j * 128, i * 128, 128, 128);
        deadAnim = new Animation(1 / 30f, deadplosion);
        deadAnim.setPlayMode(Animation.PlayMode.NORMAL);

        forceshield = new TextureRegion[4];
        for (int i = 0; i < 4; i++)
            forceshield[i] = new TextureRegion(forceshieldTexture, i * 32, 0, 32, 32);
        forceshieldAnim = new Animation(1 / 30f, forceshield);
        forceshieldAnim.setPlayMode(Animation.PlayMode.NORMAL);

        cloudexplosion = new TextureRegion[6];
        for (int i = 0; i < 6; i++)
            cloudexplosion[i] = new TextureRegion(cloudTexture, i * 64, 0, 64, 64);
        cloudexplosionAnim = new Animation(1 / 30f, cloudexplosion);
        cloudexplosionAnim.setPlayMode(Animation.PlayMode.NORMAL);

    }


    private static void loadParticles() {
        rainbowParticle = new ParticleEffect();
        rainbowParticle.load(Gdx.files.internal("data/particles/rainbow.p"), Gdx.files.internal("data/particles/"));
        rainbowPool = new ParticleEffectPool(rainbowParticle, 0, 10);

        nitroParticle = new ParticleEffect();
        nitroParticle.load(Gdx.files.internal("data/particles/nitro.p"), Gdx.files.internal("data/particles/"));
        nitroPool = new ParticleEffectPool(nitroParticle, 0, 10);

        nitro2Particle = new ParticleEffect();
        nitro2Particle.load(Gdx.files.internal("data/particles/nitro2.p"), Gdx.files.internal("data/particles/"));
        nitro2Pool = new ParticleEffectPool(nitro2Particle, 0, 10);


        energyParticle = new ParticleEffect();
        energyParticle.load(Gdx.files.internal("data/particles/energy.p"), Gdx.files.internal("data/particles/"));
        energyPool = new ParticleEffectPool(energyParticle, 0, 10);


        popcornParticle = new ParticleEffect();
        popcornParticle.load(Gdx.files.internal("data/particles/popcorn.p"), Gdx.files.internal("data/particles/"));
        popcornPool = new ParticleEffectPool(popcornParticle, 0, 10);

        sodaburstParticle = new ParticleEffect();
        sodaburstParticle.load(Gdx.files.internal("data/particles/sodaburst.p"), Gdx.files.internal("data/"));
        sodaburstPool = new ParticleEffectPool(sodaburstParticle, 0, 3);

        waveheadParticle = new ParticleEffect();
        waveheadParticle.load(Gdx.files.internal("data/particles/wavehead.p"),Gdx.files.internal("data/"));
        waveheadPool = new ParticleEffectPool(waveheadParticle,0,5);

        smokeParticle = new ParticleEffect();
        smokeParticle.load(Gdx.files.internal("data/particles/smoke.p"),Gdx.files.internal("data/particles/"));
        smokePool = new ParticleEffectPool(smokeParticle,0,3);

        fireParticle = new ParticleEffect();
        fireParticle.load(Gdx.files.internal("data/particles/firep.p"),Gdx.files.internal("data/particles/"));
        firePool = new ParticleEffectPool(fireParticle,0,10);

        thunderParticle = new ParticleEffect();
        thunderParticle.load(Gdx.files.internal("data/particles/thunder.p"),Gdx.files.internal("data/particles"));
        thunderPool = new ParticleEffectPool(thunderParticle,0,16);
    }

    private static void loadFonts() {
        font = new BitmapFont(Gdx.files.internal("data/font/8bitfont.fnt"));
        font.getData().setScale(0.2f);

    }


}
