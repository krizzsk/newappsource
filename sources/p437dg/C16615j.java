package p437dg;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import p359ag.C13458o;
import p359ag.C13459p;
import p406cg.C13810b;
import p406cg.C13817g;
import p406cg.C13821j;
import p485fg.C16999b;

/* renamed from: dg.j */
public final class C16615j implements C13459p {

    /* renamed from: b */
    public final C13810b f43285b;

    /* renamed from: c */
    public final FieldNamingStrategy f43286c;

    /* renamed from: d */
    public final C13817g f43287d;

    /* renamed from: e */
    public final C16604d f43288e;

    /* renamed from: f */
    public final C16999b f43289f = C16999b.f44115a;

    /* renamed from: dg.j$a */
    public static final class C16616a<T> extends C13458o<T> {

        /* renamed from: a */
        public final C13821j<T> f43290a;

        /* renamed from: b */
        public final Map<String, C16617b> f43291b;

        public C16616a(C13821j jVar, LinkedHashMap linkedHashMap) {
            this.f43290a = jVar;
            this.f43291b = linkedHashMap;
        }

        /* renamed from: a */
        public final T mo40320a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T g = this.f43290a.mo40737g();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    C16617b bVar = this.f43291b.get(jsonReader.nextName());
                    if (bVar != null) {
                        if (bVar.f43294c) {
                            bVar.mo49378a(g, jsonReader);
                        }
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                return g;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Exception) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: b */
        public final void mo40321b(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (C16617b next : this.f43291b.values()) {
                    if (next.mo49380c(t)) {
                        jsonWriter.name(next.f43292a);
                        next.mo49379b(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: dg.j$b */
    public static abstract class C16617b {

        /* renamed from: a */
        public final String f43292a;

        /* renamed from: b */
        public final boolean f43293b;

        /* renamed from: c */
        public final boolean f43294c;

        public C16617b(String str, boolean z, boolean z2) {
            this.f43292a = str;
            this.f43293b = z;
            this.f43294c = z2;
        }

        /* renamed from: a */
        public abstract void mo49378a(Object obj, JsonReader jsonReader) throws IOException, IllegalAccessException;

        /* renamed from: b */
        public abstract void mo49379b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        public abstract boolean mo49380c(Object obj) throws IOException, IllegalAccessException;
    }

    public C16615j(C13810b bVar, FieldNamingStrategy fieldNamingStrategy, C13817g gVar, C16604d dVar) {
        this.f43285b = bVar;
        this.f43286c = fieldNamingStrategy;
        this.f43287d = gVar;
        this.f43288e = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0185 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> p359ag.C13458o<T> mo40360a(com.google.gson.Gson r33, p509gg.C17189a<T> r34) {
        /*
            r32 = this;
            r0 = r32
            r11 = r33
            r1 = r34
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class<? super T> r2 = r1.f44431a
            boolean r3 = r12.isAssignableFrom(r2)
            r13 = 0
            if (r3 != 0) goto L_0x0012
            return r13
        L_0x0012:
            cg.b r3 = r0.f43285b
            cg.j r14 = r3.mo40738a(r1)
            dg.j$a r15 = new dg.j$a
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            boolean r3 = r2.isInterface()
            if (r3 == 0) goto L_0x002c
        L_0x0025:
            r28 = r14
            r21 = r15
            r15 = r10
            goto L_0x01ec
        L_0x002c:
            java.lang.reflect.Type r9 = r1.f44432b
            r8 = r1
            r7 = r2
        L_0x0030:
            if (r7 == r12) goto L_0x0025
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x0039:
            if (r3 >= r5) goto L_0x01ba
            r2 = r6[r3]
            r1 = 1
            boolean r16 = r0.mo49381b(r2, r1)
            boolean r17 = r0.mo49381b(r2, r4)
            if (r16 != 0) goto L_0x005f
            if (r17 != 0) goto L_0x005f
            r19 = r3
            r20 = r5
            r31 = r6
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r29 = 0
            r14 = r9
            r15 = r10
            goto L_0x0185
        L_0x005f:
            fg.b r4 = r0.f43289f
            r4.mo49636a(r2)
            java.lang.reflect.Type r4 = r8.f44432b
            java.lang.reflect.Type r13 = r2.getGenericType()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.reflect.Type r13 = com.google.gson.internal.C$Gson$Types.m36268g(r4, r7, r13, r1)
            java.lang.Class<bg.c> r1 = p384bg.C13622c.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            bg.c r1 = (p384bg.C13622c) r1
            if (r1 != 0) goto L_0x008a
            com.google.gson.FieldNamingStrategy r1 = r0.f43286c
            java.lang.String r1 = r1.translateName(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r19 = r3
            goto L_0x009b
        L_0x008a:
            java.lang.String r4 = r1.value()
            java.lang.String[] r1 = r1.alternate()
            r19 = r3
            int r3 = r1.length
            if (r3 != 0) goto L_0x00a1
            java.util.List r1 = java.util.Collections.singletonList(r4)
        L_0x009b:
            r20 = r5
            r18 = 1
            r5 = r1
            goto L_0x00c1
        L_0x00a1:
            java.util.ArrayList r3 = new java.util.ArrayList
            r20 = r5
            int r5 = r1.length
            r18 = 1
            int r5 = r5 + 1
            r3.<init>(r5)
            r3.add(r4)
            int r4 = r1.length
            r5 = 0
        L_0x00b2:
            if (r5 >= r4) goto L_0x00c0
            r21 = r4
            r4 = r1[r5]
            r3.add(r4)
            int r5 = r5 + 1
            r4 = r21
            goto L_0x00b2
        L_0x00c0:
            r5 = r3
        L_0x00c1:
            int r4 = r5.size()
            r1 = 0
            r3 = 0
        L_0x00c7:
            if (r3 >= r4) goto L_0x0173
            java.lang.Object r21 = r5.get(r3)
            r22 = r12
            r12 = r21
            java.lang.String r12 = (java.lang.String) r12
            r21 = r9
            if (r3 == 0) goto L_0x00d9
            r16 = 0
        L_0x00d9:
            gg.a r9 = new gg.a
            r9.<init>(r13)
            r23 = r1
            java.lang.Class<? super T> r1 = r9.f44431a
            r24 = r3
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x00f1
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L_0x00f1
            r25 = 1
            goto L_0x00f3
        L_0x00f1:
            r25 = 0
        L_0x00f3:
            java.lang.Class<bg.b> r1 = p384bg.C13621b.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            bg.b r1 = (p384bg.C13621b) r1
            if (r1 == 0) goto L_0x010b
            dg.d r3 = r0.f43288e
            r26 = r2
            cg.b r2 = r0.f43285b
            r3.getClass()
            ag.o r1 = p437dg.C16604d.m42126b(r2, r11, r9, r1)
            goto L_0x010e
        L_0x010b:
            r26 = r2
            r1 = 0
        L_0x010e:
            if (r1 == 0) goto L_0x0113
            r27 = 1
            goto L_0x0115
        L_0x0113:
            r27 = 0
        L_0x0115:
            if (r1 != 0) goto L_0x011b
            ag.o r1 = r11.getAdapter(r9)
        L_0x011b:
            r28 = r1
            dg.i r3 = new dg.i
            r2 = r23
            r1 = r3
            r0 = r2
            r23 = r26
            r2 = r12
            r11 = r3
            r3 = r16
            r26 = r4
            r29 = 0
            r4 = r17
            r30 = r5
            r5 = r23
            r31 = r6
            r6 = r27
            r34 = r7
            r7 = r28
            r27 = r13
            r13 = r8
            r8 = r33
            r28 = r14
            r14 = r21
            r21 = r15
            r15 = r10
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r15.put(r12, r11)
            dg.j$b r1 = (p437dg.C16615j.C16617b) r1
            if (r0 != 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r1 = r0
        L_0x0156:
            int r3 = r24 + 1
            r0 = r32
            r11 = r33
            r7 = r34
            r8 = r13
            r9 = r14
            r10 = r15
            r15 = r21
            r12 = r22
            r2 = r23
            r4 = r26
            r13 = r27
            r14 = r28
            r5 = r30
            r6 = r31
            goto L_0x00c7
        L_0x0173:
            r0 = r1
            r31 = r6
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r29 = 0
            r14 = r9
            r15 = r10
            if (r0 != 0) goto L_0x019e
        L_0x0185:
            int r3 = r19 + 1
            r0 = r32
            r11 = r33
            r7 = r34
            r8 = r13
            r9 = r14
            r10 = r15
            r5 = r20
            r15 = r21
            r12 = r22
            r14 = r28
            r6 = r31
            r4 = 0
            r13 = 0
            goto L_0x0039
        L_0x019e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f43292a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01ba:
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r14 = r9
            r15 = r10
            java.lang.reflect.Type r0 = r13.f44432b
            java.lang.reflect.Type r1 = r34.getGenericSuperclass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = r34
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.m36268g(r0, r3, r1, r2)
            gg.a r8 = new gg.a
            r8.<init>(r0)
            java.lang.Class<? super T> r7 = r8.f44431a
            r0 = r32
            r11 = r33
            r9 = r14
            r10 = r15
            r15 = r21
            r12 = r22
            r14 = r28
            r13 = 0
            goto L_0x0030
        L_0x01ec:
            r1 = r21
            r0 = r28
            r1.<init>(r0, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p437dg.C16615j.mo40360a(com.google.gson.Gson, gg.a):ag.o");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r1 == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d3 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49381b(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            cg.g r0 = r8.f43287d
            java.lang.Class r1 = r9.getType()
            boolean r2 = r0.mo40742g(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0017
            boolean r1 = r0.mo40743h(r1, r10)
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            if (r1 != 0) goto L_0x00d4
            int r1 = r0.f34005c
            int r2 = r9.getModifiers()
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0025
            goto L_0x00ce
        L_0x0025:
            double r1 = r0.f34004b
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0045
            java.lang.Class<bg.d> r1 = p384bg.C13623d.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            bg.d r1 = (p384bg.C13623d) r1
            java.lang.Class<bg.e> r2 = p384bg.C13624e.class
            java.lang.annotation.Annotation r2 = r9.getAnnotation(r2)
            bg.e r2 = (p384bg.C13624e) r2
            boolean r1 = r0.mo40744i(r1, r2)
            if (r1 != 0) goto L_0x0045
            goto L_0x00ce
        L_0x0045:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L_0x004d
            goto L_0x00ce
        L_0x004d:
            boolean r1 = r0.f34007e
            if (r1 == 0) goto L_0x006c
            java.lang.Class<bg.a> r1 = p384bg.C13620a.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            bg.a r1 = (p384bg.C13620a) r1
            if (r1 == 0) goto L_0x00ce
            if (r10 == 0) goto L_0x0065
            boolean r1 = r1.serialize()
            if (r1 != 0) goto L_0x006c
            goto L_0x00ce
        L_0x0065:
            boolean r1 = r1.deserialize()
            if (r1 != 0) goto L_0x006c
            goto L_0x00ce
        L_0x006c:
            boolean r1 = r0.f34006d
            if (r1 != 0) goto L_0x008d
            java.lang.Class r1 = r9.getType()
            boolean r2 = r1.isMemberClass()
            if (r2 == 0) goto L_0x0089
            int r1 = r1.getModifiers()
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0084
            r1 = 1
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            if (r1 != 0) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            if (r1 == 0) goto L_0x008d
            goto L_0x00ce
        L_0x008d:
            java.lang.Class r9 = r9.getType()
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r1 = r1.isAssignableFrom(r9)
            if (r1 != 0) goto L_0x00a7
            boolean r1 = r9.isAnonymousClass()
            if (r1 != 0) goto L_0x00a5
            boolean r9 = r9.isLocalClass()
            if (r9 == 0) goto L_0x00a7
        L_0x00a5:
            r9 = 1
            goto L_0x00a8
        L_0x00a7:
            r9 = 0
        L_0x00a8:
            if (r9 == 0) goto L_0x00ab
            goto L_0x00ce
        L_0x00ab:
            if (r10 == 0) goto L_0x00b0
            java.util.List<ag.b> r9 = r0.f34008f
            goto L_0x00b2
        L_0x00b0:
            java.util.List<ag.b> r9 = r0.f34009g
        L_0x00b2:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L_0x00d0
            java.util.Iterator r9 = r9.iterator()
        L_0x00bc:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d0
            java.lang.Object r10 = r9.next()
            ag.b r10 = (p359ag.C13445b) r10
            boolean r10 = r10.mo40324b()
            if (r10 == 0) goto L_0x00bc
        L_0x00ce:
            r9 = 1
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            if (r9 != 0) goto L_0x00d4
            r3 = 1
        L_0x00d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p437dg.C16615j.mo49381b(java.lang.reflect.Field, boolean):boolean");
    }
}
