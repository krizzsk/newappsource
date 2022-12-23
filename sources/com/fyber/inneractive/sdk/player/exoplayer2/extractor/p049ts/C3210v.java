package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v */
public interface C3210v {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a */
    public static final class C3211a {

        /* renamed from: a */
        public final String f11517a;

        /* renamed from: b */
        public final byte[] f11518b;

        public C3211a(String str, int i, byte[] bArr) {
            this.f11517a = str;
            this.f11518b = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b */
    public static final class C3212b {

        /* renamed from: a */
        public final String f11519a;

        /* renamed from: b */
        public final List<C3211a> f11520b;

        /* renamed from: c */
        public final byte[] f11521c;

        public C3212b(int i, String str, List<C3211a> list, byte[] bArr) {
            List<C3211a> list2;
            this.f11519a = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f11520b = list2;
            this.f11521c = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c */
    public interface C3213c {
        /* renamed from: a */
        SparseArray<C3210v> mo14249a();

        /* renamed from: a */
        C3210v mo14251a(int i, C3212b bVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d */
    public static final class C3214d {

        /* renamed from: a */
        public final String f11522a;

        /* renamed from: b */
        public final int f11523b;

        /* renamed from: c */
        public final int f11524c;

        /* renamed from: d */
        public int f11525d;

        /* renamed from: e */
        public String f11526e;

        public C3214d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f11522a = str;
            this.f11523b = i2;
            this.f11524c = i3;
            this.f11525d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void mo14271a() {
            int i;
            int i2 = this.f11525d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.f11523b;
            } else {
                i = i2 + this.f11524c;
            }
            this.f11525d = i;
            this.f11526e = this.f11522a + this.f11525d;
        }

        /* renamed from: b */
        public String mo14272b() {
            if (this.f11525d != Integer.MIN_VALUE) {
                return this.f11526e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public int mo14273c() {
            int i = this.f11525d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo14262a();

    /* renamed from: a */
    void mo14264a(C3393k kVar, boolean z);

    /* renamed from: a */
    void mo14265a(C3403r rVar, C3088h hVar, C3214d dVar);
}
