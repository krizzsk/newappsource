package com.usebutton.sdk.internal.util;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public final class Entry {
    public Editor currentEditor;
    private final File directory;
    public final String key;
    public final long[] lengths;
    public boolean readable;
    public long sequenceNumber;
    private final int valueCount;

    public Entry(String str, File file, int i) {
        this.key = str;
        this.directory = file;
        this.valueCount = i;
        this.lengths = new long[i];
    }

    private IOException invalidLengths(String[] strArr) throws IOException {
        StringBuilder k = C13555b.m33972k("unexpected journal line: ");
        k.append(Arrays.toString(strArr));
        throw new IOException(k.toString());
    }

    public File getCleanFile(int i) {
        File file = this.directory;
        return new File(file, this.key + "." + i);
    }

    public File getDirtyFile(int i) {
        File file = this.directory;
        return new File(file, this.key + "." + i + ".tmp");
    }

    public String getLengths() throws IOException {
        StringBuilder sb = new StringBuilder();
        for (long append : this.lengths) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }

    public void setLengths(String[] strArr) throws IOException {
        if (strArr.length == this.valueCount) {
            int i = 0;
            while (i < strArr.length) {
                try {
                    this.lengths[i] = Long.parseLong(strArr[i]);
                    i++;
                } catch (NumberFormatException unused) {
                    throw invalidLengths(strArr);
                }
            }
            return;
        }
        throw invalidLengths(strArr);
    }
}
