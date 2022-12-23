package ni0;

import ii0.C23610d;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ni0.C24506b;
import ni0.C24510d;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import si0.C24893c0;
import si0.C24895d0;
import si0.C24898f;
import si0.C24902i;

/* renamed from: ni0.n */
public final class C24528n implements Closeable {

    /* renamed from: f */
    public static final Logger f62113f = Logger.getLogger(C24509c.class.getName());

    /* renamed from: b */
    public final C24902i f62114b;

    /* renamed from: c */
    public final C24529a f62115c;

    /* renamed from: d */
    public final boolean f62116d;

    /* renamed from: e */
    public final C24506b.C24507a f62117e;

    /* renamed from: ni0.n$a */
    public static final class C24529a implements C24893c0 {

        /* renamed from: b */
        public final C24902i f62118b;

        /* renamed from: c */
        public int f62119c;

        /* renamed from: d */
        public byte f62120d;

        /* renamed from: e */
        public int f62121e;

        /* renamed from: f */
        public int f62122f;

        /* renamed from: g */
        public short f62123g;

        public C24529a(C24902i iVar) {
            this.f62118b = iVar;
        }

        /* renamed from: E */
        public final C24895d0 mo58974E() {
            return this.f62118b.mo58974E();
        }

        public final void close() throws IOException {
        }

        /* renamed from: m */
        public final long mo53601m(C24898f fVar, long j) throws IOException {
            int i;
            int readInt;
            do {
                int i2 = this.f62122f;
                if (i2 == 0) {
                    this.f62118b.skip((long) this.f62123g);
                    this.f62123g = 0;
                    if ((this.f62120d & 4) != 0) {
                        return -1;
                    }
                    i = this.f62121e;
                    C24902i iVar = this.f62118b;
                    byte readByte = (iVar.readByte() & 255) | ((iVar.readByte() & 255) << 16) | ((iVar.readByte() & 255) << 8);
                    this.f62122f = readByte;
                    this.f62119c = readByte;
                    byte readByte2 = (byte) (this.f62118b.readByte() & 255);
                    this.f62120d = (byte) (this.f62118b.readByte() & 255);
                    Logger logger = C24528n.f62113f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C24509c.m61646a(true, this.f62121e, this.f62119c, readByte2, this.f62120d));
                    }
                    readInt = this.f62118b.readInt() & Integer.MAX_VALUE;
                    this.f62121e = readInt;
                    if (readByte2 != 9) {
                        C24509c.m61647b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                        throw null;
                    }
                } else {
                    long m = this.f62118b.mo53601m(fVar, Math.min(j, (long) i2));
                    if (m == -1) {
                        return -1;
                    }
                    this.f62122f = (int) (((long) this.f62122f) - m);
                    return m;
                }
            } while (readInt == i);
            C24509c.m61647b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    /* renamed from: ni0.n$b */
    public interface C24530b {
    }

    public C24528n(C24902i iVar, boolean z) {
        this.f62114b = iVar;
        this.f62116d = z;
        C24529a aVar = new C24529a(iVar);
        this.f62115c = aVar;
        this.f62117e = new C24506b.C24507a(aVar);
    }

    /* renamed from: a */
    public static int m61682a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C24509c.m61647b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0434, code lost:
        if (r18 == false) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0436, code lost:
        r7.mo60784h(ii0.C23610d.f59686c, true);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60770c(boolean r20, ni0.C24528n.C24530b r21) throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = 0
            si0.i r3 = r1.f62114b     // Catch:{ EOFException -> 0x0466 }
            r4 = 9
            r3.mo61384N0(r4)     // Catch:{ EOFException -> 0x0466 }
            si0.i r3 = r1.f62114b
            byte r4 = r3.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            byte r5 = r3.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r4 = r4 | r5
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            r4 = 1
            r5 = 0
            if (r3 < 0) goto L_0x0457
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r6) goto L_0x0457
            si0.i r7 = r1.f62114b
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r8 = 4
            if (r20 == 0) goto L_0x004b
            if (r7 != r8) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            java.lang.String r0 = "Expected a SETTINGS frame but was %s"
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r7)
            r3[r2] = r4
            ni0.C24509c.m61647b(r0, r3)
            throw r5
        L_0x004b:
            si0.i r9 = r1.f62114b
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            si0.i r10 = r1.f62114b
            int r10 = r10.readInt()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            java.util.logging.Logger r12 = f62113f
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r12.isLoggable(r13)
            if (r13 == 0) goto L_0x006f
            java.lang.String r13 = ni0.C24509c.m61646a(r4, r10, r3, r7, r9)
            r12.fine(r13)
        L_0x006f:
            r12 = 5
            r15 = 2
            switch(r7) {
                case 0: goto L_0x0306;
                case 1: goto L_0x022c;
                case 2: goto L_0x0203;
                case 3: goto L_0x018d;
                case 4: goto L_0x00ed;
                case 5: goto L_0x0089;
                case 6: goto L_0x0083;
                case 7: goto L_0x007f;
                case 8: goto L_0x007b;
                default: goto L_0x0074;
            }
        L_0x0074:
            si0.i r0 = r1.f62114b
            long r2 = (long) r3
            r0.skip(r2)
            goto L_0x0086
        L_0x007b:
            r1.mo60776i(r0, r3, r10)
            goto L_0x0086
        L_0x007f:
            r1.mo60773f(r0, r3, r10)
            goto L_0x0086
        L_0x0083:
            r1.mo60775h(r0, r3, r9, r10)
        L_0x0086:
            r0 = 1
            goto L_0x0456
        L_0x0089:
            if (r10 == 0) goto L_0x00e5
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0099
            si0.i r5 = r1.f62114b
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            si0.i r6 = r1.f62114b
            int r6 = r6.readInt()
            r6 = r6 & r11
            int r3 = r3 + -4
            int r3 = m61682a(r3, r9, r5)
            java.util.ArrayList r3 = r1.mo60774g(r3, r5, r9, r10)
            ni0.d$g r0 = (ni0.C24510d.C24518g) r0
            ni0.d r7 = ni0.C24510d.this
            monitor-enter(r7)
            java.util.LinkedHashSet r0 = r7.f62065x     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e2 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00c3
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x00e2 }
            r7.mo60768p(r6, r0)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e2 }
            goto L_0x0086
        L_0x00c3:
            java.util.LinkedHashSet r0 = r7.f62065x     // Catch:{ all -> 0x00e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e2 }
            r0.add(r5)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00e2 }
            ni0.f r0 = new ni0.f     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.String r8 = r7.f62046e     // Catch:{ RejectedExecutionException -> 0x0086 }
            r5[r2] = r8     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ RejectedExecutionException -> 0x0086 }
            r5[r4] = r2     // Catch:{ RejectedExecutionException -> 0x0086 }
            r0.<init>(r7, r5, r6, r3)     // Catch:{ RejectedExecutionException -> 0x0086 }
            r7.mo60762f(r0)     // Catch:{ RejectedExecutionException -> 0x0086 }
            goto L_0x0086
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00e2 }
            throw r0
        L_0x00e5:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            ni0.C24509c.m61647b(r0, r2)
            throw r5
        L_0x00ed:
            if (r10 != 0) goto L_0x0185
            r7 = r9 & 1
            if (r7 == 0) goto L_0x0101
            if (r3 != 0) goto L_0x00f9
            r21.getClass()
            goto L_0x0086
        L_0x00f9:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x0101:
            int r7 = r3 % 6
            if (r7 != 0) goto L_0x0177
            com.facebook.appevents.o r7 = new com.facebook.appevents.o
            r7.<init>(r4)
            r9 = 0
        L_0x010b:
            if (r9 >= r3) goto L_0x015e
            si0.i r10 = r1.f62114b
            short r10 = r10.readShort()
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r11
            si0.i r11 = r1.f62114b
            int r11 = r11.readInt()
            if (r10 == r15) goto L_0x014b
            r13 = 3
            if (r10 == r13) goto L_0x0149
            if (r10 == r8) goto L_0x013d
            if (r10 == r12) goto L_0x0127
            goto L_0x0158
        L_0x0127:
            if (r11 < r6) goto L_0x012f
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 > r13) goto L_0x012f
            goto L_0x0158
        L_0x012f:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r0[r2] = r3
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x013d:
            r10 = 7
            if (r11 < 0) goto L_0x0141
            goto L_0x0158
        L_0x0141:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x0149:
            r10 = 4
            goto L_0x0158
        L_0x014b:
            if (r11 == 0) goto L_0x0158
            if (r11 != r4) goto L_0x0150
            goto L_0x0158
        L_0x0150:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x0158:
            r7.mo12502b(r10, r11)
            int r9 = r9 + 6
            goto L_0x010b
        L_0x015e:
            ni0.d$g r0 = (ni0.C24510d.C24518g) r0
            r0.getClass()
            ni0.d r3 = ni0.C24510d.this     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r3.f62050i     // Catch:{ RejectedExecutionException -> 0x0086 }
            ni0.k r6 = new ni0.k     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.String r3 = r3.f62046e     // Catch:{ RejectedExecutionException -> 0x0086 }
            r8[r2] = r3     // Catch:{ RejectedExecutionException -> 0x0086 }
            r6.<init>(r0, r8, r7)     // Catch:{ RejectedExecutionException -> 0x0086 }
            r5.execute(r6)     // Catch:{ RejectedExecutionException -> 0x0086 }
            goto L_0x0086
        L_0x0177:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_SETTINGS length %% 6 != 0: %s"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x0185:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x018d:
            if (r3 != r8) goto L_0x01f5
            if (r10 == 0) goto L_0x01ed
            si0.i r3 = r1.f62114b
            int r3 = r3.readInt()
            okhttp3.internal.http2.ErrorCode r6 = okhttp3.internal.http2.ErrorCode.fromHttp2(r3)
            if (r6 == 0) goto L_0x01df
            ni0.d$g r0 = (ni0.C24510d.C24518g) r0
            ni0.d r3 = ni0.C24510d.this
            r3.getClass()
            if (r10 == 0) goto L_0x01ac
            r3 = r10 & 1
            if (r3 != 0) goto L_0x01ac
            r3 = 1
            goto L_0x01ad
        L_0x01ac:
            r3 = 0
        L_0x01ad:
            if (r3 == 0) goto L_0x01c7
            ni0.d r0 = ni0.C24510d.this
            ni0.i r3 = new ni0.i
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.String r7 = r0.f62046e
            r5[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r5[r4] = r2
            r3.<init>(r0, r5, r10, r6)
            r0.mo60762f(r3)
            goto L_0x0086
        L_0x01c7:
            ni0.d r0 = ni0.C24510d.this
            ni0.o r2 = r0.mo60764j(r10)
            if (r2 == 0) goto L_0x0086
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.f62134k     // Catch:{ all -> 0x01dc }
            if (r0 != 0) goto L_0x01d9
            r2.f62134k = r6     // Catch:{ all -> 0x01dc }
            r2.notifyAll()     // Catch:{ all -> 0x01dc }
        L_0x01d9:
            monitor-exit(r2)
            goto L_0x0086
        L_0x01dc:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01df:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: %d"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x01ed:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x01f5:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM length: %d != 4"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x0203:
            if (r3 != r12) goto L_0x021e
            if (r10 == 0) goto L_0x0216
            si0.i r2 = r1.f62114b
            r2.readInt()
            si0.i r2 = r1.f62114b
            r2.readByte()
            r21.getClass()
            goto L_0x0086
        L_0x0216:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x021e:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "TYPE_PRIORITY length: %d != 5"
            ni0.C24509c.m61647b(r2, r0)
            throw r5
        L_0x022c:
            if (r10 == 0) goto L_0x02fe
            r5 = r9 & 1
            if (r5 == 0) goto L_0x0234
            r5 = 1
            goto L_0x0235
        L_0x0234:
            r5 = 0
        L_0x0235:
            r6 = r9 & 8
            if (r6 == 0) goto L_0x0243
            si0.i r6 = r1.f62114b
            byte r6 = r6.readByte()
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6
            goto L_0x0244
        L_0x0243:
            r6 = 0
        L_0x0244:
            r7 = r9 & 32
            if (r7 == 0) goto L_0x0257
            si0.i r7 = r1.f62114b
            r7.readInt()
            si0.i r7 = r1.f62114b
            r7.readByte()
            r21.getClass()
            int r3 = r3 + -5
        L_0x0257:
            int r3 = m61682a(r3, r9, r6)
            java.util.ArrayList r16 = r1.mo60774g(r3, r6, r9, r10)
            ni0.d$g r0 = (ni0.C24510d.C24518g) r0
            ni0.d r3 = ni0.C24510d.this
            r3.getClass()
            if (r10 == 0) goto L_0x026e
            r3 = r10 & 1
            if (r3 != 0) goto L_0x026e
            r3 = 1
            goto L_0x026f
        L_0x026e:
            r3 = 0
        L_0x026f:
            if (r3 == 0) goto L_0x0291
            ni0.d r0 = ni0.C24510d.this
            r0.getClass()
            ni0.g r3 = new ni0.g     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.Object[] r14 = new java.lang.Object[r15]     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.String r6 = r0.f62046e     // Catch:{ RejectedExecutionException -> 0x0086 }
            r14[r2] = r6     // Catch:{ RejectedExecutionException -> 0x0086 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ RejectedExecutionException -> 0x0086 }
            r14[r4] = r2     // Catch:{ RejectedExecutionException -> 0x0086 }
            r12 = r3
            r13 = r0
            r15 = r10
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ RejectedExecutionException -> 0x0086 }
            r0.mo60762f(r3)     // Catch:{ RejectedExecutionException -> 0x0086 }
            goto L_0x0086
        L_0x0291:
            ni0.d r3 = ni0.C24510d.this
            monitor-enter(r3)
            ni0.d r6 = ni0.C24510d.this     // Catch:{ all -> 0x02f0 }
            ni0.o r6 = r6.mo60761e(r10)     // Catch:{ all -> 0x02f0 }
            if (r6 != 0) goto L_0x02f2
            ni0.d r6 = ni0.C24510d.this     // Catch:{ all -> 0x02f0 }
            boolean r7 = r6.f62049h     // Catch:{ all -> 0x02f0 }
            if (r7 == 0) goto L_0x02a5
            monitor-exit(r3)     // Catch:{ all -> 0x02f0 }
            goto L_0x0086
        L_0x02a5:
            int r7 = r6.f62047f     // Catch:{ all -> 0x02f0 }
            if (r10 > r7) goto L_0x02ac
            monitor-exit(r3)     // Catch:{ all -> 0x02f0 }
            goto L_0x0086
        L_0x02ac:
            int r7 = r10 % 2
            int r6 = r6.f62048g     // Catch:{ all -> 0x02f0 }
            int r6 = r6 % r15
            if (r7 != r6) goto L_0x02b6
            monitor-exit(r3)     // Catch:{ all -> 0x02f0 }
            goto L_0x0086
        L_0x02b6:
            hi0.q r17 = ii0.C23610d.m57813u(r16)     // Catch:{ all -> 0x02f0 }
            ni0.o r6 = new ni0.o     // Catch:{ all -> 0x02f0 }
            ni0.d r14 = ni0.C24510d.this     // Catch:{ all -> 0x02f0 }
            r7 = 0
            r12 = r6
            r13 = r10
            r8 = 2
            r15 = r7
            r16 = r5
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02f0 }
            ni0.d r5 = ni0.C24510d.this     // Catch:{ all -> 0x02f0 }
            r5.f62047f = r10     // Catch:{ all -> 0x02f0 }
            java.util.LinkedHashMap r5 = r5.f62045d     // Catch:{ all -> 0x02f0 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r5.put(r7, r6)     // Catch:{ all -> 0x02f0 }
            java.util.concurrent.ThreadPoolExecutor r5 = ni0.C24510d.f62042y     // Catch:{ all -> 0x02f0 }
            ni0.j r7 = new ni0.j     // Catch:{ all -> 0x02f0 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x02f0 }
            ni0.d r9 = ni0.C24510d.this     // Catch:{ all -> 0x02f0 }
            java.lang.String r9 = r9.f62046e     // Catch:{ all -> 0x02f0 }
            r8[r2] = r9     // Catch:{ all -> 0x02f0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x02f0 }
            r8[r4] = r2     // Catch:{ all -> 0x02f0 }
            r7.<init>(r0, r8, r6)     // Catch:{ all -> 0x02f0 }
            r5.execute(r7)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r3)     // Catch:{ all -> 0x02f0 }
            goto L_0x0086
        L_0x02f0:
            r0 = move-exception
            goto L_0x02fc
        L_0x02f2:
            monitor-exit(r3)     // Catch:{ all -> 0x02f0 }
            hi0.q r0 = ii0.C23610d.m57813u(r16)
            r6.mo60784h(r0, r5)
            goto L_0x0086
        L_0x02fc:
            monitor-exit(r3)     // Catch:{ all -> 0x02f0 }
            throw r0
        L_0x02fe:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            ni0.C24509c.m61647b(r0, r2)
            throw r5
        L_0x0306:
            r8 = 2
            if (r10 == 0) goto L_0x044e
            r6 = r9 & 1
            if (r6 == 0) goto L_0x0310
            r18 = 1
            goto L_0x0312
        L_0x0310:
            r18 = 0
        L_0x0312:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x0318
            r6 = 1
            goto L_0x0319
        L_0x0318:
            r6 = 0
        L_0x0319:
            if (r6 != 0) goto L_0x0446
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0329
            si0.i r5 = r1.f62114b
            byte r5 = r5.readByte()
            r5 = r5 & 255(0xff, float:3.57E-43)
            short r5 = (short) r5
            goto L_0x032a
        L_0x0329:
            r5 = 0
        L_0x032a:
            int r3 = m61682a(r3, r9, r5)
            si0.i r6 = r1.f62114b
            ni0.d$g r0 = (ni0.C24510d.C24518g) r0
            ni0.d r7 = ni0.C24510d.this
            r7.getClass()
            if (r10 == 0) goto L_0x033f
            r7 = r10 & 1
            if (r7 != 0) goto L_0x033f
            r7 = 1
            goto L_0x0340
        L_0x033f:
            r7 = 0
        L_0x0340:
            if (r7 == 0) goto L_0x0391
            ni0.d r0 = ni0.C24510d.this
            r0.getClass()
            si0.f r7 = new si0.f
            r7.<init>()
            long r11 = (long) r3
            r6.mo61384N0(r11)
            r6.mo53601m(r7, r11)
            long r13 = r7.f62947c
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0375
            ni0.h r6 = new ni0.h
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.String r8 = r0.f62046e
            r14[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r14[r4] = r2
            r12 = r6
            r13 = r0
            r15 = r10
            r16 = r7
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r0.mo60762f(r6)
            goto L_0x03a9
        L_0x0375:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r4 = r7.f62947c
            r2.append(r4)
            java.lang.String r4 = " != "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0391:
            ni0.d r7 = ni0.C24510d.this
            ni0.o r7 = r7.mo60761e(r10)
            if (r7 != 0) goto L_0x03ad
            ni0.d r2 = ni0.C24510d.this
            okhttp3.internal.http2.ErrorCode r7 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r2.mo60768p(r10, r7)
            ni0.d r0 = ni0.C24510d.this
            long r2 = (long) r3
            r0.mo60766n(r2)
            r6.skip(r2)
        L_0x03a9:
            r16 = r5
            goto L_0x043c
        L_0x03ad:
            ni0.o$b r0 = r7.f62130g
            long r8 = (long) r3
        L_0x03b0:
            r10 = 0
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x042f
            ni0.o r3 = ni0.C24531o.this
            monitor-enter(r3)
            boolean r12 = r0.f62144f     // Catch:{ all -> 0x042c }
            si0.f r13 = r0.f62141c     // Catch:{ all -> 0x042c }
            long r13 = r13.f62947c     // Catch:{ all -> 0x042c }
            long r13 = r13 + r8
            r16 = r5
            long r4 = r0.f62142d     // Catch:{ all -> 0x042c }
            int r17 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r17 <= 0) goto L_0x03ca
            r4 = 1
            goto L_0x03cb
        L_0x03ca:
            r4 = 0
        L_0x03cb:
            monitor-exit(r3)     // Catch:{ all -> 0x042c }
            if (r4 == 0) goto L_0x03d9
            r6.skip(r8)
            ni0.o r0 = ni0.C24531o.this
            okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
            r0.mo60781e(r2)
            goto L_0x0434
        L_0x03d9:
            if (r12 == 0) goto L_0x03df
            r6.skip(r8)
            goto L_0x0434
        L_0x03df:
            si0.f r3 = r0.f62140b
            long r3 = r6.mo53601m(r3, r8)
            r12 = -1
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0426
            long r8 = r8 - r3
            ni0.o r3 = ni0.C24531o.this
            monitor-enter(r3)
            boolean r4 = r0.f62143e     // Catch:{ all -> 0x0423 }
            if (r4 == 0) goto L_0x03fb
            si0.f r4 = r0.f62140b     // Catch:{ all -> 0x0423 }
            long r12 = r4.f62947c     // Catch:{ all -> 0x0423 }
            r4.mo61413i()     // Catch:{ all -> 0x0423 }
            goto L_0x0413
        L_0x03fb:
            si0.f r4 = r0.f62141c     // Catch:{ all -> 0x0423 }
            long r12 = r4.f62947c     // Catch:{ all -> 0x0423 }
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0405
            r5 = 1
            goto L_0x0406
        L_0x0405:
            r5 = 0
        L_0x0406:
            si0.f r12 = r0.f62140b     // Catch:{ all -> 0x0423 }
            r4.mo61417q1(r12)     // Catch:{ all -> 0x0423 }
            if (r5 == 0) goto L_0x0412
            ni0.o r4 = ni0.C24531o.this     // Catch:{ all -> 0x0423 }
            r4.notifyAll()     // Catch:{ all -> 0x0423 }
        L_0x0412:
            r12 = r10
        L_0x0413:
            monitor-exit(r3)     // Catch:{ all -> 0x0423 }
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 <= 0) goto L_0x041f
            ni0.o r3 = ni0.C24531o.this
            ni0.d r3 = r3.f62127d
            r3.mo60766n(r12)
        L_0x041f:
            r5 = r16
            r4 = 1
            goto L_0x03b0
        L_0x0423:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0423 }
            throw r0
        L_0x0426:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x042c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x042c }
            throw r0
        L_0x042f:
            r16 = r5
            r0.getClass()
        L_0x0434:
            if (r18 == 0) goto L_0x043c
            hi0.q r0 = ii0.C23610d.f59686c
            r2 = 1
            r7.mo60784h(r0, r2)
        L_0x043c:
            si0.i r0 = r1.f62114b
            r2 = r16
            long r2 = (long) r2
            r0.skip(r2)
            goto L_0x0086
        L_0x0446:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            ni0.C24509c.m61647b(r0, r2)
            throw r5
        L_0x044e:
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            ni0.C24509c.m61647b(r0, r2)
            throw r5
        L_0x0456:
            return r0
        L_0x0457:
            r0 = 1
            java.lang.String r4 = "FRAME_SIZE_ERROR: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            ni0.C24509c.m61647b(r4, r0)
            throw r5
        L_0x0466:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24528n.mo60770c(boolean, ni0.n$b):boolean");
    }

    public final void close() throws IOException {
        this.f62114b.close();
    }

    /* renamed from: e */
    public final void mo60772e(C24530b bVar) throws IOException {
        if (!this.f62116d) {
            C24902i iVar = this.f62114b;
            ByteString byteString = C24509c.f62038a;
            ByteString V0 = iVar.mo61396V0((long) byteString.mo60873k());
            Logger logger = f62113f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C23610d.m57802j("<< CONNECTION %s", V0.mo60874l()));
            }
            if (!byteString.equals(V0)) {
                C24509c.m61647b("Expected a connection header but was %s", V0.mo60881t());
                throw null;
            }
        } else if (!mo60770c(true, bVar)) {
            C24509c.m61647b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo60773f(C24530b bVar, int i, int i2) throws IOException {
        C24531o[] oVarArr;
        if (i < 8) {
            C24509c.m61647b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f62114b.readInt();
            int readInt2 = this.f62114b.readInt();
            int i3 = i - 8;
            if (ErrorCode.fromHttp2(readInt2) != null) {
                ByteString byteString = ByteString.f62330d;
                if (i3 > 0) {
                    byteString = this.f62114b.mo61396V0((long) i3);
                }
                C24510d.C24518g gVar = (C24510d.C24518g) bVar;
                gVar.getClass();
                byteString.mo60873k();
                synchronized (C24510d.this) {
                    oVarArr = (C24531o[]) C24510d.this.f62045d.values().toArray(new C24531o[C24510d.this.f62045d.size()]);
                    C24510d.this.f62049h = true;
                }
                for (C24531o oVar : oVarArr) {
                    if (oVar.f62126c > readInt && oVar.mo60782f()) {
                        ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                        synchronized (oVar) {
                            if (oVar.f62134k == null) {
                                oVar.f62134k = errorCode;
                                oVar.notifyAll();
                            }
                        }
                        C24510d.this.mo60764j(oVar.f62126c);
                    }
                }
                return;
            }
            C24509c.m61647b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C24509c.m61647b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: g */
    public final ArrayList mo60774g(int i, short s, byte b, int i2) throws IOException {
        C24529a aVar = this.f62115c;
        aVar.f62122f = i;
        aVar.f62119c = i;
        aVar.f62123g = s;
        aVar.f62120d = b;
        aVar.f62121e = i2;
        C24506b.C24507a aVar2 = this.f62117e;
        while (!aVar2.f62023b.mo61415l1()) {
            byte readByte = aVar2.f62023b.readByte() & 255;
            if (readByte != 128) {
                boolean z = false;
                if ((readByte & 128) == 128) {
                    int e = aVar2.mo60752e(readByte, 127) - 1;
                    if (e >= 0 && e <= C24506b.f62020a.length - 1) {
                        z = true;
                    }
                    if (z) {
                        aVar2.f62022a.add(C24506b.f62020a[e]);
                    } else {
                        int length = aVar2.f62027f + 1 + (e - C24506b.f62020a.length);
                        if (length >= 0) {
                            C24505a[] aVarArr = aVar2.f62026e;
                            if (length < aVarArr.length) {
                                aVar2.f62022a.add(aVarArr[length]);
                            }
                        }
                        StringBuilder k = C13555b.m33972k("Header index too large ");
                        k.append(e + 1);
                        throw new IOException(k.toString());
                    }
                } else if (readByte == 64) {
                    ByteString d = aVar2.mo60751d();
                    C24506b.m61635a(d);
                    aVar2.mo60750c(new C24505a(d, aVar2.mo60751d()));
                } else if ((readByte & 64) == 64) {
                    aVar2.mo60750c(new C24505a(aVar2.mo60749b(aVar2.mo60752e(readByte, 63) - 1), aVar2.mo60751d()));
                } else if ((readByte & 32) == 32) {
                    int e2 = aVar2.mo60752e(readByte, 31);
                    aVar2.f62025d = e2;
                    if (e2 < 0 || e2 > aVar2.f62024c) {
                        StringBuilder k2 = C13555b.m33972k("Invalid dynamic table size update ");
                        k2.append(aVar2.f62025d);
                        throw new IOException(k2.toString());
                    }
                    int i3 = aVar2.f62029h;
                    if (e2 < i3) {
                        if (e2 == 0) {
                            Arrays.fill(aVar2.f62026e, (Object) null);
                            aVar2.f62027f = aVar2.f62026e.length - 1;
                            aVar2.f62028g = 0;
                            aVar2.f62029h = 0;
                        } else {
                            aVar2.mo60748a(i3 - e2);
                        }
                    }
                } else if (readByte == 16 || readByte == 0) {
                    ByteString d2 = aVar2.mo60751d();
                    C24506b.m61635a(d2);
                    aVar2.f62022a.add(new C24505a(d2, aVar2.mo60751d()));
                } else {
                    aVar2.f62022a.add(new C24505a(aVar2.mo60749b(aVar2.mo60752e(readByte, 15) - 1), aVar2.mo60751d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        C24506b.C24507a aVar3 = this.f62117e;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.f62022a);
        aVar3.f62022a.clear();
        return arrayList;
    }

    /* renamed from: h */
    public final void mo60775h(C24530b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            C24509c.m61647b("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f62114b.readInt();
            int readInt2 = this.f62114b.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            C24510d.C24518g gVar = (C24510d.C24518g) bVar;
            gVar.getClass();
            if (z) {
                synchronized (C24510d.this) {
                    if (readInt == 1) {
                        try {
                            C24510d.this.f62054m++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (readInt == 2) {
                        C24510d.this.f62056o++;
                    } else if (readInt == 3) {
                        C24510d dVar = C24510d.this;
                        dVar.getClass();
                        dVar.notifyAll();
                    }
                }
                return;
            }
            try {
                C24510d dVar2 = C24510d.this;
                dVar2.f62050i.execute(new C24510d.C24517f(readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            C24509c.m61647b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo60776i(C24530b bVar, int i, int i2) throws IOException {
        if (i == 4) {
            long readInt = ((long) this.f62114b.readInt()) & 2147483647L;
            int i3 = (readInt > 0 ? 1 : (readInt == 0 ? 0 : -1));
            if (i3 != 0) {
                C24510d.C24518g gVar = (C24510d.C24518g) bVar;
                if (i2 == 0) {
                    synchronized (C24510d.this) {
                        C24510d dVar = C24510d.this;
                        dVar.f62059r += readInt;
                        dVar.notifyAll();
                    }
                    return;
                }
                C24531o e = C24510d.this.mo60761e(i2);
                if (e != null) {
                    synchronized (e) {
                        e.f62125b += readInt;
                        if (i3 > 0) {
                            e.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            C24509c.m61647b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C24509c.m61647b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }
}
