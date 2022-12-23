package com.veriff.sdk.camera.core.impl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p001a0.C0016g;
import p358af.C13437d;

final class ExifAttribute {
    public static final Charset ASCII = StandardCharsets.US_ASCII;
    public static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public final byte[] bytes;
    public final int format;
    public final int numberOfComponents;

    public ExifAttribute(int i, int i2, byte[] bArr) {
        this(i, i2, -1, bArr);
    }

    public static ExifAttribute createByte(String str) {
        if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
            byte[] bytes2 = str.getBytes(ASCII);
            return new ExifAttribute(1, bytes2.length, bytes2);
        }
        return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
    }

    public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length)]);
        wrap.order(byteOrder);
        for (double putDouble : dArr) {
            wrap.putDouble(putDouble);
        }
        return new ExifAttribute(12, dArr.length, wrap.array());
    }

    public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length)]);
        wrap.order(byteOrder);
        for (int putInt : iArr) {
            wrap.putInt(putInt);
        }
        return new ExifAttribute(9, iArr.length, wrap.array());
    }

    public static ExifAttribute createSRational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length)]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(10, longRationalArr.length, wrap.array());
    }

    public static ExifAttribute createString(String str) {
        byte[] bytes2 = C0016g.m28k(str, 0).getBytes(ASCII);
        return new ExifAttribute(2, bytes2.length, bytes2);
    }

    public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new ExifAttribute(4, jArr.length, wrap.array());
    }

    public static ExifAttribute createURational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length)]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(5, longRationalArr.length, wrap.array());
    }

    public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length)]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new ExifAttribute(3, iArr.length, wrap.array());
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("(");
        k.append(IFD_FORMAT_NAMES[this.format]);
        k.append(", data length:");
        return C13437d.m33707l(k, this.bytes.length, ")");
    }

    public ExifAttribute(int i, int i2, long j, byte[] bArr) {
        this.format = i;
        this.numberOfComponents = i2;
        this.bytes = bArr;
    }

    public static ExifAttribute createULong(long j, ByteOrder byteOrder) {
        return createULong(new long[]{j}, byteOrder);
    }
}
