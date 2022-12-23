package p060d6;

import android.util.Log;
import com.bumptech.glide.load.data.C2144e;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p025b6.C1492e;
import p025b6.C1493f;
import p208p6.C6095c;
import p229r1.C6234d;
import p322y6.C7333a;
import p358af.C13437d;

/* renamed from: d6.e */
public final class C4384e<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f15415a;

    /* renamed from: b */
    public final List<? extends C1493f<DataType, ResourceType>> f15416b;

    /* renamed from: c */
    public final C6095c<ResourceType, Transcode> f15417c;

    /* renamed from: d */
    public final C6234d<List<Throwable>> f15418d;

    /* renamed from: e */
    public final String f15419e;

    public C4384e(Class cls, Class cls2, Class cls3, List list, C6095c cVar, C7333a.C7336c cVar2) {
        this.f15415a = cls;
        this.f15416b = list;
        this.f15417c = cVar;
        this.f15418d = cVar2;
        StringBuilder k = C13555b.m33972k("Failed DecodePath{");
        k.append(cls.getSimpleName());
        k.append("->");
        k.append(cls2.getSimpleName());
        k.append("->");
        this.f15419e = C13437d.m33705j(cls3, k, "}");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: d6.l<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: d6.l<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: d6.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: d6.k<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: d6.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: d6.l<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: d6.l<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: d6.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: d6.m} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060d6.C4397l mo19899a(int r18, int r19, p025b6.C1492e r20, com.bumptech.glide.load.data.C2144e r21, com.bumptech.glide.load.engine.DecodeJob.C2161c r22) throws com.bumptech.glide.load.engine.GlideException {
        /*
            r17 = this;
            r7 = r17
            r0 = r22
            r1.d<java.util.List<java.lang.Throwable>> r1 = r7.f15418d
            java.lang.Object r1 = r1.mo22237b()
            p584jl.C17885a.m44458r(r1)
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r8
            d6.l r1 = r1.mo19900b(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0139 }
            r1.d<java.util.List<java.lang.Throwable>> r2 = r7.f15418d
            r2.mo22236a(r8)
            com.bumptech.glide.load.engine.DecodeJob r2 = com.bumptech.glide.load.engine.DecodeJob.this
            com.bumptech.glide.load.DataSource r0 = r0.f7014a
            r2.getClass()
            java.lang.Object r3 = r1.get()
            java.lang.Class r15 = r3.getClass()
            com.bumptech.glide.load.DataSource r3 = com.bumptech.glide.load.DataSource.RESOURCE_DISK_CACHE
            r4 = 0
            if (r0 == r3) goto L_0x004a
            com.bumptech.glide.load.engine.d<R> r3 = r2.f6986b
            b6.h r3 = r3.mo10960f(r15)
            com.bumptech.glide.f r5 = r2.f6993i
            int r6 = r2.f6997m
            int r8 = r2.f6998n
            d6.l r5 = r3.mo5844b(r5, r1, r6, r8)
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r5 = r1
            r14 = r4
        L_0x004c:
            boolean r3 = r1.equals(r5)
            if (r3 != 0) goto L_0x0055
            r1.mo10979a()
        L_0x0055:
            com.bumptech.glide.load.engine.d<R> r1 = r2.f6986b
            com.bumptech.glide.f r1 = r1.f7044c
            com.bumptech.glide.Registry r1 = r1.f6909b
            s6.e r1 = r1.f6872d
            java.lang.Class r3 = r5.mo10980b()
            b6.g r1 = r1.mo22590a(r3)
            r3 = 0
            r6 = 1
            if (r1 == 0) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 == 0) goto L_0x0091
            com.bumptech.glide.load.engine.d<R> r1 = r2.f6986b
            com.bumptech.glide.f r1 = r1.f7044c
            com.bumptech.glide.Registry r1 = r1.f6909b
            s6.e r1 = r1.f6872d
            java.lang.Class r4 = r5.mo10980b()
            b6.g r4 = r1.mo22590a(r4)
            if (r4 == 0) goto L_0x0087
            b6.e r1 = r2.f7000p
            com.bumptech.glide.load.EncodeStrategy r1 = r4.mo5852i(r1)
            goto L_0x0093
        L_0x0087:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r1 = r5.mo10980b()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            com.bumptech.glide.load.EncodeStrategy r1 = com.bumptech.glide.load.EncodeStrategy.NONE
        L_0x0093:
            com.bumptech.glide.load.engine.d<R> r8 = r2.f6986b
            b6.b r9 = r2.f7008x
            java.util.ArrayList r8 = r8.mo10956b()
            int r10 = r8.size()
            r11 = 0
        L_0x00a0:
            if (r11 >= r10) goto L_0x00b5
            java.lang.Object r12 = r8.get(r11)
            h6.n$a r12 = (p108h6.C5104n.C5105a) r12
            b6.b r12 = r12.f17104a
            boolean r12 = r12.equals(r9)
            if (r12 == 0) goto L_0x00b2
            r8 = 1
            goto L_0x00b6
        L_0x00b2:
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00b5:
            r8 = 0
        L_0x00b6:
            r8 = r8 ^ r6
            d6.f r9 = r2.f6999o
            boolean r0 = r9.mo19905d(r8, r0, r1)
            if (r0 == 0) goto L_0x0130
            if (r4 == 0) goto L_0x0122
            int[] r0 = com.bumptech.glide.load.engine.DecodeJob.C2159a.f7013c
            int r8 = r1.ordinal()
            r0 = r0[r8]
            if (r0 == r6) goto L_0x00fe
            r8 = 2
            if (r0 != r8) goto L_0x00e7
            d6.m r0 = new d6.m
            com.bumptech.glide.load.engine.d<R> r1 = r2.f6986b
            com.bumptech.glide.f r1 = r1.f7044c
            e6.b r9 = r1.f6908a
            b6.b r10 = r2.f7008x
            b6.b r11 = r2.f6994j
            int r12 = r2.f6997m
            int r13 = r2.f6998n
            b6.e r1 = r2.f7000p
            r8 = r0
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0107
        L_0x00e7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown strategy: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            d6.c r0 = new d6.c
            b6.b r1 = r2.f7008x
            b6.b r8 = r2.f6994j
            r0.<init>(r1, r8)
        L_0x0107:
            y6.a$c r1 = p060d6.C4395k.f15437f
            java.lang.Object r1 = r1.mo22237b()
            d6.k r1 = (p060d6.C4395k) r1
            p584jl.C17885a.m44458r(r1)
            r1.f15441e = r3
            r1.f15440d = r6
            r1.f15439c = r5
            com.bumptech.glide.load.engine.DecodeJob$d<?> r2 = r2.f6991g
            r2.f7016a = r0
            r2.f7017b = r4
            r2.f7018c = r1
            r5 = r1
            goto L_0x0130
        L_0x0122:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r1 = r5.get()
            java.lang.Class r1 = r1.getClass()
            r0.<init>(r1)
            throw r0
        L_0x0130:
            p6.c<ResourceType, Transcode> r0 = r7.f15417c
            r1 = r20
            d6.l r0 = r0.mo20049h(r5, r1)
            return r0
        L_0x0139:
            r0 = move-exception
            r1 = r0
            r1.d<java.util.List<java.lang.Throwable>> r0 = r7.f15418d
            r0.mo22236a(r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060d6.C4384e.mo19899a(int, int, b6.e, com.bumptech.glide.load.data.e, com.bumptech.glide.load.engine.DecodeJob$c):d6.l");
    }

    /* renamed from: b */
    public final C4397l<ResourceType> mo19900b(C2144e<DataType> eVar, int i, int i2, C1492e eVar2, List<Throwable> list) throws GlideException {
        int size = this.f15416b.size();
        C4397l<ResourceType> lVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1493f fVar = (C1493f) this.f15416b.get(i3);
            try {
                if (fVar.mo5850a(eVar.mo10898a(), eVar2)) {
                    lVar = fVar.mo5851b(eVar.mo10898a(), i, i2, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(fVar);
                }
                list.add(e);
            }
            if (lVar != null) {
                break;
            }
        }
        if (lVar != null) {
            return lVar;
        }
        throw new GlideException(this.f15419e, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DecodePath{ dataClass=");
        k.append(this.f15415a);
        k.append(", decoders=");
        k.append(this.f15416b);
        k.append(", transcoder=");
        k.append(this.f15417c);
        k.append('}');
        return k.toString();
    }
}
