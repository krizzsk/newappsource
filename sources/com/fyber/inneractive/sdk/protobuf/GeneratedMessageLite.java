package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3473a;
import com.fyber.inneractive.sdk.protobuf.C3490e;
import com.fyber.inneractive.sdk.protobuf.C3562q;
import com.fyber.inneractive.sdk.protobuf.C3564q0;
import com.fyber.inneractive.sdk.protobuf.C3584t1;
import com.fyber.inneractive.sdk.protobuf.C3596u;
import com.fyber.inneractive.sdk.protobuf.C3609z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage.a;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3465a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C3465a<MessageType, BuilderType>> extends C3473a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C3553n1 unknownFields = C3553n1.f12524f;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$b */
    public static class C3466b<T extends GeneratedMessageLite<T, ?>> extends C3479b<T> {

        /* renamed from: a */
        public final T f12367a;

        public C3466b(T t) {
            this.f12367a = t;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c */
    public static final class C3467c implements C3596u.C3597a<C3467c> {

        /* renamed from: a */
        public final C3609z.C3613d<?> f12368a;

        /* renamed from: b */
        public final int f12369b;

        /* renamed from: c */
        public final C3584t1.C3586b f12370c;

        /* renamed from: d */
        public final boolean f12371d;

        /* renamed from: e */
        public final boolean f12372e;

        public C3467c(C3609z.C3613d<?> dVar, int i, C3584t1.C3586b bVar, boolean z, boolean z2) {
            this.f12368a = dVar;
            this.f12369b = i;
            this.f12370c = bVar;
            this.f12371d = z;
            this.f12372e = z2;
        }

        /* renamed from: a */
        public int mo14763a() {
            return this.f12369b;
        }

        /* renamed from: b */
        public boolean mo14765b() {
            return this.f12371d;
        }

        /* renamed from: c */
        public C3584t1.C3586b mo14766c() {
            return this.f12370c;
        }

        public int compareTo(Object obj) {
            return this.f12369b - ((C3467c) obj).f12369b;
        }

        /* renamed from: d */
        public C3584t1.C3591c mo14768d() {
            return this.f12370c.f12595a;
        }

        /* renamed from: e */
        public boolean mo14769e() {
            return this.f12372e;
        }

        /* renamed from: a */
        public C3564q0.C3565a mo14764a(C3564q0.C3565a aVar, C3564q0 q0Var) {
            return ((C3465a) aVar).mo14756a((GeneratedMessageLite) q0Var);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d */
    public static class C3468d<ContainingType extends C3564q0, Type> extends C3554o<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f12373a;

        /* renamed from: b */
        public final Type f12374b;

        /* renamed from: c */
        public final C3564q0 f12375c;

        /* renamed from: d */
        public final C3467c f12376d;

        public C3468d(C3564q0 q0Var, Object obj, C3564q0 q0Var2, C3467c cVar) {
            if (q0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (cVar.mo14766c() == C3584t1.C3586b.MESSAGE && q0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f12373a = q0Var;
                this.f12374b = obj;
                this.f12375c = q0Var2;
                this.f12376d = cVar;
            }
        }

        /* renamed from: a */
        public Object mo14770a(Object obj) {
            C3467c cVar = this.f12376d;
            if (cVar.f12370c.f12595a == C3584t1.C3591c.ENUM) {
                return cVar.f12368a.mo15253a(((Integer) obj).intValue());
            }
            return obj;
        }

        /* renamed from: b */
        public Object mo14771b(Object obj) {
            if (this.f12376d.f12370c.f12595a == C3584t1.C3591c.ENUM) {
                return Integer.valueOf(((C3609z.C3612c) obj).mo13014a());
            }
            return obj;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e */
    public enum C3469e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* access modifiers changed from: private */
    public static C3468d checkIsLite(C3554o oVar) {
        oVar.getClass();
        return (C3468d) oVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws C3476a0 {
        if (t == null || t.isInitialized()) {
            return t;
        }
        C3547l1 newUninitializedMessageException = t.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new C3476a0(newUninitializedMessageException.getMessage());
    }

    public static C3609z.C3610a emptyBooleanList() {
        return C3499g.f12430d;
    }

    public static C3609z.C3611b emptyDoubleList() {
        return C3551n.f12519d;
    }

    public static C3609z.C3615f emptyFloatList() {
        return C3603w.f12631d;
    }

    public static C3609z.C3616g emptyIntList() {
        return C3607y.f12637d;
    }

    public static C3609z.C3619i emptyLongList() {
        return C3506h0.f12436d;
    }

    public static <E> C3609z.C3620j<E> emptyProtobufList() {
        return C3486c1.f12408d;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C3553n1.f12524f) {
            this.unknownFields = C3553n1.m9372c();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            try {
                t = ((GeneratedMessageLite) C3569r1.f12539a.allocateInstance(cls)).getDefaultInstanceForType();
                if (t != null) {
                    defaultInstanceMap.put(cls, t);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        return t;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            StringBuilder k = C13555b.m33972k("Generated message class \"");
            k.append(cls.getName());
            k.append("\" missing method \"");
            k.append(str);
            k.append("\".");
            throw new RuntimeException(k.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static C3609z.C3616g mutableCopy(C3609z.C3616g gVar) {
        C3607y yVar = (C3607y) gVar;
        int i = yVar.f12639c;
        return yVar.mo14808b(i == 0 ? 10 : i * 2);
    }

    public static Object newMessageInfo(C3564q0 q0Var, String str, Object[] objArr) {
        return new C3489d1(q0Var, str, objArr);
    }

    public static <ContainingType extends C3564q0, Type> C3468d<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C3564q0 q0Var, C3609z.C3613d<?> dVar, int i, C3584t1.C3586b bVar, boolean z, Class cls) {
        return new C3468d<>(containingtype, Collections.emptyList(), q0Var, new C3467c(dVar, i, bVar, true, z));
    }

    public static <ContainingType extends C3564q0, Type> C3468d<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C3564q0 q0Var, C3609z.C3613d<?> dVar, int i, C3584t1.C3586b bVar, Class cls) {
        return new C3468d<>(containingtype, type, q0Var, new C3467c(dVar, i, bVar, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws C3476a0 {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C3562q.m9406a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parseFrom(t, C3529j.m9023a(byteBuffer, false), qVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE) != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005a, code lost:
        throw com.fyber.inneractive.sdk.protobuf.C3476a0.m8731e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T r5, java.io.InputStream r6, com.fyber.inneractive.sdk.protobuf.C3562q r7) throws com.fyber.inneractive.sdk.protobuf.C3476a0 {
        /*
            int r0 = r6.read()     // Catch:{ IOException -> 0x005b }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r5 = 0
            return r5
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x005b }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x0056
            int r3 = r6.read()     // Catch:{ IOException -> 0x005b }
            if (r3 == r1) goto L_0x0051
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x004e
        L_0x003a:
            com.fyber.inneractive.sdk.protobuf.a$a$a r1 = new com.fyber.inneractive.sdk.protobuf.a$a$a
            r1.<init>(r6, r0)
            com.fyber.inneractive.sdk.protobuf.j r6 = com.fyber.inneractive.sdk.protobuf.C3529j.m9022a((java.io.InputStream) r1)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r5 = parsePartialFrom(r5, (com.fyber.inneractive.sdk.protobuf.C3529j) r6, (com.fyber.inneractive.sdk.protobuf.C3562q) r7)
            r7 = 0
            r6.mo14987a((int) r7)     // Catch:{ a0 -> 0x004c }
            return r5
        L_0x004c:
            r5 = move-exception
            throw r5
        L_0x004e:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x0051:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x0056:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8731e()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r5 = move-exception
            com.fyber.inneractive.sdk.protobuf.a0 r6 = new com.fyber.inneractive.sdk.protobuf.a0
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.parsePartialDelimitedFrom(com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, java.io.InputStream, com.fyber.inneractive.sdk.protobuf.q):com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite");
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3529j jVar, C3562q qVar) throws C3476a0 {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(C3469e.NEW_MUTABLE_INSTANCE);
        try {
            C3481b1 b1Var = C3481b1.f12402c;
            b1Var.getClass();
            C3498f1<?> a = b1Var.mo14786a(t2.getClass());
            C3537k kVar = jVar.f12475d;
            if (kVar == null) {
                kVar = new C3537k(jVar);
            }
            a.mo14891a(t2, kVar, qVar);
            a.mo14898c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C3476a0) {
                throw ((C3476a0) e.getCause());
            }
            throw new C3476a0(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C3476a0) {
                throw ((C3476a0) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(C3469e.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C3465a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C3465a) dynamicMethod(C3469e.NEW_BUILDER);
    }

    public Object dynamicMethod(C3469e eVar, Object obj) {
        return dynamicMethod(eVar, obj, (Object) null);
    }

    public abstract Object dynamicMethod(C3469e eVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3481b1 b1Var = C3481b1.f12402c;
        b1Var.getClass();
        return b1Var.mo14786a(getClass()).mo14897b(this, (GeneratedMessageLite) obj);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C3608y0<MessageType> getParserForType() {
        return (C3608y0) dynamicMethod(C3469e.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            C3481b1 b1Var = C3481b1.f12402c;
            b1Var.getClass();
            this.memoizedSerializedSize = b1Var.mo14786a(getClass()).mo14896b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C3481b1 b1Var = C3481b1.f12402c;
        b1Var.getClass();
        int d = b1Var.mo14786a(getClass()).mo14899d(this);
        this.memoizedHashCode = d;
        return d;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        C3481b1 b1Var = C3481b1.f12402c;
        b1Var.getClass();
        b1Var.mo14786a(getClass()).mo14898c(this);
    }

    public void mergeLengthDelimitedField(int i, C3508i iVar) {
        ensureUnknownFieldsInitialized();
        C3553n1 n1Var = this.unknownFields;
        n1Var.mo15135a();
        if (i != 0) {
            n1Var.mo15136a(C3584t1.m9573a(i, 2), (Object) iVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(C3553n1 n1Var) {
        this.unknownFields = C3553n1.m9370a(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C3553n1 n1Var = this.unknownFields;
        n1Var.mo15135a();
        if (i != 0) {
            n1Var.mo15136a(C3584t1.m9573a(i, 0), (Object) Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i, C3529j jVar) throws IOException {
        int i2 = C3584t1.f12572a;
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo15138a(i, jVar);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C3575s0.m9497a(this, sb, 0);
        return sb.toString();
    }

    public void writeTo(C3540l lVar) throws IOException {
        C3481b1 b1Var = C3481b1.f12402c;
        b1Var.getClass();
        C3498f1<?> a = b1Var.mo14786a(getClass());
        C3548m mVar = lVar.f12509a;
        if (mVar == null) {
            mVar = new C3548m(lVar);
        }
        a.mo14892a(this, (C3599u1) mVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(C3469e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C3481b1 b1Var = C3481b1.f12402c;
        b1Var.getClass();
        boolean a = b1Var.mo14786a(t.getClass()).mo14895a(t);
        if (z) {
            t.dynamicMethod(C3469e.SET_MEMOIZED_IS_INITIALIZED, a ? t : null);
        }
        return a;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C3465a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.mo14761c();
        createBuilder.mo14759a(createBuilder.f12365b, messagetype);
        return createBuilder;
    }

    public Object dynamicMethod(C3469e eVar) {
        return dynamicMethod(eVar, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(C3469e.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (C3465a) dynamicMethod(C3469e.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C3465a) dynamicMethod(C3469e.NEW_BUILDER);
        buildertype.mo14761c();
        buildertype.mo14759a(buildertype.f12365b, this);
        return buildertype;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$a */
    public static abstract class C3465a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C3465a<MessageType, BuilderType>> extends C3473a.C3474a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f12364a;

        /* renamed from: b */
        public MessageType f12365b;

        /* renamed from: c */
        public boolean f12366c = false;

        public C3465a(MessageType messagetype) {
            this.f12364a = messagetype;
            this.f12365b = (GeneratedMessageLite) messagetype.dynamicMethod(C3469e.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: a */
        public final void mo14759a(MessageType messagetype, MessageType messagetype2) {
            C3481b1 b1Var = C3481b1.f12402c;
            b1Var.getClass();
            b1Var.mo14786a(messagetype.getClass()).mo14893a(messagetype, messagetype2);
        }

        /* renamed from: b */
        public MessageType mo14760b() {
            if (this.f12366c) {
                return this.f12365b;
            }
            this.f12365b.makeImmutable();
            this.f12366c = true;
            return this.f12365b;
        }

        /* renamed from: c */
        public final void mo14761c() {
            if (this.f12366c) {
                MessageType messagetype = (GeneratedMessageLite) this.f12365b.dynamicMethod(C3469e.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.f12365b;
                C3481b1 b1Var = C3481b1.f12402c;
                b1Var.getClass();
                b1Var.mo14786a(messagetype.getClass()).mo14893a(messagetype, messagetype2);
                this.f12365b = messagetype;
                this.f12366c = false;
            }
        }

        public Object clone() throws CloneNotSupportedException {
            C3465a newBuilderForType = this.f12364a.newBuilderForType();
            newBuilderForType.mo14756a(mo14760b());
            return newBuilderForType;
        }

        public C3564q0 getDefaultInstanceForType() {
            return this.f12364a;
        }

        /* renamed from: a */
        public final MessageType mo14758a() {
            MessageType b = mo14760b();
            if (b.isInitialized()) {
                return b;
            }
            throw new C3547l1();
        }

        /* renamed from: a */
        public BuilderType mo14756a(MessageType messagetype) {
            mo14761c();
            mo14759a(this.f12365b, messagetype);
            return this;
        }

        /* renamed from: a */
        public BuilderType mo14757a(C3529j jVar, C3562q qVar) throws IOException {
            mo14761c();
            try {
                C3481b1 b1Var = C3481b1.f12402c;
                MessageType messagetype = this.f12365b;
                b1Var.getClass();
                C3498f1<?> a = b1Var.mo14786a(messagetype.getClass());
                MessageType messagetype2 = this.f12365b;
                C3537k kVar = jVar.f12475d;
                if (kVar == null) {
                    kVar = new C3537k(jVar);
                }
                a.mo14891a(messagetype2, kVar, qVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static C3609z.C3619i mutableCopy(C3609z.C3619i iVar) {
        C3506h0 h0Var = (C3506h0) iVar;
        int i = h0Var.f12438c;
        return h0Var.mo14808b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws C3476a0 {
        return parseFrom(t, byteBuffer, C3562q.m9406a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3508i iVar) throws C3476a0 {
        return checkMessageInitialized(parseFrom(t, iVar, C3562q.m9406a()));
    }

    public static C3609z.C3615f mutableCopy(C3609z.C3615f fVar) {
        C3603w wVar = (C3603w) fVar;
        int i = wVar.f12633c;
        return wVar.mo14808b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3508i iVar, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, iVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C3562q.m9406a()));
    }

    public static C3609z.C3611b mutableCopy(C3609z.C3611b bVar) {
        C3551n nVar = (C3551n) bVar;
        int i = nVar.f12521c;
        return nVar.mo14808b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }

    public static abstract class ExtendableMessage extends GeneratedMessageLite implements C3568r0 {
        public C3596u<C3467c> extensions = C3596u.m9588b();

        /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C3464a {
            public C3464a(ExtendableMessage extendableMessage, boolean z) {
                Iterator<Map.Entry<C3467c, Object>> f = extendableMessage.extensions.mo15225f();
                if (f.hasNext()) {
                    Map.Entry next = f.next();
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(C3529j jVar, C3468d<?, ?> dVar, C3562q qVar, int i) throws IOException {
            parseExtension(jVar, qVar, dVar, C3584t1.m9573a(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(C3508i iVar, C3562q qVar, C3468d<?, ?> dVar) throws IOException {
            C3564q0.C3565a aVar;
            C3564q0 q0Var = (C3564q0) this.extensions.mo15214a(dVar.f12376d);
            if (q0Var != null) {
                aVar = q0Var.toBuilder();
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = dVar.f12375c.newBuilderForType();
            }
            C3473a.C3474a aVar2 = (C3473a.C3474a) aVar;
            aVar2.getClass();
            try {
                C3529j g = iVar.mo14937g();
                ((C3465a) aVar2).mo14757a(g, qVar);
                g.mo14987a(0);
                ensureExtensionsAreMutable().mo15218c(dVar.f12376d, dVar.mo14771b(((C3465a) aVar).mo14758a()));
            } catch (C3476a0 e) {
                throw e;
            } catch (IOException e2) {
                StringBuilder k = C13555b.m33972k("Reading ");
                k.append(aVar2.getClass().getName());
                k.append(" from a ");
                k.append("ByteString");
                k.append(" threw an IOException (should never happen).");
                throw new RuntimeException(k.toString(), e2);
            }
        }

        private <MessageType extends C3564q0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, C3529j jVar, C3562q qVar) throws IOException {
            int i = 0;
            C3508i iVar = null;
            C3468d dVar = null;
            while (true) {
                int t = jVar.mo15011t();
                if (t == 0) {
                    break;
                } else if (t == C3584t1.f12574c) {
                    i = jVar.mo15012u();
                    if (i != 0) {
                        dVar = qVar.f12536a.get(new C3562q.C3563a(messagetype, i));
                    }
                } else if (t == C3584t1.f12575d) {
                    if (i == 0 || dVar == null) {
                        iVar = jVar.mo14995e();
                    } else {
                        eagerlyMergeMessageSetExtension(jVar, dVar, qVar, i);
                        iVar = null;
                    }
                } else if (!jVar.mo14996e(t)) {
                    break;
                }
            }
            jVar.mo14987a(C3584t1.f12573b);
            if (iVar != null && i != 0) {
                if (dVar != null) {
                    mergeMessageSetExtensionFromBytes(iVar, qVar, dVar);
                } else {
                    mergeLengthDelimitedField(i, iVar);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.C3529j r6, com.fyber.inneractive.sdk.protobuf.C3562q r7, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3468d<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = com.fyber.inneractive.sdk.protobuf.C3584t1.f12572a
                r0 = r9 & 7
                r1 = 0
                r2 = 1
                if (r8 != 0) goto L_0x0009
                goto L_0x002f
            L_0x0009:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f12370c
                int r3 = com.fyber.inneractive.sdk.protobuf.C3596u.m9585a((com.fyber.inneractive.sdk.protobuf.C3584t1.C3586b) r3, (boolean) r1)
                if (r0 != r3) goto L_0x0015
                r0 = 0
                goto L_0x0031
            L_0x0015:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f12376d
                boolean r4 = r3.f12371d
                if (r4 == 0) goto L_0x002f
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f12370c
                boolean r3 = r3.mo15210f()
                if (r3 == 0) goto L_0x002f
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f12370c
                int r3 = com.fyber.inneractive.sdk.protobuf.C3596u.m9585a((com.fyber.inneractive.sdk.protobuf.C3584t1.C3586b) r3, (boolean) r2)
                if (r0 != r3) goto L_0x002f
                r0 = 1
                goto L_0x0031
            L_0x002f:
                r0 = 0
                r1 = 1
            L_0x0031:
                if (r1 == 0) goto L_0x0038
                boolean r6 = r5.parseUnknownField(r9, r6)
                return r6
            L_0x0038:
                r5.ensureExtensionsAreMutable()
                if (r0 == 0) goto L_0x008d
                int r7 = r6.mo15004m()
                int r7 = r6.mo14993d(r7)
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f12370c
                com.fyber.inneractive.sdk.protobuf.t1$b r10 = com.fyber.inneractive.sdk.protobuf.C3584t1.C3586b.ENUM
                if (r9 != r10) goto L_0x006e
            L_0x004d:
                int r9 = r6.mo14986a()
                if (r9 <= 0) goto L_0x0088
                int r9 = r6.mo14998g()
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.z$d<?> r10 = r10.f12368a
                com.fyber.inneractive.sdk.protobuf.z$c r9 = r10.mo15253a(r9)
                if (r9 != 0) goto L_0x0062
                return r2
            L_0x0062:
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r10 = r5.extensions
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r8.f12376d
                java.lang.Object r9 = r8.mo14771b(r9)
                r10.mo15215a(r0, (java.lang.Object) r9)
                goto L_0x004d
            L_0x006e:
                int r9 = r6.mo14986a()
                if (r9 <= 0) goto L_0x0088
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f12370c
                com.fyber.inneractive.sdk.protobuf.u r10 = com.fyber.inneractive.sdk.protobuf.C3596u.f12611d
                com.fyber.inneractive.sdk.protobuf.t1$d r10 = com.fyber.inneractive.sdk.protobuf.C3584t1.C3592d.LOOSE
                java.lang.Object r9 = com.fyber.inneractive.sdk.protobuf.C3584t1.m9574a(r6, r9, r10)
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r10 = r5.extensions
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r8.f12376d
                r10.mo15215a(r0, (java.lang.Object) r9)
                goto L_0x006e
            L_0x0088:
                r6.mo14991c(r7)
                goto L_0x010c
            L_0x008d:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f12370c
                com.fyber.inneractive.sdk.protobuf.t1$c r9 = r9.f12595a
                int r9 = r9.ordinal()
                r0 = 7
                if (r9 == r0) goto L_0x00e0
                r10 = 8
                if (r9 == r10) goto L_0x00ab
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r7 = r7.f12370c
                com.fyber.inneractive.sdk.protobuf.u r9 = com.fyber.inneractive.sdk.protobuf.C3596u.f12611d
                com.fyber.inneractive.sdk.protobuf.t1$d r9 = com.fyber.inneractive.sdk.protobuf.C3584t1.C3592d.LOOSE
                java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3584t1.m9574a(r6, r7, r9)
                goto L_0x00f3
            L_0x00ab:
                r9 = 0
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f12376d
                boolean r0 = r10.f12371d
                if (r0 != 0) goto L_0x00c0
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r0 = r5.extensions
                java.lang.Object r10 = r0.mo15214a(r10)
                com.fyber.inneractive.sdk.protobuf.q0 r10 = (com.fyber.inneractive.sdk.protobuf.C3564q0) r10
                if (r10 == 0) goto L_0x00c0
                com.fyber.inneractive.sdk.protobuf.q0$a r9 = r10.toBuilder()
            L_0x00c0:
                if (r9 != 0) goto L_0x00c8
                com.fyber.inneractive.sdk.protobuf.q0 r9 = r8.f12375c
                com.fyber.inneractive.sdk.protobuf.q0$a r9 = r9.newBuilderForType()
            L_0x00c8:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.t1$b r0 = r10.f12370c
                com.fyber.inneractive.sdk.protobuf.t1$b r1 = com.fyber.inneractive.sdk.protobuf.C3584t1.C3586b.GROUP
                if (r0 != r1) goto L_0x00d6
                int r10 = r10.f12369b
                r6.mo14988a(r10, r9, r7)
                goto L_0x00d9
            L_0x00d6:
                r6.mo14989a((com.fyber.inneractive.sdk.protobuf.C3564q0.C3565a) r9, (com.fyber.inneractive.sdk.protobuf.C3562q) r7)
            L_0x00d9:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$a r9 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3465a) r9
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r6 = r9.mo14758a()
                goto L_0x00f3
            L_0x00e0:
                int r6 = r6.mo14998g()
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f12376d
                com.fyber.inneractive.sdk.protobuf.z$d<?> r7 = r7.f12368a
                com.fyber.inneractive.sdk.protobuf.z$c r7 = r7.mo15253a(r6)
                if (r7 != 0) goto L_0x00f2
                r5.mergeVarintField(r10, r6)
                return r2
            L_0x00f2:
                r6 = r7
            L_0x00f3:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f12376d
                boolean r9 = r7.f12371d
                if (r9 == 0) goto L_0x0103
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r9 = r5.extensions
                java.lang.Object r6 = r8.mo14771b(r6)
                r9.mo15215a(r7, (java.lang.Object) r6)
                goto L_0x010c
            L_0x0103:
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r9 = r5.extensions
                java.lang.Object r6 = r8.mo14771b(r6)
                r9.mo15218c(r7, r6)
            L_0x010c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.j, com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d, int, int):boolean");
        }

        private void verifyExtensionContainingType(C3468d<ExtendableMessage, ?> dVar) {
            if (dVar.f12373a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C3596u<C3467c> ensureExtensionsAreMutable() {
            C3596u<C3467c> uVar = this.extensions;
            if (uVar.f12613b) {
                this.extensions = uVar.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.mo15223e();
        }

        public int extensionsSerializedSize() {
            return this.extensions.mo15221d();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.mo15217c();
        }

        public /* bridge */ /* synthetic */ C3564q0 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(C3554o<ExtendableMessage, Type> oVar) {
            C3468d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            Type a = this.extensions.mo15214a(access$000.f12376d);
            if (a == null) {
                return access$000.f12374b;
            }
            C3467c cVar = access$000.f12376d;
            if (!cVar.f12371d) {
                return access$000.mo14770a(a);
            }
            if (cVar.f12370c.f12595a != C3584t1.C3591c.ENUM) {
                return a;
            }
            Type arrayList = new ArrayList();
            for (Object a2 : (List) a) {
                arrayList.add(access$000.mo14770a(a2));
            }
            return arrayList;
        }

        public final <Type> int getExtensionCount(C3554o<ExtendableMessage, List<Type>> oVar) {
            C3468d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C3596u<C3467c> uVar = this.extensions;
            C3467c cVar = access$000.f12376d;
            uVar.getClass();
            if (cVar.mo14765b()) {
                Object a = uVar.mo15214a(cVar);
                if (a == null) {
                    return 0;
                }
                return ((List) a).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public final <Type> boolean hasExtension(C3554o<ExtendableMessage, Type> oVar) {
            C3468d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C3596u<C3467c> uVar = this.extensions;
            C3467c cVar = access$000.f12376d;
            uVar.getClass();
            if (cVar.mo14765b()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            } else if (uVar.f12612a.get(cVar) != null) {
                return true;
            } else {
                return false;
            }
        }

        public final void mergeExtensionFields(ExtendableMessage extendableMessage) {
            C3596u<C3467c> uVar = this.extensions;
            if (uVar.f12613b) {
                this.extensions = uVar.clone();
            }
            this.extensions.mo15216a(extendableMessage.extensions);
        }

        public /* bridge */ /* synthetic */ C3564q0.C3565a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public a newExtensionWriter() {
            return new C3464a(this, false);
        }

        public a newMessageSetExtensionWriter() {
            return new C3464a(this, true);
        }

        public <MessageType extends C3564q0> boolean parseUnknownField(MessageType messagetype, C3529j jVar, C3562q qVar, int i) throws IOException {
            int i2 = C3584t1.f12572a;
            int i3 = i >>> 3;
            return parseExtension(jVar, qVar, qVar.f12536a.get(new C3562q.C3563a(messagetype, i3)), i, i3);
        }

        public <MessageType extends C3564q0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, C3529j jVar, C3562q qVar, int i) throws IOException {
            if (i == C3584t1.f12572a) {
                mergeMessageSetExtensionFromCodedStream(messagetype, jVar, qVar);
                return true;
            } else if ((i & 7) == 2) {
                return parseUnknownField(messagetype, jVar, qVar, i);
            } else {
                return jVar.mo14996e(i);
            }
        }

        public /* bridge */ /* synthetic */ C3564q0.C3565a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        public final <Type> Type getExtension(C3554o<ExtendableMessage, List<Type>> oVar, int i) {
            C3468d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C3596u<C3467c> uVar = this.extensions;
            C3467c cVar = access$000.f12376d;
            uVar.getClass();
            if (cVar.mo14765b()) {
                Object a = uVar.mo15214a(cVar);
                if (a != null) {
                    return access$000.mo14770a(((List) a).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static C3609z.C3610a mutableCopy(C3609z.C3610a aVar) {
        C3499g gVar = (C3499g) aVar;
        int i = gVar.f12432c;
        return gVar.mo14808b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, C3529j.m9022a(inputStream), C3562q.m9406a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C3562q qVar) throws C3476a0 {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(C3469e.NEW_MUTABLE_INSTANCE);
        try {
            C3481b1 b1Var = C3481b1.f12402c;
            b1Var.getClass();
            C3498f1<?> a = b1Var.mo14786a(t2.getClass());
            a.mo14894a(t2, bArr, i, i + i2, new C3490e.C3491a(qVar));
            a.mo14898c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C3476a0) {
                throw ((C3476a0) e.getCause());
            }
            throw new C3476a0(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C3476a0.m8735i();
        }
    }

    public static <E> C3609z.C3620j<E> mutableCopy(C3609z.C3620j<E> jVar) {
        int size = jVar.size();
        return jVar.mo14808b(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, C3529j.m9022a(inputStream), qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3529j jVar) throws C3476a0 {
        return parseFrom(t, jVar, C3562q.m9406a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C3529j jVar, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, jVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3529j jVar) throws C3476a0 {
        return parsePartialFrom(t, jVar, C3562q.m9406a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C3508i iVar, C3562q qVar) throws C3476a0 {
        try {
            C3529j g = iVar.mo14937g();
            T parsePartialFrom = parsePartialFrom(t, g, qVar);
            g.mo14987a(0);
            return parsePartialFrom;
        } catch (C3476a0 e) {
            throw e;
        } catch (C3476a0 e2) {
            throw e2;
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, C3562q qVar) throws C3476a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }
}
