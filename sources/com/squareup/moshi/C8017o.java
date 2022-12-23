package com.squareup.moshi;

import com.squareup.moshi.C8011k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import nb0.C12947k;
import ob0.C12977b;

/* renamed from: com.squareup.moshi.o */
public final class C8017o {

    /* renamed from: d */
    public static final ArrayList f24278d;

    /* renamed from: a */
    public final List<C8011k.C8012a> f24279a;

    /* renamed from: b */
    public final ThreadLocal<C8020c> f24280b = new ThreadLocal<>();

    /* renamed from: c */
    public final LinkedHashMap f24281c = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.o$a */
    public static final class C8018a {

        /* renamed from: a */
        public final ArrayList f24282a = new ArrayList();

        /* renamed from: b */
        public int f24283b = 0;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.squareup.moshi.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.squareup.moshi.e} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.squareup.moshi.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: com.squareup.moshi.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: com.squareup.moshi.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.squareup.moshi.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: com.squareup.moshi.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: com.squareup.moshi.d} */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            r5 = false;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01a7 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x00d4 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25084a(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Class<com.squareup.moshi.k> r1 = com.squareup.moshi.C8011k.class
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.lang.Class r4 = r24.getClass()
            L_0x0012:
                java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                if (r4 == r5) goto L_0x01f1
                java.lang.reflect.Method[] r5 = r4.getDeclaredMethods()
                int r6 = r5.length
                r7 = 0
                r8 = 0
            L_0x001d:
                if (r8 >= r6) goto L_0x01e9
                r15 = r5[r8]
                java.lang.Class<nb0.l> r9 = nb0.C12948l.class
                boolean r9 = r15.isAnnotationPresent(r9)
                java.lang.String r14 = "\n    "
                java.lang.String r13 = "Unexpected signature for "
                r10 = 1
                if (r9 == 0) goto L_0x010c
                r15.setAccessible(r10)
                java.lang.reflect.Type r12 = r15.getGenericReturnType()
                java.lang.reflect.Type[] r11 = r15.getGenericParameterTypes()
                java.lang.annotation.Annotation[][] r9 = r15.getParameterAnnotations()
                int r10 = r11.length
                r20 = r5
                r5 = 2
                if (r10 < r5) goto L_0x008a
                r5 = r11[r7]
                java.lang.Class<nb0.k> r7 = nb0.C12947k.class
                if (r5 != r7) goto L_0x008a
                java.lang.Class r5 = java.lang.Void.TYPE
                if (r12 != r5) goto L_0x008a
                int r5 = r11.length
                r7 = 2
            L_0x004f:
                if (r7 >= r5) goto L_0x0069
                r10 = r11[r7]
                r16 = r5
                boolean r5 = r10 instanceof java.lang.reflect.ParameterizedType
                if (r5 != 0) goto L_0x005a
                goto L_0x0062
            L_0x005a:
                java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
                java.lang.reflect.Type r5 = r10.getRawType()
                if (r5 == r1) goto L_0x0064
            L_0x0062:
                r5 = 0
                goto L_0x006a
            L_0x0064:
                int r7 = r7 + 1
                r5 = r16
                goto L_0x004f
            L_0x0069:
                r5 = 1
            L_0x006a:
                if (r5 == 0) goto L_0x008a
                r5 = 1
                r7 = r9[r5]
                java.util.Set r7 = ob0.C12977b.m32853f(r7)
                com.squareup.moshi.b r16 = new com.squareup.moshi.b
                r10 = r11[r5]
                int r5 = r11.length
                r9 = r16
                r11 = r7
                r12 = r24
                r7 = r13
                r13 = r15
                r21 = r6
                r6 = r14
                r14 = r5
                r9.<init>(r10, r11, r12, r13, r14)
                r0 = r15
                r5 = r16
                goto L_0x00c6
            L_0x008a:
                r21 = r6
                r7 = r13
                r6 = r14
                r5 = 1
                int r10 = r11.length
                if (r10 != r5) goto L_0x00f1
                java.lang.Class r5 = java.lang.Void.TYPE
                if (r12 == r5) goto L_0x00f1
                java.util.Set<java.lang.annotation.Annotation> r5 = ob0.C12977b.f32131a
                java.lang.annotation.Annotation[] r5 = r15.getAnnotations()
                java.util.Set r19 = ob0.C12977b.m32853f(r5)
                r5 = 0
                r10 = r9[r5]
                java.util.Set r18 = ob0.C12977b.m32853f(r10)
                r9 = r9[r5]
                boolean r16 = ob0.C12977b.m32851d(r9)
                com.squareup.moshi.c r22 = new com.squareup.moshi.c
                r10 = r11[r5]
                int r14 = r11.length
                r9 = r22
                r5 = r11
                r11 = r18
                r17 = r12
                r12 = r24
                r13 = r15
                r0 = r15
                r15 = r16
                r16 = r5
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r5 = r22
            L_0x00c6:
                java.lang.reflect.Type r9 = r5.f24235a
                java.util.Set<? extends java.lang.annotation.Annotation> r10 = r5.f24236b
                com.squareup.moshi.a$b r9 = com.squareup.moshi.C7995a.m18226b(r2, r9, r10)
                if (r9 != 0) goto L_0x00d4
                r2.add(r5)
                goto L_0x0113
            L_0x00d4:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Conflicting @ToJson methods:\n    "
                java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
                java.lang.reflect.Method r2 = r9.f24238d
                r1.append(r2)
                r1.append(r6)
                java.lang.reflect.Method r2 = r5.f24238d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f1:
                r0 = r15
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r7)
                r2.append(r0)
                java.lang.String r0 = ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x010c:
                r20 = r5
                r21 = r6
                r7 = r13
                r6 = r14
                r0 = r15
            L_0x0113:
                java.lang.Class<nb0.f> r5 = nb0.C12942f.class
                boolean r5 = r0.isAnnotationPresent(r5)
                if (r5 == 0) goto L_0x01de
                r5 = 1
                r0.setAccessible(r5)
                java.lang.reflect.Type r15 = r0.getGenericReturnType()
                java.util.Set<java.lang.annotation.Annotation> r9 = ob0.C12977b.f32131a
                java.lang.annotation.Annotation[] r9 = r0.getAnnotations()
                java.util.Set r19 = ob0.C12977b.m32853f(r9)
                java.lang.reflect.Type[] r14 = r0.getGenericParameterTypes()
                java.lang.annotation.Annotation[][] r9 = r0.getParameterAnnotations()
                int r10 = r14.length
                if (r10 < r5) goto L_0x016c
                r5 = 0
                r5 = r14[r5]
                java.lang.Class<com.squareup.moshi.JsonReader> r10 = com.squareup.moshi.JsonReader.class
                if (r5 != r10) goto L_0x016c
                java.lang.Class r5 = java.lang.Void.TYPE
                if (r15 == r5) goto L_0x016c
                int r5 = r14.length
                r10 = 1
            L_0x0145:
                if (r10 >= r5) goto L_0x015b
                r11 = r14[r10]
                boolean r12 = r11 instanceof java.lang.reflect.ParameterizedType
                if (r12 != 0) goto L_0x014e
                goto L_0x0156
            L_0x014e:
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                java.lang.reflect.Type r11 = r11.getRawType()
                if (r11 == r1) goto L_0x0158
            L_0x0156:
                r5 = 0
                goto L_0x015c
            L_0x0158:
                int r10 = r10 + 1
                goto L_0x0145
            L_0x015b:
                r5 = 1
            L_0x015c:
                if (r5 == 0) goto L_0x016c
                com.squareup.moshi.d r5 = new com.squareup.moshi.d
                int r14 = r14.length
                r9 = r5
                r10 = r15
                r11 = r19
                r12 = r24
                r13 = r0
                r9.<init>(r10, r11, r12, r13, r14)
                goto L_0x0199
            L_0x016c:
                int r5 = r14.length
                r10 = 1
                if (r5 != r10) goto L_0x01c4
                java.lang.Class r5 = java.lang.Void.TYPE
                if (r15 == r5) goto L_0x01c4
                r5 = 0
                r7 = r9[r5]
                java.util.Set r18 = ob0.C12977b.m32853f(r7)
                r5 = r9[r5]
                boolean r5 = ob0.C12977b.m32851d(r5)
                com.squareup.moshi.e r7 = new com.squareup.moshi.e
                int r13 = r14.length
                r9 = r7
                r10 = r15
                r11 = r19
                r12 = r24
                r16 = r13
                r13 = r0
                r0 = r14
                r14 = r16
                r17 = r15
                r15 = r5
                r16 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r5 = r7
            L_0x0199:
                java.lang.reflect.Type r0 = r5.f24235a
                java.util.Set<? extends java.lang.annotation.Annotation> r7 = r5.f24236b
                com.squareup.moshi.a$b r0 = com.squareup.moshi.C7995a.m18226b(r3, r0, r7)
                if (r0 != 0) goto L_0x01a7
                r3.add(r5)
                goto L_0x01de
            L_0x01a7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Conflicting @FromJson methods:\n    "
                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
                java.lang.reflect.Method r0 = r0.f24238d
                r2.append(r0)
                r2.append(r6)
                java.lang.reflect.Method r0 = r5.f24238d
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x01c4:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r7)
                r2.append(r0)
                java.lang.String r0 = ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x01de:
                int r8 = r8 + 1
                r7 = 0
                r0 = r23
                r5 = r20
                r6 = r21
                goto L_0x001d
            L_0x01e9:
                java.lang.Class r4 = r4.getSuperclass()
                r0 = r23
                goto L_0x0012
            L_0x01f1:
                boolean r0 = r2.isEmpty()
                if (r0 == 0) goto L_0x0219
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto L_0x01fe
                goto L_0x0219
            L_0x01fe:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected at least one @ToJson or @FromJson method on "
                java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
                java.lang.Class r2 = r24.getClass()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0219:
                com.squareup.moshi.a r0 = new com.squareup.moshi.a
                r0.<init>(r2, r3)
                r1 = r23
                java.util.ArrayList r2 = r1.f24282a
                int r3 = r1.f24283b
                int r4 = r3 + 1
                r1.f24283b = r4
                r2.add(r3, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8017o.C8018a.mo25084a(java.lang.Object):void");
        }
    }

    /* renamed from: com.squareup.moshi.o$b */
    public static final class C8019b<T> extends C8011k<T> {

        /* renamed from: a */
        public final Type f24284a;

        /* renamed from: b */
        public final String f24285b;

        /* renamed from: c */
        public final Object f24286c;

        /* renamed from: d */
        public C8011k<T> f24287d;

        public C8019b(Type type, String str, Object obj) {
            this.f24284a = type;
            this.f24285b = str;
            this.f24286c = obj;
        }

        /* renamed from: a */
        public final T mo11093a(JsonReader jsonReader) throws IOException {
            C8011k<T> kVar = this.f24287d;
            if (kVar != null) {
                return kVar.mo11093a(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, T t) throws IOException {
            C8011k<T> kVar2 = this.f24287d;
            if (kVar2 != null) {
                kVar2.mo11094e(kVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public final String toString() {
            C8011k<T> kVar = this.f24287d;
            return kVar != null ? kVar.toString() : super.toString();
        }
    }

    /* renamed from: com.squareup.moshi.o$c */
    public final class C8020c {

        /* renamed from: a */
        public final ArrayList f24288a = new ArrayList();

        /* renamed from: b */
        public final ArrayDeque f24289b = new ArrayDeque();

        /* renamed from: c */
        public boolean f24290c;

        public C8020c() {
        }

        /* renamed from: a */
        public final IllegalArgumentException mo25086a(IllegalArgumentException illegalArgumentException) {
            if (this.f24290c) {
                return illegalArgumentException;
            }
            this.f24290c = true;
            if (this.f24289b.size() == 1 && ((C8019b) this.f24289b.getFirst()).f24285b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator descendingIterator = this.f24289b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C8019b bVar = (C8019b) descendingIterator.next();
                sb.append("\nfor ");
                sb.append(bVar.f24284a);
                if (bVar.f24285b != null) {
                    sb.append(' ');
                    sb.append(bVar.f24285b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* renamed from: b */
        public final void mo25087b(boolean z) {
            this.f24289b.removeLast();
            if (this.f24289b.isEmpty()) {
                C8017o.this.f24280b.remove();
                if (z) {
                    synchronized (C8017o.this.f24281c) {
                        int size = this.f24288a.size();
                        for (int i = 0; i < size; i++) {
                            C8019b bVar = (C8019b) this.f24288a.get(i);
                            C8011k<T> kVar = (C8011k) C8017o.this.f24281c.put(bVar.f24286c, bVar.f24287d);
                            if (kVar != null) {
                                bVar.f24287d = kVar;
                                C8017o.this.f24281c.put(bVar.f24286c, kVar);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f24278d = arrayList;
        arrayList.add(C8023q.f24293a);
        arrayList.add(C8007h.f24262b);
        arrayList.add(C8015n.f24275c);
        arrayList.add(C8002f.f24252c);
        arrayList.add(C8021p.f24292a);
        arrayList.add(C8004g.f24255d);
    }

    public C8017o(C8018a aVar) {
        int size = aVar.f24282a.size();
        ArrayList arrayList = f24278d;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(aVar.f24282a);
        arrayList2.addAll(arrayList);
        this.f24279a = Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: a */
    public final <T> C8011k<T> mo25080a(Class<T> cls) {
        return mo25082c(cls, C12977b.f32131a, (String) null);
    }

    /* renamed from: b */
    public final <T> C8011k<T> mo25081b(Type type) {
        return mo25082c(type, C12977b.f32131a, (String) null);
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [com.squareup.moshi.k<T>] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r3 = r8.f24280b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r3 = new com.squareup.moshi.C8017o.C8020c(r8);
        r8.f24280b.set(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r4 = r3.f24288a.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r5 >= r4) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r6 = (com.squareup.moshi.C8017o.C8019b) r3.f24288a.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r6.f24286c.equals(r0) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r3.f24289b.add(r6);
        r11 = r6.f24287d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r11 == 0) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r4 = new com.squareup.moshi.C8017o.C8019b(r9, r11, r0);
        r3.f24288a.add(r4);
        r3.f24289b.add(r4);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (r6 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r3.mo25087b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11 = r8.f24279a.size();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r0 >= r11) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        r4 = r8.f24279a.get(r0).mo25038a(r9, r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r4 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        ((com.squareup.moshi.C8017o.C8019b) r3.f24289b.getLast()).f24287d = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        r3.mo25087b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + ob0.C12977b.m32858k(r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        throw r3.mo25086a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
        r3.mo25087b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d0, code lost:
        throw r9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.squareup.moshi.C8011k<T> mo25082c(java.lang.reflect.Type r9, java.util.Set<? extends java.lang.annotation.Annotation> r10, java.lang.String r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00dc
            if (r10 == 0) goto L_0x00d4
            java.lang.reflect.Type r9 = ob0.C12977b.m32848a(r9)
            java.lang.reflect.Type r9 = ob0.C12977b.m32855h(r9)
            boolean r0 = r10.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            r0 = r9
            goto L_0x0021
        L_0x0016:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r9
            r0[r2] = r10
            java.util.List r0 = java.util.Arrays.asList(r0)
        L_0x0021:
            java.util.LinkedHashMap r3 = r8.f24281c
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r8.f24281c     // Catch:{ all -> 0x00d1 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x00d1 }
            com.squareup.moshi.k r4 = (com.squareup.moshi.C8011k) r4     // Catch:{ all -> 0x00d1 }
            if (r4 == 0) goto L_0x0030
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            return r4
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            java.lang.ThreadLocal<com.squareup.moshi.o$c> r3 = r8.f24280b
            java.lang.Object r3 = r3.get()
            com.squareup.moshi.o$c r3 = (com.squareup.moshi.C8017o.C8020c) r3
            if (r3 != 0) goto L_0x0045
            com.squareup.moshi.o$c r3 = new com.squareup.moshi.o$c
            r3.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.o$c> r4 = r8.f24280b
            r4.set(r3)
        L_0x0045:
            java.util.ArrayList r4 = r3.f24288a
            int r4 = r4.size()
            r5 = 0
        L_0x004c:
            if (r5 >= r4) goto L_0x006c
            java.util.ArrayList r6 = r3.f24288a
            java.lang.Object r6 = r6.get(r5)
            com.squareup.moshi.o$b r6 = (com.squareup.moshi.C8017o.C8019b) r6
            java.lang.Object r7 = r6.f24286c
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0069
            java.util.ArrayDeque r11 = r3.f24289b
            r11.add(r6)
            com.squareup.moshi.k<T> r11 = r6.f24287d
            if (r11 == 0) goto L_0x007c
            r6 = r11
            goto L_0x007c
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x004c
        L_0x006c:
            com.squareup.moshi.o$b r4 = new com.squareup.moshi.o$b
            r4.<init>(r9, r11, r0)
            java.util.ArrayList r11 = r3.f24288a
            r11.add(r4)
            java.util.ArrayDeque r11 = r3.f24289b
            r11.add(r4)
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0082
            r3.mo25087b(r1)
            return r6
        L_0x0082:
            java.util.List<com.squareup.moshi.k$a> r11 = r8.f24279a     // Catch:{ IllegalArgumentException -> 0x00c7 }
            int r11 = r11.size()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r0 = 0
        L_0x0089:
            if (r0 >= r11) goto L_0x00aa
            java.util.List<com.squareup.moshi.k$a> r4 = r8.f24279a     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            com.squareup.moshi.k$a r4 = (com.squareup.moshi.C8011k.C8012a) r4     // Catch:{ IllegalArgumentException -> 0x00c7 }
            com.squareup.moshi.k r4 = r4.mo25038a(r9, r10, r8)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            if (r4 != 0) goto L_0x009c
            int r0 = r0 + 1
            goto L_0x0089
        L_0x009c:
            java.util.ArrayDeque r9 = r3.f24289b     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.Object r9 = r9.getLast()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            com.squareup.moshi.o$b r9 = (com.squareup.moshi.C8017o.C8019b) r9     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r9.f24287d = r4     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r3.mo25087b(r2)
            return r4
        L_0x00aa:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r2 = "No JsonAdapter for "
            r0.append(r2)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r9 = ob0.C12977b.m32858k(r9, r10)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r0.append(r9)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            java.lang.String r9 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x00c7 }
            r11.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x00c7 }
        L_0x00c5:
            r9 = move-exception
            goto L_0x00cd
        L_0x00c7:
            r9 = move-exception
            java.lang.IllegalArgumentException r9 = r3.mo25086a(r9)     // Catch:{ all -> 0x00c5 }
            throw r9     // Catch:{ all -> 0x00c5 }
        L_0x00cd:
            r3.mo25087b(r1)
            throw r9
        L_0x00d1:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d1 }
            throw r9
        L_0x00d4:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "annotations == null"
            r9.<init>(r10)
            throw r9
        L_0x00dc:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "type == null"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8017o.mo25082c(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.k");
    }

    /* renamed from: d */
    public final <T> C8011k<T> mo25083d(C8011k.C8012a aVar, Type type, Set<? extends Annotation> set) {
        if (set != null) {
            Type h = C12977b.m32855h(C12977b.m32848a(type));
            int indexOf = this.f24279a.indexOf(aVar);
            if (indexOf != -1) {
                int size = this.f24279a.size();
                for (int i = indexOf + 1; i < size; i++) {
                    C8011k<?> a = this.f24279a.get(i).mo25038a(h, set, this);
                    if (a != null) {
                        return a;
                    }
                }
                StringBuilder k = C13555b.m33972k("No next JsonAdapter for ");
                k.append(C12977b.m32858k(h, set));
                throw new IllegalArgumentException(k.toString());
            }
            throw new IllegalArgumentException("Unable to skip past unknown factory " + aVar);
        }
        throw new NullPointerException("annotations == null");
    }
}
