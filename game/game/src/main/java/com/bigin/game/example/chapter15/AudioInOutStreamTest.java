package com.bigin.game.example.chapter15;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class AudioInOutStreamTest {
        public static void main(String[] argv) throws Exception {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new URL("https://file-examples.com/storage/fe783a5cbb6323602a28c66/2017/11/file_example_WAV_10MG.wav"));

            AudioFormat format = stream.getFormat();
            if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
                format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, format.getSampleRate(),
                        format.getSampleSizeInBits() * 2, format.getChannels(), format.getFrameSize() * 2,
                        format.getFrameRate(), true); // big endian
                stream = AudioSystem.getAudioInputStream(format, stream);
            }

            DataLine.Info info = new DataLine.Info(Clip.class, stream.getFormat(),
                    ((int) stream.getFrameLength() * format.getFrameSize()));
            Clip clip = (Clip) AudioSystem.getLine(info);

            clip.open(stream);

            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000); // ?? : ??? ???..??
        }
}
