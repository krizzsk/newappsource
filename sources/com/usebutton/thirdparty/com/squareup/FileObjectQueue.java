package com.usebutton.thirdparty.com.squareup;

import com.usebutton.thirdparty.com.squareup.ObjectQueue;
import com.usebutton.thirdparty.com.squareup.QueueFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileObjectQueue<T> implements ObjectQueue<T> {
    private final DirectByteArrayOutputStream bytes = new DirectByteArrayOutputStream();
    /* access modifiers changed from: private */
    public final Converter<T> converter;
    private final File file;
    private ObjectQueue.Listener<T> listener;
    private final QueueFile queueFile;

    public interface Converter<T> {
        T from(byte[] bArr) throws IOException;

        void toStream(T t, OutputStream outputStream) throws IOException;
    }

    public static class DirectByteArrayOutputStream extends ByteArrayOutputStream {
        public byte[] getArray() {
            return this.buf;
        }
    }

    public FileObjectQueue(File file2, Converter<T> converter2) throws IOException {
        this.file = file2;
        this.converter = converter2;
        this.queueFile = new QueueFile(file2);
    }

    public final void add(T t) {
        try {
            this.bytes.reset();
            this.converter.toStream(t, this.bytes);
            this.queueFile.add(this.bytes.getArray(), 0, this.bytes.size());
            ObjectQueue.Listener<T> listener2 = this.listener;
            if (listener2 != null) {
                listener2.onAdd(this, t);
            }
        } catch (IOException e) {
            throw new FileException("Failed to add entry.", e, this.file);
        }
    }

    public List<T> asList() {
        return peek(size());
    }

    public final void close() {
        try {
            this.queueFile.close();
        } catch (IOException e) {
            throw new FileException("Failed to close.", e, this.file);
        }
    }

    public T peek() {
        try {
            byte[] peek = this.queueFile.peek();
            if (peek == null) {
                return null;
            }
            return this.converter.from(peek);
        } catch (IOException e) {
            throw new FileException("Failed to peek.", e, this.file);
        }
    }

    public final void remove() {
        try {
            this.queueFile.remove();
            ObjectQueue.Listener<T> listener2 = this.listener;
            if (listener2 != null) {
                listener2.onRemove(this);
            }
        } catch (IOException e) {
            throw new FileException("Failed to remove.", e, this.file);
        }
    }

    public void setListener(final ObjectQueue.Listener<T> listener2) {
        if (listener2 != null) {
            try {
                this.queueFile.forEach((QueueFile.ElementVisitor) new QueueFile.ElementVisitor() {
                    public boolean read(InputStream inputStream, int i) throws IOException {
                        byte[] bArr = new byte[i];
                        inputStream.read(bArr, 0, i);
                        ObjectQueue.Listener listener = listener2;
                        FileObjectQueue fileObjectQueue = FileObjectQueue.this;
                        listener.onAdd(fileObjectQueue, fileObjectQueue.converter.from(bArr));
                        return true;
                    }
                });
            } catch (IOException e) {
                throw new FileException("Unable to iterate over QueueFile contents.", e, this.file);
            }
        }
        this.listener = listener2;
    }

    public int size() {
        return this.queueFile.size();
    }

    public List<T> peek(final int i) {
        try {
            final ArrayList arrayList = new ArrayList(i);
            this.queueFile.forEach((QueueFile.ElementVisitor) new QueueFile.ElementVisitor() {
                public int count;

                public boolean read(InputStream inputStream, int i) throws IOException {
                    byte[] bArr = new byte[i];
                    inputStream.read(bArr, 0, i);
                    arrayList.add(FileObjectQueue.this.converter.from(bArr));
                    int i2 = this.count + 1;
                    this.count = i2;
                    if (i2 < i) {
                        return true;
                    }
                    return false;
                }
            });
            return Collections.unmodifiableList(arrayList);
        } catch (IOException e) {
            throw new FileException("Failed to peek.", e, this.file);
        }
    }

    public final void remove(int i) throws Exception {
        try {
            this.queueFile.remove(i);
            if (this.listener != null) {
                for (int i2 = 0; i2 < i; i2++) {
                    this.listener.onRemove(this);
                }
            }
        } catch (IOException e) {
            throw new FileException("Failed to remove.", e, this.file);
        }
    }
}
