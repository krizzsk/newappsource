package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21420av;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.bi */
public final class C21450bi {

    /* renamed from: a */
    public static final List<C21420av.C21424a> f53963a;

    /* renamed from: b */
    private final List<C21420av.C21424a> f53964b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ThreadLocal<C21453c> f53965c = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<Object, C21420av<?>> f53966d = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f53963a = arrayList;
        arrayList.add(C21454bj.f53976a);
        arrayList.add(C21415at.f53878a);
        arrayList.add(C21448bh.f53960a);
        arrayList.add(C21405aq.f53858a);
        arrayList.add(C21412as.f53871a);
    }

    public C21450bi(C21451a aVar) {
        int size = aVar.f53967a.size();
        List<C21420av.C21424a> list = f53963a;
        ArrayList arrayList = new ArrayList(list.size() + size);
        arrayList.addAll(aVar.f53967a);
        arrayList.addAll(list);
        this.f53964b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: com.veriff.sdk.internal.bi$a */
    public static final class C21451a {

        /* renamed from: a */
        public final List<C21420av.C21424a> f53967a = new ArrayList();

        /* renamed from: a */
        public C21451a mo54338a(C21420av.C21424a aVar) {
            if (aVar != null) {
                this.f53967a.add(aVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: a */
        public C21450bi mo54339a() {
            return new C21450bi(this);
        }
    }

    /* renamed from: b */
    private Object m51200b(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    /* renamed from: a */
    public <T> C21420av<T> mo54335a(Type type) {
        return mo54336a(type, C21472bo.f53999a);
    }

    /* renamed from: com.veriff.sdk.internal.bi$b */
    public static final class C21452b<T> extends C21420av<T> {

        /* renamed from: a */
        public final Type f53968a;

        /* renamed from: b */
        public final String f53969b;

        /* renamed from: c */
        public final Object f53970c;

        /* renamed from: d */
        public C21420av<T> f53971d;

        public C21452b(Type type, String str, Object obj) {
            this.f53968a = type;
            this.f53969b = str;
            this.f53970c = obj;
        }

        /* renamed from: a */
        public T mo54204a(C21430ba baVar) throws IOException {
            C21420av<T> avVar = this.f53971d;
            if (avVar != null) {
                return avVar.mo54204a(baVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C21420av<T> avVar = this.f53971d;
            return avVar != null ? avVar.toString() : super.toString();
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, T t) throws IOException {
            C21420av<T> avVar = this.f53971d;
            if (avVar != null) {
                avVar.mo54205a(bfVar, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
    }

    /* renamed from: a */
    public <T> C21420av<T> mo54334a(Class<T> cls) {
        return mo54336a(cls, C21472bo.f53999a);
    }

    /* renamed from: a */
    public <T> C21420av<T> mo54336a(Type type, Set<? extends Annotation> set) {
        return mo54337a(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r4.f53965c.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r1 = new com.veriff.sdk.internal.C21450bi.C21453c(r4);
        r4.f53965c.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        r7 = r1.mo54341a(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1.mo54344a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = r4.f53964b.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2 >= r7) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r3 = r4.f53964b.get(r2).mo54207a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r1.mo54343a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r1.mo54344a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + com.veriff.sdk.internal.C21472bo.m51288a(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        throw r1.mo54342a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        r1.mo54344a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.veriff.sdk.internal.C21420av<T> mo54337a(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0093
            if (r6 == 0) goto L_0x008b
            java.lang.reflect.Type r5 = com.veriff.sdk.internal.C21472bo.m51289a((java.lang.reflect.Type) r5)
            java.lang.reflect.Type r5 = com.veriff.sdk.internal.C21472bo.m51297b((java.lang.reflect.Type) r5)
            java.lang.Object r0 = r4.m51200b(r5, r6)
            java.util.Map<java.lang.Object, com.veriff.sdk.internal.av<?>> r1 = r4.f53966d
            monitor-enter(r1)
            java.util.Map<java.lang.Object, com.veriff.sdk.internal.av<?>> r2 = r4.f53966d     // Catch:{ all -> 0x0088 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0088 }
            com.veriff.sdk.internal.av r2 = (com.veriff.sdk.internal.C21420av) r2     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            java.lang.ThreadLocal<com.veriff.sdk.internal.bi$c> r1 = r4.f53965c
            java.lang.Object r1 = r1.get()
            com.veriff.sdk.internal.bi$c r1 = (com.veriff.sdk.internal.C21450bi.C21453c) r1
            if (r1 != 0) goto L_0x0034
            com.veriff.sdk.internal.bi$c r1 = new com.veriff.sdk.internal.bi$c
            r1.<init>()
            java.lang.ThreadLocal<com.veriff.sdk.internal.bi$c> r2 = r4.f53965c
            r2.set(r1)
        L_0x0034:
            com.veriff.sdk.internal.av r7 = r1.mo54341a(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x003f
            r1.mo54344a((boolean) r0)
            return r7
        L_0x003f:
            java.util.List<com.veriff.sdk.internal.av$a> r7 = r4.f53964b     // Catch:{ IllegalArgumentException -> 0x007e }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x007e }
            r2 = 0
        L_0x0046:
            if (r2 >= r7) goto L_0x0061
            java.util.List<com.veriff.sdk.internal.av$a> r3 = r4.f53964b     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x007e }
            com.veriff.sdk.internal.av$a r3 = (com.veriff.sdk.internal.C21420av.C21424a) r3     // Catch:{ IllegalArgumentException -> 0x007e }
            com.veriff.sdk.internal.av r3 = r3.mo54207a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x007e }
            if (r3 != 0) goto L_0x0059
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0059:
            r1.mo54343a(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            r5 = 1
            r1.mo54344a((boolean) r5)
            return r3
        L_0x0061:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = com.veriff.sdk.internal.C21472bo.m51288a((java.lang.reflect.Type) r5, (java.util.Set<? extends java.lang.annotation.Annotation>) r6)     // Catch:{ IllegalArgumentException -> 0x007e }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x007e }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x007e }
            throw r7     // Catch:{ IllegalArgumentException -> 0x007e }
        L_0x007c:
            r5 = move-exception
            goto L_0x0084
        L_0x007e:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo54342a((java.lang.IllegalArgumentException) r5)     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x0084:
            r1.mo54344a((boolean) r0)
            throw r5
        L_0x0088:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0088 }
            throw r5
        L_0x008b:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x0093:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21450bi.mo54337a(java.lang.reflect.Type, java.util.Set, java.lang.String):com.veriff.sdk.internal.av");
    }

    /* renamed from: com.veriff.sdk.internal.bi$c */
    public final class C21453c {

        /* renamed from: a */
        public final List<C21452b<?>> f53972a = new ArrayList();

        /* renamed from: b */
        public final Deque<C21452b<?>> f53973b = new ArrayDeque();

        /* renamed from: c */
        public boolean f53974c;

        public C21453c() {
        }

        /* renamed from: a */
        public <T> C21420av<T> mo54341a(Type type, String str, Object obj) {
            int size = this.f53972a.size();
            for (int i = 0; i < size; i++) {
                C21452b bVar = this.f53972a.get(i);
                if (bVar.f53970c.equals(obj)) {
                    this.f53973b.add(bVar);
                    C21420av<T> avVar = bVar.f53971d;
                    return avVar != null ? avVar : bVar;
                }
            }
            C21452b bVar2 = new C21452b(type, str, obj);
            this.f53972a.add(bVar2);
            this.f53973b.add(bVar2);
            return null;
        }

        /* renamed from: a */
        public <T> void mo54343a(C21420av<T> avVar) {
            this.f53973b.getLast().f53971d = avVar;
        }

        /* renamed from: a */
        public void mo54344a(boolean z) {
            this.f53973b.removeLast();
            if (this.f53973b.isEmpty()) {
                C21450bi.this.f53965c.remove();
                if (z) {
                    synchronized (C21450bi.this.f53966d) {
                        int size = this.f53972a.size();
                        for (int i = 0; i < size; i++) {
                            C21452b bVar = this.f53972a.get(i);
                            C21420av<T> avVar = (C21420av) C21450bi.this.f53966d.put(bVar.f53970c, bVar.f53971d);
                            if (avVar != null) {
                                bVar.f53971d = avVar;
                                C21450bi.this.f53966d.put(bVar.f53970c, avVar);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public IllegalArgumentException mo54342a(IllegalArgumentException illegalArgumentException) {
            if (this.f53974c) {
                return illegalArgumentException;
            }
            this.f53974c = true;
            if (this.f53973b.size() == 1 && this.f53973b.getFirst().f53969b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C21452b<?>> descendingIterator = this.f53973b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C21452b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f53968a);
                if (next.f53969b != null) {
                    sb.append(' ');
                    sb.append(next.f53969b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }
    }
}
