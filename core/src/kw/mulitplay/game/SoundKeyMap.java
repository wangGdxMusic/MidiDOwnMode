package kw.mulitplay.game;

import com.badlogic.gdx.utils.Array;

import java.util.HashMap;

public class SoundKeyMap {
    public static HashMap<String,String> jianpuToAG = new HashMap<>();
    public static HashMap<String,String> AGToResouce = new HashMap<>();
    public static HashMap<String,String> AGToIndex = new HashMap<>();
    public static HashMap<String,String> indexToAG = new HashMap<>();
    public static Array<String> array = new Array<>();

    static String AG[] = {"A","B","C","D","E","F","G"};
    static {
        jianpuToAG.put("6....","A2");
        jianpuToAG.put("7....","B2");

        jianpuToAG.put("1...","C1");
        jianpuToAG.put("2...","D1");
        jianpuToAG.put("3...","E1");
        jianpuToAG.put("4...","F1");
        jianpuToAG.put("5...","G1");
        jianpuToAG.put("6...","A1");
        jianpuToAG.put("7...","B1");

        jianpuToAG.put("1..","C");
        jianpuToAG.put("2..","D");
        jianpuToAG.put("3..","E");
        jianpuToAG.put("4..","F");
        jianpuToAG.put("5..","G");
        jianpuToAG.put("6..","A");
        jianpuToAG.put("7..","B");

        jianpuToAG.put("1.","c");
        jianpuToAG.put("2.","d");
        jianpuToAG.put("3.","e");
        jianpuToAG.put("4.","f");
        jianpuToAG.put("5.","g");
        jianpuToAG.put("6.","a");
        jianpuToAG.put("7.","b");



        jianpuToAG.put("1","c1");
        jianpuToAG.put("2","d1");
        jianpuToAG.put("3","e1");
        jianpuToAG.put("4","f1");
        jianpuToAG.put("5","g1");
        jianpuToAG.put("6","a1");
        jianpuToAG.put("7","b1");



        jianpuToAG.put(".1","c2");
        jianpuToAG.put(".2","d3");
        jianpuToAG.put(".3","e2");
        jianpuToAG.put(".4","f2");
        jianpuToAG.put(".5","g2");
        jianpuToAG.put(".6","a2");
        jianpuToAG.put(".7","b2");

        jianpuToAG.put("..1","c3");
        jianpuToAG.put("..2","d3");
        jianpuToAG.put("..3","e3");
        jianpuToAG.put("..4","f3");
        jianpuToAG.put("..5","g3");
        jianpuToAG.put("..6","a3");
        jianpuToAG.put("..7","b3");


        jianpuToAG.put("...1","c4");
        jianpuToAG.put("...2","d4");
        jianpuToAG.put("...3","e4");
        jianpuToAG.put("...4","f4");
        jianpuToAG.put("...5","g4");
        jianpuToAG.put("...6","a4");
        jianpuToAG.put("...7","b4");

        jianpuToAG.put("1....","c5");

        }

        static String path = "piano2/p";

    static {
        AGToResouce.put("A2", path+"01"+".mp3");     AGToResouce.put("A2+", path+"02"+".mp3");
        AGToResouce.put("B2", path+"03"+".mp3");
        AGToResouce.put("C1", path+"04"+".mp3");     AGToResouce.put("C1+", path+"05"+".mp3");
        AGToResouce.put("D1", path+"06"+".mp3");     AGToResouce.put("D1+", path+"07"+".mp3");
        AGToResouce.put("E1", path+"08"+".mp3");
        AGToResouce.put("F1", path+"09"+".mp3");     AGToResouce.put("F1+", path+"10"+".mp3");
        AGToResouce.put("G1", path+"11"+".mp3");     AGToResouce.put("G1+", path+"12"+".mp3");
        AGToResouce.put("A1", path+"13"+".mp3");     AGToResouce.put("A1+", path+"14"+".mp3");
        AGToResouce.put("B1", path+"15"+".mp3");
        AGToResouce.put("C", path+"16"+".mp3");     AGToResouce.put("C+", path+"17"+".mp3");
        AGToResouce.put("D", path+"18"+".mp3");     AGToResouce.put("D+", path+"19"+".mp3");
        AGToResouce.put("E", path+"20"+".mp3");
        AGToResouce.put("F", path+"21"+".mp3");     AGToResouce.put("F+", path+"22"+".mp3");
        AGToResouce.put("G", path+"23"+".mp3");     AGToResouce.put("G+", path+"24"+".mp3");
        AGToResouce.put("A", path+"25"+".mp3");     AGToResouce.put("A+", path+"26"+".mp3");
        AGToResouce.put("B", path+"27"+".mp3");
        AGToResouce.put("c", path+"28"+".mp3");     AGToResouce.put("c+", path+"29"+".mp3");
        AGToResouce.put("d", path+"30"+".mp3");     AGToResouce.put("d+", path+"31"+".mp3");
        AGToResouce.put("e", path+"32"+".mp3");
        AGToResouce.put("f", path+"33"+".mp3");     AGToResouce.put("f+", path+"34"+".mp3");
        AGToResouce.put("g", path+"35"+".mp3");     AGToResouce.put("g+", path+"36"+".mp3");
        AGToResouce.put("a", path+"37"+".mp3");     AGToResouce.put("a+", path+"38"+".mp3");
        AGToResouce.put("b", path+"39"+".mp3");
        AGToResouce.put("c1",path+ "40"+".mp3");     AGToResouce.put("c1+", path+"41"+".mp3");
        AGToResouce.put("d1",path+ "42"+".mp3");     AGToResouce.put("d1+", path+"43"+".mp3");
        AGToResouce.put("e1",path+"44"+".mp3");
        AGToResouce.put("f1",path+"45"+".mp3");     AGToResouce.put("f1+", path+"46"+".mp3");
        AGToResouce.put("g1",path+"47"+".mp3");     AGToResouce.put("g1+", path+"48"+".mp3");
        AGToResouce.put("a1",path+"49"+".mp3");     AGToResouce.put("a1+", path+"50"+".mp3");
        AGToResouce.put("b1",path+"51"+".mp3");
        AGToResouce.put("c2",path+"52"+".mp3");     AGToResouce.put("c2+", path+"53"+".mp3");
        AGToResouce.put("d2",path+"54"+".mp3");     AGToResouce.put("d2+", path+"55"+".mp3");
        AGToResouce.put("e2",path+"56"+".mp3");
        AGToResouce.put("f2",path+"57"+".mp3");     AGToResouce.put("f2+", path+"58"+".mp3");
        AGToResouce.put("g2",path+"59"+".mp3");     AGToResouce.put("g2+", path+"60"+".mp3");
        AGToResouce.put("a2",path+"61"+".mp3");     AGToResouce.put("a2+", path+"62"+".mp3");
        AGToResouce.put("b2",path+"63"+".mp3");
        AGToResouce.put("c3",path+"64"+".mp3");     AGToResouce.put("c3+", path+"65"+".mp3");
        AGToResouce.put("d3",path+"66"+".mp3");     AGToResouce.put("d3+", path+"67"+".mp3");
        AGToResouce.put("e3",path+"68"+".mp3");
        AGToResouce.put("f3",path+"69"+".mp3");     AGToResouce.put("f3+", path+"70"+".mp3");
        AGToResouce.put("g3",path+"71"+".mp3");     AGToResouce.put("g3+", path+"72"+".mp3");
        AGToResouce.put("a3",path+"73"+".mp3");     AGToResouce.put("a3+", path+"74"+".mp3");
        AGToResouce.put("b3",path+"75"+".mp3");
        AGToResouce.put("c4",path+"76"+".mp3");     AGToResouce.put("c4+", path+"77"+".mp3");
        AGToResouce.put("d4",path+"78"+".mp3");     AGToResouce.put("d4+", path+"79"+".mp3");
        AGToResouce.put("e4",path+"80"+".mp3");
        AGToResouce.put("f4",path+"81"+".mp3");     AGToResouce.put("f4+", path+"82"+".mp3");
        AGToResouce.put("g4",path+"83"+".mp3");     AGToResouce.put("g4+", path+"84"+".mp3");
        AGToResouce.put("a4",path+"85"+".mp3");     AGToResouce.put("a4+", path+"86"+".mp3");
        AGToResouce.put("b4",path+"87"+".mp3");
        AGToResouce.put("c5",path+"88"+".mp3");
    }
    static {
        indexToAG.put("1",   "A2"           );
        indexToAG.put("3",   "B2"           );
        indexToAG.put("4",   "C1"           );
        indexToAG.put("6",   "D1"           );
        indexToAG.put("8",   "E1"           );
        indexToAG.put("9",   "F1"           );
        indexToAG.put( "11",     "G1"            );
        indexToAG.put( "13",     "A1"            );
        indexToAG.put( "15",     "B1"            );
        indexToAG.put( "16",  "C"            );
        indexToAG.put( "18",  "D"            );
        indexToAG.put( "20",  "E"            );
        indexToAG.put( "21",  "F"            );
        indexToAG.put( "23",  "G"            );
        indexToAG.put( "25",  "A"            );
        indexToAG.put( "27",  "B"               );
        indexToAG.put( "28",  "c"               );
        indexToAG.put( "30",  "d"               );
        indexToAG.put( "32",  "e"               );
        indexToAG.put( "33",  "f"               );
        indexToAG.put( "35",  "g"               );
        indexToAG.put( "37",  "a"            );
        indexToAG.put( "39",  "b"            );
        indexToAG.put( "40",  "c1"            );
        indexToAG.put( "43",  "d1"            );
        indexToAG.put("44",   "e1");
        indexToAG.put("45",   "f1");
        indexToAG.put("47",   "g1");
        indexToAG.put("49",   "a1");
        indexToAG.put("51",   "b1");
        indexToAG.put("52",   "c2");
        indexToAG.put("54",   "d2");
        indexToAG.put("56",   "e2");
        indexToAG.put("57",   "f2");
        indexToAG.put("59",   "g2");
        indexToAG.put("61",   "a2");
        indexToAG.put("63",   "b2");
        indexToAG.put("64",   "c3");
        indexToAG.put("66",   "d3");
        indexToAG.put("68",   "e3");
        indexToAG.put("69",   "f3");
        indexToAG.put("71",   "g3");
        indexToAG.put("73",   "a3");
        indexToAG.put("75",   "b3");
        indexToAG.put("76",   "c4");
        indexToAG.put("78",   "d4");
        indexToAG.put("80",   "e4");
        indexToAG.put("81",   "f4");
        indexToAG.put("83",   "g4");
        indexToAG.put("85",   "a4");
        indexToAG.put("87",   "b4");
        indexToAG.put("88",   "c5");


        indexToAG.put("2",               "A2+"            );
        indexToAG.put("5",               "C1+"            );
        indexToAG.put("7",               "D1+"            );
        indexToAG.put("10",               "F1+"            );
        indexToAG.put("12",               "G1+"            );
        indexToAG.put("14",               "A1+"            );
        indexToAG.put("17",               "C+"             );
        indexToAG.put("19",               "D+"             );
        indexToAG.put("22",               "F+"             );
        indexToAG.put("24",               "G+"             );
        indexToAG.put("26",               "A+"             );
        indexToAG.put("29",               "c+"             );
        indexToAG.put("31",               "d+"            );
        indexToAG.put("34",               "f+"             );
        indexToAG.put("36",               "g+"             );
        indexToAG.put("38",               "a+"             );
        indexToAG.put("41",               "c1+"          );
        indexToAG.put("43",               "d1+"          );
        indexToAG.put("46",               "f1+"          );
        indexToAG.put("48",               "g1+"          );
        indexToAG.put("50",               "a1+"            );
        indexToAG.put("53",               "c2+"            );
        indexToAG.put("55",               "d2+"            );
        indexToAG.put("58",               "f2+"            );
        indexToAG.put("60",               "g2+"           );
        indexToAG.put("62",               "a2+"           );
        indexToAG.put("65",               "c3+"           );
        indexToAG.put("67",               "d3+"           );
        indexToAG.put("70",             "f3+"            );
        indexToAG.put("72",             "g3+"            );
        indexToAG.put("74",             "a3+"            );
        indexToAG.put("77",             "c4+"            );
        indexToAG.put("79",               "d4+"            );
        indexToAG.put("82",               "f4+"            );
        indexToAG.put("84",               "g4+"            );
        indexToAG.put("86",               "a4+"            );
    }


    static {
        AGToIndex.put("A2", "1");

        AGToIndex.put("B2", "3");
        AGToIndex.put("C1", "4");
        AGToIndex.put("D1", "6");
        AGToIndex.put("E1", "8");
        AGToIndex.put("F1", "9");
        AGToIndex.put("G1", "11");
        AGToIndex.put("A1", "13");
        AGToIndex.put("B1", "15");
        AGToIndex.put("C", "16");
        AGToIndex.put("D", "18");
        AGToIndex.put("E", "20");
        AGToIndex.put("F", "21");
        AGToIndex.put("G", "23");
        AGToIndex.put("A", "25");
        AGToIndex.put("B", "27");
        AGToIndex.put("c", "28");
        AGToIndex.put("d", "30");
        AGToIndex.put("e", "32");
        AGToIndex.put("f", "33");
        AGToIndex.put("g", "35");
        AGToIndex.put("a", "37");
        AGToIndex.put("b", "39");
        AGToIndex.put("c1", "40");
        AGToIndex.put("d1", "42");
        AGToIndex.put("e1","44");
        AGToIndex.put("f1","45");
        AGToIndex.put("g1","47");
        AGToIndex.put("a1","49");
        AGToIndex.put("b1","51");
        AGToIndex.put("c2","52");
        AGToIndex.put("d2","54");
        AGToIndex.put("e2","56");
        AGToIndex.put("f2","57");
        AGToIndex.put("g2","59");
        AGToIndex.put("a2","61");
        AGToIndex.put("b2","63");
        AGToIndex.put("c3","64");
        AGToIndex.put("d3","66");
        AGToIndex.put("e3","68");
        AGToIndex.put("f3","69");
        AGToIndex.put("g3","71");
        AGToIndex.put("a3","73");
        AGToIndex.put("b3","75");
        AGToIndex.put("c4","76");
        AGToIndex.put("d4","78");
        AGToIndex.put("e4","80");
        AGToIndex.put("f4","81");
        AGToIndex.put("g4","83");
        AGToIndex.put("a4","85");
        AGToIndex.put("b4","87");
        AGToIndex.put("c5","88");
    }

//    static {
//        AGToResouce.put("A2", "6....");
//        AGToResouce.put("B2", "7....");
//
//        AGToResouce.put("C1", "1...");
//        AGToResouce.put("D1", "2...");
//        AGToResouce.put("E1", "3...");
//        AGToResouce.put("F1", "4...");
//        AGToResouce.put("G1", "5...");
//        AGToResouce.put("A1", "6...");
//        AGToResouce.put("B1", "7...");
//
//        AGToResouce.put("C", "1..");
//        AGToResouce.put("D", "2..");
//        AGToResouce.put("E", "3..");
//        AGToResouce.put("F", "4..");
//        AGToResouce.put("G", "5..");
//        AGToResouce.put("A", "6..");
//        AGToResouce.put("B", "7..");
//
//        AGToResouce.put("c", "1.");
//        AGToResouce.put("d", "2.");
//        AGToResouce.put("e", "3.");
//        AGToResouce.put("f", "4.");
//        AGToResouce.put("g", "5.");
//        AGToResouce.put("a", "6.");
//        AGToResouce.put("b", "7.");
//
//
//        AGToResouce.put("c1", "1");
//        AGToResouce.put("d1", "2");
//        AGToResouce.put("e1", "3");
//        AGToResouce.put("f1", "4");
//        AGToResouce.put("g1", "5");
//        AGToResouce.put("a1", "6");
//        AGToResouce.put("b1", "7");
//
//
//        AGToResouce.put("c2", ".1");
//        AGToResouce.put("d3", ".2");
//        AGToResouce.put("e2", ".3");
//        AGToResouce.put("f2", ".4");
//        AGToResouce.put("g2", ".5");
//        AGToResouce.put("a2", ".6");
//        AGToResouce.put("b2", ".7");
//
//        AGToResouce.put("c3", "..1");
//        AGToResouce.put("d3", "..2");
//        AGToResouce.put("e3", "..3");
//        AGToResouce.put("f3", "..4");
//        AGToResouce.put("g3", "..5");
//        AGToResouce.put("a3", "..6");
//        AGToResouce.put("b3", "..7");
//
//
//        AGToResouce.put("c4", "...1");
//        AGToResouce.put("d4", "...2");
//        AGToResouce.put("e4", "...3");
//        AGToResouce.put("f4", "...4");
//        AGToResouce.put("g4", "...5");
//        AGToResouce.put("a4", "...6");
//        AGToResouce.put("b4", "...7");
//
//        AGToResouce.put("c5", "1....");
//    }

    }
