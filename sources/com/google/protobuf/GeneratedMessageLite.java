package com.google.protobuf;

import com.google.protobuf.C14583a;
import com.google.protobuf.C14606i;
import com.google.protobuf.C14610k;
import com.google.protobuf.C14629t;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.C14572a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p911xg.C20505m;
import p911xg.C20510r;
import p911xg.C20512t;
import p911xg.C20518x;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C14572a<MessageType, BuilderType>> extends C14583a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C14599d0 unknownFields = C14599d0.f36840e;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static abstract class C14572a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C14572a<MessageType, BuilderType>> extends C14583a.C14584a<MessageType, BuilderType> {

        /* renamed from: b */
        public final MessageType f36808b;

        /* renamed from: c */
        public MessageType f36809c;

        /* renamed from: d */
        public boolean f36810d = false;

        public C14572a(MessageType messagetype) {
            this.f36808b = messagetype;
            this.f36809c = (GeneratedMessageLite) messagetype.mo43546n(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: q */
        public static void m36511q(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            C20510r rVar = C20510r.f51897c;
            rVar.getClass();
            rVar.mo52690a(generatedMessageLite.getClass()).mo44129a(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f36808b;
            messagetype.getClass();
            C14572a aVar = (C14572a) messagetype.mo43546n(MethodToInvoke.NEW_BUILDER);
            GeneratedMessageLite o = mo43955o();
            aVar.mo43956p();
            m36511q(aVar.f36809c, o);
            return aVar;
        }

        /* renamed from: j */
        public final GeneratedMessageLite mo43949j() {
            return this.f36808b;
        }

        /* renamed from: m */
        public final MessageType mo43954m() {
            MessageType o = mo43955o();
            if (o.isInitialized()) {
                return o;
            }
            throw new UninitializedMessageException();
        }

        /* renamed from: o */
        public final MessageType mo43955o() {
            if (this.f36810d) {
                return this.f36809c;
            }
            MessageType messagetype = this.f36809c;
            messagetype.getClass();
            C20510r rVar = C20510r.f51897c;
            rVar.getClass();
            rVar.mo52690a(messagetype.getClass()).mo44130b(messagetype);
            this.f36810d = true;
            return this.f36809c;
        }

        /* renamed from: p */
        public final void mo43956p() {
            if (this.f36810d) {
                MessageType messagetype = (GeneratedMessageLite) this.f36809c.mo43546n(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m36511q(messagetype, this.f36809c);
                this.f36809c = messagetype;
                this.f36810d = false;
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static class C14573b<T extends GeneratedMessageLite<T, ?>> extends C14586b<T> {
        public C14573b(T t) {
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static abstract class C14574c<MessageType extends C14574c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements C20505m {
        public C14606i<C14575d> extensions = C14606i.f36852d;

        /* renamed from: j */
        public final GeneratedMessageLite mo43949j() {
            return (GeneratedMessageLite) mo43546n(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }

        public final C14572a toBuilder() {
            C14572a aVar = (C14572a) mo43546n(MethodToInvoke.NEW_BUILDER);
            aVar.mo43956p();
            C14572a.m36511q(aVar.f36809c, this);
            return aVar;
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static final class C14575d implements C14606i.C14608b<C14575d> {
        /* renamed from: B */
        public final WireFormat$JavaType mo43957B() {
            throw null;
        }

        /* renamed from: K */
        public final C14572a mo43958K(C14629t.C14630a aVar, C14629t tVar) {
            C14572a aVar2 = (C14572a) aVar;
            aVar2.mo43956p();
            C14572a.m36511q(aVar2.f36809c, (GeneratedMessageLite) tVar);
            return aVar2;
        }

        public final int compareTo(Object obj) {
            ((C14575d) obj).getClass();
            return 0;
        }

        public final void getNumber() {
        }

        public final void isPacked() {
        }

        /* renamed from: x */
        public final void mo43962x() {
        }

        /* renamed from: z */
        public final void mo43963z() {
        }
    }

    /* renamed from: o */
    public static <T extends GeneratedMessageLite<?, ?>> T m36501o(Class<T> cls) {
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
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) C20518x.m48159b(cls);
            generatedMessageLite.getClass();
            t = (GeneratedMessageLite) generatedMessageLite.mo43546n(MethodToInvoke.GET_DEFAULT_INSTANCE);
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: p */
    static Object m36502p(Method method, Object obj, Object... objArr) {
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

    /* renamed from: q */
    public static <E> C14610k.C14615e<E> m36503q(C14610k.C14615e<E> eVar) {
        int i;
        int size = eVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return eVar.mo44086c1(i);
    }

    /* renamed from: r */
    public static <T extends GeneratedMessageLite<?, ?>> void m36504r(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: a */
    public final void mo43942a(CodedOutputStream codedOutputStream) throws IOException {
        C20510r rVar = C20510r.f51897c;
        rVar.getClass();
        C20512t<?> a = rVar.mo52690a(getClass());
        C14602f fVar = codedOutputStream.f36801a;
        if (fVar == null) {
            fVar = new C14602f(codedOutputStream);
        }
        a.mo44133e(this, fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo43943c() {
        return this.memoizedSerializedSize;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo43944e(int i) {
        this.memoizedSerializedSize = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C20510r rVar = C20510r.f51897c;
        rVar.getClass();
        return rVar.mo52690a(getClass()).equals(this, (GeneratedMessageLite) obj);
    }

    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            C20510r rVar = C20510r.f51897c;
            rVar.getClass();
            this.memoizedSerializedSize = rVar.mo52690a(getClass()).mo44132d(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C20510r rVar = C20510r.f51897c;
        rVar.getClass();
        int hashCode = rVar.mo52690a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final boolean isInitialized() {
        byte byteValue = ((Byte) mo43546n(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C20510r rVar = C20510r.f51897c;
        rVar.getClass();
        boolean c = rVar.mo52690a(getClass()).mo44131c(this);
        mo43546n(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return c;
    }

    /* renamed from: j */
    public GeneratedMessageLite mo43949j() {
        return (GeneratedMessageLite) mo43546n(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: m */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C14572a<MessageType, BuilderType>> BuilderType mo43950m() {
        return (C14572a) mo43546n(MethodToInvoke.NEW_BUILDER);
    }

    /* renamed from: n */
    public abstract Object mo43546n(MethodToInvoke methodToInvoke);

    public C14572a toBuilder() {
        C14572a aVar = (C14572a) mo43546n(MethodToInvoke.NEW_BUILDER);
        aVar.mo43956p();
        C14572a.m36511q(aVar.f36809c, this);
        return aVar;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C14631u.m36658c(this, sb, 0);
        return sb.toString();
    }
}
