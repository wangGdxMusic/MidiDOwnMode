//package kw.mulitplay.game.screen;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.files.FileHandle;
//import com.badlogic.gdx.utils.Array;
//
//import java.util.ArrayList;
//
//import javax.sound.midi.MidiDevice;
//import javax.sound.midi.MidiSystem;
//import javax.sound.midi.MidiUnavailableException;
//import javax.sound.midi.Sequence;
//import javax.sound.midi.Sequencer;
//
//import kw.mulitplay.game.group.PianoView;
//import kw.mulitplay.game.midi.handler.Channel;
//import kw.mulitplay.game.midi.handler.MidiInstruments;
//import kw.mulitplay.game.midi.handler.MidiUtils;
//import kw.mulitplay.game.midi.handler.Note;
//import kw.mulitplay.game.midi.handler.Sheet;
//import kw.mulitplay.game.screen.base.BaseScreen;
//import kw.mulitplay.game.time.ActorTimeLine;
//
//public class SandbankDemoScreen extends BaseScreen {
//    private Sequencer midip= null;//创建一个音序器(Sequencer)，即播放器的核心，这里如果传了-dev参数，就不自动连接默认设备
//    private MidiDevice midid;
//    @Override
//    protected void initView() {
//
//    }
//
//    @Override
//    protected void initListener() {
//
//    }
//
//    @Override
//    protected void initData() {
//        MidiDevice.Info[] vdevs = MidiSystem.getMidiDeviceInfo();//获取所有MIDI设备信息
//        ArrayList<MidiDevice.Info> xdevs = new ArrayList<MidiDevice.Info>();//准备筛除一些不能用来播放的设备，用这个ArrayList存放合格的
//        for (MidiDevice.Info dev : vdevs) {
//            String s = dev.getName();
//            try {
//                MidiDevice vc = MidiSystem.getMidiDevice(dev);//启动每个设备试验
//                vc.getReceiver();//直接访问Receiver，如果没有就走catch
//                vc.close();//关闭设备
//            } catch (MidiUnavailableException e) {
//                s = "$NORECEIVER";//利用名称筛除没有Receiver的设备
//            }
//            if (s != "Real Time Sequencer" && s != "$NORECEIVER")//筛除没有Receiver的设备和Real Time Sequencer(这个是音序器的Receiver，用来做MIDI录制的，当然不能要它)
//                xdevs.add(dev);//过检的插进ArrayList里
//        }
//
//
//
//        MidiDevice.Info[] arrw = new MidiDevice.Info[xdevs.size()];
//        MidiDevice.Info[] devs = xdevs.toArray(arrw);//这两句用来把ArrayList转为数组，注意不能直接toArray
//        System.out.println("ID	Name	Description	Vendor	Version");
//        int id = 0;
//        for (MidiDevice.Info dev : devs) {
//            System.out.println(String.valueOf(id) + "	" + dev.getName() + "	" + dev.getDescription() + "	" + dev.getVendor() + "	" + dev.getVersion());
//            id += 1;
//        }
////        System.exit(0);//结束
////        String arg1 = "", arg2 = "";//准备读第二、三个参数
//
//
//        FileHandle midif = Gdx.files.internal("");//打开MIDI文件，这里是直接从参数的第一位读取
//        try {
//            Sequence seq = MidiSystem.getSequence(midif.file());//加载文件到序列(Sequence)中
//            midip = MidiSystem.getSequencer();
//            midip.open();//启动音序器，
//            //使用哪一个设备
//            midid = MidiSystem.getMidiDevice(devs[1]);//获取MIDI设备
//            midid.open();//启动MIDI设备
//            midip.getTransmitter().setReceiver(midid.getReceiver());//关键的一步，把之前的音序器的Transmitter和MidiDevice的Receiver挂接起来
//            midip.setSequence(seq);//把序列插入到音序器中
//            if (!midip.isRunning())
//                midip.start();//开始播放
//            Runtime.getRuntime().addShutdownHook(new Thread() {//加入退出检测线程，Ctrl-C时停止并释放资源
//                public void run() {
//                    try {
//                        System.out.println("Quit");
//                        if (midip.isRunning())
//                            midip.stop();
//                        if (midip.isOpen())
//                            midip.close();
//                        if (midid != null && midid.isOpen())
//                            midid.close();//关闭音序器和设备，结束程序
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    protected void back() {
//
//    }
//}
//
