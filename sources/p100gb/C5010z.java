package p100gb;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p100gb.C4956a0;
import p137ja.C5410b;
import p173ma.C5754v;
import p265tb.C6645a;
import p265tb.C6658j;
import p277ub.C6774a0;
import p277ub.C6803r;

/* renamed from: gb.z */
public final class C5010z {

    /* renamed from: a */
    public final C6658j f16966a;

    /* renamed from: b */
    public final int f16967b;

    /* renamed from: c */
    public final C6803r f16968c = new C6803r(32);

    /* renamed from: d */
    public C5011a f16969d;

    /* renamed from: e */
    public C5011a f16970e;

    /* renamed from: f */
    public C5011a f16971f;

    /* renamed from: g */
    public long f16972g;

    /* renamed from: gb.z$a */
    public static final class C5011a {

        /* renamed from: a */
        public final long f16973a;

        /* renamed from: b */
        public final long f16974b;

        /* renamed from: c */
        public boolean f16975c;

        /* renamed from: d */
        public C6645a f16976d;

        /* renamed from: e */
        public C5011a f16977e;

        public C5011a(long j, int i) {
            this.f16973a = j;
            this.f16974b = j + ((long) i);
        }
    }

    public C5010z(C6658j jVar) {
        this.f16966a = jVar;
        int i = jVar.f20679b;
        this.f16967b = i;
        C5011a aVar = new C5011a(0, i);
        this.f16969d = aVar;
        this.f16970e = aVar;
        this.f16971f = aVar;
    }

    /* renamed from: c */
    public static C5011a m12834c(C5011a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.f16974b) {
            aVar = aVar.f16977e;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (aVar.f16974b - j));
            C6645a aVar2 = aVar.f16976d;
            byteBuffer.put(aVar2.f20645a, ((int) (j - aVar.f16973a)) + aVar2.f20646b, min);
            i -= min;
            j += (long) min;
            if (j == aVar.f16974b) {
                aVar = aVar.f16977e;
            }
        }
        return aVar;
    }

    /* renamed from: d */
    public static C5011a m12835d(C5011a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.f16974b) {
            aVar = aVar.f16977e;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (aVar.f16974b - j));
            C6645a aVar2 = aVar.f16976d;
            System.arraycopy(aVar2.f20645a, ((int) (j - aVar.f16973a)) + aVar2.f20646b, bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == aVar.f16974b) {
                aVar = aVar.f16977e;
            }
        }
        return aVar;
    }

    /* renamed from: e */
    public static C5011a m12836e(C5011a aVar, DecoderInputBuffer decoderInputBuffer, C4956a0.C4957a aVar2, C6803r rVar) {
        boolean z;
        if (decoderInputBuffer.mo21174d(1073741824)) {
            long j = aVar2.f16775b;
            int i = 1;
            rVar.mo23004w(1);
            C5011a d = m12835d(aVar, j, rVar.f21038a, 1);
            long j2 = j + 1;
            byte b = rVar.f21038a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            byte b2 = b & Byte.MAX_VALUE;
            C5410b bVar = decoderInputBuffer.f13646c;
            byte[] bArr = bVar.f17758a;
            if (bArr == null) {
                bVar.f17758a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = m12835d(d, j2, bVar.f17758a, b2);
            long j3 = j2 + ((long) b2);
            if (z) {
                rVar.mo23004w(2);
                aVar = m12835d(aVar, j3, rVar.f21038a, 2);
                j3 += 2;
                i = rVar.mo23002u();
            }
            int[] iArr = bVar.f17761d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = bVar.f17762e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                rVar.mo23004w(i2);
                aVar = m12835d(aVar, j3, rVar.f21038a, i2);
                j3 += (long) i2;
                rVar.mo23007z(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = rVar.mo23002u();
                    iArr2[i3] = rVar.mo23000s();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.f16774a - ((int) (j3 - aVar2.f16775b));
            }
            C5754v.C5755a aVar3 = aVar2.f16776c;
            int i4 = C6774a0.f20959a;
            byte[] bArr2 = aVar3.f18633b;
            byte[] bArr3 = bVar.f17758a;
            int i5 = aVar3.f18632a;
            int i6 = aVar3.f18634c;
            int i7 = aVar3.f18635d;
            bVar.f17763f = i;
            bVar.f17761d = iArr;
            bVar.f17762e = iArr2;
            bVar.f17759b = bArr2;
            bVar.f17758a = bArr3;
            bVar.f17760c = i5;
            bVar.f17764g = i6;
            bVar.f17765h = i7;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f17766i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            if (C6774a0.f20959a >= 24) {
                C5410b.C5411a aVar4 = bVar.f17767j;
                aVar4.getClass();
                C5410b.C5411a.m13516a(aVar4, i6, i7);
            }
            long j4 = aVar2.f16775b;
            int i8 = (int) (j3 - j4);
            aVar2.f16775b = j4 + ((long) i8);
            aVar2.f16774a -= i8;
        }
        if (decoderInputBuffer.mo21174d(268435456)) {
            rVar.mo23004w(4);
            C5011a d2 = m12835d(aVar, aVar2.f16775b, rVar.f21038a, 4);
            int s = rVar.mo23000s();
            aVar2.f16775b += 4;
            aVar2.f16774a -= 4;
            decoderInputBuffer.mo15950j(s);
            C5011a c = m12834c(d2, aVar2.f16775b, decoderInputBuffer.f13647d, s);
            aVar2.f16775b += (long) s;
            int i9 = aVar2.f16774a - s;
            aVar2.f16774a = i9;
            ByteBuffer byteBuffer = decoderInputBuffer.f13650g;
            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                decoderInputBuffer.f13650g = ByteBuffer.allocate(i9);
            } else {
                decoderInputBuffer.f13650g.clear();
            }
            return m12834c(c, aVar2.f16775b, decoderInputBuffer.f13650g, aVar2.f16774a);
        }
        decoderInputBuffer.mo15950j(aVar2.f16774a);
        return m12834c(aVar, aVar2.f16775b, decoderInputBuffer.f13647d, aVar2.f16774a);
    }

    /* renamed from: a */
    public final void mo20723a(long j) {
        if (j != -1) {
            while (true) {
                C5011a aVar = this.f16969d;
                if (j >= aVar.f16974b) {
                    C6658j jVar = this.f16966a;
                    C6645a aVar2 = aVar.f16976d;
                    synchronized (jVar) {
                        C6645a[] aVarArr = jVar.f20680c;
                        aVarArr[0] = aVar2;
                        jVar.mo22831a(aVarArr);
                    }
                    C5011a aVar3 = this.f16969d;
                    aVar3.f16976d = null;
                    C5011a aVar4 = aVar3.f16977e;
                    aVar3.f16977e = null;
                    this.f16969d = aVar4;
                } else if (this.f16970e.f16973a < aVar.f16973a) {
                    this.f16970e = aVar;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo20724b(int i) {
        C6645a aVar;
        C5011a aVar2 = this.f16971f;
        if (!aVar2.f16975c) {
            C6658j jVar = this.f16966a;
            synchronized (jVar) {
                jVar.f20682e++;
                int i2 = jVar.f20683f;
                if (i2 > 0) {
                    C6645a[] aVarArr = jVar.f20684g;
                    int i3 = i2 - 1;
                    jVar.f20683f = i3;
                    aVar = aVarArr[i3];
                    aVar.getClass();
                    jVar.f20684g[jVar.f20683f] = null;
                } else {
                    aVar = new C6645a(new byte[jVar.f20679b], 0);
                }
            }
            C5011a aVar3 = new C5011a(this.f16971f.f16974b, this.f16967b);
            aVar2.f16976d = aVar;
            aVar2.f16977e = aVar3;
            aVar2.f16975c = true;
        }
        return Math.min(i, (int) (this.f16971f.f16974b - this.f16972g));
    }
}
