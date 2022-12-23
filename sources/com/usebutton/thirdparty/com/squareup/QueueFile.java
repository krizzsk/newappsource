package com.usebutton.thirdparty.com.squareup;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p358af.C13437d;

public class QueueFile implements Closeable {
    public static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(QueueFile.class.getName());
    private static final byte[] ZEROES = new byte[4096];
    private final byte[] buffer = new byte[16];
    private int elementCount;
    public int fileLength;
    private Element first;
    private Element last;
    public final RandomAccessFile raf;

    public static class Element {
        public static final int HEADER_LENGTH = 4;
        public static final Element NULL = new Element(0, 0);
        public final int length;
        public final int position;

        public Element(int i, int i2) {
            this.position = i;
            this.length = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position = ");
            sb.append(this.position);
            sb.append(", length = ");
            return C13437d.m33707l(sb, this.length, "]");
        }
    }

    public final class ElementInputStream extends InputStream {
        private int position;
        private int remaining;

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.remaining;
            if (i3 == 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            QueueFile.this.ringRead(this.position, bArr, i, i2);
            this.position = QueueFile.this.wrapPosition(this.position + i2);
            this.remaining -= i2;
            return i2;
        }

        private ElementInputStream(Element element) {
            this.position = QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            QueueFile.this.raf.seek((long) this.position);
            int read = QueueFile.this.raf.read();
            this.position = QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return read;
        }
    }

    @Deprecated
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public interface ElementVisitor {
        boolean read(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    private void expandIfNecessary(int i) throws IOException {
        int i2 = i + 4;
        int remainingBytes = remainingBytes();
        if (remainingBytes < i2) {
            int i3 = this.fileLength;
            do {
                remainingBytes += i3;
                i3 <<= 1;
            } while (remainingBytes < i2);
            setLength(i3);
            Element element = this.last;
            int wrapPosition = wrapPosition(element.position + 4 + element.length);
            if (wrapPosition <= this.first.position) {
                FileChannel channel = this.raf.getChannel();
                channel.position((long) this.fileLength);
                int i4 = wrapPosition - 16;
                long j = (long) i4;
                if (channel.transferTo(16, j, channel) == j) {
                    ringErase(16, i4);
                } else {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.last.position;
            int i6 = this.first.position;
            if (i5 < i6) {
                int i7 = (this.fileLength + i5) - 16;
                writeHeader(i3, this.elementCount, i6, i7);
                this.last = new Element(i7, this.last.length);
            } else {
                writeHeader(i3, this.elementCount, i6, i5);
            }
            this.fileLength = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    private static void initialize(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile open = open(file2);
        try {
            open.setLength(4096);
            open.seek(0);
            byte[] bArr = new byte[16];
            writeInt(bArr, 0, 4096);
            open.write(bArr);
            open.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            open.close();
            throw th;
        }
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i) throws IOException {
        if (i == 0) {
            return Element.NULL;
        }
        ringRead(i, this.buffer, 0, 4);
        return new Element(i, readInt(this.buffer, 0));
    }

    private void readHeader() throws IOException {
        this.raf.seek(0);
        this.raf.readFully(this.buffer);
        int readInt = readInt(this.buffer, 0);
        this.fileLength = readInt;
        if (((long) readInt) > this.raf.length()) {
            StringBuilder k = C13555b.m33972k("File is truncated. Expected length: ");
            k.append(this.fileLength);
            k.append(", Actual length: ");
            k.append(this.raf.length());
            throw new IOException(k.toString());
        } else if (this.fileLength > 0) {
            this.elementCount = readInt(this.buffer, 4);
            int readInt2 = readInt(this.buffer, 8);
            int readInt3 = readInt(this.buffer, 12);
            this.first = readElement(readInt2);
            this.last = readElement(readInt3);
        } else {
            throw new IOException(C13437d.m33707l(C13555b.m33972k("File is corrupt; length stored in header ("), this.fileLength, ") is invalid."));
        }
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    private void ringErase(int i, int i2) throws IOException {
        while (i2 > 0) {
            byte[] bArr = ZEROES;
            int min = Math.min(i2, bArr.length);
            ringWrite(i, bArr, 0, min);
            i2 -= min;
            i += min;
        }
    }

    /* access modifiers changed from: private */
    public void ringRead(int i, byte[] bArr, int i2, int i3) throws IOException {
        int wrapPosition = wrapPosition(i);
        int i4 = wrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek((long) wrapPosition);
            this.raf.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - wrapPosition;
        this.raf.seek((long) wrapPosition);
        this.raf.readFully(bArr, i2, i6);
        this.raf.seek(16);
        this.raf.readFully(bArr, i2 + i6, i3 - i6);
    }

    private void ringWrite(int i, byte[] bArr, int i2, int i3) throws IOException {
        int wrapPosition = wrapPosition(i);
        int i4 = wrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek((long) wrapPosition);
            this.raf.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - wrapPosition;
        this.raf.seek((long) wrapPosition);
        this.raf.write(bArr, i2, i6);
        this.raf.seek(16);
        this.raf.write(bArr, i2 + i6, i3 - i6);
    }

    private void setLength(int i) throws IOException {
        this.raf.setLength((long) i);
        this.raf.getChannel().force(true);
    }

    private int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int i = element.position;
        int i2 = this.first.position;
        if (i >= i2) {
            return (i - i2) + 4 + element.length + 16;
        }
        return (((i + 4) + element.length) + this.fileLength) - i2;
    }

    /* access modifiers changed from: private */
    public int wrapPosition(int i) {
        int i2 = this.fileLength;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws IOException {
        writeInt(this.buffer, 0, i);
        writeInt(this.buffer, 4, i2);
        writeInt(this.buffer, 8, i3);
        writeInt(this.buffer, 12, i4);
        this.raf.seek(0);
        this.raf.write(this.buffer);
    }

    public static void writeInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        writeHeader(4096, 0, 0, 0);
        this.raf.seek(16);
        this.raf.write(ZEROES, 0, 4080);
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096);
        }
        this.fileLength = 4096;
    }

    public synchronized void close() throws IOException {
        this.raf.close();
    }

    @Deprecated
    public synchronized void forEach(final ElementReader elementReader) throws IOException {
        forEach((ElementVisitor) new ElementVisitor() {
            public boolean read(InputStream inputStream, int i) throws IOException {
                elementReader.read(inputStream, i);
                return true;
            }
        });
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        byte[] bArr = new byte[i];
        ringRead(element.position + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        remove(1);
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            forEach((ElementReader) new ElementReader() {
                public boolean first = true;

                public void read(InputStream inputStream, int i) throws IOException {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized void add(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (bArr != null) {
            if ((i | i2) >= 0) {
                if (i2 <= bArr.length - i) {
                    expandIfNecessary(i2);
                    boolean isEmpty = isEmpty();
                    if (isEmpty) {
                        i3 = 16;
                    } else {
                        Element element = this.last;
                        i3 = wrapPosition(element.position + 4 + element.length);
                    }
                    Element element2 = new Element(i3, i2);
                    writeInt(this.buffer, 0, i2);
                    ringWrite(element2.position, this.buffer, 0, 4);
                    ringWrite(element2.position + 4, bArr, i, i2);
                    writeHeader(this.fileLength, this.elementCount + 1, isEmpty ? element2.position : this.first.position, element2.position);
                    this.last = element2;
                    this.elementCount++;
                    if (isEmpty) {
                        this.first = element2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("data == null");
    }

    public synchronized int forEach(ElementVisitor elementVisitor) throws IOException {
        int i = this.first.position;
        int i2 = 0;
        while (true) {
            int i3 = this.elementCount;
            if (i2 >= i3) {
                return i3;
            }
            Element readElement = readElement(i);
            if (!elementVisitor.read(new ElementInputStream(readElement), readElement.length)) {
                return i2 + 1;
            }
            i = wrapPosition(readElement.position + 4 + readElement.length);
            i2++;
        }
    }

    public synchronized void remove(int i) throws IOException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (i < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i + ") number of elements.");
        } else if (i != 0) {
            int i2 = this.elementCount;
            if (i == i2) {
                clear();
            } else if (i <= i2) {
                Element element = this.first;
                int i3 = element.position;
                int i4 = element.length;
                int i5 = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    i6 += i4 + 4;
                    i5 = wrapPosition(i5 + 4 + i4);
                    ringRead(i5, this.buffer, 0, 4);
                    i4 = readInt(this.buffer, 0);
                }
                writeHeader(this.fileLength, this.elementCount - i, i5, this.last.position);
                this.elementCount -= i;
                this.first = new Element(i5, i4);
                ringErase(i3, i6);
            } else {
                throw new IllegalArgumentException("Cannot remove more elements (" + i + ") than present in queue (" + this.elementCount + ").");
            }
        }
    }

    @Deprecated
    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.elementCount > 0) {
            elementReader.read(new ElementInputStream(this.first), this.first.length);
        }
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.raf = randomAccessFile;
        readHeader();
    }

    public synchronized void peek(ElementVisitor elementVisitor) throws IOException {
        if (this.elementCount > 0) {
            elementVisitor.read(new ElementInputStream(this.first), this.first.length);
        }
    }
}
