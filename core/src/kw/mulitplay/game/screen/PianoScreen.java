package kw.mulitplay.game.screen;

import kw.mulitplay.game.group.PianoView;
import kw.mulitplay.game.screen.base.BaseScreen;

public class PianoScreen extends BaseScreen {
    @Override
    protected void initView() {
        PianoView view = new PianoView();
        stage.addActor(view);
        view.showPianoKey();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void back() {

    }
}
