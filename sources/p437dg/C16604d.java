package p437dg;

import com.google.gson.Gson;
import p359ag.C13458o;
import p359ag.C13459p;
import p384bg.C13621b;
import p406cg.C13810b;
import p509gg.C17189a;

/* renamed from: dg.d */
public final class C16604d implements C13459p {

    /* renamed from: b */
    public final C13810b f43258b;

    public C16604d(C13810b bVar) {
        this.f43258b = bVar;
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [ag.o] */
    /* JADX WARNING: type inference failed for: r8v14, types: [ag.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p359ag.C13458o m42126b(p406cg.C13810b r8, com.google.gson.Gson r9, p509gg.C17189a r10, p384bg.C13621b r11) {
        /*
            java.lang.Class r0 = r11.value()
            gg.a r1 = new gg.a
            r1.<init>(r0)
            cg.j r8 = r8.mo40738a(r1)
            java.lang.Object r8 = r8.mo40737g()
            boolean r0 = r8 instanceof p359ag.C13458o
            if (r0 == 0) goto L_0x0018
            ag.o r8 = (p359ag.C13458o) r8
            goto L_0x0072
        L_0x0018:
            boolean r0 = r8 instanceof p359ag.C13459p
            if (r0 == 0) goto L_0x0023
            ag.p r8 = (p359ag.C13459p) r8
            ag.o r8 = r8.mo40360a(r9, r10)
            goto L_0x0072
        L_0x0023:
            boolean r0 = r8 instanceof p359ag.C13456m
            if (r0 != 0) goto L_0x0058
            boolean r1 = r8 instanceof p359ag.C13449f
            if (r1 == 0) goto L_0x002c
            goto L_0x0058
        L_0x002c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r11 = p379.C13555b.m33972k(r11)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r8
            ag.m r0 = (p359ag.C13456m) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r8 instanceof p359ag.C13449f
            if (r0 == 0) goto L_0x0068
            r1 = r8
            ag.f r1 = (p359ag.C13449f) r1
        L_0x0068:
            r4 = r1
            dg.m r8 = new dg.m
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r8 == 0) goto L_0x0080
            boolean r9 = r11.nullSafe()
            if (r9 == 0) goto L_0x0080
            ag.n r9 = new ag.n
            r9.<init>(r8)
            r8 = r9
        L_0x0080:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p437dg.C16604d.m42126b(cg.b, com.google.gson.Gson, gg.a, bg.b):ag.o");
    }

    /* renamed from: a */
    public final <T> C13458o<T> mo40360a(Gson gson, C17189a<T> aVar) {
        C13621b bVar = (C13621b) aVar.f44431a.getAnnotation(C13621b.class);
        if (bVar == null) {
            return null;
        }
        return m42126b(this.f43258b, gson, aVar, bVar);
    }
}
