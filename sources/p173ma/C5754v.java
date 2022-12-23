package p173ma;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import p265tb.C6652e;
import p277ub.C6803r;

/* renamed from: ma.v */
public interface C5754v {

    /* renamed from: ma.v$a */
    public static final class C5755a {

        /* renamed from: a */
        public final int f18632a;

        /* renamed from: b */
        public final byte[] f18633b;

        /* renamed from: c */
        public final int f18634c;

        /* renamed from: d */
        public final int f18635d;

        public C5755a(int i, byte[] bArr, int i2, int i3) {
            this.f18632a = i;
            this.f18633b = bArr;
            this.f18634c = i2;
            this.f18635d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5755a.class != obj.getClass()) {
                return false;
            }
            C5755a aVar = (C5755a) obj;
            if (this.f18632a == aVar.f18632a && this.f18634c == aVar.f18634c && this.f18635d == aVar.f18635d && Arrays.equals(this.f18633b, aVar.f18633b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f18633b) + (this.f18632a * 31)) * 31) + this.f18634c) * 31) + this.f18635d;
        }
    }

    /* renamed from: a */
    int mo20630a(C6652e eVar, int i, boolean z) throws IOException;

    /* renamed from: b */
    void mo20631b(int i, C6803r rVar);

    /* renamed from: c */
    void mo20632c(Format format);

    /* renamed from: d */
    void mo20633d(long j, int i, int i2, int i3, C5755a aVar);

    /* renamed from: e */
    void mo20634e(C6803r rVar, int i);
}
