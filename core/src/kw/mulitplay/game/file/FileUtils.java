package kw.mulitplay.game.file;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.File;

/**
 * @Auther jian xian si qi
 * @Date 2023/4/12 20:17
 */
public class FileUtils {
    private static FileHandle handle;
    private static FileUtils fileUtils;
    public FileUtils(){
        handle = Gdx.files.local("xxx.end");
    }

    public static FileUtils getFileUtils() {
        if (fileUtils == null){
            fileUtils = new FileUtils();
            handle.writeString("",false);
        }
        return fileUtils;
    }

    public void write(String content){
        handle.writeString(content+ " ",true);
    }
}
