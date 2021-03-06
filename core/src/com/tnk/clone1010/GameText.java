package com.tnk.clone1010;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;

/**
 * Created by tnk on 8/11/15.
 */
public class GameText {
    private GlyphLayout glyphLayout;
    private BitmapFont font;

    public GameText() {
        glyphLayout = new GlyphLayout();
        font = new BitmapFont(Gdx.files.internal("verdana39.fnt"));
    }

    public void draw(SpriteBatch batch) {
        glyphLayout.setText(font, "AAA", Color.RED, 0, Align.center, false);
        font.draw(batch, glyphLayout, MyGdxGame.VIEW_WIDTH * 0.5f, MyGdxGame.VIEW_HEIGHT - glyphLayout.height * 1.5f);
    }

    public void drawScore(SpriteBatch batch, int score) {
        glyphLayout.setText(font, "" + score, Color.valueOf("2196F3FF"), 0, Align.left, false); // #2196F3
        font.draw(batch, glyphLayout, (MyGdxGame.VIEW_WIDTH - 20) * 0.5f, MyGdxGame.VIEW_HEIGHT - glyphLayout.height * 1.5f);
    }
}
