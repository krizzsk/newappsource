package rj0;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.p981xz.CorruptedInputException;
import org.tukaani.p981xz.XZIOException;
import wj0.C25241a;
import xj0.C25282b;
import yj0.C25329a;

/* renamed from: rj0.h */
public final class C24841h extends InputStream {

    /* renamed from: b */
    public DataInputStream f62787b;

    /* renamed from: c */
    public final C25241a f62788c;

    /* renamed from: d */
    public final C25329a f62789d = new C25329a();

    /* renamed from: e */
    public C25282b f62790e;

    /* renamed from: f */
    public int f62791f = 0;

    /* renamed from: g */
    public boolean f62792g;

    /* renamed from: h */
    public boolean f62793h = true;

    /* renamed from: i */
    public boolean f62794i = true;

    /* renamed from: j */
    public boolean f62795j = false;

    /* renamed from: k */
    public IOException f62796k = null;

    /* renamed from: l */
    public final byte[] f62797l = new byte[1];

    public C24841h(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f62787b = new DataInputStream(inputStream);
        this.f62788c = new C25241a(m62381f(i));
    }

    /* renamed from: f */
    public static int m62381f(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & -16;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Unsupported dictionary size ");
        stringBuffer.append(i);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public final int available() throws IOException {
        if (this.f62787b != null) {
            IOException iOException = this.f62796k;
            if (iOException == null) {
                return this.f62791f;
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    public final void close() throws IOException {
        DataInputStream dataInputStream = this.f62787b;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } finally {
                this.f62787b = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo61302e() throws IOException {
        int readUnsignedByte = this.f62787b.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f62795j = true;
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.f62794i = true;
            this.f62793h = false;
            C25241a aVar = this.f62788c;
            aVar.f63508b = 0;
            aVar.f63509c = 0;
            aVar.f63510d = 0;
            aVar.f63511e = 0;
            byte[] bArr = aVar.f63507a;
            bArr[bArr.length - 1] = 0;
        } else if (this.f62793h) {
            throw new CorruptedInputException();
        }
        if (readUnsignedByte >= 128) {
            this.f62792g = true;
            int i = (readUnsignedByte & 31) << 16;
            this.f62791f = i;
            this.f62791f = this.f62787b.readUnsignedShort() + 1 + i;
            int readUnsignedShort = this.f62787b.readUnsignedShort() + 1;
            if (readUnsignedByte >= 192) {
                this.f62794i = false;
                int readUnsignedByte2 = this.f62787b.readUnsignedByte();
                if (readUnsignedByte2 <= 224) {
                    int i2 = readUnsignedByte2 / 45;
                    int i3 = readUnsignedByte2 - ((i2 * 9) * 5);
                    int i4 = i3 / 9;
                    int i5 = i3 - (i4 * 9);
                    if (i5 + i4 <= 4) {
                        this.f62790e = new C25282b(this.f62788c, this.f62789d, i5, i4, i2);
                    } else {
                        throw new CorruptedInputException();
                    }
                } else {
                    throw new CorruptedInputException();
                }
            } else if (this.f62794i) {
                throw new CorruptedInputException();
            } else if (readUnsignedByte >= 160) {
                this.f62790e.mo61880a();
            }
            C25329a aVar2 = this.f62789d;
            DataInputStream dataInputStream = this.f62787b;
            aVar2.getClass();
            if (readUnsignedShort < 5) {
                throw new CorruptedInputException();
            } else if (dataInputStream.readUnsignedByte() == 0) {
                aVar2.f63632c = dataInputStream.readInt();
                aVar2.f63631b = -1;
                aVar2.f63634e = 0;
                int i6 = readUnsignedShort - 5;
                aVar2.f63635f = i6;
                dataInputStream.readFully(aVar2.f63633d, 0, i6);
            } else {
                throw new CorruptedInputException();
            }
        } else if (readUnsignedByte <= 2) {
            this.f62792g = false;
            this.f62791f = this.f62787b.readUnsignedShort() + 1;
        } else {
            throw new CorruptedInputException();
        }
    }

    public final int read() throws IOException {
        if (read(this.f62797l, 0, 1) == -1) {
            return -1;
        }
        return this.f62797l[0] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f62787b != null) {
                IOException iOException = this.f62796k;
                if (iOException != null) {
                    throw iOException;
                } else if (this.f62795j) {
                    return -1;
                } else {
                    int i4 = 0;
                    while (i2 > 0) {
                        try {
                            if (this.f62791f == 0) {
                                mo61302e();
                                if (this.f62795j) {
                                    if (i4 == 0) {
                                        return -1;
                                    }
                                    return i4;
                                }
                            }
                            int min = Math.min(this.f62791f, i2);
                            boolean z = true;
                            if (!this.f62792g) {
                                C25241a aVar = this.f62788c;
                                DataInputStream dataInputStream = this.f62787b;
                                int min2 = Math.min(aVar.f63507a.length - aVar.f63509c, min);
                                dataInputStream.readFully(aVar.f63507a, aVar.f63509c, min2);
                                int i5 = aVar.f63509c + min2;
                                aVar.f63509c = i5;
                                if (aVar.f63510d < i5) {
                                    aVar.f63510d = i5;
                                }
                            } else {
                                C25241a aVar2 = this.f62788c;
                                byte[] bArr2 = aVar2.f63507a;
                                int length = bArr2.length;
                                int i6 = aVar2.f63509c;
                                if (length - i6 <= min) {
                                    aVar2.f63511e = bArr2.length;
                                } else {
                                    aVar2.f63511e = i6 + min;
                                }
                                this.f62790e.mo61882b();
                                C25329a aVar3 = this.f62789d;
                                if (!(aVar3.f63634e <= aVar3.f63635f)) {
                                    throw new CorruptedInputException();
                                }
                            }
                            C25241a aVar4 = this.f62788c;
                            int i7 = aVar4.f63509c;
                            int i8 = aVar4.f63508b;
                            int i9 = i7 - i8;
                            byte[] bArr3 = aVar4.f63507a;
                            if (i7 == bArr3.length) {
                                aVar4.f63509c = 0;
                            }
                            System.arraycopy(bArr3, i8, bArr, i, i9);
                            aVar4.f63508b = aVar4.f63509c;
                            i += i9;
                            i2 -= i9;
                            i4 += i9;
                            int i11 = this.f62791f - i9;
                            this.f62791f = i11;
                            if (i11 == 0) {
                                C25329a aVar5 = this.f62789d;
                                if (aVar5.f63634e == aVar5.f63635f && aVar5.f63632c == 0) {
                                    if (this.f62788c.f63512f <= 0) {
                                        z = false;
                                    }
                                    if (!z) {
                                    }
                                }
                                throw new CorruptedInputException();
                            }
                        } catch (IOException e) {
                            this.f62796k = e;
                            throw e;
                        }
                    }
                    return i4;
                }
            } else {
                throw new XZIOException("Stream closed");
            }
        }
    }
}
