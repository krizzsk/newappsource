package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

class NamespaceRemovingInputStream extends SdkFilterInputStream {
    private static final int BUFFER_SIZE = 200;
    private boolean hasRemovedNamespace = false;
    private final byte[] lookAheadData = new byte[BUFFER_SIZE];

    public static final class StringPrefixSlicer {

        /* renamed from: s */
        private String f6723s;

        public StringPrefixSlicer(String str) {
            this.f6723s = str;
        }

        public String getString() {
            return this.f6723s;
        }

        public boolean removePrefix(String str) {
            if (!this.f6723s.startsWith(str)) {
                return false;
            }
            this.f6723s = this.f6723s.substring(str.length());
            return true;
        }

        public boolean removePrefixEndingWith(String str) {
            int indexOf = this.f6723s.indexOf(str);
            if (indexOf < 0) {
                return false;
            }
            this.f6723s = this.f6723s.substring(str.length() + indexOf);
            return true;
        }

        public boolean removeRepeatingPrefix(String str) {
            if (!this.f6723s.startsWith(str)) {
                return false;
            }
            while (this.f6723s.startsWith(str)) {
                this.f6723s = this.f6723s.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
    }

    private int matchXmlNamespaceAttribute(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.removePrefix("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("=")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (stringPrefixSlicer.removePrefix("\"") && stringPrefixSlicer.removePrefixEndingWith("\"")) {
            return str.length() - stringPrefixSlicer.getString().length();
        }
        return -1;
    }

    public int read() throws IOException {
        abortIfNeeded();
        int read = this.in.read();
        if (read != 120 || this.hasRemovedNamespace) {
            return read;
        }
        this.lookAheadData[0] = (byte) read;
        this.in.mark(this.lookAheadData.length);
        InputStream inputStream = this.in;
        byte[] bArr = this.lookAheadData;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        this.in.reset();
        int matchXmlNamespaceAttribute = matchXmlNamespaceAttribute(new String(this.lookAheadData, 0, read2 + 1, StringUtils.UTF8));
        if (matchXmlNamespaceAttribute <= 0) {
            return read;
        }
        for (int i = 0; i < matchXmlNamespaceAttribute - 1; i++) {
            this.in.read();
        }
        int read3 = this.in.read();
        this.hasRemovedNamespace = true;
        return read3;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int read = read();
            if (read != -1) {
                bArr[i3 + i] = (byte) read;
                i3++;
            } else if (i3 == 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
