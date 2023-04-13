package kw.mulitplay.game.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import javax.sound.midi.Instrument;

import kw.mulitplay.game.asset.AssetLoadFile;
import kw.mulitplay.game.constant.Constant;
import kw.mulitplay.game.midi.handler.MidiInstruments;

public class InsturmentItem extends Group {
    public InsturmentItem(Instrument instrument){
        Label label = new Label(instrument.getName(),new Label.LabelStyle(){{
            font = AssetLoadFile.getBR40();
        }});
        label.setColor(Color.BLACK);
        addActor(label);
        setSize(label.getPrefWidth(),label.getPrefHeight());
        addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                Constant.instrument = instrument;
                MidiInstruments.selectInstrument(Constant.instrument);
            }
        });
    }
}
