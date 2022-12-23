package com.usebutton.sdk.internal.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public final class Editor {
    private final DiskLruCache cache;
    public final Entry entry;
    /* access modifiers changed from: private */
    public boolean hasErrors;

    public class FaultHidingOutputStream extends FilterOutputStream {
        public void close() {
            try {
                this.out.close();
            } catch (IOException unused) {
                boolean unused2 = Editor.this.hasErrors = true;
            }
        }

        public void flush() {
            try {
                this.out.flush();
            } catch (IOException unused) {
                boolean unused2 = Editor.this.hasErrors = true;
            }
        }

        public void write(int i) {
            try {
                this.out.write(i);
            } catch (IOException unused) {
                boolean unused2 = Editor.this.hasErrors = true;
            }
        }

        private FaultHidingOutputStream(OutputStream outputStream) {
            super(outputStream);
        }

        public void write(byte[] bArr, int i, int i2) {
            try {
                this.out.write(bArr, i, i2);
            } catch (IOException unused) {
                boolean unused2 = Editor.this.hasErrors = true;
            }
        }
    }

    public Editor(Entry entry2, DiskLruCache diskLruCache) {
        this.entry = entry2;
        this.cache = diskLruCache;
    }

    public void abort() throws IOException {
        this.cache.completeEdit(this, false);
    }

    public void commit() throws IOException {
        if (this.hasErrors) {
            this.cache.completeEdit(this, false);
            this.cache.remove(this.entry.key);
            return;
        }
        this.cache.completeEdit(this, true);
    }

    public String getString(int i) throws IOException {
        InputStream newInputStream = newInputStream(i);
        if (newInputStream != null) {
            return DiskLruCache.inputStreamToString(newInputStream);
        }
        return null;
    }

    public InputStream newInputStream(int i) throws IOException {
        synchronized (this.cache) {
            Entry entry2 = this.entry;
            if (entry2.currentEditor != this) {
                throw new IllegalStateException();
            } else if (!entry2.readable) {
                return null;
            } else {
                FileInputStream fileInputStream = new FileInputStream(this.entry.getCleanFile(i));
                return fileInputStream;
            }
        }
    }

    public OutputStream newOutputStream(int i) throws IOException {
        FaultHidingOutputStream faultHidingOutputStream;
        synchronized (this.cache) {
            if (this.entry.currentEditor == this) {
                faultHidingOutputStream = new FaultHidingOutputStream(new FileOutputStream(this.entry.getDirtyFile(i)));
            } else {
                throw new IllegalStateException();
            }
        }
        return faultHidingOutputStream;
    }

    public void set(int i, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(newOutputStream(i), DiskLruCache.UTF_8);
            try {
                outputStreamWriter2.write(str);
                DiskLruCache.closeQuietly(outputStreamWriter2);
            } catch (Throwable th) {
                th = th;
                outputStreamWriter = outputStreamWriter2;
                DiskLruCache.closeQuietly(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            DiskLruCache.closeQuietly(outputStreamWriter);
            throw th;
        }
    }
}
