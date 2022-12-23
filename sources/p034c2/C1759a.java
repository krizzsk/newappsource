package p034c2;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.ValidationUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p001a0.C0016g;
import p034c2.C1767b;
import p358af.C13437d;
import p988j$.util.DesugarTimeZone;

/* renamed from: c2.a */
public final class C1759a {

    /* renamed from: A */
    public static final byte[] f6164A = {109, 105, 102, 49};

    /* renamed from: B */
    public static final byte[] f6165B = {104, 101, 105, 99};

    /* renamed from: C */
    public static final byte[] f6166C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D */
    public static final byte[] f6167D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E */
    public static final byte[] f6168E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F */
    public static final byte[] f6169F = {101, 88, 73, 102};

    /* renamed from: G */
    public static final byte[] f6170G = {73, 72, 68, 82};

    /* renamed from: H */
    public static final byte[] f6171H = {73, 69, 78, 68};

    /* renamed from: I */
    public static final byte[] f6172I = {82, 73, 70, 70};

    /* renamed from: J */
    public static final byte[] f6173J = {87, 69, 66, 80};

    /* renamed from: K */
    public static final byte[] f6174K = {69, 88, 73, 70};

    /* renamed from: L */
    public static final byte[] f6175L = {-99, 1, 42};

    /* renamed from: M */
    public static final byte[] f6176M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N */
    public static final byte[] f6177N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O */
    public static final byte[] f6178O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P */
    public static final byte[] f6179P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f6180Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    public static final String[] f6181R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: S */
    public static final int[] f6182S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: T */
    public static final byte[] f6183T = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: U */
    public static final C1764e f6184U = new C1764e("StripOffsets", 273, 3);

    /* renamed from: V */
    public static final C1764e[][] f6185V;

    /* renamed from: W */
    public static final C1764e[] f6186W = {new C1764e("SubIFDPointer", 330, 4), new C1764e("ExifIFDPointer", 34665, 4), new C1764e("GPSInfoIFDPointer", 34853, 4), new C1764e("InteroperabilityIFDPointer", 40965, 4), new C1764e("CameraSettingsIFDPointer", 8224, 1), new C1764e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: X */
    public static final HashMap<Integer, C1764e>[] f6187X = new HashMap[10];

    /* renamed from: Y */
    public static final HashMap<String, C1764e>[] f6188Y = new HashMap[10];

    /* renamed from: Z */
    public static final HashSet<String> f6189Z = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: a0 */
    public static final HashMap<Integer, Integer> f6190a0 = new HashMap<>();

    /* renamed from: b0 */
    public static final Charset f6191b0;

    /* renamed from: c0 */
    public static final byte[] f6192c0;

    /* renamed from: d0 */
    public static final byte[] f6193d0;

    /* renamed from: e0 */
    public static final Pattern f6194e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: f0 */
    public static final Pattern f6195f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: g0 */
    public static final Pattern f6196g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: t */
    public static final boolean f6197t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u */
    public static final List<Integer> f6198u = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: v */
    public static final List<Integer> f6199v = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: w */
    public static final int[] f6200w = {8, 8, 8};

    /* renamed from: x */
    public static final int[] f6201x = {8};

    /* renamed from: y */
    public static final byte[] f6202y = {-1, -40, -1};

    /* renamed from: z */
    public static final byte[] f6203z = {102, 116, 121, 112};

    /* renamed from: a */
    public String f6204a;

    /* renamed from: b */
    public FileDescriptor f6205b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f6206c;

    /* renamed from: d */
    public int f6207d;

    /* renamed from: e */
    public final HashMap<String, C1763d>[] f6208e;

    /* renamed from: f */
    public HashSet f6209f;

    /* renamed from: g */
    public ByteOrder f6210g = ByteOrder.BIG_ENDIAN;

    /* renamed from: h */
    public boolean f6211h;

    /* renamed from: i */
    public boolean f6212i;

    /* renamed from: j */
    public boolean f6213j;

    /* renamed from: k */
    public int f6214k;

    /* renamed from: l */
    public int f6215l;

    /* renamed from: m */
    public byte[] f6216m;

    /* renamed from: n */
    public int f6217n;

    /* renamed from: o */
    public int f6218o;

    /* renamed from: p */
    public int f6219p;

    /* renamed from: q */
    public int f6220q;

    /* renamed from: r */
    public int f6221r;

    /* renamed from: s */
    public boolean f6222s;

    /* renamed from: c2.a$a */
    public class C1760a extends MediaDataSource {

        /* renamed from: b */
        public long f6223b;

        /* renamed from: c */
        public final /* synthetic */ C1766g f6224c;

        public C1760a(C1766g gVar) {
            this.f6224c = gVar;
        }

        public final void close() throws IOException {
        }

        public final long getSize() throws IOException {
            return -1;
        }

        public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f6223b;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f6224c.available())) {
                        return -1;
                    }
                    this.f6224c.mo6587c(j);
                    this.f6223b = j;
                }
                if (i2 > this.f6224c.available()) {
                    i2 = this.f6224c.available();
                }
                int read = this.f6224c.read(bArr, i, i2);
                if (read >= 0) {
                    this.f6223b += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f6223b = -1;
            return -1;
        }
    }

    /* renamed from: c2.a$b */
    public static class C1761b extends InputStream implements DataInput {

        /* renamed from: f */
        public static final ByteOrder f6225f = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: g */
        public static final ByteOrder f6226g = ByteOrder.BIG_ENDIAN;

        /* renamed from: b */
        public final DataInputStream f6227b;

        /* renamed from: c */
        public ByteOrder f6228c;

        /* renamed from: d */
        public int f6229d;

        /* renamed from: e */
        public byte[] f6230e;

        public C1761b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public final void mo6555a(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f6227b.skip((long) i3);
                if (skip <= 0) {
                    if (this.f6230e == null) {
                        this.f6230e = new byte[8192];
                    }
                    skip = this.f6227b.read(this.f6230e, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException(C25541a.m63878h("Reached EOF while skipping ", i, " bytes."));
                    }
                }
                i2 += skip;
            }
            this.f6229d += i2;
        }

        public final int available() throws IOException {
            return this.f6227b.available();
        }

        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public final int read() throws IOException {
            this.f6229d++;
            return this.f6227b.read();
        }

        public final boolean readBoolean() throws IOException {
            this.f6229d++;
            return this.f6227b.readBoolean();
        }

        public final byte readByte() throws IOException {
            this.f6229d++;
            int read = this.f6227b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public final char readChar() throws IOException {
            this.f6229d += 2;
            return this.f6227b.readChar();
        }

        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f6229d += i2;
            this.f6227b.readFully(bArr, i, i2);
        }

        public final int readInt() throws IOException {
            this.f6229d += 4;
            int read = this.f6227b.read();
            int read2 = this.f6227b.read();
            int read3 = this.f6227b.read();
            int read4 = this.f6227b.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f6228c;
                if (byteOrder == f6225f) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f6226g) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                StringBuilder k = C13555b.m33972k("Invalid byte order: ");
                k.append(this.f6228c);
                throw new IOException(k.toString());
            }
            throw new EOFException();
        }

        public final String readLine() throws IOException {
            return null;
        }

        public final long readLong() throws IOException {
            this.f6229d += 8;
            int read = this.f6227b.read();
            int read2 = this.f6227b.read();
            int read3 = this.f6227b.read();
            int read4 = this.f6227b.read();
            int read5 = this.f6227b.read();
            int read6 = this.f6227b.read();
            int read7 = this.f6227b.read();
            int read8 = this.f6227b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f6228c;
                if (byteOrder == f6225f) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                if (byteOrder == f6226g) {
                    return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                StringBuilder k = C13555b.m33972k("Invalid byte order: ");
                k.append(this.f6228c);
                throw new IOException(k.toString());
            }
            throw new EOFException();
        }

        public final short readShort() throws IOException {
            this.f6229d += 2;
            int read = this.f6227b.read();
            int read2 = this.f6227b.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f6228c;
                if (byteOrder == f6225f) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f6226g) {
                    return (short) ((read << 8) + read2);
                }
                StringBuilder k = C13555b.m33972k("Invalid byte order: ");
                k.append(this.f6228c);
                throw new IOException(k.toString());
            }
            throw new EOFException();
        }

        public final String readUTF() throws IOException {
            this.f6229d += 2;
            return this.f6227b.readUTF();
        }

        public final int readUnsignedByte() throws IOException {
            this.f6229d++;
            return this.f6227b.readUnsignedByte();
        }

        public final int readUnsignedShort() throws IOException {
            this.f6229d += 2;
            int read = this.f6227b.read();
            int read2 = this.f6227b.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f6228c;
                if (byteOrder == f6225f) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f6226g) {
                    return (read << 8) + read2;
                }
                StringBuilder k = C13555b.m33972k("Invalid byte order: ");
                k.append(this.f6228c);
                throw new IOException(k.toString());
            }
            throw new EOFException();
        }

        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public final int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public C1761b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C1761b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f6228c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f6227b = dataInputStream;
            dataInputStream.mark(0);
            this.f6229d = 0;
            this.f6228c = byteOrder;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f6227b.read(bArr, i, i2);
            this.f6229d += read;
            return read;
        }

        public final void readFully(byte[] bArr) throws IOException {
            this.f6229d += bArr.length;
            this.f6227b.readFully(bArr);
        }
    }

    /* renamed from: c2.a$c */
    public static class C1762c extends FilterOutputStream {

        /* renamed from: b */
        public final OutputStream f6231b;

        /* renamed from: c */
        public ByteOrder f6232c;

        public C1762c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f6231b = outputStream;
            this.f6232c = byteOrder;
        }

        /* renamed from: a */
        public final void mo6576a(int i) throws IOException {
            this.f6231b.write(i);
        }

        /* renamed from: c */
        public final void mo6577c(int i) throws IOException {
            ByteOrder byteOrder = this.f6232c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f6231b.write((i >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f6231b.write((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((i >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            }
        }

        /* renamed from: e */
        public final void mo6578e(short s) throws IOException {
            ByteOrder byteOrder = this.f6232c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f6231b.write((s >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((s >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f6231b.write((s >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f6231b.write((s >>> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            }
        }

        public final void write(byte[] bArr) throws IOException {
            this.f6231b.write(bArr);
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f6231b.write(bArr, i, i2);
        }
    }

    /* renamed from: c2.a$d */
    public static class C1763d {

        /* renamed from: a */
        public final int f6233a;

        /* renamed from: b */
        public final int f6234b;

        /* renamed from: c */
        public final long f6235c;

        /* renamed from: d */
        public final byte[] f6236d;

        public C1763d(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        /* renamed from: a */
        public static C1763d m5053a(String str) {
            byte[] bytes = C0016g.m28k(str, 0).getBytes(C1759a.f6191b0);
            return new C1763d(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C1763d m5054b(long j, ByteOrder byteOrder) {
            return m5055c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C1763d m5055c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1759a.f6182S[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C1763d(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C1763d m5056d(C1765f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1759a.f6182S[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (C1765f fVar : fVarArr) {
                wrap.putInt((int) fVar.f6241a);
                wrap.putInt((int) fVar.f6242b);
            }
            return new C1763d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static C1763d m5057e(int i, ByteOrder byteOrder) {
            return m5058f(new int[]{i}, byteOrder);
        }

        /* renamed from: f */
        public static C1763d m5058f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C1759a.f6182S[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C1763d(3, iArr.length, wrap.array());
        }

        /* renamed from: g */
        public final double mo6581g(ByteOrder byteOrder) {
            Serializable j = mo6584j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (j instanceof String) {
                return Double.parseDouble((String) j);
            } else {
                if (j instanceof long[]) {
                    long[] jArr = (long[]) j;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof int[]) {
                    int[] iArr = (int[]) j;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof double[]) {
                    double[] dArr = (double[]) j;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof C1765f[]) {
                    C1765f[] fVarArr = (C1765f[]) j;
                    if (fVarArr.length == 1) {
                        C1765f fVar = fVarArr[0];
                        return ((double) fVar.f6241a) / ((double) fVar.f6242b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: h */
        public final int mo6582h(ByteOrder byteOrder) {
            Serializable j = mo6584j(byteOrder);
            if (j == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (j instanceof String) {
                return Integer.parseInt((String) j);
            } else {
                if (j instanceof long[]) {
                    long[] jArr = (long[]) j;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (j instanceof int[]) {
                    int[] iArr = (int[]) j;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: i */
        public final String mo6583i(ByteOrder byteOrder) {
            Serializable j = mo6584j(byteOrder);
            if (j == null) {
                return null;
            }
            if (j instanceof String) {
                return (String) j;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (j instanceof long[]) {
                long[] jArr = (long[]) j;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                }
                return sb.toString();
            } else if (j instanceof int[]) {
                int[] iArr = (int[]) j;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                }
                return sb.toString();
            } else if (j instanceof double[]) {
                double[] dArr = (double[]) j;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                }
                return sb.toString();
            } else if (!(j instanceof C1765f[])) {
                return null;
            } else {
                C1765f[] fVarArr = (C1765f[]) j;
                while (i < fVarArr.length) {
                    sb.append(fVarArr[i].f6241a);
                    sb.append('/');
                    sb.append(fVarArr[i].f6242b);
                    i++;
                    if (i != fVarArr.length) {
                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: type inference failed for: r11v14, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v16, types: [long[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v18, types: [c2.a$f[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v20, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v22, types: [int[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v24, types: [c2.a$f[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v26, types: [double[], java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r11v28, types: [double[], java.io.Serializable] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0154 A[SYNTHETIC, Splitter:B:140:0x0154] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x015c A[SYNTHETIC, Splitter:B:147:0x015c] */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.Serializable mo6584j(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                r0 = 0
                c2.a$b r1 = new c2.a$b     // Catch:{ IOException -> 0x0158, all -> 0x0151 }
                byte[] r2 = r10.f6236d     // Catch:{ IOException -> 0x0158, all -> 0x0151 }
                r1.<init>((byte[]) r2)     // Catch:{ IOException -> 0x0158, all -> 0x0151 }
                r1.f6228c = r11     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r11 = r10.f6233a     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
                r4 = 0
                r5 = 1
                switch(r11) {
                    case 1: goto L_0x0124;
                    case 2: goto L_0x00de;
                    case 3: goto L_0x00c9;
                    case 4: goto L_0x00b2;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0124;
                    case 7: goto L_0x00de;
                    case 8: goto L_0x0078;
                    case 9: goto L_0x0063;
                    case 10: goto L_0x0043;
                    case 11: goto L_0x002d;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0016:
                goto L_0x014a
            L_0x0018:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x001c:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x0029
                double r2 = r1.readDouble()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x001c
            L_0x0029:
                r1.close()     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                return r11
            L_0x002d:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0031:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x003f
                float r2 = r1.readFloat()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                double r2 = (double) r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x0031
            L_0x003f:
                r1.close()     // Catch:{ IOException -> 0x0042 }
            L_0x0042:
                return r11
            L_0x0043:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                c2.a$f[] r11 = new p034c2.C1759a.C1765f[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0047:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x005f
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r2 = (long) r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r5 = (long) r5     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                c2.a$f r7 = new c2.a$f     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r7.<init>(r2, r5)     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r7     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x0047
            L_0x005f:
                r1.close()     // Catch:{ IOException -> 0x0062 }
            L_0x0062:
                return r11
            L_0x0063:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0067:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x0074
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x0067
            L_0x0074:
                r1.close()     // Catch:{ IOException -> 0x0077 }
            L_0x0077:
                return r11
            L_0x0078:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x007c:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x0089
                short r2 = r1.readShort()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x007c
            L_0x0089:
                r1.close()     // Catch:{ IOException -> 0x008c }
            L_0x008c:
                return r11
            L_0x008d:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                c2.a$f[] r11 = new p034c2.C1759a.C1765f[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0091:
                int r5 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r5) goto L_0x00ae
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r5 = (long) r5     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r5 = r5 & r2
                int r7 = r1.readInt()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r7 = (long) r7     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r7 = r7 & r2
                c2.a$f r9 = new c2.a$f     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r9.<init>(r5, r7)     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r9     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x0091
            L_0x00ab:
                goto L_0x015a
            L_0x00ae:
                r1.close()     // Catch:{ IOException -> 0x00b1 }
            L_0x00b1:
                return r11
            L_0x00b2:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x00b6:
                int r5 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r5) goto L_0x00c5
                int r5 = r1.readInt()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r5 = (long) r5     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                long r5 = r5 & r2
                r11[r4] = r5     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x00b6
            L_0x00c5:
                r1.close()     // Catch:{ IOException -> 0x00c8 }
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x00cd:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x00da
                int r2 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11[r4] = r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r4 = r4 + 1
                goto L_0x00cd
            L_0x00da:
                r1.close()     // Catch:{ IOException -> 0x00dd }
            L_0x00dd:
                return r11
            L_0x00de:
                int r11 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                byte[] r2 = p034c2.C1759a.f6183T     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r2 = r2.length     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r11 < r2) goto L_0x00fb
                r11 = 0
            L_0x00e6:
                byte[] r2 = p034c2.C1759a.f6183T     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r3 = r2.length     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r11 >= r3) goto L_0x00f8
                byte[] r3 = r10.f6236d     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                byte r3 = r3[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                byte r6 = r2[r11]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r3 == r6) goto L_0x00f5
                r5 = 0
                goto L_0x00f8
            L_0x00f5:
                int r11 = r11 + 1
                goto L_0x00e6
            L_0x00f8:
                if (r5 == 0) goto L_0x00fb
                int r4 = r2.length     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x00fb:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11.<init>()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0100:
                int r2 = r10.f6234b     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r4 >= r2) goto L_0x011c
                byte[] r2 = r10.f6236d     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                byte r2 = r2[r4]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r2 != 0) goto L_0x010b
                goto L_0x011c
            L_0x010b:
                r3 = 32
                if (r2 < r3) goto L_0x0114
                char r2 = (char) r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11.append(r2)     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                goto L_0x0119
            L_0x0114:
                r2 = 63
                r11.append(r2)     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
            L_0x0119:
                int r4 = r4 + 1
                goto L_0x0100
            L_0x011c:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r1.close()     // Catch:{ IOException -> 0x0123 }
            L_0x0123:
                return r11
            L_0x0124:
                byte[] r11 = r10.f6236d     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r2 = r11.length     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r2 != r5) goto L_0x013f
                byte r2 = r11[r4]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                if (r2 < 0) goto L_0x013f
                if (r2 > r5) goto L_0x013f
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                char[] r3 = new char[r5]     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                int r2 = r2 + 48
                char r2 = (char) r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r3[r4] = r2     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r11.<init>(r3)     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r1.close()     // Catch:{ IOException -> 0x013e }
            L_0x013e:
                return r11
            L_0x013f:
                java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                java.nio.charset.Charset r3 = p034c2.C1759a.f6191b0     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r2.<init>(r11, r3)     // Catch:{ IOException -> 0x00ab, all -> 0x014e }
                r1.close()     // Catch:{ IOException -> 0x0149 }
            L_0x0149:
                return r2
            L_0x014a:
                r1.close()     // Catch:{ IOException -> 0x014d }
            L_0x014d:
                return r0
            L_0x014e:
                r11 = move-exception
                r0 = r1
                goto L_0x0152
            L_0x0151:
                r11 = move-exception
            L_0x0152:
                if (r0 == 0) goto L_0x0157
                r0.close()     // Catch:{ IOException -> 0x0157 }
            L_0x0157:
                throw r11
            L_0x0158:
                r1 = r0
            L_0x015a:
                if (r1 == 0) goto L_0x015f
                r1.close()     // Catch:{ IOException -> 0x015f }
            L_0x015f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.C1763d.mo6584j(java.nio.ByteOrder):java.io.Serializable");
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("(");
            k.append(C1759a.f6181R[this.f6233a]);
            k.append(", data length:");
            return C13437d.m33707l(k, this.f6236d.length, ")");
        }

        public C1763d(int i, int i2, long j, byte[] bArr) {
            this.f6233a = i;
            this.f6234b = i2;
            this.f6235c = j;
            this.f6236d = bArr;
        }
    }

    /* renamed from: c2.a$f */
    public static class C1765f {

        /* renamed from: a */
        public final long f6241a;

        /* renamed from: b */
        public final long f6242b;

        public C1765f(long j, long j2) {
            if (j2 == 0) {
                this.f6241a = 0;
                this.f6242b = 1;
                return;
            }
            this.f6241a = j;
            this.f6242b = j2;
        }

        public final String toString() {
            return this.f6241a + "/" + this.f6242b;
        }
    }

    static {
        C1764e[] eVarArr = {new C1764e("NewSubfileType", 254, 4), new C1764e("SubfileType", ValidationUtils.APPBOY_STRING_MAX_LENGTH, 4), new C1764e("ImageWidth", 256, 3, 4), new C1764e("ImageLength", 257, 3, 4), new C1764e("BitsPerSample", 258, 3), new C1764e("Compression", 259, 3), new C1764e("PhotometricInterpretation", 262, 3), new C1764e("ImageDescription", 270, 2), new C1764e("Make", 271, 2), new C1764e("Model", 272, 2), new C1764e("StripOffsets", 273, 3, 4), new C1764e("Orientation", 274, 3), new C1764e("SamplesPerPixel", 277, 3), new C1764e("RowsPerStrip", 278, 3, 4), new C1764e("StripByteCounts", 279, 3, 4), new C1764e("XResolution", 282, 5), new C1764e("YResolution", 283, 5), new C1764e("PlanarConfiguration", 284, 3), new C1764e("ResolutionUnit", 296, 3), new C1764e("TransferFunction", 301, 3), new C1764e("Software", 305, 2), new C1764e("DateTime", 306, 2), new C1764e("Artist", 315, 2), new C1764e("WhitePoint", 318, 5), new C1764e("PrimaryChromaticities", 319, 5), new C1764e("SubIFDPointer", 330, 4), new C1764e("JPEGInterchangeFormat", 513, 4), new C1764e("JPEGInterchangeFormatLength", 514, 4), new C1764e("YCbCrCoefficients", 529, 5), new C1764e("YCbCrSubSampling", 530, 3), new C1764e("YCbCrPositioning", 531, 3), new C1764e("ReferenceBlackWhite", 532, 5), new C1764e("Copyright", 33432, 2), new C1764e("ExifIFDPointer", 34665, 4), new C1764e("GPSInfoIFDPointer", 34853, 4), new C1764e("SensorTopBorder", 4, 4), new C1764e("SensorLeftBorder", 5, 4), new C1764e("SensorBottomBorder", 6, 4), new C1764e("SensorRightBorder", 7, 4), new C1764e("ISO", 23, 3), new C1764e("JpgFromRaw", 46, 7), new C1764e("Xmp", 700, 1)};
        f6185V = new C1764e[][]{eVarArr, new C1764e[]{new C1764e("ExposureTime", 33434, 5), new C1764e("FNumber", 33437, 5), new C1764e("ExposureProgram", 34850, 3), new C1764e("SpectralSensitivity", 34852, 2), new C1764e("PhotographicSensitivity", 34855, 3), new C1764e("OECF", 34856, 7), new C1764e("SensitivityType", 34864, 3), new C1764e("StandardOutputSensitivity", 34865, 4), new C1764e("RecommendedExposureIndex", 34866, 4), new C1764e("ISOSpeed", 34867, 4), new C1764e("ISOSpeedLatitudeyyy", 34868, 4), new C1764e("ISOSpeedLatitudezzz", 34869, 4), new C1764e("ExifVersion", 36864, 2), new C1764e("DateTimeOriginal", 36867, 2), new C1764e("DateTimeDigitized", 36868, 2), new C1764e("OffsetTime", 36880, 2), new C1764e("OffsetTimeOriginal", 36881, 2), new C1764e("OffsetTimeDigitized", 36882, 2), new C1764e("ComponentsConfiguration", 37121, 7), new C1764e("CompressedBitsPerPixel", 37122, 5), new C1764e("ShutterSpeedValue", 37377, 10), new C1764e("ApertureValue", 37378, 5), new C1764e("BrightnessValue", 37379, 10), new C1764e("ExposureBiasValue", 37380, 10), new C1764e("MaxApertureValue", 37381, 5), new C1764e("SubjectDistance", 37382, 5), new C1764e("MeteringMode", 37383, 3), new C1764e("LightSource", 37384, 3), new C1764e("Flash", 37385, 3), new C1764e("FocalLength", 37386, 5), new C1764e("SubjectArea", 37396, 3), new C1764e("MakerNote", 37500, 7), new C1764e("UserComment", 37510, 7), new C1764e("SubSecTime", 37520, 2), new C1764e("SubSecTimeOriginal", 37521, 2), new C1764e("SubSecTimeDigitized", 37522, 2), new C1764e("FlashpixVersion", 40960, 7), new C1764e("ColorSpace", 40961, 3), new C1764e("PixelXDimension", 40962, 3, 4), new C1764e("PixelYDimension", 40963, 3, 4), new C1764e("RelatedSoundFile", 40964, 2), new C1764e("InteroperabilityIFDPointer", 40965, 4), new C1764e("FlashEnergy", 41483, 5), new C1764e("SpatialFrequencyResponse", 41484, 7), new C1764e("FocalPlaneXResolution", 41486, 5), new C1764e("FocalPlaneYResolution", 41487, 5), new C1764e("FocalPlaneResolutionUnit", 41488, 3), new C1764e("SubjectLocation", 41492, 3), new C1764e("ExposureIndex", 41493, 5), new C1764e("SensingMethod", 41495, 3), new C1764e("FileSource", 41728, 7), new C1764e("SceneType", 41729, 7), new C1764e("CFAPattern", 41730, 7), new C1764e("CustomRendered", 41985, 3), new C1764e("ExposureMode", 41986, 3), new C1764e("WhiteBalance", 41987, 3), new C1764e("DigitalZoomRatio", 41988, 5), new C1764e("FocalLengthIn35mmFilm", 41989, 3), new C1764e("SceneCaptureType", 41990, 3), new C1764e("GainControl", 41991, 3), new C1764e("Contrast", 41992, 3), new C1764e("Saturation", 41993, 3), new C1764e("Sharpness", 41994, 3), new C1764e("DeviceSettingDescription", 41995, 7), new C1764e("SubjectDistanceRange", 41996, 3), new C1764e("ImageUniqueID", 42016, 2), new C1764e("CameraOwnerName", 42032, 2), new C1764e("BodySerialNumber", 42033, 2), new C1764e("LensSpecification", 42034, 5), new C1764e("LensMake", 42035, 2), new C1764e("LensModel", 42036, 2), new C1764e("Gamma", 42240, 5), new C1764e("DNGVersion", 50706, 1), new C1764e("DefaultCropSize", 50720, 3, 4)}, new C1764e[]{new C1764e("GPSVersionID", 0, 1), new C1764e("GPSLatitudeRef", 1, 2), new C1764e("GPSLatitude", 2, 5, 10), new C1764e("GPSLongitudeRef", 3, 2), new C1764e("GPSLongitude", 4, 5, 10), new C1764e("GPSAltitudeRef", 5, 1), new C1764e("GPSAltitude", 6, 5), new C1764e("GPSTimeStamp", 7, 5), new C1764e("GPSSatellites", 8, 2), new C1764e("GPSStatus", 9, 2), new C1764e("GPSMeasureMode", 10, 2), new C1764e("GPSDOP", 11, 5), new C1764e("GPSSpeedRef", 12, 2), new C1764e("GPSSpeed", 13, 5), new C1764e("GPSTrackRef", 14, 2), new C1764e("GPSTrack", 15, 5), new C1764e("GPSImgDirectionRef", 16, 2), new C1764e("GPSImgDirection", 17, 5), new C1764e("GPSMapDatum", 18, 2), new C1764e("GPSDestLatitudeRef", 19, 2), new C1764e("GPSDestLatitude", 20, 5), new C1764e("GPSDestLongitudeRef", 21, 2), new C1764e("GPSDestLongitude", 22, 5), new C1764e("GPSDestBearingRef", 23, 2), new C1764e("GPSDestBearing", 24, 5), new C1764e("GPSDestDistanceRef", 25, 2), new C1764e("GPSDestDistance", 26, 5), new C1764e("GPSProcessingMethod", 27, 7), new C1764e("GPSAreaInformation", 28, 7), new C1764e("GPSDateStamp", 29, 2), new C1764e("GPSDifferential", 30, 3), new C1764e("GPSHPositioningError", 31, 5)}, new C1764e[]{new C1764e("InteroperabilityIndex", 1, 2)}, new C1764e[]{new C1764e("NewSubfileType", 254, 4), new C1764e("SubfileType", ValidationUtils.APPBOY_STRING_MAX_LENGTH, 4), new C1764e("ThumbnailImageWidth", 256, 3, 4), new C1764e("ThumbnailImageLength", 257, 3, 4), new C1764e("BitsPerSample", 258, 3), new C1764e("Compression", 259, 3), new C1764e("PhotometricInterpretation", 262, 3), new C1764e("ImageDescription", 270, 2), new C1764e("Make", 271, 2), new C1764e("Model", 272, 2), new C1764e("StripOffsets", 273, 3, 4), new C1764e("ThumbnailOrientation", 274, 3), new C1764e("SamplesPerPixel", 277, 3), new C1764e("RowsPerStrip", 278, 3, 4), new C1764e("StripByteCounts", 279, 3, 4), new C1764e("XResolution", 282, 5), new C1764e("YResolution", 283, 5), new C1764e("PlanarConfiguration", 284, 3), new C1764e("ResolutionUnit", 296, 3), new C1764e("TransferFunction", 301, 3), new C1764e("Software", 305, 2), new C1764e("DateTime", 306, 2), new C1764e("Artist", 315, 2), new C1764e("WhitePoint", 318, 5), new C1764e("PrimaryChromaticities", 319, 5), new C1764e("SubIFDPointer", 330, 4), new C1764e("JPEGInterchangeFormat", 513, 4), new C1764e("JPEGInterchangeFormatLength", 514, 4), new C1764e("YCbCrCoefficients", 529, 5), new C1764e("YCbCrSubSampling", 530, 3), new C1764e("YCbCrPositioning", 531, 3), new C1764e("ReferenceBlackWhite", 532, 5), new C1764e("Copyright", 33432, 2), new C1764e("ExifIFDPointer", 34665, 4), new C1764e("GPSInfoIFDPointer", 34853, 4), new C1764e("DNGVersion", 50706, 1), new C1764e("DefaultCropSize", 50720, 3, 4)}, eVarArr, new C1764e[]{new C1764e("ThumbnailImage", 256, 7), new C1764e("CameraSettingsIFDPointer", 8224, 4), new C1764e("ImageProcessingIFDPointer", 8256, 4)}, new C1764e[]{new C1764e("PreviewImageStart", 257, 4), new C1764e("PreviewImageLength", 258, 4)}, new C1764e[]{new C1764e("AspectFrame", 4371, 3)}, new C1764e[]{new C1764e("ColorSpace", 55, 3)}};
        Charset forName = Charset.forName("US-ASCII");
        f6191b0 = forName;
        f6192c0 = "Exif\u0000\u0000".getBytes(forName);
        f6193d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1764e[][] eVarArr2 = f6185V;
            if (i < eVarArr2.length) {
                f6187X[i] = new HashMap<>();
                f6188Y[i] = new HashMap<>();
                for (C1764e eVar : eVarArr2[i]) {
                    f6187X[i].put(Integer.valueOf(eVar.f6237a), eVar);
                    f6188Y[i].put(eVar.f6238b, eVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f6190a0;
                C1764e[] eVarArr3 = f6186W;
                hashMap.put(Integer.valueOf(eVarArr3[0].f6237a), 5);
                hashMap.put(Integer.valueOf(eVarArr3[1].f6237a), 1);
                hashMap.put(Integer.valueOf(eVarArr3[2].f6237a), 2);
                hashMap.put(Integer.valueOf(eVarArr3[3].f6237a), 3);
                hashMap.put(Integer.valueOf(eVarArr3[4].f6237a), 7);
                hashMap.put(Integer.valueOf(eVarArr3[5].f6237a), 8);
                Pattern.compile(".*[1-9].*");
                return;
            }
        }
    }

    public C1759a(String str) throws IOException {
        boolean z;
        C1764e[][] eVarArr = f6185V;
        this.f6208e = new HashMap[eVarArr.length];
        this.f6209f = new HashSet(eVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f6206c = null;
            this.f6204a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        C1767b.C1768a.m5071c(fileInputStream2.getFD(), 0, OsConstants.SEEK_CUR);
                        z = true;
                    } catch (Exception unused) {
                        z = false;
                    }
                    if (z) {
                        this.f6205b = fileInputStream2.getFD();
                    } else {
                        this.f6205b = null;
                    }
                    mo6549w(fileInputStream2);
                    C1767b.m5065b(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    C1767b.m5065b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C1767b.m5065b(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: b */
    public static double m5009b(String str, String str2) {
        try {
            String[] split = str.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble2;
                }
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m5010c(C1761b bVar, C1762c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder k = C13555b.m33972k("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f6191b0;
                k.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    StringBuilder k2 = C13555b.m33972k(" or ");
                    k2.append(new String(bArr2, charset));
                    str = k2.toString();
                }
                k.append(str);
                throw new IOException(k.toString());
            }
            int readInt = bVar.readInt();
            cVar.write(bArr3);
            cVar.mo6577c(readInt);
            if (readInt % 2 == 1) {
                readInt++;
            }
            C1767b.m5067d(bVar, cVar, readInt);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m5011t(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = m5011t(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = m5011t(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = -1
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = -1
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r1)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.m5011t(java.lang.String):android.util.Pair");
    }

    /* renamed from: z */
    public static ByteOrder m5012z(C1761b bVar) throws IOException {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder k = C13555b.m33972k("Invalid byte order: ");
        k.append(Integer.toHexString(readShort));
        throw new IOException(k.toString());
    }

    /* renamed from: A */
    public final void mo6516A(int i, byte[] bArr) throws IOException {
        C1766g gVar = new C1766g(bArr);
        mo6550x(gVar);
        mo6517B(gVar, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0190  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6517B(p034c2.C1759a.C1766g r24, int r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.HashSet r3 = r0.f6209f
            int r4 = r1.f6229d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r24.readShort()
            if (r3 > 0) goto L_0x0018
            return
        L_0x0018:
            r4 = 0
            r5 = 0
        L_0x001a:
            r6 = 5
            r10 = 1
            if (r5 >= r3) goto L_0x0243
            int r11 = r24.readUnsignedShort()
            int r12 = r24.readUnsignedShort()
            int r15 = r24.readInt()
            int r13 = r1.f6229d
            long r13 = (long) r13
            r16 = 4
            long r13 = r13 + r16
            java.util.HashMap<java.lang.Integer, c2.a$e>[] r18 = f6187X
            r7 = r18[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            java.lang.Object r7 = r7.get(r8)
            c2.a$e r7 = (p034c2.C1759a.C1764e) r7
            boolean r8 = f6197t
            r9 = 3
            if (r8 == 0) goto L_0x006f
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r25)
            r6[r4] = r20
            java.lang.Integer r20 = java.lang.Integer.valueOf(r11)
            r6[r10] = r20
            if (r7 == 0) goto L_0x0057
            java.lang.String r10 = r7.f6238b
            goto L_0x0058
        L_0x0057:
            r10 = 0
        L_0x0058:
            r19 = 2
            r6[r19] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r6[r9] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r18 = 4
            r6[r18] = r10
            java.lang.String r10 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String.format(r10, r6)
        L_0x006f:
            r4 = 7
            if (r7 != 0) goto L_0x0076
        L_0x0072:
            r21 = r3
            goto L_0x00d4
        L_0x0076:
            if (r12 <= 0) goto L_0x0072
            int[] r10 = f6182S
            int r6 = r10.length
            if (r12 < r6) goto L_0x007e
            goto L_0x0072
        L_0x007e:
            int r6 = r7.f6239c
            if (r6 == r4) goto L_0x00ad
            if (r12 != r4) goto L_0x0085
            goto L_0x00ad
        L_0x0085:
            if (r6 == r12) goto L_0x00ad
            int r4 = r7.f6240d
            if (r4 != r12) goto L_0x008c
            goto L_0x00ad
        L_0x008c:
            r9 = 4
            if (r6 == r9) goto L_0x0091
            if (r4 != r9) goto L_0x0095
        L_0x0091:
            r9 = 3
            if (r12 != r9) goto L_0x0095
            goto L_0x00ad
        L_0x0095:
            r9 = 9
            if (r6 == r9) goto L_0x009b
            if (r4 != r9) goto L_0x00a0
        L_0x009b:
            r9 = 8
            if (r12 != r9) goto L_0x00a0
            goto L_0x00ad
        L_0x00a0:
            r9 = 12
            if (r6 == r9) goto L_0x00a6
            if (r4 != r9) goto L_0x00ab
        L_0x00a6:
            r4 = 11
            if (r12 != r4) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r4 = 0
            goto L_0x00ae
        L_0x00ad:
            r4 = 1
        L_0x00ae:
            if (r4 != 0) goto L_0x00b7
            if (r8 == 0) goto L_0x0072
            java.lang.String[] r4 = f6181R
            r4 = r4[r12]
            goto L_0x0072
        L_0x00b7:
            r4 = 7
            r9 = r3
            if (r12 != r4) goto L_0x00bc
            r12 = r6
        L_0x00bc:
            long r3 = (long) r15
            r6 = r10[r12]
            r21 = r9
            long r9 = (long) r6
            long r3 = r3 * r9
            r9 = 0
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x00d6
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            r6 = 1
            goto L_0x00d7
        L_0x00d4:
            r3 = 0
        L_0x00d6:
            r6 = 0
        L_0x00d7:
            if (r6 != 0) goto L_0x00e0
            r1.mo6587c(r13)
            r22 = r5
            goto L_0x0239
        L_0x00e0:
            java.lang.String r6 = "Compression"
            int r9 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x014c
            int r9 = r24.readInt()
            int r10 = r0.f6207d
            r22 = r5
            r5 = 7
            if (r10 != r5) goto L_0x0145
            java.lang.String r5 = r7.f6238b
            java.lang.String r10 = "MakerNote"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x00fe
            r0.f6219p = r9
            goto L_0x0145
        L_0x00fe:
            r5 = 6
            if (r2 != r5) goto L_0x0145
            java.lang.String r10 = r7.f6238b
            java.lang.String r5 = "ThumbnailImage"
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x0145
            r0.f6220q = r9
            r0.f6221r = r15
            java.nio.ByteOrder r5 = r0.f6210g
            r10 = 6
            c2.a$d r5 = p034c2.C1759a.C1763d.m5057e(r10, r5)
            int r10 = r0.f6220q
            r16 = r3
            long r2 = (long) r10
            java.nio.ByteOrder r4 = r0.f6210g
            c2.a$d r2 = p034c2.C1759a.C1763d.m5054b(r2, r4)
            int r3 = r0.f6221r
            long r3 = (long) r3
            java.nio.ByteOrder r10 = r0.f6210g
            c2.a$d r3 = p034c2.C1759a.C1763d.m5054b(r3, r10)
            java.util.HashMap<java.lang.String, c2.a$d>[] r4 = r0.f6208e
            r10 = 4
            r4 = r4[r10]
            r4.put(r6, r5)
            java.util.HashMap<java.lang.String, c2.a$d>[] r4 = r0.f6208e
            r4 = r4[r10]
            java.lang.String r5 = "JPEGInterchangeFormat"
            r4.put(r5, r2)
            java.util.HashMap<java.lang.String, c2.a$d>[] r2 = r0.f6208e
            r2 = r2[r10]
            java.lang.String r4 = "JPEGInterchangeFormatLength"
            r2.put(r4, r3)
            goto L_0x0147
        L_0x0145:
            r16 = r3
        L_0x0147:
            long r2 = (long) r9
            r1.mo6587c(r2)
            goto L_0x0150
        L_0x014c:
            r16 = r3
            r22 = r5
        L_0x0150:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f6190a0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x01c6
            r3 = -1
            r5 = 3
            if (r12 == r5) goto L_0x0189
            r5 = 4
            if (r12 == r5) goto L_0x017d
            r5 = 8
            if (r12 == r5) goto L_0x0178
            r5 = 9
            if (r12 == r5) goto L_0x0173
            r5 = 13
            if (r12 == r5) goto L_0x0173
            goto L_0x018e
        L_0x0173:
            int r3 = r24.readInt()
            goto L_0x018d
        L_0x0178:
            short r3 = r24.readShort()
            goto L_0x018d
        L_0x017d:
            int r3 = r24.readInt()
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            goto L_0x018e
        L_0x0189:
            int r3 = r24.readUnsignedShort()
        L_0x018d:
            long r3 = (long) r3
        L_0x018e:
            if (r8 == 0) goto L_0x01a4
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r8 = 0
            r5[r8] = r6
            java.lang.String r6 = r7.f6238b
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "Offset: %d, tagName: %s"
            java.lang.String.format(r6, r5)
        L_0x01a4:
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c1
            java.util.HashSet r5 = r0.f6209f
            int r6 = (int) r3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x01c1
            r1.mo6587c(r3)
            int r2 = r2.intValue()
            r0.mo6517B(r1, r2)
        L_0x01c1:
            r1.mo6587c(r13)
            goto L_0x0239
        L_0x01c6:
            int r2 = r1.f6229d
            int r3 = r0.f6218o
            int r2 = r2 + r3
            r3 = r16
            int r4 = (int) r3
            byte[] r3 = new byte[r4]
            r1.readFully(r3)
            c2.a$d r4 = new c2.a$d
            long r8 = (long) r2
            r10 = r13
            r13 = r4
            r14 = r12
            r16 = r8
            r18 = r3
            r13.<init>(r14, r15, r16, r18)
            java.util.HashMap<java.lang.String, c2.a$d>[] r2 = r0.f6208e
            r2 = r2[r25]
            java.lang.String r3 = r7.f6238b
            r2.put(r3, r4)
            java.lang.String r2 = r7.f6238b
            java.lang.String r3 = "DNGVersion"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x01f6
            r2 = 3
            r0.f6207d = r2
        L_0x01f6:
            java.lang.String r2 = r7.f6238b
            java.lang.String r3 = "Make"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x020a
            java.lang.String r2 = r7.f6238b
            java.lang.String r3 = "Model"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0218
        L_0x020a:
            java.nio.ByteOrder r2 = r0.f6210g
            java.lang.String r2 = r4.mo6583i(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x022b
        L_0x0218:
            java.lang.String r2 = r7.f6238b
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x022f
            java.nio.ByteOrder r2 = r0.f6210g
            int r2 = r4.mo6582h(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x022f
        L_0x022b:
            r2 = 8
            r0.f6207d = r2
        L_0x022f:
            int r2 = r1.f6229d
            long r2 = (long) r2
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0239
            r1.mo6587c(r10)
        L_0x0239:
            int r5 = r22 + 1
            short r5 = (short) r5
            r2 = r25
            r3 = r21
            r4 = 0
            goto L_0x001a
        L_0x0243:
            int r2 = r24.readInt()
            boolean r3 = f6197t
            if (r3 == 0) goto L_0x025a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String.format(r4, r3)
        L_0x025a:
            long r3 = (long) r2
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x028c
            java.util.HashSet r5 = r0.f6209f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x028c
            r1.mo6587c(r3)
            java.util.HashMap<java.lang.String, c2.a$d>[] r2 = r0.f6208e
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x027f
            r0.mo6517B(r1, r3)
            goto L_0x028c
        L_0x027f:
            java.util.HashMap<java.lang.String, c2.a$d>[] r2 = r0.f6208e
            r2 = r2[r6]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x028c
            r0.mo6517B(r1, r6)
        L_0x028c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6517B(c2.a$g, int):void");
    }

    /* renamed from: C */
    public final void mo6518C(String str) {
        for (int i = 0; i < f6185V.length; i++) {
            this.f6208e[i].remove(str);
        }
    }

    /* renamed from: D */
    public final void mo6519D(int i, String str, String str2) {
        if (!this.f6208e[i].isEmpty() && this.f6208e[i].get(str) != null) {
            HashMap<String, C1763d> hashMap = this.f6208e[i];
            hashMap.put(str2, hashMap.get(str));
            this.f6208e[i].remove(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d4, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00d5, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00d6, code lost:
        r11 = null;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00dc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00dd, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ed, code lost:
        p034c2.C1767b.C1768a.m5071c(r14.f6205b, 0, android.system.OsConstants.SEEK_SET);
        r6 = new java.io.FileOutputStream(r14.f6205b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fc, code lost:
        r6 = new java.io.FileOutputStream(r14.f6204a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:38:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ed A[Catch:{ Exception -> 0x0118, all -> 0x0115 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fc A[Catch:{ Exception -> 0x0118, all -> 0x0115 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6520E() throws java.io.IOException {
        /*
            r14 = this;
            int r0 = r14.f6207d
            r1 = 1
            r2 = 0
            r3 = 14
            r4 = 13
            r5 = 4
            if (r0 == r5) goto L_0x0012
            if (r0 == r4) goto L_0x0012
            if (r0 != r3) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            if (r0 == 0) goto L_0x0174
            java.io.FileDescriptor r0 = r14.f6205b
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = r14.f6204a
            if (r0 == 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0026:
            boolean r0 = r14.f6211h
            if (r0 == 0) goto L_0x003b
            boolean r0 = r14.f6212i
            if (r0 == 0) goto L_0x003b
            boolean r0 = r14.f6213j
            if (r0 == 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            int r0 = r14.f6217n
            r6 = 6
            r7 = 0
            if (r0 == r6) goto L_0x0047
            r6 = 7
            if (r0 != r6) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = r7
            goto L_0x004b
        L_0x0047:
            byte[] r0 = r14.mo6545r()
        L_0x004b:
            r14.f6216m = r0
            java.lang.String r0 = "temp"
            java.lang.String r6 = "tmp"
            java.io.File r0 = java.io.File.createTempFile(r0, r6)     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            java.lang.String r6 = r14.f6204a     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            r8 = 0
            if (r6 == 0) goto L_0x0065
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            java.lang.String r10 = r14.f6204a     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            r6.<init>(r10)     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            goto L_0x0073
        L_0x0065:
            java.io.FileDescriptor r6 = r14.f6205b     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            int r10 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            p034c2.C1767b.C1768a.m5071c(r6, r8, r10)     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            java.io.FileDescriptor r10 = r14.f6205b     // Catch:{ Exception -> 0x0162, all -> 0x015f }
            r6.<init>(r10)     // Catch:{ Exception -> 0x0162, all -> 0x015f }
        L_0x0073:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x015b, all -> 0x0157 }
            r10.<init>(r0)     // Catch:{ Exception -> 0x015b, all -> 0x0157 }
            p034c2.C1767b.m5068e(r6, r10)     // Catch:{ Exception -> 0x0154, all -> 0x0151 }
            p034c2.C1767b.m5065b(r6)
            p034c2.C1767b.m5065b(r10)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00e0, all -> 0x00dc }
            r6.<init>(r0)     // Catch:{ Exception -> 0x00e0, all -> 0x00dc }
            java.lang.String r10 = r14.f6204a     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            if (r10 == 0) goto L_0x0092
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            java.lang.String r11 = r14.f6204a     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            goto L_0x00a0
        L_0x0092:
            java.io.FileDescriptor r10 = r14.f6205b     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            p034c2.C1767b.C1768a.m5071c(r10, r8, r11)     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            java.io.FileDescriptor r11 = r14.f6205b     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
            r10.<init>(r11)     // Catch:{ Exception -> 0x00d4, all -> 0x00dc }
        L_0x00a0:
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00d2, all -> 0x00dc }
            r11.<init>(r6)     // Catch:{ Exception -> 0x00d2, all -> 0x00dc }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00cf, all -> 0x00cb }
            r12.<init>(r10)     // Catch:{ Exception -> 0x00cf, all -> 0x00cb }
            int r13 = r14.f6207d     // Catch:{ Exception -> 0x00c9 }
            if (r13 != r5) goto L_0x00b2
            r14.mo6521F(r11, r12)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00bd
        L_0x00b2:
            if (r13 != r4) goto L_0x00b8
            r14.mo6522G(r11, r12)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00bd
        L_0x00b8:
            if (r13 != r3) goto L_0x00bd
            r14.mo6523H(r11, r12)     // Catch:{ Exception -> 0x00c9 }
        L_0x00bd:
            p034c2.C1767b.m5065b(r11)
            p034c2.C1767b.m5065b(r12)
            r0.delete()
            r14.f6216m = r7
            return
        L_0x00c9:
            r3 = move-exception
            goto L_0x00d8
        L_0x00cb:
            r1 = move-exception
            r12 = r7
            goto L_0x0144
        L_0x00cf:
            r3 = move-exception
            r12 = r7
            goto L_0x00d8
        L_0x00d2:
            r3 = move-exception
            goto L_0x00d6
        L_0x00d4:
            r3 = move-exception
            r10 = r7
        L_0x00d6:
            r11 = r7
            r12 = r11
        L_0x00d8:
            r7 = r10
            r4 = r7
            r7 = r6
            goto L_0x00e4
        L_0x00dc:
            r1 = move-exception
            r12 = r7
            goto L_0x0145
        L_0x00e0:
            r3 = move-exception
            r4 = r7
            r11 = r4
            r12 = r11
        L_0x00e4:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x011d, all -> 0x011b }
            r5.<init>(r0)     // Catch:{ Exception -> 0x011d, all -> 0x011b }
            java.lang.String r6 = r14.f6204a     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            if (r6 != 0) goto L_0x00fc
            java.io.FileDescriptor r6 = r14.f6205b     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            p034c2.C1767b.C1768a.m5071c(r6, r8, r7)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.io.FileDescriptor r7 = r14.f6205b     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            goto L_0x0103
        L_0x00fc:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r7 = r14.f6204a     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
        L_0x0103:
            r4 = r6
            p034c2.C1767b.m5068e(r5, r4)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            p034c2.C1767b.m5065b(r5)     // Catch:{ all -> 0x0143 }
            p034c2.C1767b.m5065b(r4)     // Catch:{ all -> 0x0143 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Failed to save new file"
            r1.<init>(r4, r3)     // Catch:{ all -> 0x0143 }
            throw r1     // Catch:{ all -> 0x0143 }
        L_0x0115:
            r1 = move-exception
            r7 = r5
            goto L_0x013c
        L_0x0118:
            r2 = move-exception
            r7 = r5
            goto L_0x011e
        L_0x011b:
            r1 = move-exception
            goto L_0x013c
        L_0x011d:
            r2 = move-exception
        L_0x011e:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0139 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0139 }
            r5.<init>()     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = "Failed to save new file. Original file is stored in "
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            java.lang.String r6 = r0.getAbsolutePath()     // Catch:{ all -> 0x0139 }
            r5.append(r6)     // Catch:{ all -> 0x0139 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0139 }
            r3.<init>(r5, r2)     // Catch:{ all -> 0x0139 }
            throw r3     // Catch:{ all -> 0x0139 }
        L_0x0139:
            r2 = move-exception
            r1 = r2
            r2 = 1
        L_0x013c:
            p034c2.C1767b.m5065b(r7)     // Catch:{ all -> 0x0143 }
            p034c2.C1767b.m5065b(r4)     // Catch:{ all -> 0x0143 }
            throw r1     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r1 = move-exception
        L_0x0144:
            r7 = r11
        L_0x0145:
            p034c2.C1767b.m5065b(r7)
            p034c2.C1767b.m5065b(r12)
            if (r2 != 0) goto L_0x0150
            r0.delete()
        L_0x0150:
            throw r1
        L_0x0151:
            r0 = move-exception
            r7 = r10
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r7 = r10
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
        L_0x0158:
            r1 = r7
            r7 = r6
            goto L_0x016d
        L_0x015b:
            r0 = move-exception
        L_0x015c:
            r1 = r7
            r7 = r6
            goto L_0x0164
        L_0x015f:
            r0 = move-exception
            r1 = r7
            goto L_0x016d
        L_0x0162:
            r0 = move-exception
            r1 = r7
        L_0x0164:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x016c }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x016c }
            throw r2     // Catch:{ all -> 0x016c }
        L_0x016c:
            r0 = move-exception
        L_0x016d:
            p034c2.C1767b.m5065b(r7)
            p034c2.C1767b.m5065b(r1)
            throw r0
        L_0x0174:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6520E():void");
    }

    /* renamed from: F */
    public final void mo6521F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f6197t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        C1761b bVar = new C1761b((InputStream) bufferedInputStream);
        C1762c cVar = new C1762c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.mo6576a(-1);
            if (bVar.readByte() == -40) {
                cVar.mo6576a(-40);
                C1763d dVar = null;
                if (mo6532e("Xmp") != null && this.f6222s) {
                    dVar = this.f6208e[0].remove("Xmp");
                }
                cVar.mo6576a(-1);
                cVar.mo6576a(-31);
                mo6529N(cVar);
                if (dVar != null) {
                    this.f6208e[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.mo6576a(-1);
                        cVar.mo6576a(readByte);
                        C1767b.m5068e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.mo6576a(-1);
                        cVar.mo6576a(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.mo6578e((short) readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i, 4096));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f6192c0)) {
                                    bVar.mo6555a(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.mo6576a(-1);
                            cVar.mo6576a(readByte);
                            cVar.mo6578e((short) (readUnsignedShort2 + 2));
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: G */
    public final void mo6522G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f6197t) {
            Objects.toString(bufferedInputStream);
            Objects.toString(bufferedOutputStream);
        }
        C1761b bVar = new C1761b((InputStream) bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C1762c cVar = new C1762c(bufferedOutputStream, byteOrder);
        byte[] bArr = f6168E;
        C1767b.m5067d(bVar, cVar, bArr.length);
        int i = this.f6218o;
        if (i == 0) {
            int readInt = bVar.readInt();
            cVar.mo6577c(readInt);
            C1767b.m5067d(bVar, cVar, readInt + 4 + 4);
        } else {
            C1767b.m5067d(bVar, cVar, ((i - bArr.length) - 4) - 4);
            bVar.mo6555a(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C1762c cVar2 = new C1762c(byteArrayOutputStream2, byteOrder);
                mo6529N(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f6231b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.mo6577c((int) crc32.getValue());
                C1767b.m5065b(byteArrayOutputStream2);
                C1767b.m5068e(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                C1767b.m5065b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C1767b.m5065b(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0198 A[Catch:{ Exception -> 0x01da, all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a4 A[Catch:{ Exception -> 0x01da, all -> 0x0052 }] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6523H(java.io.BufferedInputStream r20, java.io.BufferedOutputStream r21) throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = f6197t
            if (r2 == 0) goto L_0x000e
            java.util.Objects.toString(r20)
            java.util.Objects.toString(r21)
        L_0x000e:
            c2.a$b r2 = new c2.a$b
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.<init>(r0, r3)
            c2.a$c r4 = new c2.a$c
            r5 = r21
            r4.<init>(r5, r3)
            byte[] r5 = f6172I
            int r6 = r5.length
            p034c2.C1767b.m5067d(r2, r4, r6)
            byte[] r6 = f6173J
            int r7 = r6.length
            r8 = 4
            int r7 = r7 + r8
            r2.mo6555a(r7)
            r7 = 0
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x01df }
            r9.<init>()     // Catch:{ Exception -> 0x01df }
            c2.a$c r10 = new c2.a$c     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.<init>(r9, r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r3 = r1.f6218o     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r3 == 0) goto L_0x0055
            int r0 = r5.length     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r0 = r0 + r8
            int r5 = r6.length     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r0 = r0 + r5
            int r3 = r3 - r0
            int r3 = r3 - r8
            int r3 = r3 - r8
            p034c2.C1767b.m5067d(r2, r10, r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r2.mo6555a(r8)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r0 = r2.readInt()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r2.mo6555a(r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r1.mo6529N(r10)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            goto L_0x01ba
        L_0x0052:
            r0 = move-exception
            goto L_0x01e9
        L_0x0055:
            byte[] r3 = new byte[r8]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r5 = r2.read(r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r5 != r8) goto L_0x01d2
            byte[] r5 = f6176M     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r6 = java.util.Arrays.equals(r3, r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r11 = 0
            r12 = 8
            r13 = 1
            if (r6 == 0) goto L_0x00c7
            int r3 = r2.readInt()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r6 = r3 % 2
            if (r6 != r13) goto L_0x0074
            int r6 = r3 + 1
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r2.read(r6)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte r14 = r6[r11]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r12 = r12 | r14
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r6[r11] = r12     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r12 = r12 >> r13
            r12 = r12 & r13
            if (r12 != r13) goto L_0x0085
            r11 = 1
        L_0x0085:
            r10.write(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.mo6577c(r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.write(r6)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r11 == 0) goto L_0x00bb
            byte[] r3 = f6179P     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            m5010c(r2, r10, r3, r7)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
        L_0x0095:
            byte[] r3 = new byte[r8]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r0.read(r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte[] r5 = f6180Q     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r5 = java.util.Arrays.equals(r3, r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r5 != 0) goto L_0x00a7
            r1.mo6529N(r10)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            goto L_0x01ba
        L_0x00a7:
            int r5 = r2.readInt()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.write(r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.mo6577c(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r3 = r5 % 2
            if (r3 != r13) goto L_0x00b7
            int r5 = r5 + 1
        L_0x00b7:
            p034c2.C1767b.m5067d(r2, r10, r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            goto L_0x0095
        L_0x00bb:
            byte[] r0 = f6178O     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte[] r3 = f6177N     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            m5010c(r2, r10, r0, r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r1.mo6529N(r10)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            goto L_0x01ba
        L_0x00c7:
            byte[] r0 = f6178O     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r6 = java.util.Arrays.equals(r3, r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r6 != 0) goto L_0x00d7
            byte[] r6 = f6177N     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r6 = java.util.Arrays.equals(r3, r6)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r6 == 0) goto L_0x01ba
        L_0x00d7:
            int r6 = r2.readInt()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r7 = r6 % 2
            if (r7 != r13) goto L_0x00e2
            int r7 = r6 + 1
            goto L_0x00e3
        L_0x00e2:
            r7 = r6
        L_0x00e3:
            r14 = 3
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r16 = java.util.Arrays.equals(r3, r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r8 = 47
            if (r16 == 0) goto L_0x0118
            r2.read(r15)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte[] r13 = new byte[r14]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r12 = r2.read(r13)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r12 != r14) goto L_0x0110
            byte[] r12 = f6175L     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r12 = java.util.Arrays.equals(r12, r13)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r12 == 0) goto L_0x0110
            int r12 = r2.readInt()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r13 = r12 << 18
            int r13 = r13 >> 18
            int r14 = r12 << 2
            int r14 = r14 >> 18
            int r7 = r7 + -10
            goto L_0x0145
        L_0x0110:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            java.lang.String r2 = "Encountered error while checking VP8 signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            throw r0     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
        L_0x0118:
            byte[] r12 = f6177N     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r12 = java.util.Arrays.equals(r3, r12)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r12 == 0) goto L_0x0142
            byte r12 = r2.readByte()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r12 != r8) goto L_0x013a
            int r12 = r2.readInt()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r14 = r12 << 18
            int r14 = r14 >> 18
            int r14 = r14 + r13
            int r17 = r12 << 4
            int r17 = r17 >> 18
            int r17 = r17 + 1
            r13 = r12 & 8
            int r7 = r7 + -5
            goto L_0x0149
        L_0x013a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            java.lang.String r2 = "Encountered error while checking VP8L signature"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            throw r0     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
        L_0x0142:
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0145:
            r17 = r14
            r14 = r13
            r13 = 0
        L_0x0149:
            r10.write(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5 = 10
            r10.mo6577c(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte r18 = r5[r11]     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r16 = 8
            r8 = r18 | 8
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r11] = r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r18 = 4
            int r13 = r13 << 4
            r8 = r8 | r13
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r11] = r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r14 = r14 + -1
            int r8 = r17 + -1
            byte r11 = (byte) r14     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r18] = r11     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r11 = 5
            int r13 = r14 >> 8
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r11] = r13     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r11 = 6
            int r13 = r14 >> 16
            byte r13 = (byte) r13     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r11] = r13     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r11 = 7
            byte r13 = (byte) r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r11] = r13     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r11 = r8 >> 8
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r13 = 8
            r5[r13] = r11     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r11 = 9
            int r8 = r8 >> 16
            byte r8 = (byte) r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r5[r11] = r8     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.write(r5)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.write(r3)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.mo6577c(r6)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r0 == 0) goto L_0x01a4
            r10.write(r15)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte[] r0 = f6175L     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.write(r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.mo6577c(r12)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            goto L_0x01b4
        L_0x01a4:
            byte[] r0 = f6177N     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            if (r0 == 0) goto L_0x01b4
            r0 = 47
            r10.write(r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r10.mo6577c(r12)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
        L_0x01b4:
            p034c2.C1767b.m5067d(r2, r10, r7)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r1.mo6529N(r10)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
        L_0x01ba:
            p034c2.C1767b.m5068e(r2, r10)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            byte[] r2 = f6173J     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r3 = r2.length     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            int r0 = r0 + r3
            r4.mo6577c(r0)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r4.write(r2)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            r9.writeTo(r4)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            p034c2.C1767b.m5065b(r9)
            return
        L_0x01d2:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            java.lang.String r2 = "Encountered invalid length while parsing WebP chunk type"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
            throw r0     // Catch:{ Exception -> 0x01da, all -> 0x0052 }
        L_0x01da:
            r0 = move-exception
            r7 = r9
            goto L_0x01e0
        L_0x01dd:
            r0 = move-exception
            goto L_0x01e8
        L_0x01df:
            r0 = move-exception
        L_0x01e0:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x01dd }
            java.lang.String r3 = "Failed to save WebP file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x01dd }
            throw r2     // Catch:{ all -> 0x01dd }
        L_0x01e8:
            r9 = r7
        L_0x01e9:
            p034c2.C1767b.m5065b(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6523H(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* renamed from: I */
    public final void mo6524I(String str, String str2) {
        int i;
        C1764e eVar;
        int i2;
        C1763d dVar;
        String str3 = str;
        String str4 = str2;
        if (str3 != null) {
            if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean find = f6195f0.matcher(str4).find();
                boolean find2 = f6196g0.matcher(str4).find();
                if (str2.length() != 19) {
                    return;
                }
                if (!find && !find2) {
                    return;
                }
                if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            int i3 = 2;
            int i4 = 1;
            if (str4 != null && f6189Z.contains(str3)) {
                if (str3.equals("GPSTimeStamp")) {
                    Matcher matcher = f6194e0.matcher(str4);
                    if (matcher.find()) {
                        str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                    } else {
                        return;
                    }
                } else {
                    try {
                        str4 = ((long) (Double.parseDouble(str4) * 10000.0d)) + "/" + 10000;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
            }
            char c = 0;
            int i5 = 0;
            while (i5 < f6185V.length) {
                if ((i5 != 4 || this.f6211h) && (eVar = f6188Y[i5].get(str3)) != null) {
                    if (str4 != null) {
                        Pair<Integer, Integer> t = m5011t(str4);
                        if (eVar.f6239c == ((Integer) t.first).intValue() || eVar.f6239c == ((Integer) t.second).intValue()) {
                            i2 = eVar.f6239c;
                        } else {
                            int i6 = eVar.f6240d;
                            if (i6 == -1 || !(i6 == ((Integer) t.first).intValue() || eVar.f6240d == ((Integer) t.second).intValue())) {
                                int i7 = eVar.f6239c;
                                if (i7 == i4 || i7 == 7 || i7 == i3) {
                                    i2 = i7;
                                } else if (f6197t) {
                                    String[] strArr = f6181R;
                                    String str5 = strArr[i7];
                                    int i8 = eVar.f6240d;
                                    if (i8 != -1) {
                                        String str6 = strArr[i8];
                                    }
                                    String str7 = strArr[((Integer) t.first).intValue()];
                                    if (((Integer) t.second).intValue() != -1) {
                                        String str8 = strArr[((Integer) t.second).intValue()];
                                    }
                                }
                            } else {
                                i2 = eVar.f6240d;
                            }
                        }
                        switch (i2) {
                            case 1:
                                i = i5;
                                HashMap<String, C1763d> hashMap = this.f6208e[i];
                                if (str4.length() == 1) {
                                    if (str4.charAt(0) >= '0' && str4.charAt(0) <= '1') {
                                        dVar = new C1763d(1, 1, new byte[]{(byte) (str4.charAt(0) - '0')});
                                        hashMap.put(str3, dVar);
                                        continue;
                                    }
                                }
                                byte[] bytes = str4.getBytes(f6191b0);
                                dVar = new C1763d(1, bytes.length, bytes);
                                hashMap.put(str3, dVar);
                                continue;
                            case 2:
                            case 7:
                                i = i5;
                                this.f6208e[i].put(str3, C1763d.m5053a(str4));
                                break;
                            case 3:
                                i = i5;
                                String[] split = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                int[] iArr = new int[split.length];
                                for (int i9 = 0; i9 < split.length; i9++) {
                                    iArr[i9] = Integer.parseInt(split[i9]);
                                }
                                this.f6208e[i].put(str3, C1763d.m5058f(iArr, this.f6210g));
                                break;
                            case 4:
                                i = i5;
                                String[] split2 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                long[] jArr = new long[split2.length];
                                for (int i11 = 0; i11 < split2.length; i11++) {
                                    jArr[i11] = Long.parseLong(split2[i11]);
                                }
                                this.f6208e[i].put(str3, C1763d.m5055c(jArr, this.f6210g));
                                break;
                            case 5:
                                i = i5;
                                String[] split3 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                C1765f[] fVarArr = new C1765f[split3.length];
                                for (int i12 = 0; i12 < split3.length; i12++) {
                                    String[] split4 = split3[i12].split("/", -1);
                                    fVarArr[i12] = new C1765f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                }
                                this.f6208e[i].put(str3, C1763d.m5056d(fVarArr, this.f6210g));
                                break;
                            case 9:
                                i = i5;
                                String[] split5 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                int length = split5.length;
                                int[] iArr2 = new int[length];
                                for (int i13 = 0; i13 < split5.length; i13++) {
                                    iArr2[i13] = Integer.parseInt(split5[i13]);
                                }
                                HashMap<String, C1763d> hashMap2 = this.f6208e[i];
                                ByteOrder byteOrder = this.f6210g;
                                ByteBuffer wrap = ByteBuffer.wrap(new byte[(f6182S[9] * length)]);
                                wrap.order(byteOrder);
                                for (int i14 = 0; i14 < length; i14++) {
                                    wrap.putInt(iArr2[i14]);
                                }
                                hashMap2.put(str3, new C1763d(9, length, wrap.array()));
                                break;
                            case 10:
                                String[] split6 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                int length2 = split6.length;
                                C1765f[] fVarArr2 = new C1765f[length2];
                                int i15 = 0;
                                while (i15 < split6.length) {
                                    String[] split7 = split6[i15].split("/", -1);
                                    fVarArr2[i15] = new C1765f((long) Double.parseDouble(split7[c]), (long) Double.parseDouble(split7[i4]));
                                    i15++;
                                    i5 = i5;
                                    i4 = 1;
                                    c = 0;
                                }
                                i = i5;
                                HashMap<String, C1763d> hashMap3 = this.f6208e[i];
                                ByteOrder byteOrder2 = this.f6210g;
                                ByteBuffer wrap2 = ByteBuffer.wrap(new byte[(f6182S[10] * length2)]);
                                wrap2.order(byteOrder2);
                                for (int i16 = 0; i16 < length2; i16++) {
                                    C1765f fVar = fVarArr2[i16];
                                    wrap2.putInt((int) fVar.f6241a);
                                    wrap2.putInt((int) fVar.f6242b);
                                }
                                hashMap3.put(str3, new C1763d(10, length2, wrap2.array()));
                                break;
                            case 12:
                                String[] split8 = str4.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
                                int length3 = split8.length;
                                double[] dArr = new double[length3];
                                for (int i17 = 0; i17 < split8.length; i17++) {
                                    dArr[i17] = Double.parseDouble(split8[i17]);
                                }
                                HashMap<String, C1763d> hashMap4 = this.f6208e[i5];
                                ByteOrder byteOrder3 = this.f6210g;
                                ByteBuffer wrap3 = ByteBuffer.wrap(new byte[(f6182S[12] * length3)]);
                                wrap3.order(byteOrder3);
                                for (int i18 = 0; i18 < length3; i18++) {
                                    wrap3.putDouble(dArr[i18]);
                                }
                                hashMap4.put(str3, new C1763d(12, length3, wrap3.array()));
                                break;
                        }
                    } else {
                        this.f6208e[i5].remove(str3);
                    }
                }
                i = i5;
                i5 = i + 1;
                i3 = 2;
                i4 = 1;
                c = 0;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6525J(p034c2.C1759a.C1761b r19) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.util.HashMap<java.lang.String, c2.a$d>[] r2 = r0.f6208e
            r3 = 4
            r2 = r2[r3]
            java.lang.String r3 = "Compression"
            java.lang.Object r3 = r2.get(r3)
            c2.a$d r3 = (p034c2.C1759a.C1763d) r3
            r4 = 6
            if (r3 == 0) goto L_0x010e
            java.nio.ByteOrder r5 = r0.f6210g
            int r3 = r3.mo6582h(r5)
            r0.f6217n = r3
            r5 = 1
            if (r3 == r5) goto L_0x002b
            if (r3 == r4) goto L_0x0026
            r6 = 7
            if (r3 == r6) goto L_0x002b
            goto L_0x0113
        L_0x0026:
            r0.mo6547u(r1, r2)
            goto L_0x0113
        L_0x002b:
            java.lang.String r3 = "BitsPerSample"
            java.lang.Object r3 = r2.get(r3)
            c2.a$d r3 = (p034c2.C1759a.C1763d) r3
            r6 = 0
            if (r3 == 0) goto L_0x0070
            java.nio.ByteOrder r7 = r0.f6210g
            java.io.Serializable r3 = r3.mo6584j(r7)
            int[] r3 = (int[]) r3
            int[] r7 = f6200w
            boolean r8 = java.util.Arrays.equals(r7, r3)
            if (r8 == 0) goto L_0x0047
            goto L_0x006e
        L_0x0047:
            int r8 = r0.f6207d
            r9 = 3
            if (r8 != r9) goto L_0x0070
            java.lang.String r8 = "PhotometricInterpretation"
            java.lang.Object r8 = r2.get(r8)
            c2.a$d r8 = (p034c2.C1759a.C1763d) r8
            if (r8 == 0) goto L_0x0070
            java.nio.ByteOrder r9 = r0.f6210g
            int r8 = r8.mo6582h(r9)
            if (r8 != r5) goto L_0x0066
            int[] r9 = f6201x
            boolean r9 = java.util.Arrays.equals(r3, r9)
            if (r9 != 0) goto L_0x006e
        L_0x0066:
            if (r8 != r4) goto L_0x0070
            boolean r3 = java.util.Arrays.equals(r3, r7)
            if (r3 == 0) goto L_0x0070
        L_0x006e:
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 == 0) goto L_0x0113
            java.lang.String r3 = "StripOffsets"
            java.lang.Object r3 = r2.get(r3)
            c2.a$d r3 = (p034c2.C1759a.C1763d) r3
            java.lang.String r4 = "StripByteCounts"
            java.lang.Object r2 = r2.get(r4)
            c2.a$d r2 = (p034c2.C1759a.C1763d) r2
            if (r3 == 0) goto L_0x0113
            if (r2 == 0) goto L_0x0113
            java.nio.ByteOrder r4 = r0.f6210g
            java.io.Serializable r3 = r3.mo6584j(r4)
            long[] r3 = p034c2.C1767b.m5066c(r3)
            java.nio.ByteOrder r4 = r0.f6210g
            java.io.Serializable r2 = r2.mo6584j(r4)
            long[] r2 = p034c2.C1767b.m5066c(r2)
            if (r3 == 0) goto L_0x0113
            int r4 = r3.length
            if (r4 != 0) goto L_0x00a2
            goto L_0x0113
        L_0x00a2:
            if (r2 == 0) goto L_0x0113
            int r4 = r2.length
            if (r4 != 0) goto L_0x00a9
            goto L_0x0113
        L_0x00a9:
            int r4 = r3.length
            int r7 = r2.length
            if (r4 == r7) goto L_0x00ae
            goto L_0x0113
        L_0x00ae:
            r7 = 0
            int r4 = r2.length
            r9 = 0
        L_0x00b2:
            if (r9 >= r4) goto L_0x00ba
            r10 = r2[r9]
            long r7 = r7 + r10
            int r9 = r9 + 1
            goto L_0x00b2
        L_0x00ba:
            int r4 = (int) r7
            byte[] r7 = new byte[r4]
            r0.f6213j = r5
            r0.f6212i = r5
            r0.f6211h = r5
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x00c6:
            int r11 = r3.length
            if (r8 >= r11) goto L_0x0100
            r11 = r3[r8]
            int r12 = (int) r11
            r13 = r2[r8]
            int r11 = (int) r13
            int r13 = r3.length
            int r13 = r13 - r5
            if (r8 >= r13) goto L_0x00e0
            int r13 = r12 + r11
            long r13 = (long) r13
            int r15 = r8 + 1
            r15 = r3[r15]
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x00e0
            r0.f6213j = r6
        L_0x00e0:
            int r12 = r12 - r9
            if (r12 >= 0) goto L_0x00e4
            goto L_0x0113
        L_0x00e4:
            long r13 = (long) r12
            long r15 = r1.skip(r13)
            int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x00ee
            goto L_0x0113
        L_0x00ee:
            int r9 = r9 + r12
            byte[] r12 = new byte[r11]
            int r13 = r1.read(r12)
            if (r13 == r11) goto L_0x00f8
            goto L_0x0113
        L_0x00f8:
            int r9 = r9 + r11
            java.lang.System.arraycopy(r12, r6, r7, r10, r11)
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L_0x00c6
        L_0x0100:
            r0.f6216m = r7
            boolean r1 = r0.f6213j
            if (r1 == 0) goto L_0x0113
            r1 = r3[r6]
            int r2 = (int) r1
            r0.f6214k = r2
            r0.f6215l = r4
            goto L_0x0113
        L_0x010e:
            r0.f6217n = r4
            r0.mo6547u(r1, r2)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6525J(c2.a$b):void");
    }

    /* renamed from: K */
    public final void mo6526K(int i, int i2) throws IOException {
        if (!this.f6208e[i].isEmpty() && !this.f6208e[i2].isEmpty()) {
            C1763d dVar = this.f6208e[i].get("ImageLength");
            C1763d dVar2 = this.f6208e[i].get("ImageWidth");
            C1763d dVar3 = this.f6208e[i2].get("ImageLength");
            C1763d dVar4 = this.f6208e[i2].get("ImageWidth");
            if (dVar != null && dVar2 != null && dVar3 != null && dVar4 != null) {
                int h = dVar.mo6582h(this.f6210g);
                int h2 = dVar2.mo6582h(this.f6210g);
                int h3 = dVar3.mo6582h(this.f6210g);
                int h4 = dVar4.mo6582h(this.f6210g);
                if (h < h3 && h2 < h4) {
                    HashMap<String, C1763d>[] hashMapArr = this.f6208e;
                    HashMap<String, C1763d> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* renamed from: L */
    public final void mo6527L(C1766g gVar, int i) throws IOException {
        C1763d dVar;
        C1763d dVar2;
        C1763d dVar3 = this.f6208e[i].get("DefaultCropSize");
        C1763d dVar4 = this.f6208e[i].get("SensorTopBorder");
        C1763d dVar5 = this.f6208e[i].get("SensorLeftBorder");
        C1763d dVar6 = this.f6208e[i].get("SensorBottomBorder");
        C1763d dVar7 = this.f6208e[i].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f6233a == 5) {
                C1765f[] fVarArr = (C1765f[]) dVar3.mo6584j(this.f6210g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Arrays.toString(fVarArr);
                    return;
                }
                C1765f fVar = fVarArr[0];
                C1765f[] fVarArr2 = {fVar};
                dVar2 = C1763d.m5056d(fVarArr2, this.f6210g);
                C1765f fVar2 = fVarArr[1];
                C1765f[] fVarArr3 = {fVar2};
                dVar = C1763d.m5056d(fVarArr3, this.f6210g);
            } else {
                int[] iArr = (int[]) dVar3.mo6584j(this.f6210g);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    dVar2 = C1763d.m5057e(iArr[0], this.f6210g);
                    dVar = C1763d.m5057e(iArr[1], this.f6210g);
                }
            }
            this.f6208e[i].put("ImageWidth", dVar2);
            this.f6208e[i].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            C1763d dVar8 = this.f6208e[i].get("ImageLength");
            C1763d dVar9 = this.f6208e[i].get("ImageWidth");
            if (dVar8 == null || dVar9 == null) {
                C1763d dVar10 = this.f6208e[i].get("JPEGInterchangeFormat");
                C1763d dVar11 = this.f6208e[i].get("JPEGInterchangeFormatLength");
                if (dVar10 != null && dVar11 != null) {
                    int h = dVar10.mo6582h(this.f6210g);
                    int h2 = dVar10.mo6582h(this.f6210g);
                    gVar.mo6587c((long) h);
                    byte[] bArr = new byte[h2];
                    gVar.read(bArr);
                    mo6537j(new C1761b(bArr), h, i);
                }
            }
        } else {
            int h3 = dVar4.mo6582h(this.f6210g);
            int h4 = dVar6.mo6582h(this.f6210g);
            int h5 = dVar7.mo6582h(this.f6210g);
            int h6 = dVar5.mo6582h(this.f6210g);
            if (h4 > h3 && h5 > h6) {
                C1763d e = C1763d.m5057e(h4 - h3, this.f6210g);
                C1763d e2 = C1763d.m5057e(h5 - h6, this.f6210g);
                this.f6208e[i].put("ImageLength", e);
                this.f6208e[i].put("ImageWidth", e2);
            }
        }
    }

    /* renamed from: M */
    public final void mo6528M() throws IOException {
        mo6526K(0, 5);
        mo6526K(0, 4);
        mo6526K(5, 4);
        C1763d dVar = this.f6208e[1].get("PixelXDimension");
        C1763d dVar2 = this.f6208e[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f6208e[0].put("ImageWidth", dVar);
            this.f6208e[0].put("ImageLength", dVar2);
        }
        if (this.f6208e[4].isEmpty() && mo6548v(this.f6208e[5])) {
            HashMap<String, C1763d>[] hashMapArr = this.f6208e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        mo6548v(this.f6208e[4]);
        mo6519D(0, "ThumbnailOrientation", "Orientation");
        mo6519D(0, "ThumbnailImageLength", "ImageLength");
        mo6519D(0, "ThumbnailImageWidth", "ImageWidth");
        mo6519D(5, "ThumbnailOrientation", "Orientation");
        mo6519D(5, "ThumbnailImageLength", "ImageLength");
        mo6519D(5, "ThumbnailImageWidth", "ImageWidth");
        mo6519D(4, "Orientation", "ThumbnailOrientation");
        mo6519D(4, "ImageLength", "ThumbnailImageLength");
        mo6519D(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: N */
    public final void mo6529N(C1762c cVar) throws IOException {
        short s;
        C1762c cVar2 = cVar;
        C1764e[][] eVarArr = f6185V;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (C1764e eVar : f6186W) {
            mo6518C(eVar.f6238b);
        }
        if (this.f6211h) {
            if (this.f6212i) {
                mo6518C("StripOffsets");
                mo6518C("StripByteCounts");
            } else {
                mo6518C("JPEGInterchangeFormat");
                mo6518C("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < f6185V.length; i++) {
            for (Object obj : this.f6208e[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f6208e[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f6208e[1].isEmpty()) {
            this.f6208e[0].put(f6186W[1].f6238b, C1763d.m5054b(0, this.f6210g));
        }
        if (!this.f6208e[2].isEmpty()) {
            this.f6208e[0].put(f6186W[2].f6238b, C1763d.m5054b(0, this.f6210g));
        }
        if (!this.f6208e[3].isEmpty()) {
            this.f6208e[1].put(f6186W[3].f6238b, C1763d.m5054b(0, this.f6210g));
        }
        if (this.f6211h) {
            if (this.f6212i) {
                this.f6208e[4].put("StripOffsets", C1763d.m5057e(0, this.f6210g));
                this.f6208e[4].put("StripByteCounts", C1763d.m5057e(this.f6215l, this.f6210g));
            } else {
                this.f6208e[4].put("JPEGInterchangeFormat", C1763d.m5054b(0, this.f6210g));
                this.f6208e[4].put("JPEGInterchangeFormatLength", C1763d.m5054b((long) this.f6215l, this.f6210g));
            }
        }
        for (int i2 = 0; i2 < f6185V.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C1763d> value : this.f6208e[i2].entrySet()) {
                C1763d dVar = (C1763d) value.getValue();
                dVar.getClass();
                int i4 = f6182S[dVar.f6233a] * dVar.f6234b;
                if (i4 > 4) {
                    i3 += i4;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i5 = 8;
        for (int i6 = 0; i6 < f6185V.length; i6++) {
            if (!this.f6208e[i6].isEmpty()) {
                iArr[i6] = i5;
                i5 = (this.f6208e[i6].size() * 12) + 2 + 4 + iArr2[i6] + i5;
            }
        }
        if (this.f6211h) {
            if (this.f6212i) {
                this.f6208e[4].put("StripOffsets", C1763d.m5057e(i5, this.f6210g));
            } else {
                this.f6208e[4].put("JPEGInterchangeFormat", C1763d.m5054b((long) i5, this.f6210g));
            }
            this.f6214k = i5;
            i5 += this.f6215l;
        }
        if (this.f6207d == 4) {
            i5 += 8;
        }
        if (f6197t) {
            for (int i7 = 0; i7 < f6185V.length; i7++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i7), Integer.valueOf(iArr[i7]), Integer.valueOf(this.f6208e[i7].size()), Integer.valueOf(iArr2[i7]), Integer.valueOf(i5)});
            }
        }
        if (!this.f6208e[1].isEmpty()) {
            this.f6208e[0].put(f6186W[1].f6238b, C1763d.m5054b((long) iArr[1], this.f6210g));
        }
        if (!this.f6208e[2].isEmpty()) {
            this.f6208e[0].put(f6186W[2].f6238b, C1763d.m5054b((long) iArr[2], this.f6210g));
        }
        if (!this.f6208e[3].isEmpty()) {
            this.f6208e[1].put(f6186W[3].f6238b, C1763d.m5054b((long) iArr[3], this.f6210g));
        }
        int i8 = this.f6207d;
        if (i8 == 4) {
            cVar2.mo6578e((short) i5);
            cVar2.write(f6192c0);
        } else if (i8 == 13) {
            cVar2.mo6577c(i5);
            cVar2.write(f6169F);
        } else if (i8 == 14) {
            cVar2.write(f6174K);
            cVar2.mo6577c(i5);
        }
        if (this.f6210g == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        cVar2.mo6578e(s);
        cVar2.f6232c = this.f6210g;
        cVar2.mo6578e((short) 42);
        cVar2.mo6577c((int) 8);
        for (int i9 = 0; i9 < f6185V.length; i9++) {
            if (!this.f6208e[i9].isEmpty()) {
                cVar2.mo6578e((short) this.f6208e[i9].size());
                int size = (this.f6208e[i9].size() * 12) + iArr[i9] + 2 + 4;
                for (Map.Entry next : this.f6208e[i9].entrySet()) {
                    int i11 = f6188Y[i9].get(next.getKey()).f6237a;
                    C1763d dVar2 = (C1763d) next.getValue();
                    dVar2.getClass();
                    int i12 = f6182S[dVar2.f6233a] * dVar2.f6234b;
                    cVar2.mo6578e((short) i11);
                    cVar2.mo6578e((short) dVar2.f6233a);
                    cVar2.mo6577c(dVar2.f6234b);
                    if (i12 > 4) {
                        cVar2.mo6577c((int) ((long) size));
                        size += i12;
                    } else {
                        cVar2.write(dVar2.f6236d);
                        if (i12 < 4) {
                            while (i12 < 4) {
                                cVar2.mo6576a(0);
                                i12++;
                            }
                        }
                    }
                }
                if (i9 != 0 || this.f6208e[4].isEmpty()) {
                    cVar2.mo6577c((int) 0);
                } else {
                    cVar2.mo6577c((int) ((long) iArr[4]));
                }
                for (Map.Entry<String, C1763d> value2 : this.f6208e[i9].entrySet()) {
                    byte[] bArr = ((C1763d) value2.getValue()).f6236d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f6211h) {
            cVar2.write(mo6545r());
        }
        if (this.f6207d == 14 && i5 % 2 == 1) {
            cVar2.mo6576a(0);
        }
        cVar2.f6232c = ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a */
    public final void mo6530a() {
        String e = mo6532e("DateTimeOriginal");
        if (e != null && mo6532e("DateTime") == null) {
            this.f6208e[0].put("DateTime", C1763d.m5053a(e));
        }
        if (mo6532e("ImageWidth") == null) {
            this.f6208e[0].put("ImageWidth", C1763d.m5054b(0, this.f6210g));
        }
        if (mo6532e("ImageLength") == null) {
            this.f6208e[0].put("ImageLength", C1763d.m5054b(0, this.f6210g));
        }
        if (mo6532e("Orientation") == null) {
            this.f6208e[0].put("Orientation", C1763d.m5054b(0, this.f6210g));
        }
        if (mo6532e("LightSource") == null) {
            this.f6208e[1].put("LightSource", C1763d.m5054b(0, this.f6210g));
        }
    }

    /* renamed from: d */
    public final double mo6531d() {
        double f = mo6533f(-1.0d, "GPSAltitude");
        int i = -1;
        int g = mo6534g(-1, "GPSAltitudeRef");
        if (f < 0.0d || g < 0) {
            return 0.0d;
        }
        if (g != 1) {
            i = 1;
        }
        return f * ((double) i);
    }

    /* renamed from: e */
    public final String mo6532e(String str) {
        if (str != null) {
            C1763d h = mo6535h(str);
            if (h != null) {
                if (!f6189Z.contains(str)) {
                    return h.mo6583i(this.f6210g);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = h.f6233a;
                    if (i != 5 && i != 10) {
                        return null;
                    }
                    C1765f[] fVarArr = (C1765f[]) h.mo6584j(this.f6210g);
                    if (fVarArr == null || fVarArr.length != 3) {
                        Arrays.toString(fVarArr);
                        return null;
                    }
                    C1765f fVar = fVarArr[0];
                    C1765f fVar2 = fVarArr[1];
                    C1765f fVar3 = fVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) fVar.f6241a) / ((float) fVar.f6242b))), Integer.valueOf((int) (((float) fVar2.f6241a) / ((float) fVar2.f6242b))), Integer.valueOf((int) (((float) fVar3.f6241a) / ((float) fVar3.f6242b)))});
                }
                try {
                    return Double.toString(h.mo6581g(this.f6210g));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: f */
    public final double mo6533f(double d, String str) {
        C1763d h = mo6535h(str);
        if (h == null) {
            return d;
        }
        try {
            return h.mo6581g(this.f6210g);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: g */
    public final int mo6534g(int i, String str) {
        C1763d h = mo6535h(str);
        if (h == null) {
            return i;
        }
        try {
            return h.mo6582h(this.f6210g);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: h */
    public final C1763d mo6535h(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < f6185V.length; i++) {
                C1763d dVar = this.f6208e[i].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0118, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0119, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011c, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0111 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6536i(p034c2.C1759a.C1766g r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x011d
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            c2.a$a r2 = new c2.a$a     // Catch:{ RuntimeException -> 0x0111 }
            r2.<init>(r11)     // Catch:{ RuntimeException -> 0x0111 }
            p034c2.C1767b.C1769b.m5072a(r1, r2)     // Catch:{ RuntimeException -> 0x0111 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0111 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0111 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0111 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0111 }
            r6 = 0
            if (r4 == 0) goto L_0x0048
            r0 = 29
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = 30
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 31
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x0063
        L_0x0048:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0111 }
            if (r0 == 0) goto L_0x0061
            r0 = 18
            java.lang.String r6 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = 19
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 24
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x0063
        L_0x0061:
            r0 = r6
            r4 = r0
        L_0x0063:
            r5 = 0
            if (r6 == 0) goto L_0x0079
            java.util.HashMap<java.lang.String, c2.a$d>[] r7 = r10.f6208e     // Catch:{ RuntimeException -> 0x0111 }
            r7 = r7[r5]     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r8 = "ImageWidth"
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x0111 }
            java.nio.ByteOrder r9 = r10.f6210g     // Catch:{ RuntimeException -> 0x0111 }
            c2.a$d r6 = p034c2.C1759a.C1763d.m5057e(r6, r9)     // Catch:{ RuntimeException -> 0x0111 }
            r7.put(r8, r6)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x0079:
            if (r0 == 0) goto L_0x008e
            java.util.HashMap<java.lang.String, c2.a$d>[] r6 = r10.f6208e     // Catch:{ RuntimeException -> 0x0111 }
            r6 = r6[r5]     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r7 = "ImageLength"
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0111 }
            java.nio.ByteOrder r8 = r10.f6210g     // Catch:{ RuntimeException -> 0x0111 }
            c2.a$d r0 = p034c2.C1759a.C1763d.m5057e(r0, r8)     // Catch:{ RuntimeException -> 0x0111 }
            r6.put(r7, r0)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x008e:
            r0 = 6
            if (r4 == 0) goto L_0x00b8
            r6 = 1
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0111 }
            r7 = 90
            if (r4 == r7) goto L_0x00a8
            r7 = 180(0xb4, float:2.52E-43)
            if (r4 == r7) goto L_0x00a6
            r7 = 270(0x10e, float:3.78E-43)
            if (r4 == r7) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            r6 = 8
            goto L_0x00a9
        L_0x00a6:
            r6 = 3
            goto L_0x00a9
        L_0x00a8:
            r6 = 6
        L_0x00a9:
            java.util.HashMap<java.lang.String, c2.a$d>[] r4 = r10.f6208e     // Catch:{ RuntimeException -> 0x0111 }
            r4 = r4[r5]     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r7 = "Orientation"
            java.nio.ByteOrder r8 = r10.f6210g     // Catch:{ RuntimeException -> 0x0111 }
            c2.a$d r6 = p034c2.C1759a.C1763d.m5057e(r6, r8)     // Catch:{ RuntimeException -> 0x0111 }
            r4.put(r7, r6)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x00b8:
            if (r2 == 0) goto L_0x010b
            if (r3 == 0) goto L_0x010b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0111 }
            if (r3 <= r0) goto L_0x0103
            long r6 = (long) r2     // Catch:{ RuntimeException -> 0x0111 }
            r11.mo6587c(r6)     // Catch:{ RuntimeException -> 0x0111 }
            byte[] r4 = new byte[r0]     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r11.read(r4)     // Catch:{ RuntimeException -> 0x0111 }
            if (r6 != r0) goto L_0x00fb
            int r2 = r2 + r0
            int r3 = r3 + -6
            byte[] r0 = f6192c0     // Catch:{ RuntimeException -> 0x0111 }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ RuntimeException -> 0x0111 }
            if (r0 == 0) goto L_0x00f3
            byte[] r0 = new byte[r3]     // Catch:{ RuntimeException -> 0x0111 }
            int r11 = r11.read(r0)     // Catch:{ RuntimeException -> 0x0111 }
            if (r11 != r3) goto L_0x00eb
            r10.f6218o = r2     // Catch:{ RuntimeException -> 0x0111 }
            r10.mo6516A(r5, r0)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x010b
        L_0x00eb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r0 = "Can't read exif"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0111 }
            throw r11     // Catch:{ RuntimeException -> 0x0111 }
        L_0x00f3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r0 = "Invalid identifier"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0111 }
            throw r11     // Catch:{ RuntimeException -> 0x0111 }
        L_0x00fb:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r0 = "Can't read identifier"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0111 }
            throw r11     // Catch:{ RuntimeException -> 0x0111 }
        L_0x0103:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0111 }
            java.lang.String r0 = "Invalid exif length"
            r11.<init>(r0)     // Catch:{ RuntimeException -> 0x0111 }
            throw r11     // Catch:{ RuntimeException -> 0x0111 }
        L_0x010b:
            r1.release()
            return
        L_0x010f:
            r11 = move-exception
            goto L_0x0119
        L_0x0111:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x010f }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r11.<init>(r0)     // Catch:{ all -> 0x010f }
            throw r11     // Catch:{ all -> 0x010f }
        L_0x0119:
            r1.release()
            throw r11
        L_0x011d:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6536i(c2.a$g):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x014c A[LOOP:0: B:8:0x0024->B:79:0x014c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0154 A[SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6537j(p034c2.C1759a.C1761b r18, int r19, int r20) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = f6197t
            if (r3 == 0) goto L_0x000d
            java.util.Objects.toString(r18)
        L_0x000d:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f6228c = r3
            byte r3 = r18.readByte()
            java.lang.String r4 = "Invalid marker: "
            r5 = -1
            if (r3 != r5) goto L_0x0195
            byte r6 = r18.readByte()
            r7 = -40
            if (r6 != r7) goto L_0x017e
            r3 = 2
            r4 = 2
        L_0x0024:
            byte r6 = r18.readByte()
            if (r6 != r5) goto L_0x0165
            r5 = 1
            int r4 = r4 + r5
            byte r6 = r18.readByte()
            boolean r7 = f6197t
            if (r7 == 0) goto L_0x0039
            r8 = r6 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r8)
        L_0x0039:
            int r4 = r4 + r5
            r8 = -39
            if (r6 == r8) goto L_0x0160
            r8 = -38
            if (r6 != r8) goto L_0x0044
            goto L_0x0160
        L_0x0044:
            int r8 = r18.readUnsignedShort()
            int r8 = r8 - r3
            int r4 = r4 + r3
            if (r7 == 0) goto L_0x0051
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.Integer.toHexString(r3)
        L_0x0051:
            java.lang.String r3 = "Invalid length"
            if (r8 < 0) goto L_0x015a
            r7 = -31
            r9 = 0
            if (r6 == r7) goto L_0x00d1
            r7 = -2
            if (r6 == r7) goto L_0x00a5
            switch(r6) {
                case -64: goto L_0x006b;
                case -63: goto L_0x006b;
                case -62: goto L_0x006b;
                case -61: goto L_0x006b;
                default: goto L_0x0060;
            }
        L_0x0060:
            switch(r6) {
                case -59: goto L_0x006b;
                case -58: goto L_0x006b;
                case -57: goto L_0x006b;
                default: goto L_0x0063;
            }
        L_0x0063:
            switch(r6) {
                case -55: goto L_0x006b;
                case -54: goto L_0x006b;
                case -53: goto L_0x006b;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r6) {
                case -51: goto L_0x006b;
                case -50: goto L_0x006b;
                case -49: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x014a
        L_0x006b:
            r1.mo6555a(r5)
            java.util.HashMap<java.lang.String, c2.a$d>[] r5 = r0.f6208e
            r5 = r5[r2]
            r6 = 4
            if (r2 == r6) goto L_0x0078
            java.lang.String r7 = "ImageLength"
            goto L_0x007a
        L_0x0078:
            java.lang.String r7 = "ThumbnailImageLength"
        L_0x007a:
            int r9 = r18.readUnsignedShort()
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.f6210g
            c2.a$d r9 = p034c2.C1759a.C1763d.m5054b(r9, r11)
            r5.put(r7, r9)
            java.util.HashMap<java.lang.String, c2.a$d>[] r5 = r0.f6208e
            r5 = r5[r2]
            if (r2 == r6) goto L_0x0091
            java.lang.String r6 = "ImageWidth"
            goto L_0x0093
        L_0x0091:
            java.lang.String r6 = "ThumbnailImageWidth"
        L_0x0093:
            int r7 = r18.readUnsignedShort()
            long r9 = (long) r7
            java.nio.ByteOrder r7 = r0.f6210g
            c2.a$d r7 = p034c2.C1759a.C1763d.m5054b(r9, r7)
            r5.put(r6, r7)
            int r8 = r8 + -5
            goto L_0x014a
        L_0x00a5:
            byte[] r6 = new byte[r8]
            int r7 = r1.read(r6)
            if (r7 != r8) goto L_0x00c9
            java.lang.String r7 = "UserComment"
            java.lang.String r8 = r0.mo6532e(r7)
            if (r8 != 0) goto L_0x0149
            java.util.HashMap<java.lang.String, c2.a$d>[] r8 = r0.f6208e
            r5 = r8[r5]
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = f6191b0
            r8.<init>(r6, r9)
            c2.a$d r6 = p034c2.C1759a.C1763d.m5053a(r8)
            r5.put(r7, r6)
            goto L_0x0149
        L_0x00c9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x00d1:
            byte[] r6 = new byte[r8]
            r1.readFully(r6)
            int r7 = r4 + r8
            byte[] r10 = f6192c0
            if (r10 != 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            int r11 = r10.length
            if (r8 >= r11) goto L_0x00e1
            goto L_0x00eb
        L_0x00e1:
            r11 = 0
        L_0x00e2:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x00f0
            byte r12 = r6[r11]
            byte r13 = r10[r11]
            if (r12 == r13) goto L_0x00ed
        L_0x00eb:
            r11 = 0
            goto L_0x00f1
        L_0x00ed:
            int r11 = r11 + 1
            goto L_0x00e2
        L_0x00f0:
            r11 = 1
        L_0x00f1:
            if (r11 == 0) goto L_0x010a
            int r5 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r6, r5, r8)
            int r4 = r19 + r4
            int r6 = r10.length
            int r4 = r4 + r6
            r0.f6218o = r4
            r0.mo6516A(r2, r5)
            c2.a$b r4 = new c2.a$b
            r4.<init>((byte[]) r5)
            r0.mo6525J(r4)
            goto L_0x0148
        L_0x010a:
            byte[] r10 = f6193d0
            if (r10 != 0) goto L_0x010f
            goto L_0x011d
        L_0x010f:
            int r11 = r10.length
            if (r8 >= r11) goto L_0x0113
            goto L_0x011d
        L_0x0113:
            r11 = 0
        L_0x0114:
            int r12 = r10.length
            if (r11 >= r12) goto L_0x0122
            byte r12 = r6[r11]
            byte r13 = r10[r11]
            if (r12 == r13) goto L_0x011f
        L_0x011d:
            r11 = 0
            goto L_0x0123
        L_0x011f:
            int r11 = r11 + 1
            goto L_0x0114
        L_0x0122:
            r11 = 1
        L_0x0123:
            if (r11 == 0) goto L_0x0148
            int r11 = r10.length
            int r4 = r4 + r11
            int r10 = r10.length
            byte[] r6 = java.util.Arrays.copyOfRange(r6, r10, r8)
            java.lang.String r8 = "Xmp"
            java.lang.String r10 = r0.mo6532e(r8)
            if (r10 != 0) goto L_0x0148
            java.util.HashMap<java.lang.String, c2.a$d>[] r10 = r0.f6208e
            r9 = r10[r9]
            c2.a$d r10 = new c2.a$d
            r12 = 1
            int r13 = r6.length
            long r14 = (long) r4
            r11 = r10
            r16 = r6
            r11.<init>(r12, r13, r14, r16)
            r9.put(r8, r10)
            r0.f6222s = r5
        L_0x0148:
            r4 = r7
        L_0x0149:
            r8 = 0
        L_0x014a:
            if (r8 < 0) goto L_0x0154
            r1.mo6555a(r8)
            int r4 = r4 + r8
            r3 = 2
            r5 = -1
            goto L_0x0024
        L_0x0154:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r3)
            throw r1
        L_0x015a:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r3)
            throw r1
        L_0x0160:
            java.nio.ByteOrder r2 = r0.f6210g
            r1.f6228c = r2
            return
        L_0x0165:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            r3 = r6 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x017e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0195:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6537j(c2.a$b, int, int):void");
    }

    /* renamed from: k */
    public final double[] mo6538k() {
        String e = mo6532e("GPSLatitude");
        String e2 = mo6532e("GPSLatitudeRef");
        String e3 = mo6532e("GPSLongitude");
        String e4 = mo6532e("GPSLongitudeRef");
        if (e == null || e2 == null || e3 == null || e4 == null) {
            return null;
        }
        try {
            return new double[]{m5009b(e, e2), m5009b(e3, e4)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{e, e2, e3, e4});
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c7, code lost:
        if (r6 != null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0115 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0117 A[SYNTHETIC, Splitter:B:106:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0149 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0105  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6539l(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
        L_0x0012:
            byte[] r5 = f6202y
            int r6 = r5.length
            r7 = 1
            if (r4 >= r6) goto L_0x0023
            byte r6 = r3[r4]
            byte r5 = r5[r4]
            if (r6 == r5) goto L_0x0020
            r4 = 0
            goto L_0x0024
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0023:
            r4 = 1
        L_0x0024:
            r5 = 4
            if (r4 == 0) goto L_0x0028
            return r5
        L_0x0028:
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r6 = "FUJIFILMCCD-RAW"
            byte[] r4 = r6.getBytes(r4)
            r6 = 0
        L_0x0033:
            int r8 = r4.length
            if (r6 >= r8) goto L_0x0041
            byte r8 = r3[r6]
            byte r9 = r4[r6]
            if (r8 == r9) goto L_0x003e
            r4 = 0
            goto L_0x0042
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0033
        L_0x0041:
            r4 = 1
        L_0x0042:
            if (r4 == 0) goto L_0x0047
            r0 = 9
            return r0
        L_0x0047:
            r4 = 0
            c2.a$b r6 = new c2.a$b     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            r6.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00c5, all -> 0x00be }
            int r8 = r6.readInt()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            long r8 = (long) r8     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r10 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r6.read(r10)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            byte[] r11 = f6203z     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r10 = java.util.Arrays.equals(r10, r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r10 != 0) goto L_0x0061
            goto L_0x00c9
        L_0x0061:
            r10 = 16
            r12 = 8
            r14 = 1
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x0074
            long r8 = r6.readLong()     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r16 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r16 >= 0) goto L_0x0075
            goto L_0x00c9
        L_0x0074:
            r10 = r12
        L_0x0075:
            long r0 = (long) r2     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007b
            r8 = r0
        L_0x007b:
            long r8 = r8 - r10
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            goto L_0x00c9
        L_0x0081:
            byte[] r0 = new byte[r5]     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            r1 = 0
            r10 = 0
            r11 = 0
        L_0x0087:
            r12 = 4
            long r12 = r8 / r12
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x00c9
            int r12 = r6.read(r0)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r12 == r5) goto L_0x0096
            goto L_0x00c9
        L_0x0096:
            int r12 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x009b
            goto L_0x00b7
        L_0x009b:
            byte[] r12 = f6164A     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r12 == 0) goto L_0x00a5
            r10 = 1
            goto L_0x00ae
        L_0x00a5:
            byte[] r12 = f6165B     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            boolean r12 = java.util.Arrays.equals(r0, r12)     // Catch:{ Exception -> 0x00bc, all -> 0x00b9 }
            if (r12 == 0) goto L_0x00ae
            r11 = 1
        L_0x00ae:
            if (r10 == 0) goto L_0x00b7
            if (r11 == 0) goto L_0x00b7
            r6.close()
            r0 = 1
            goto L_0x00cd
        L_0x00b7:
            long r1 = r1 + r14
            goto L_0x0087
        L_0x00b9:
            r0 = move-exception
            r4 = r6
            goto L_0x00bf
        L_0x00bc:
            goto L_0x00c7
        L_0x00be:
            r0 = move-exception
        L_0x00bf:
            if (r4 == 0) goto L_0x00c4
            r4.close()
        L_0x00c4:
            throw r0
        L_0x00c5:
            r6 = r4
        L_0x00c7:
            if (r6 == 0) goto L_0x00cc
        L_0x00c9:
            r6.close()
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            if (r0 == 0) goto L_0x00d2
            r0 = 12
            return r0
        L_0x00d2:
            c2.a$b r1 = new c2.a$b     // Catch:{ Exception -> 0x0109, all -> 0x0100 }
            r1.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0109, all -> 0x0100 }
            java.nio.ByteOrder r0 = m5012z(r1)     // Catch:{ Exception -> 0x00fc, all -> 0x00f7 }
            r2 = r17
            r2.f6210g = r0     // Catch:{ Exception -> 0x00fe, all -> 0x00f5 }
            r1.f6228c = r0     // Catch:{ Exception -> 0x00fe, all -> 0x00f5 }
            short r0 = r1.readShort()     // Catch:{ Exception -> 0x00fe, all -> 0x00f5 }
            r6 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r6) goto L_0x00f0
            r6 = 21330(0x5352, float:2.989E-41)
            if (r0 != r6) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            r0 = 0
            goto L_0x00f1
        L_0x00f0:
            r0 = 1
        L_0x00f1:
            r1.close()
            goto L_0x0113
        L_0x00f5:
            r0 = move-exception
            goto L_0x00fa
        L_0x00f7:
            r0 = move-exception
            r2 = r17
        L_0x00fa:
            r4 = r1
            goto L_0x0103
        L_0x00fc:
            r2 = r17
        L_0x00fe:
            goto L_0x010d
        L_0x0100:
            r0 = move-exception
            r2 = r17
        L_0x0103:
            if (r4 == 0) goto L_0x0108
            r4.close()
        L_0x0108:
            throw r0
        L_0x0109:
            r2 = r17
            r1 = r4
        L_0x010d:
            if (r1 == 0) goto L_0x0112
            r1.close()
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 == 0) goto L_0x0117
            r0 = 7
            return r0
        L_0x0117:
            c2.a$b r1 = new c2.a$b     // Catch:{ Exception -> 0x0140, all -> 0x0139 }
            r1.<init>((byte[]) r3)     // Catch:{ Exception -> 0x0140, all -> 0x0139 }
            java.nio.ByteOrder r0 = m5012z(r1)     // Catch:{ Exception -> 0x0136, all -> 0x0133 }
            r2.f6210g = r0     // Catch:{ Exception -> 0x0136, all -> 0x0133 }
            r1.f6228c = r0     // Catch:{ Exception -> 0x0136, all -> 0x0133 }
            short r0 = r1.readShort()     // Catch:{ Exception -> 0x0136, all -> 0x0133 }
            r4 = 85
            if (r0 != r4) goto L_0x012e
            r0 = 1
            goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            r1.close()
            goto L_0x0147
        L_0x0133:
            r0 = move-exception
            r4 = r1
            goto L_0x013a
        L_0x0136:
            r4 = r1
            goto L_0x0141
        L_0x0139:
            r0 = move-exception
        L_0x013a:
            if (r4 == 0) goto L_0x013f
            r4.close()
        L_0x013f:
            throw r0
        L_0x0140:
        L_0x0141:
            if (r4 == 0) goto L_0x0146
            r4.close()
        L_0x0146:
            r0 = 0
        L_0x0147:
            if (r0 == 0) goto L_0x014c
            r0 = 10
            return r0
        L_0x014c:
            r0 = 0
        L_0x014d:
            byte[] r1 = f6168E
            int r4 = r1.length
            if (r0 >= r4) goto L_0x015d
            byte r4 = r3[r0]
            byte r1 = r1[r0]
            if (r4 == r1) goto L_0x015a
            r0 = 0
            goto L_0x015e
        L_0x015a:
            int r0 = r0 + 1
            goto L_0x014d
        L_0x015d:
            r0 = 1
        L_0x015e:
            if (r0 == 0) goto L_0x0163
            r0 = 13
            return r0
        L_0x0163:
            r0 = 0
        L_0x0164:
            byte[] r1 = f6172I
            int r4 = r1.length
            if (r0 >= r4) goto L_0x0173
            byte r4 = r3[r0]
            byte r1 = r1[r0]
            if (r4 == r1) goto L_0x0170
            goto L_0x0184
        L_0x0170:
            int r0 = r0 + 1
            goto L_0x0164
        L_0x0173:
            r0 = 0
        L_0x0174:
            byte[] r1 = f6173J
            int r4 = r1.length
            if (r0 >= r4) goto L_0x0189
            byte[] r4 = f6172I
            int r4 = r4.length
            int r4 = r4 + r0
            int r4 = r4 + r5
            byte r4 = r3[r4]
            byte r1 = r1[r0]
            if (r4 == r1) goto L_0x0186
        L_0x0184:
            r7 = 0
            goto L_0x0189
        L_0x0186:
            int r0 = r0 + 1
            goto L_0x0174
        L_0x0189:
            if (r7 == 0) goto L_0x018e
            r0 = 14
            return r0
        L_0x018e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6539l(java.io.BufferedInputStream):int");
    }

    /* renamed from: m */
    public final void mo6540m(C1766g gVar) throws IOException {
        int i;
        int i2;
        mo6543p(gVar);
        C1763d dVar = this.f6208e[1].get("MakerNote");
        if (dVar != null) {
            C1766g gVar2 = new C1766g(dVar.f6236d);
            gVar2.f6228c = this.f6210g;
            byte[] bArr = f6166C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.mo6587c(0);
            byte[] bArr3 = f6167D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.mo6587c(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.mo6587c(12);
            }
            mo6517B(gVar2, 6);
            C1763d dVar2 = this.f6208e[7].get("PreviewImageStart");
            C1763d dVar3 = this.f6208e[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f6208e[5].put("JPEGInterchangeFormat", dVar2);
                this.f6208e[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            C1763d dVar4 = this.f6208e[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.mo6584j(this.f6210g);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                    int i5 = (i3 - i4) + 1;
                    int i6 = (i - i2) + 1;
                    if (i5 < i6) {
                        int i7 = i5 + i6;
                        i6 = i7 - i6;
                        i5 = i7 - i6;
                    }
                    C1763d e = C1763d.m5057e(i5, this.f6210g);
                    C1763d e2 = C1763d.m5057e(i6, this.f6210g);
                    this.f6208e[0].put("ImageWidth", e);
                    this.f6208e[0].put("ImageLength", e2);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo6541n(C1761b bVar) throws IOException {
        if (f6197t) {
            Objects.toString(bVar);
        }
        bVar.f6228c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f6168E;
        bVar.mo6555a(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16) {
                        if (!Arrays.equals(bArr2, f6170G)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                    }
                    if (!Arrays.equals(bArr2, f6171H)) {
                        if (Arrays.equals(bArr2, f6169F)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f6218o = i2;
                                    mo6516A(0, bArr3);
                                    mo6528M();
                                    mo6525J(new C1761b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + C1767b.m5064a(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.mo6555a(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: o */
    public final void mo6542o(C1761b bVar) throws IOException {
        if (f6197t) {
            Objects.toString(bVar);
        }
        bVar.mo6555a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.mo6555a(i - bVar.f6229d);
        bVar.read(bArr4);
        mo6537j(new C1761b(bArr4), i, 5);
        bVar.mo6555a(i3 - bVar.f6229d);
        bVar.f6228c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f6184U.f6237a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C1763d e = C1763d.m5057e(readShort, this.f6210g);
                C1763d e2 = C1763d.m5057e(readShort2, this.f6210g);
                this.f6208e[0].put("ImageLength", e);
                this.f6208e[0].put("ImageWidth", e2);
                return;
            }
            bVar.mo6555a(readUnsignedShort2);
        }
    }

    /* renamed from: p */
    public final void mo6543p(C1766g gVar) throws IOException {
        C1763d dVar;
        mo6550x(gVar);
        mo6517B(gVar, 0);
        mo6527L(gVar, 0);
        mo6527L(gVar, 5);
        mo6527L(gVar, 4);
        mo6528M();
        if (this.f6207d == 8 && (dVar = this.f6208e[1].get("MakerNote")) != null) {
            C1766g gVar2 = new C1766g(dVar.f6236d);
            gVar2.f6228c = this.f6210g;
            gVar2.mo6555a(6);
            mo6517B(gVar2, 9);
            C1763d dVar2 = this.f6208e[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f6208e[1].put("ColorSpace", dVar2);
            }
        }
    }

    /* renamed from: q */
    public final void mo6544q(C1766g gVar) throws IOException {
        if (f6197t) {
            Objects.toString(gVar);
        }
        mo6543p(gVar);
        C1763d dVar = this.f6208e[0].get("JpgFromRaw");
        if (dVar != null) {
            mo6537j(new C1761b(dVar.f6236d), (int) dVar.f6235c, 5);
        }
        C1763d dVar2 = this.f6208e[0].get("ISO");
        C1763d dVar3 = this.f6208e[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f6208e[1].put("PhotographicSensitivity", dVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005f A[SYNTHETIC, Splitter:B:33:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[Catch:{ Exception -> 0x009c, all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0096 A[SYNTHETIC, Splitter:B:59:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00a1 A[SYNTHETIC, Splitter:B:68:0x00a1] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo6545r() {
        /*
            r10 = this;
            boolean r0 = r10.f6211h
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            byte[] r0 = r10.f6216m
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            android.content.res.AssetManager$AssetInputStream r0 = r10.f6206c     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            if (r0 == 0) goto L_0x0028
            boolean r2 = r0.markSupported()     // Catch:{ Exception -> 0x0025, all -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r0.reset()     // Catch:{ Exception -> 0x0025, all -> 0x001e }
        L_0x0018:
            r2 = r1
            goto L_0x0049
        L_0x001a:
            p034c2.C1767b.m5065b(r0)
            return r1
        L_0x001e:
            r2 = move-exception
            r9 = r1
            r1 = r0
            r0 = r2
            r2 = r9
            goto L_0x0091
        L_0x0025:
            r2 = r1
            goto L_0x009c
        L_0x0028:
            java.lang.String r0 = r10.f6204a     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            if (r0 == 0) goto L_0x0034
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            java.lang.String r2 = r10.f6204a     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            r0.<init>(r2)     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            goto L_0x0018
        L_0x0034:
            java.io.FileDescriptor r0 = r10.f6205b     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            java.io.FileDescriptor r0 = p034c2.C1767b.C1768a.m5070b(r0)     // Catch:{ Exception -> 0x009a, all -> 0x008e }
            r2 = 0
            int r4 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            p034c2.C1767b.C1768a.m5071c(r0, r2, r4)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0087 }
            r9 = r2
            r2 = r0
            r0 = r9
        L_0x0049:
            int r3 = r10.f6214k     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r4 = r10.f6218o     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r3 = r3 + r4
            long r3 = (long) r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            long r3 = r0.skip(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r5 = r10.f6214k     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r6 = r10.f6218o     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r5 = r5 + r6
            long r5 = (long) r5
            java.lang.String r7 = "Corrupted image"
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x007c
            int r3 = r10.f6215l     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r4 = r0.read(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            int r5 = r10.f6215l     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            if (r4 != r5) goto L_0x0076
            r10.f6216m = r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            p034c2.C1767b.m5065b(r0)
            if (r2 == 0) goto L_0x0075
            p034c2.C1767b.C1768a.m5069a(r2)     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            return r3
        L_0x0076:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            throw r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
        L_0x007c:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            r3.<init>(r7)     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
            throw r3     // Catch:{ Exception -> 0x009c, all -> 0x0082 }
        L_0x0082:
            r1 = move-exception
            r9 = r1
            r1 = r0
        L_0x0085:
            r0 = r9
            goto L_0x0091
        L_0x0087:
            r2 = move-exception
            r9 = r2
            r2 = r0
            goto L_0x0085
        L_0x008b:
            r2 = r0
            r0 = r1
            goto L_0x009c
        L_0x008e:
            r2 = move-exception
            r0 = r2
            r2 = r1
        L_0x0091:
            p034c2.C1767b.m5065b(r1)
            if (r2 == 0) goto L_0x0099
            p034c2.C1767b.C1768a.m5069a(r2)     // Catch:{ Exception -> 0x0099 }
        L_0x0099:
            throw r0
        L_0x009a:
            r0 = r1
            r2 = r0
        L_0x009c:
            p034c2.C1767b.m5065b(r0)
            if (r2 == 0) goto L_0x00a4
            p034c2.C1767b.C1768a.m5069a(r2)     // Catch:{ Exception -> 0x00a4 }
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6545r():byte[]");
    }

    /* renamed from: s */
    public final void mo6546s(C1761b bVar) throws IOException {
        if (f6197t) {
            Objects.toString(bVar);
        }
        bVar.f6228c = ByteOrder.LITTLE_ENDIAN;
        bVar.mo6555a(f6172I.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f6173J;
        bVar.mo6555a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f6174K, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f6218o = i;
                            mo6516A(0, bArr3);
                            mo6525J(new C1761b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C1767b.m5064a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.mo6555a(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: u */
    public final void mo6547u(C1761b bVar, HashMap hashMap) throws IOException {
        C1763d dVar = (C1763d) hashMap.get("JPEGInterchangeFormat");
        C1763d dVar2 = (C1763d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int h = dVar.mo6582h(this.f6210g);
            int h2 = dVar2.mo6582h(this.f6210g);
            if (this.f6207d == 7) {
                h += this.f6219p;
            }
            if (h > 0 && h2 > 0) {
                this.f6211h = true;
                if (this.f6204a == null && this.f6206c == null && this.f6205b == null) {
                    byte[] bArr = new byte[h2];
                    bVar.skip((long) h);
                    bVar.read(bArr);
                    this.f6216m = bArr;
                }
                this.f6214k = h;
                this.f6215l = h2;
            }
        }
    }

    /* renamed from: v */
    public final boolean mo6548v(HashMap hashMap) throws IOException {
        C1763d dVar = (C1763d) hashMap.get("ImageLength");
        C1763d dVar2 = (C1763d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        int h = dVar.mo6582h(this.f6210g);
        int h2 = dVar2.mo6582h(this.f6210g);
        if (h > 512 || h2 > 512) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|40|(1:52)) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7 = f6197t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
        mo6530a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008f, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0095, code lost:
        mo6530a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009a, code lost:
        if (f6197t != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009c, code lost:
        mo6551y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009f, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037 A[Catch:{ IOException | UnsupportedOperationException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[Catch:{ IOException | UnsupportedOperationException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6549w(java.io.InputStream r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00a0
            r0 = 0
            r1 = 0
        L_0x0004:
            c2.a$e[][] r2 = f6185V     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r2 = r2.length     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            if (r1 >= r2) goto L_0x0015
            java.util.HashMap<java.lang.String, c2.a$d>[] r2 = r6.f6208e     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r3.<init>()     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r2[r1] = r3     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r7, r2)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r7 = r6.mo6539l(r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r6.f6207d = r7     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r2 = 14
            r3 = 13
            r4 = 9
            r5 = 4
            if (r7 == r5) goto L_0x0034
            if (r7 == r4) goto L_0x0034
            if (r7 == r3) goto L_0x0034
            if (r7 != r2) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r7 = 1
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            if (r7 == 0) goto L_0x0062
            c2.a$g r7 = new c2.a$g     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r7.<init>((java.io.InputStream) r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r0 = r6.f6207d     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r1 = 12
            if (r0 != r1) goto L_0x0046
            r6.mo6536i(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0058
        L_0x0046:
            r1 = 7
            if (r0 != r1) goto L_0x004d
            r6.mo6540m(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0058
        L_0x004d:
            r1 = 10
            if (r0 != r1) goto L_0x0055
            r6.mo6544q(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0058
        L_0x0055:
            r6.mo6543p(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
        L_0x0058:
            int r0 = r6.f6218o     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            long r0 = (long) r0     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r7.mo6587c(r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r6.mo6525J(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x0062:
            c2.a$b r7 = new c2.a$b     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            r7.<init>((java.io.InputStream) r1)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            int r1 = r6.f6207d     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            if (r1 != r5) goto L_0x006f
            r6.mo6537j(r7, r0, r0)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x006f:
            if (r1 != r3) goto L_0x0075
            r6.mo6541n(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x0075:
            if (r1 != r4) goto L_0x007b
            r6.mo6542o(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
            goto L_0x0080
        L_0x007b:
            if (r1 != r2) goto L_0x0080
            r6.mo6546s(r7)     // Catch:{ IOException | UnsupportedOperationException -> 0x008a }
        L_0x0080:
            r6.mo6530a()
            boolean r7 = f6197t
            if (r7 == 0) goto L_0x0094
            goto L_0x0091
        L_0x0088:
            r7 = move-exception
            goto L_0x0095
        L_0x008a:
            boolean r7 = f6197t     // Catch:{ all -> 0x0088 }
            r6.mo6530a()
            if (r7 == 0) goto L_0x0094
        L_0x0091:
            r6.mo6551y()
        L_0x0094:
            return
        L_0x0095:
            r6.mo6530a()
            boolean r0 = f6197t
            if (r0 == 0) goto L_0x009f
            r6.mo6551y()
        L_0x009f:
            throw r7
        L_0x00a0:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c2.C1759a.mo6549w(java.io.InputStream):void");
    }

    /* renamed from: x */
    public final void mo6550x(C1761b bVar) throws IOException {
        ByteOrder z = m5012z(bVar);
        this.f6210g = z;
        bVar.f6228c = z;
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f6207d;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bVar.mo6555a(i2);
                    return;
                }
                return;
            }
            throw new IOException(C16759e.m42349e("Invalid first Ifd offset: ", readInt));
        }
        StringBuilder k = C13555b.m33972k("Invalid start code: ");
        k.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(k.toString());
    }

    /* renamed from: y */
    public final void mo6551y() {
        for (int i = 0; i < this.f6208e.length; i++) {
            this.f6208e[i].size();
            for (Map.Entry next : this.f6208e[i].entrySet()) {
                C1763d dVar = (C1763d) next.getValue();
                String str = (String) next.getKey();
                dVar.toString();
                dVar.mo6583i(this.f6210g);
            }
        }
    }

    /* renamed from: c2.a$g */
    public static class C1766g extends C1761b {
        public C1766g(byte[] bArr) throws IOException {
            super(bArr);
            this.f6227b.mark(Integer.MAX_VALUE);
        }

        /* renamed from: c */
        public final void mo6587c(long j) throws IOException {
            int i = this.f6229d;
            if (((long) i) > j) {
                this.f6229d = 0;
                this.f6227b.reset();
            } else {
                j -= (long) i;
            }
            mo6555a((int) j);
        }

        public C1766g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f6227b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* renamed from: c2.a$e */
    public static class C1764e {

        /* renamed from: a */
        public final int f6237a;

        /* renamed from: b */
        public final String f6238b;

        /* renamed from: c */
        public final int f6239c;

        /* renamed from: d */
        public final int f6240d;

        public C1764e(String str, int i, int i2) {
            this.f6238b = str;
            this.f6237a = i;
            this.f6239c = i2;
            this.f6240d = -1;
        }

        public C1764e(String str, int i, int i2, int i3) {
            this.f6238b = str;
            this.f6237a = i;
            this.f6239c = i2;
            this.f6240d = i3;
        }
    }

    public C1759a(InputStream inputStream) throws IOException {
        boolean z;
        C1764e[][] eVarArr = f6185V;
        this.f6208e = new HashMap[eVarArr.length];
        this.f6209f = new HashSet(eVarArr.length);
        if (inputStream != null) {
            this.f6204a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f6206c = (AssetManager.AssetInputStream) inputStream;
                this.f6205b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        C1767b.C1768a.m5071c(fileInputStream.getFD(), 0, OsConstants.SEEK_CUR);
                        z = true;
                    } catch (Exception unused) {
                        z = false;
                    }
                    if (z) {
                        this.f6206c = null;
                        this.f6205b = fileInputStream.getFD();
                    }
                }
                this.f6206c = null;
                this.f6205b = null;
            }
            mo6549w(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
