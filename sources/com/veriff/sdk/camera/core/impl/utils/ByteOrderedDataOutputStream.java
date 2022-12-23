package com.veriff.sdk.camera.core.impl.utils;

import com.appboy.support.ValidationUtils;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    public final OutputStream mOutputStream;

    public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    public void write(byte[] bArr) throws IOException {
        this.mOutputStream.write(bArr);
    }

    public void writeByte(int i) throws IOException {
        this.mOutputStream.write(i);
    }

    public void writeInt(int i) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((i >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((i >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        }
    }

    public void writeShort(short s) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write((s >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((s >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((s >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.mOutputStream.write((s >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        }
    }

    public void writeUnsignedInt(long j) throws IOException {
        writeInt((int) j);
    }

    public void writeUnsignedShort(int i) throws IOException {
        writeShort((short) i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.mOutputStream.write(bArr, i, i2);
    }
}
