package kw.mulitplay.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

import java.util.HashMap;

public class MapKeySound {
    static HashMap<String,String> hashMap = new HashMap<>();
    static {
        hashMap.put("A2",       "piano/a54.mp3");
        hashMap.put("A3",       "piano/a69.mp3");
        hashMap.put("A4",       "piano/a80.mp3");
        hashMap.put("A5",       "piano/a74.mp3");
        hashMap.put("A6",       "piano/a66.mp3");
        hashMap.put("A#3",      "piano/b69.mp3");
        hashMap.put("A#4",      "piano/b80.mp3");
        hashMap.put("A#5",      "piano/b74.mp3");
        hashMap.put("A#6",      "piano/b66.mp3");
        hashMap.put("B2",       "piano/a55.mp3");
        hashMap.put("B3",       "piano/a82.mp3");
        hashMap.put("B4",       "piano/a65.mp3");
        hashMap.put("B5",       "piano/a75.mp3");
        hashMap.put("B6",       "piano/a78.mp3");
        hashMap.put("C2",       "piano/a49.mp3");
        hashMap.put("C3",       "piano/a56.mp3");
        hashMap.put("C4",       "piano/a84.mp3");
        hashMap.put("C5",       "piano/a83.mp3");
        hashMap.put("C6",       "piano/a76.mp3");
        hashMap.put("C7",       "piano/a77.mp3");
        hashMap.put("C#2",      "piano/b49.mp3");
        hashMap.put("C#3",      "piano/b56.mp3");
        hashMap.put("C#4",      "piano/b84.mp3");
        hashMap.put("C#5",      "piano/b83.mp3");
        hashMap.put("C#6",      "piano/b76.mp3");
        hashMap.put("D2",       "piano/a50.mp3");
        hashMap.put("D3",       "piano/a57.mp3");
        hashMap.put("D4",       "piano/a89.mp3");
        hashMap.put("D5",       "piano/a68.mp3");
        hashMap.put("D6",       "piano/a90.mp3");
        hashMap.put("D#2",      "piano/b50.mp3");
        hashMap.put("D#3",      "piano/b57.mp3");
        hashMap.put("D#4",      "piano/b89.mp3");
        hashMap.put("D#5",      "piano/b68.mp3");
        hashMap.put("D#6",      "piano/b90.mp3");
        hashMap.put("E2",       "piano/a51.mp3");
        hashMap.put("E3",       "piano/a48.mp3");
        hashMap.put("E4",       "piano/a85.mp3");
        hashMap.put("E5",       "piano/a70.mp3");
        hashMap.put("E6",       "piano/a88.mp3");
        hashMap.put("F2",       "piano/a52.mp3");
        hashMap.put("F3",       "piano/a81.mp3");
        hashMap.put("F4",       "piano/a73.mp3");
        hashMap.put("F5",       "piano/a71.mp3");
        hashMap.put("F6",       "piano/a67.mp3");
        hashMap.put("F#2",      "piano/b52.mp3");
        hashMap.put("F#3",      "piano/b81.mp3");
        hashMap.put("F#4",      "piano/b73.mp3");
        hashMap.put("F#5",      "piano/b71.mp3");
        hashMap.put("F#6",      "piano/b67.mp3");
        hashMap.put("G2",       "piano/a53.mp3");
        hashMap.put("G3",       "piano/a87.mp3");
        hashMap.put("G4",       "piano/a79.mp3");
        hashMap.put("G5",       "piano/a72.mp3");
        hashMap.put("G6",       "piano/a86.mp3");
        hashMap.put("G#2",      "piano/b53.mp3");
        hashMap.put("G#3",      "piano/b87.mp3");
        hashMap.put("G#4",      "piano/b79.mp3");
        hashMap.put("G#5",      "piano/b72.mp3");
        hashMap.put("G#6",      "piano/b86.mp3") ;
    }


    static {
//        hashMap.put("A2",   "Shift+6"   );
//        hashMap.put("A3",   "Ctrl+6"    );
//        hashMap.put("A4",   "6"         );
//        hashMap.put("A5",   "Option+6"  );
//        hashMap.put("A6",   "Command+6" );
//        hashMap.put("A#3",  "Ctrl+t"    );
//        hashMap.put("A#4",  "t"         );
//        hashMap.put("A#5",  "Option+t"  );
//        hashMap.put("A#6",  "Command+t" );
//        hashMap.put("B2", "Shift+6"     );
//        hashMap.put("B3", "Ctrl+6"      );
//        hashMap.put("B4", "6"           );
//        hashMap.put("B5", "Option+6"    );
//        hashMap.put("B6", "Command+6"   );
//        hashMap.put("C2", "Shift+6"   );
//        hashMap.put("C3", "Ctrl+6"    );
//        hashMap.put("C4", "6"         );
//        hashMap.put("C5", "Option+6"  );
//        hashMap.put("C6", "Command+6" );
//        hashMap.put("C7", "");
//        hashMap.put("C#2", "piano/b49");
//        hashMap.put("C#3", "Ctrl+t"   );
//        hashMap.put("C#4", "t"        );
//        hashMap.put("C#5", "Option+t" );
//        hashMap.put("C#6", "Command+t");
//        hashMap.put("D2", "Shift+6"   );
//        hashMap.put("D3", "Ctrl+6"    );
//        hashMap.put("D4", "6"         );
//        hashMap.put("D5", "Option+6"  );
//        hashMap.put("D6", "Command+6" );
//        hashMap.put("D#2", "piano/b50");
//        hashMap.put("D#3", "Ctrl+t"   );
//        hashMap.put("D#4", "t"        );
//        hashMap.put("D#5", "Option+t" );
//        hashMap.put("D#6", "Command+t");
//        hashMap.put("E2", "Shift+6"   );
//        hashMap.put("E3", "Ctrl+6"    );
//        hashMap.put("E4", "6"         );
//        hashMap.put("E5", "Option+6"  );
//        hashMap.put("E6", "Command+6" );
//        hashMap.put("F2", "Shift+6"   );
//        hashMap.put("F3", "Ctrl+6"    );
//        hashMap.put("F4", "6"         );
//        hashMap.put("F5", "Option+6"  );
//        hashMap.put("F6", "Command+6" );
//        hashMap.put("F#2", "piano/b52");
//        hashMap.put("F#3", "Ctrl+t"   );
//        hashMap.put("F#4", "t"        );
//        hashMap.put("F#5", "Option+t" );
//        hashMap.put("F#6", "Command+t");
//        hashMap.put("G2", "Shift+6"   );
//        hashMap.put("G3", "Ctrl+6"    );
//        hashMap.put("G4", "6"         );
//        hashMap.put("G5", "Option+6"  );
//        hashMap.put("G6", "Command+6" );
//        hashMap.put("G#2", "piano/b53");
//        hashMap.put("G#3", "Ctrl+t"   );
//        hashMap.put("G#4", "t"        );
//        hashMap.put("G#5", "Option+t" );
//        hashMap.put("G#6", "Command+t");
    }

    public static void main(String[] args) {
        MapKeySound sound = new MapKeySound();
        sound.test();
    }
    public String[] str;

    public void test(){
        str = new String[]{
                "3", "4", "5", "5", "5", "6", "7", "+1..",
                "+1", "+1", "7", "+2", "6", "5", "5", "5", "+2", "+1", "+1", "+3", "+3..",
                "+1", "+2", "+3", "+3", "+4", "+3", "+2", "+3", "+1", "+1", "6", "6",
                "6", "7", "+1", "+2", "+2", "+1", "7", "6", "+4", "+2",
                // 将愿望...
                "+2..", "3", "4", "5",
                // 折飞机寄成信...
                "5", "5", "5", "6", "7", "+1..",
                "+1", "+1", "7", "+2", "6", "5", "5", "5", "+2", "+1", "+1", "+3", "+3..",
                "+1", "+2", "+3", "+3", "+4", "+3", "+2", "+3", "+1", "+1", "6", "6",
                "6", "7", "+1", "+2", "+2", "+1", "7", "6", "+4", "+2..",
                // 一起长大的约定...
                "3", "5", "+1", "+3", "+3.", "+4", "+2..", "+2", "+5", "7", "+1..",
                "+3", "+4", "+5", "+1", "+1", "+2", "+3", "+3..",
                // 说好要一起旅行...
                "3", "5", "+1.", "+3", "+3.", "+4", "+2..",
                // 是你如今...
                "+2", "+5", "7", "+1..",
                // 唯一坚持的任性
                "+3", "+4", "+5", "+1", "+1", "+2.", "+1", "+1",
                // 在走廊...
                "3", "4",
                "5", "5", "5", "6", "7", "+1..",
                "+1", "+1", "7", "+2", "6", "5", "5", "5", "+2", "+1", "+1", "+3", "+3..",
                "+1", "+2", "+3", "+3", "+4", "+3", "+2", "+3", "+1", "+1", "6", "6",
                "6", "7", "+1", "+2", "+2", "+1", "7", "6", "+4", "+2",
                // 一起长大的约定...
                "3", "5", "+1", "+3", "+3.", "+4", "+2..", "+2", "+5", "7", "+1..",
                "+3", "+4", "+5", "+1", "+1", "+2", "+3", "+3..",
                // 说好要一起旅行...
                "3", "5", "+1.", "+3", "+3.", "+4", "+2..",
                // 是你如今...
                "+2", "+5", "7", "+1..",
                // 唯一坚持的任性...
                "+3", "+4", "+5", "+1", "+1", "+2.", "+1", "+1",
                // 一起长大的约定...
                "+6", "+5", "+3", "+2", "+1", "+3.", "+4", "+2..",
                "+6", "+5", "7", "+1..",
                // 与你聊不完的曾经...
                "+3", "+4", "+5", "+1", "+1", "+2", "+3", "+3..",
                // 而我已经分不清...
                "3", "5", "+1", "+3", "+3.", "+2", "+2", "+2..", "+2", "+5", "7", "+2", "+1", "+1",
                // 还是错过的爱情...
                "+3", "+4", "+5", "+1", "+1", "+2.", "+1", "+1.."
        };
    }


    public float xx(String s){
        float time = 0;
        String note = "";
        int number1 =0;
        int subNum = 0;
        int addKey = 0;
        int pointKey = 0;
        int halfKey = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                subNum++;
            } else if (c == '+') {
                addKey++;
            } else if (c == '.') {
                pointKey++;
            } else if (c == '#') {
                halfKey++;
            }else if (c>='0'&&c<='9'){
                int c1 = c- '0';
                number1 = c1;
            }
        }

        switch (number1) {
            case 0:
                time = 1000;
                return time / 1000.0f;
            case 1:
                note = "C";
                break;

            case 2:
                note = "D";
                break;

            case 3:
                note = "E";
                break;

            case 4:
                note = "F";
                break;

            case 5:
                note = "G";
                break;

            case 6:
                note = "A";
                break;

            case 7:
                note = "B";
                break;
        }
        int key = 0;
        switch (subNum) {
            case 0:
                key = 4;
                break;

            case 1:
                key = 3;
                break;

            case 2:
                key = 2;
                break;
        }

        switch (addKey) {
            case 0:
                key = 4;
                break;

            case 1:
                key = 5;
                break;

            case 2:
                key = 6;
                break;
        }


        switch (pointKey) {
            case 0:
                time = 500;
                break;

            case 1:
                time = 1000;
                break;

            case 2:
                time = 1500;
                break;
        }
        String ss = note + (halfKey > 0 ? "#" : "") + key;
        Sound sound = Gdx.audio.newSound(Gdx.files.internal(hashMap.get(ss)));
        sound.play();
        return time / 1000.0f;
    }

//   public void handleStrings(String song, int offset) {
//        let reg = /[0-9]/g;
//        let str = song[offset];
//        let order = 1;
//        let result = [];
//
//        while (true) {
//            let temp = reg.exec(str);
//
//            if (temp) {
//                result.push({
//                        text: temp[0],
//                        index: temp.index,
//                        order: order
//        });
//                order++;
//            } else {
//                break;
//            }
//        }
//
//        result.map(item => {
//                switch (str[item.index - 1]) {
//                    case "1":
//                    case "2":
//                    case "3":
//                    case "4":
//                    case "5":
//                    case "6":
//                    case "7":
//                        break;
//
//                    case "+":
//                        item.text = `+${item.text}`;
//
//                    switch (str[item.index - 2]) {
//                        case "+":
//                            item.text = `+${item.text}`;
//                        break;
//                    }
//
//                    break;
//
//                    case "-":
//                        item.text = `-${item.text}`;
//
//                    switch (str[item.index - 2]) {
//                        case "-":
//                            item.text = `-${item.text}`;
//                        break;
//                    }
//
//                    break;
//
//                    case "#":
//                        item.text = `#${item.text}`;
//
//                    switch (str[item.index - 2]) {
//                        case "-":
//                            item.text = `-${item.text}`;
//
//                        switch (str[item.index - 3]) {
//                            case "-":
//                                item.text = `-${item.text}`;
//                            break;
//                        }
//
//                        break;
//
//                        case "+":
//                            item.text = `+${item.text}`;
//
//                        switch (str[item.index - 3]) {
//                            case "+":
//                                item.text = `+${item.text}`;
//                            break;
//                        }
//
//                        break;
//                    }
//
//                    break;
//                }
//
//                switch (str[item.index + 1]) {
//                    case ".":
//                        item.text = `${item.text}.`;
//
//                    switch (str[item.index + 2]) {
//                        case ".":
//                            item.text = `${item.text}.`;
//                        break;
//                    }
//
//                    break;
//                }
//        });
//        let notes = result.map(item => {
//        return item.text;
//    });
//        let time = [];
//        notes.forEach((item, index) => {
//            time.push(this.handleString(notes, index));
//        });
//        return time.sort()[0];
//    }
//
//    handleString(song, offset) {
//        let letter = song[offset].match(/[0-9]/g)[0];
//        let subKey = song[offset].split("-").length - 1;
//        let addKey = song[offset].split("+").length - 1;
//        let pointKey = song[offset].split(".").length - 1;
//        let halfKey = song[offset].split("#").length - 1;
//        let note;
//        let key;
//        let time;
//
//        switch (letter) {
//            case "0":
//                return (time = 1000);
//            break;
//
//            case "1":
//                note = "C";
//                break;
//
//            case "2":
//                note = "D";
//                break;
//
//            case "3":
//                note = "E";
//                break;
//
//            case "4":
//                note = "F";
//                break;
//
//            case "5":
//                note = "G";
//                break;
//
//            case "6":
//                note = "A";
//                break;
//
//            case "7":
//                note = "B";
//                break;
//        }
//
//        switch (subKey) {
//            case 0:
//                key = 4;
//                break;
//
//            case 1:
//                key = 3;
//                break;
//
//            case 2:
//                key = 2;
//                break;
//        }
//
//        switch (addKey) {
//            case 0:
//                key = 4;
//                break;
//
//            case 1:
//                key = 5;
//                break;
//
//            case 2:
//                key = 6;
//                break;
//        }
//
//        switch (pointKey) {
//            case 0:
//                time = 500;
//                break;
//
//            case 1:
//                time = 1000;
//                break;
//
//            case 2:
//                time = 1500;
//                break;
//        }
//
//        console.log(`${note + (halfKey > 0 ? "#" : "") + key}`);
//        this.playNote(`${note + (halfKey > 0 ? "#" : "") + key}`);
//        return time;
//    }

}
