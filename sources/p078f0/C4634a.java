package p078f0;

import com.appboy.support.ValidationUtils;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: f0.a */
public final class C4634a extends FilterOutputStream {

    /* renamed from: b */
    public final OutputStream f15857b;

    /* renamed from: c */
    public ByteOrder f15858c;

    public C4634a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f15857b = outputStream;
        this.f15858c = byteOrder;
    }

    /* renamed from: a */
    public final void mo20156a(int i) throws IOException {
        ByteOrder byteOrder = this.f15858c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f15857b.write((i >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f15857b.write((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((i >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        }
    }

    /* renamed from: c */
    public final void mo20157c(short s) throws IOException {
        ByteOrder byteOrder = this.f15858c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f15857b.write((s >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((s >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f15857b.write((s >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.f15857b.write((s >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        }
    }

    public final void write(byte[] bArr) throws IOException {
        this.f15857b.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f15857b.write(bArr, i, i2);
    }
}
