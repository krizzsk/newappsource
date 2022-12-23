package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.util.Base64;
import p001a0.C0016g;

class FileRecordParser {
    private static final String DELIMITER = ",";
    public byte[] bytes;
    public String streamName;

    public static String asString(String str, byte[] bArr) {
        StringBuilder t = C0016g.m36t(str, ",");
        t.append(Base64.encodeAsString(bArr));
        return t.toString();
    }

    public void parse(String str) {
        String[] split = str.split(",", 2);
        if (split.length >= 2) {
            this.streamName = split[0];
            this.bytes = Base64.decode(split[1]);
            return;
        }
        throw new IllegalArgumentException(C25541a.m63881k("Invalid line: ", str));
    }

    public String toString() {
        return asString(this.streamName, this.bytes);
    }
}
