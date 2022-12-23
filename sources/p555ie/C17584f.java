package p555ie;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Logger;
import p358af.C13437d;

/* renamed from: ie.f */
public final class C17584f implements Closeable {

    /* renamed from: h */
    public static final Logger f45212h = Logger.getLogger(C17584f.class.getName());

    /* renamed from: b */
    public final RandomAccessFile f45213b;

    /* renamed from: c */
    public int f45214c;

    /* renamed from: d */
    public int f45215d;

    /* renamed from: e */
    public C17585a f45216e;

    /* renamed from: f */
    public C17585a f45217f;

    /* renamed from: g */
    public final byte[] f45218g;

    /* renamed from: ie.f$a */
    public static class C17585a {

        /* renamed from: c */
        public static final C17585a f45219c = new C17585a(0, 0);

        /* renamed from: a */
        public final int f45220a;

        /* renamed from: b */
        public final int f45221b;

        public C17585a(int i, int i2) {
            this.f45220a = i;
            this.f45221b = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C17585a.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f45220a);
            sb.append(", length = ");
            return C13437d.m33707l(sb, this.f45221b, "]");
        }
    }

    /* JADX INFO: finally extract failed */
    public C17584f(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f45218g = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                int i2 = 0;
                for (int i3 = 4; i < i3; i3 = 4) {
                    int i4 = iArr[i];
                    bArr2[i2] = (byte) (i4 >> 24);
                    bArr2[i2 + 1] = (byte) (i4 >> 16);
                    bArr2[i2 + 2] = (byte) (i4 >> 8);
                    bArr2[i2 + 3] = (byte) i4;
                    i2 += 4;
                    i++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f45213b = randomAccessFile2;
        randomAccessFile2.seek(0);
        randomAccessFile2.readFully(bArr);
        int k = m43705k(bArr, 0);
        this.f45214c = k;
        if (((long) k) <= randomAccessFile2.length()) {
            this.f45215d = m43705k(bArr, 4);
            int k2 = m43705k(bArr, 8);
            int k3 = m43705k(bArr, 12);
            this.f45216e = mo50041j(k2);
            this.f45217f = mo50041j(k3);
            return;
        }
        StringBuilder k4 = C13555b.m33972k("File is truncated. Expected length: ");
        k4.append(this.f45214c);
        k4.append(", Actual length: ");
        k4.append(randomAccessFile2.length());
        throw new IOException(k4.toString());
    }

    /* renamed from: k */
    public static int m43705k(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final synchronized void close() throws IOException {
        this.f45213b.close();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public final void mo50039e(byte[] r10) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r10.length
            monitor-enter(r9)
            r1 = r0 | 0
            if (r1 < 0) goto L_0x006d
            int r1 = r10.length     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r1 = r1 - r2
            if (r0 > r1) goto L_0x006d
            r9.mo50040f(r0)     // Catch:{ all -> 0x0073 }
            monitor-enter(r9)     // Catch:{ all -> 0x0073 }
            int r1 = r9.f45215d     // Catch:{ all -> 0x006a }
            r3 = 1
            if (r1 != 0) goto L_0x0016
            r1 = 1
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            r4 = 4
            if (r1 == 0) goto L_0x001e
            r5 = 16
            goto L_0x002a
        L_0x001e:
            ie.f$a r5 = r9.f45217f     // Catch:{ all -> 0x0073 }
            int r6 = r5.f45220a     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r4
            int r5 = r5.f45221b     // Catch:{ all -> 0x0073 }
            int r6 = r6 + r5
            int r5 = r9.mo50047w(r6)     // Catch:{ all -> 0x0073 }
        L_0x002a:
            ie.f$a r6 = new ie.f$a     // Catch:{ all -> 0x0073 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0073 }
            byte[] r7 = r9.f45218g     // Catch:{ all -> 0x0073 }
            int r8 = r0 >> 24
            byte r8 = (byte) r8     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            int r2 = r0 >> 16
            byte r2 = (byte) r2     // Catch:{ all -> 0x0073 }
            r7[r3] = r2     // Catch:{ all -> 0x0073 }
            r2 = 2
            int r8 = r0 >> 8
            byte r8 = (byte) r8     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            r2 = 3
            byte r8 = (byte) r0     // Catch:{ all -> 0x0073 }
            r7[r2] = r8     // Catch:{ all -> 0x0073 }
            r9.mo50044t(r5, r7, r4)     // Catch:{ all -> 0x0073 }
            int r2 = r5 + 4
            r9.mo50044t(r2, r10, r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0051
            r10 = r5
            goto L_0x0055
        L_0x0051:
            ie.f$a r10 = r9.f45216e     // Catch:{ all -> 0x0073 }
            int r10 = r10.f45220a     // Catch:{ all -> 0x0073 }
        L_0x0055:
            int r0 = r9.f45214c     // Catch:{ all -> 0x0073 }
            int r2 = r9.f45215d     // Catch:{ all -> 0x0073 }
            int r2 = r2 + r3
            r9.mo50048x(r0, r2, r10, r5)     // Catch:{ all -> 0x0073 }
            r9.f45217f = r6     // Catch:{ all -> 0x0073 }
            int r10 = r9.f45215d     // Catch:{ all -> 0x0073 }
            int r10 = r10 + r3
            r9.f45215d = r10     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0068
            r9.f45216e = r6     // Catch:{ all -> 0x0073 }
        L_0x0068:
            monitor-exit(r9)
            return
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x006d:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0073 }
            r10.<init>()     // Catch:{ all -> 0x0073 }
            throw r10     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17584f.mo50039e(byte[]):void");
    }

    /* renamed from: f */
    public final void mo50040f(int i) throws IOException {
        int i2 = i + 4;
        int v = this.f45214c - mo50046v();
        if (v < i2) {
            int i3 = this.f45214c;
            do {
                v += i3;
                i3 <<= 1;
            } while (v < i2);
            this.f45213b.setLength((long) i3);
            this.f45213b.getChannel().force(true);
            C17585a aVar = this.f45217f;
            int w = mo50047w(aVar.f45220a + 4 + aVar.f45221b);
            if (w < this.f45216e.f45220a) {
                FileChannel channel = this.f45213b.getChannel();
                channel.position((long) this.f45214c);
                long j = (long) (w - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f45217f.f45220a;
            int i5 = this.f45216e.f45220a;
            if (i4 < i5) {
                int i6 = (this.f45214c + i4) - 16;
                mo50048x(i3, this.f45215d, i5, i6);
                this.f45217f = new C17585a(i6, this.f45217f.f45221b);
            } else {
                mo50048x(i3, this.f45215d, i5, i4);
            }
            this.f45214c = i3;
        }
    }

    /* renamed from: j */
    public final C17585a mo50041j(int i) throws IOException {
        if (i == 0) {
            return C17585a.f45219c;
        }
        this.f45213b.seek((long) i);
        return new C17585a(i, this.f45213b.readInt());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: q */
    public final synchronized void mo50042q() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x0070 }
            int r0 = r6.f45215d     // Catch:{ all -> 0x0072 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            if (r3 != 0) goto L_0x006a
            if (r0 != r2) goto L_0x0038
            monitor-enter(r6)     // Catch:{ all -> 0x0070 }
            r0 = 4096(0x1000, float:5.74E-42)
            r6.mo50048x(r0, r1, r1, r1)     // Catch:{ all -> 0x0035 }
            r6.f45215d = r1     // Catch:{ all -> 0x0035 }
            ie.f$a r1 = p555ie.C17584f.C17585a.f45219c     // Catch:{ all -> 0x0035 }
            r6.f45216e = r1     // Catch:{ all -> 0x0035 }
            r6.f45217f = r1     // Catch:{ all -> 0x0035 }
            int r1 = r6.f45214c     // Catch:{ all -> 0x0035 }
            if (r1 <= r0) goto L_0x0031
            java.io.RandomAccessFile r1 = r6.f45213b     // Catch:{ all -> 0x0035 }
            long r3 = (long) r0     // Catch:{ all -> 0x0035 }
            r1.setLength(r3)     // Catch:{ all -> 0x0035 }
            java.io.RandomAccessFile r1 = r6.f45213b     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ all -> 0x0035 }
            r1.force(r2)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            r6.f45214c = r0     // Catch:{ all -> 0x0035 }
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            goto L_0x0068
        L_0x0035:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0038:
            ie.f$a r0 = r6.f45216e     // Catch:{ all -> 0x0070 }
            int r3 = r0.f45220a     // Catch:{ all -> 0x0070 }
            r4 = 4
            int r3 = r3 + r4
            int r0 = r0.f45221b     // Catch:{ all -> 0x0070 }
            int r3 = r3 + r0
            int r0 = r6.mo50047w(r3)     // Catch:{ all -> 0x0070 }
            byte[] r3 = r6.f45218g     // Catch:{ all -> 0x0070 }
            r6.mo50043r(r0, r3, r1, r4)     // Catch:{ all -> 0x0070 }
            byte[] r3 = r6.f45218g     // Catch:{ all -> 0x0070 }
            int r1 = m43705k(r3, r1)     // Catch:{ all -> 0x0070 }
            int r3 = r6.f45214c     // Catch:{ all -> 0x0070 }
            int r4 = r6.f45215d     // Catch:{ all -> 0x0070 }
            int r4 = r4 - r2
            ie.f$a r5 = r6.f45217f     // Catch:{ all -> 0x0070 }
            int r5 = r5.f45220a     // Catch:{ all -> 0x0070 }
            r6.mo50048x(r3, r4, r0, r5)     // Catch:{ all -> 0x0070 }
            int r3 = r6.f45215d     // Catch:{ all -> 0x0070 }
            int r3 = r3 - r2
            r6.f45215d = r3     // Catch:{ all -> 0x0070 }
            ie.f$a r2 = new ie.f$a     // Catch:{ all -> 0x0070 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0070 }
            r6.f45216e = r2     // Catch:{ all -> 0x0070 }
        L_0x0068:
            monitor-exit(r6)
            return
        L_0x006a:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            goto L_0x0075
        L_0x0072:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0075:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17584f.mo50042q():void");
    }

    /* renamed from: r */
    public final void mo50043r(int i, byte[] bArr, int i2, int i3) throws IOException {
        int w = mo50047w(i);
        int i4 = w + i3;
        int i5 = this.f45214c;
        if (i4 <= i5) {
            this.f45213b.seek((long) w);
            this.f45213b.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - w;
        this.f45213b.seek((long) w);
        this.f45213b.readFully(bArr, i2, i6);
        this.f45213b.seek(16);
        this.f45213b.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: t */
    public final void mo50044t(int i, byte[] bArr, int i2) throws IOException {
        int w = mo50047w(i);
        int i3 = w + i2;
        int i4 = this.f45214c;
        if (i3 <= i4) {
            this.f45213b.seek((long) w);
            this.f45213b.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - w;
        this.f45213b.seek((long) w);
        this.f45213b.write(bArr, 0, i5);
        this.f45213b.seek(16);
        this.f45213b.write(bArr, 0 + i5, i2 - i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        f45212h.log(java.util.logging.Level.WARNING, "read error", r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<ie.f> r1 = p555ie.C17584f.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "fileLength="
            r0.append(r1)
            int r1 = r7.f45214c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            int r1 = r7.f45215d
            r0.append(r1)
            java.lang.String r1 = ", first="
            r0.append(r1)
            ie.f$a r1 = r7.f45216e
            r0.append(r1)
            java.lang.String r1 = ", last="
            r0.append(r1)
            ie.f$a r1 = r7.f45217f
            r0.append(r1)
            java.lang.String r1 = ", element lengths=["
            r0.append(r1)
            monitor-enter(r7)     // Catch:{ IOException -> 0x0076 }
            ie.f$a r1 = r7.f45216e     // Catch:{ all -> 0x0073 }
            int r1 = r1.f45220a     // Catch:{ all -> 0x0073 }
            r2 = 0
            r3 = 1
            r4 = 0
        L_0x0048:
            int r5 = r7.f45215d     // Catch:{ all -> 0x0073 }
            if (r4 >= r5) goto L_0x0071
            ie.f$a r1 = r7.mo50041j(r1)     // Catch:{ all -> 0x0073 }
            ie.f$b r5 = new ie.f$b     // Catch:{ all -> 0x0073 }
            r5.<init>(r1)     // Catch:{ all -> 0x0073 }
            int r5 = r1.f45221b     // Catch:{ all -> 0x0073 }
            if (r3 == 0) goto L_0x005b
            r3 = 0
            goto L_0x0060
        L_0x005b:
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x0073 }
        L_0x0060:
            r0.append(r5)     // Catch:{ all -> 0x0073 }
            int r5 = r1.f45220a     // Catch:{ all -> 0x0073 }
            int r5 = r5 + 4
            int r1 = r1.f45221b     // Catch:{ all -> 0x0073 }
            int r5 = r5 + r1
            int r1 = r7.mo50047w(r5)     // Catch:{ all -> 0x0073 }
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0071:
            monitor-exit(r7)     // Catch:{ IOException -> 0x0076 }
            goto L_0x0080
        L_0x0073:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ IOException -> 0x0076 }
            throw r1     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            java.util.logging.Logger r2 = f45212h
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "read error"
            r2.log(r3, r4, r1)
        L_0x0080:
            java.lang.String r1 = "]]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p555ie.C17584f.toString():java.lang.String");
    }

    /* renamed from: v */
    public final int mo50046v() {
        if (this.f45215d == 0) {
            return 16;
        }
        C17585a aVar = this.f45217f;
        int i = aVar.f45220a;
        int i2 = this.f45216e.f45220a;
        if (i >= i2) {
            return (i - i2) + 4 + aVar.f45221b + 16;
        }
        return (((i + 4) + aVar.f45221b) + this.f45214c) - i2;
    }

    /* renamed from: w */
    public final int mo50047w(int i) {
        int i2 = this.f45214c;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: x */
    public final void mo50048x(int i, int i2, int i3, int i4) throws IOException {
        byte[] bArr = this.f45218g;
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            int i7 = iArr[i6];
            bArr[i5] = (byte) (i7 >> 24);
            bArr[i5 + 1] = (byte) (i7 >> 16);
            bArr[i5 + 2] = (byte) (i7 >> 8);
            bArr[i5 + 3] = (byte) i7;
            i5 += 4;
        }
        this.f45213b.seek(0);
        this.f45213b.write(this.f45218g);
    }

    /* renamed from: ie.f$b */
    public final class C17586b extends InputStream {

        /* renamed from: b */
        public int f45222b;

        /* renamed from: c */
        public int f45223c;

        public C17586b(C17585a aVar) {
            this.f45222b = C17584f.this.mo50047w(aVar.f45220a + 4);
            this.f45223c = aVar.f45221b;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i3 = this.f45223c;
                if (i3 <= 0) {
                    return -1;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                C17584f.this.mo50043r(this.f45222b, bArr, i, i2);
                this.f45222b = C17584f.this.mo50047w(this.f45222b + i2);
                this.f45223c -= i2;
                return i2;
            }
        }

        public final int read() throws IOException {
            if (this.f45223c == 0) {
                return -1;
            }
            C17584f.this.f45213b.seek((long) this.f45222b);
            int read = C17584f.this.f45213b.read();
            this.f45222b = C17584f.this.mo50047w(this.f45222b + 1);
            this.f45223c--;
            return read;
        }
    }
}
