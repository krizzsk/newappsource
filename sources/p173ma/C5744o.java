package p173ma;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p277ub.C6774a0;
import p277ub.C6802q;

/* renamed from: ma.o */
public final class C5744o {

    /* renamed from: a */
    public final int f18602a;

    /* renamed from: b */
    public final int f18603b;

    /* renamed from: c */
    public final int f18604c;

    /* renamed from: d */
    public final int f18605d;

    /* renamed from: e */
    public final int f18606e;

    /* renamed from: f */
    public final int f18607f;

    /* renamed from: g */
    public final int f18608g;

    /* renamed from: h */
    public final int f18609h;

    /* renamed from: i */
    public final int f18610i;

    /* renamed from: j */
    public final long f18611j;

    /* renamed from: k */
    public final C5745a f18612k;

    /* renamed from: l */
    public final Metadata f18613l;

    /* renamed from: ma.o$a */
    public static class C5745a {

        /* renamed from: a */
        public final long[] f18614a;

        /* renamed from: b */
        public final long[] f18615b;

        public C5745a(long[] jArr, long[] jArr2) {
            this.f18614a = jArr;
            this.f18615b = jArr2;
        }
    }

    public C5744o(byte[] bArr, int i) {
        C6802q qVar = new C6802q(bArr, bArr.length);
        qVar.mo22977j(i * 8);
        this.f18602a = qVar.mo22973f(16);
        this.f18603b = qVar.mo22973f(16);
        this.f18604c = qVar.mo22973f(24);
        this.f18605d = qVar.mo22973f(24);
        int f = qVar.mo22973f(20);
        this.f18606e = f;
        this.f18607f = m14143e(f);
        this.f18608g = qVar.mo22973f(3) + 1;
        int f2 = qVar.mo22973f(5) + 1;
        this.f18609h = f2;
        this.f18610i = m14142b(f2);
        int f3 = qVar.mo22973f(4);
        int f4 = qVar.mo22973f(32);
        int i2 = C6774a0.f20959a;
        this.f18611j = ((((long) f3) & 4294967295L) << 32) | (((long) f4) & 4294967295L);
        this.f18612k = null;
        this.f18613l = null;
    }

    /* renamed from: a */
    public static Metadata m14141a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = C6774a0.f20959a;
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                arrayList.add(new VorbisComment(split[0], split[1]));
            } else if (str.length() != 0) {
                "Failed to parse Vorbis comment: ".concat(str);
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: b */
    public static int m14142b(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* renamed from: e */
    public static int m14143e(int i) {
        switch (i) {
            case ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    public final long mo21597c() {
        long j = this.f18611j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f18606e);
    }

    /* renamed from: d */
    public final Format mo21598d(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f18605d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f18613l;
        if (metadata2 != null) {
            if (metadata == null) {
                metadata = metadata2;
            } else {
                metadata = metadata2.mo16084b(metadata.f13864b);
            }
        }
        Format.C3872b bVar = new Format.C3872b();
        bVar.f13446k = "audio/flac";
        bVar.f13447l = i;
        bVar.f13459x = this.f18608g;
        bVar.f13460y = this.f18606e;
        bVar.f13448m = Collections.singletonList(bArr);
        bVar.f13444i = metadata;
        return new Format(bVar);
    }

    public C5744o(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C5745a aVar, Metadata metadata) {
        this.f18602a = i;
        this.f18603b = i2;
        this.f18604c = i3;
        this.f18605d = i4;
        this.f18606e = i5;
        this.f18607f = m14143e(i5);
        this.f18608g = i6;
        this.f18609h = i7;
        this.f18610i = m14142b(i7);
        this.f18611j = j;
        this.f18612k = aVar;
        this.f18613l = metadata;
    }
}
