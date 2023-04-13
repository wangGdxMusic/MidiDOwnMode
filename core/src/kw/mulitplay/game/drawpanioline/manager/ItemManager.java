package kw.mulitplay.game.drawpanioline.manager;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Array;

import java.util.HashMap;

import kw.mulitplay.game.drawpanioline.data.PerPaItem;
import kw.mulitplay.game.drawpanioline.view.EveryMusicalNote;
import kw.mulitplay.game.drawpanioline.view.PerPaItemNote;

/**
 * @Auther jian xian si qi
 * @Date 2023/4/13 10:43
 *
 * 每个条目
 */
public class ItemManager {
    private Table rootGroup;
    private HashMap<Integer, Array<PerPaItem>> hashMapData;
    private HashMap<Integer, Group> hashMapGroup;
    private static ItemManager itemManager;
    private int index;

    public ItemManager(Table rootGroup){
        this.rootGroup = rootGroup;
        hashMapData = new HashMap<>();
        hashMapGroup = new HashMap<>();
        itemManager = this;
    }

    public static ItemManager getItemManager() {
        return itemManager;
    }

    public void addItem(int key, PerPaItem item){

        Array<PerPaItem> perPaItems;
        PerPaItemNote baseGroup;
        if (hashMapData.containsKey(key)){
            perPaItems = hashMapData.get(key);
            baseGroup = (PerPaItemNote) hashMapGroup.get(key);
        }else {
            perPaItems = new Array<>();
            baseGroup = new PerPaItemNote();
            rootGroup.add(baseGroup);
            rootGroup.pack();
            index ++;
            if (index>3){
                rootGroup.row();
                index = 0;
            }
            hashMapData.put(key,perPaItems);
            hashMapGroup.put(key,baseGroup);
        }
        perPaItems.add(item);
        baseGroup.addActor(new EveryMusicalNote(item));
    }
}
