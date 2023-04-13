//package kw.mulitplay.game.data;
//
//import com.badlogic.gdx.utils.Array;
//
//public class TestJson {
//    public float bpm = 120;
//    public String[] left;
//    public String[] right;
//    public String l = "2/4";
//
//    public static void main(String[] args) {
//        TestJson json = new TestJson();
//    }
//    public TestJson(){
//        String str = "c2[K],d2[K],e2[K],c2[K];" +
//                "c2[K],d2[K],e2[K],c2[K];" +
//                "e2[K],f2[K],g2[J];" +
//                "e2[K],f2[K],g2[J];" +
//                "g2[L],a2[L],g2[L],f2[L],e2[K],c2[K];" +
//                "g2[L],a2[L],g2[L],f2[L],e2[K],c2[K];" +
//                "d2[K],g1[K],c2[J];" +
//                "d2[K],g1[K],(c1.e1.g1.c2)[J];"+
//        "c[L],g[L],e[L],g[L],c[L],g[L],e[L],g[L];" +
//                "c[L],g[L],e[L],g[L],c[L],g[L],e[L],g[L];" +
//                "c[L],g[L],e[L],g[L],c[L],g[L],e[L],g[L];" +
//                "c[L],g[L],e[L],g[L],c[L],g[L],e[L],g[L];" +
//                "d[L],g[L],B-1[L],g[L],c[L],g[L],e[L],g[L];" +
//                "d[L],g[L],B-1[L],g[L],c[L],g[L],e[L],g[L];" +
//                "d[L],g[L],B-1[L],g[L],c[L],g[L],e[L],g[L];" +
//                "d[L],g[L],B-1[L],g[L],c[J]";
//
//        String str1 =
//                "c2[L],d2[L],e2[L],f2[L],g2[L],T,U;" +
//                        "c2[L],d2[L],e2[L],f2[L],g2[L],T,U;" +
//                        "c2[L],d2[L],e2[L],f2[L],g2[L],e2[L],d2[L],c2[L];" +
//                        "d2[L],U,e2[L],U,d2[L],U,g2[L],U;" +
//                        "c2[L],(e1.d2)[L],e2[L],(e1.f2)[L],g2[L],e1[K],e1[L];" +
//                        "c2[L],(e1.d2)[L],e2[L],(e1.f2)[L],g2[L],e1[K],e1[L];" +
//                        "c2[L],(a.d2)[L],(d1.e2)[L],(f1.f2)[L],g2[L],(c1.e2)[L],(e1.d2)[L],(g1.c2)[L];" +
//                        "d2[K],e2[K],c2[L],g[L],(e1.c2)[K];" +
//                        "c2[L],d2[L],e2[L],f2[L],g2[L],U,e2[L],c2[L];" +
//                        "c3[L],U,a2[L],f2[L],g2[L],g2[L],e2[L],U;" +
//                        "c2[L],d2[L],e2[L],f2[L],g2[L],e2[L],d2[L],c2[L];" +
//                        "d2[L],U,e2[L],U,d2[K],g2[K]";
//
//        String str2 = "c2[L],(e.d2)[L],(a.e2)[L],(c1.f2)[L],g2[L],e[L],(b.e2)[L],(e1.c2)[L];" +
//                "c3[L],c[L],(f.a2)[L],(a.f2)[L],g2[L],(c.g2)[L],(e.e2)[L],g[L];" +
//                "c2[L],(A-1.d2)[L],(f.e2)[L],(a.f2)[L],(c1.g2)[L],(e1.e2)[L],(a1.d2)[L],c2[L];" +
//                "d2[K],e2[K],c2[K],c2[K];c3[L],(f.a.c1)[L],a2[L],(f.a.c1.f2)[L],g2[L],(g.b.c1.g2)[L],c2[L],(g.b.c1)[L];" +
//                "c3[L],(f.a.c1)[L],a2[L],(f.a.c1.f2)[L],g2[L],(g.b.c1)[L],e2[L],(g.b.c1)[L];" +
//                "c2[L],(e.a.c1.d2)[L],e2[L],(e.a.c1.f2)[L],g2[L],(g.b.c1.e2)[L],d2[L],(g.b.c1.c2)[L];" +
//                "d2[L],f[L],(g.b.e2)[K],c2[K],c2[K];" +
//                "c3[L],U,a2[L],f2[L],g2[L],g2[L],c2[L],U;" +
//                "c3[L],U,a2[L],f2[L],g2[L],U,e2[L],U;" +
//                "c2[L],d2[L],e2[L],f2[L],g2[L],e2[L],d2[L],c2[L];" +
//                "d2[L],U,e2[K],c2[K],c2[K]";
////                "A-1[J],G-1[J];F-1[J],E-1[J];D-1[I];(G-1.f.a.c1.f1)[K],T,(C-1.g.c1.e1)[K],T;f[J],e[J];d[J],e[J];f[J],e[J];d[K],T,(c.g.c1.e1)[K],T;F-1[L],c[L],(a.c1.f1)[L],c[L],E-1[L],B-1[L],(b.d1.g1)[L],B-1[L];D-1[L],A-1[L],(d.a.c1.f1)[L],A-1[L],E-1[L],B-1[L],(e.b.g1)[L],B-1[L];F-1[L],c[L],(a.c1.f1)[L],c[L],E-1[L],c[L],(e.b.g1)[L],c[L];" +
////                        "D-1[L],A-1[L],(G-1.f.b.e1)[K],(c.g.c1.e1)[K],T";
//        String[] split = str.split(";");
//        Array<String> array = new Array<>();
//        for (String s : split) {
//            String[] split1 = s.split(",");
//            for (String s1 : split1) {
//                if (s1.indexOf("[")<=0) {
//                    continue;
//                }
//                String substring = s1.substring(0, s1.indexOf("["));
//                if (substring.contains("(")) {
//                    String[] split2 = substring.split("\\.");
//                    for (String s2 : split2) {
//                        String replace = s2.replace("(", "");
//                        String replace1 = replace.replace(")", "");
//                        array.add(replace1);
//                    }
//                }else {
//                    array.add(substring);
////                    System.out.println(substring);
//                }
//            }
//        }
//        left = new String[array.size];
//        for (int i = 0; i < array.size; i++) {
//            left[i] = array.get(i);
//        }
//        right = new String[]{
//                "1","1",    "5","5",    "6","6",    "5","0",
//                "4","4",    "3","3",    "2","2",    "1","0",
//                "5","5",    "4","4",    "3","3",    "2","0",
//                "5","5",    "4","4",    "3","3",    "2","0",
//                "1","1",    "5","5",    "6","6",    "5","0",
//                "4","4",    "3","3",    "2","2",    "1","0"
//        };
//
//    }
//
//    public String[] getLeft() {
//        return left;
//    }
//
//    public String[] getRight() {
//        return right;
//    }
//}
