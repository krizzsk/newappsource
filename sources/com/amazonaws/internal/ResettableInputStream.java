package com.amazonaws.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class ResettableInputStream extends ReleasableInputStream {
    private static final Log log = LogFactory.getLog((Class<?>) ResettableInputStream.class);
    private final File file;
    private final FileChannel fileChannel;
    private final FileInputStream fis;
    private long markPos;

    public ResettableInputStream(File file2) throws IOException {
        this(new FileInputStream(file2), file2);
    }

    public static ResettableInputStream newResettableInputStream(File file2) {
        return newResettableInputStream(file2, (String) null);
    }

    public int available() throws IOException {
        abortIfNeeded();
        return this.fis.available();
    }

    public File getFile() {
        return this.file;
    }

    public void mark(int i) {
        abortIfNeeded();
        try {
            this.markPos = this.fileChannel.position();
            Log log2 = log;
            if (log2.isTraceEnabled()) {
                StringBuilder k = C13555b.m33972k("File input stream marked at position ");
                k.append(this.markPos);
                log2.trace(k.toString());
            }
        } catch (IOException e) {
            throw new AmazonClientException("Failed to mark the file position", e);
        }
    }

    public final boolean markSupported() {
        return true;
    }

    public int read() throws IOException {
        abortIfNeeded();
        return this.fis.read();
    }

    public void reset() throws IOException {
        abortIfNeeded();
        this.fileChannel.position(this.markPos);
        Log log2 = log;
        if (log2.isTraceEnabled()) {
            StringBuilder k = C13555b.m33972k("Reset to position ");
            k.append(this.markPos);
            log2.trace(k.toString());
        }
    }

    public long skip(long j) throws IOException {
        abortIfNeeded();
        return this.fis.skip(j);
    }

    public ResettableInputStream(FileInputStream fileInputStream) throws IOException {
        this(fileInputStream, (File) null);
    }

    public static ResettableInputStream newResettableInputStream(File file2, String str) {
        try {
            return new ResettableInputStream(file2);
        } catch (IOException e) {
            throw (str == null ? new AmazonClientException((Throwable) e) : new AmazonClientException(str, e));
        }
    }

    private ResettableInputStream(FileInputStream fileInputStream, File file2) throws IOException {
        super(fileInputStream);
        this.file = file2;
        this.fis = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.fileChannel = channel;
        this.markPos = channel.position();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        abortIfNeeded();
        return this.fis.read(bArr, i, i2);
    }

    public static ResettableInputStream newResettableInputStream(FileInputStream fileInputStream) {
        return newResettableInputStream(fileInputStream, (String) null);
    }

    public static ResettableInputStream newResettableInputStream(FileInputStream fileInputStream, String str) {
        try {
            return new ResettableInputStream(fileInputStream);
        } catch (IOException e) {
            throw new AmazonClientException(str, e);
        }
    }
}
