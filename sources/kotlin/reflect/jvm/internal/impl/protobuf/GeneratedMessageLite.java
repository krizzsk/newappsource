package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C24074a;
import kotlin.reflect.jvm.internal.impl.protobuf.C24081e;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;
import kotlin.reflect.jvm.internal.impl.protobuf.C24087g;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.C24093j;
import p001a0.C0017h;
import vg0.C25091a;
import vg0.C25099f;

public abstract class GeneratedMessageLite extends C24074a implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C24065a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61053a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f61053a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f61053a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C24065a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b */
    public static abstract class C24066b<MessageType extends GeneratedMessageLite, BuilderType extends C24066b> extends C24074a.C24075a<BuilderType> {

        /* renamed from: b */
        public C25091a f61054b = C25091a.f63298b;

        /* renamed from: f */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: g */
        public abstract BuilderType mo59648g(MessageType messagetype);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c */
    public static abstract class C24067c<MessageType extends ExtendableMessage<MessageType>, BuilderType extends C24067c<MessageType, BuilderType>> extends C24066b<MessageType, BuilderType> implements C25099f {

        /* renamed from: c */
        public C24081e<C24068d> f61055c = C24081e.f61081d;

        /* renamed from: d */
        public boolean f61056d;

        /* renamed from: h */
        public final void mo59999h(MessageType messagetype) {
            if (!this.f61056d) {
                this.f61055c = this.f61055c.clone();
                this.f61056d = true;
            }
            C24081e<C24068d> eVar = this.f61055c;
            C24081e d = messagetype.extensions;
            eVar.getClass();
            for (int i = 0; i < d.f61082a.f61092c.size(); i++) {
                eVar.mo60046h(d.f61082a.f61092c.get(i));
            }
            for (Map.Entry h : d.f61082a.mo60059c()) {
                eVar.mo60046h(h);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d */
    public static final class C24068d implements C24081e.C24083b<C24068d> {

        /* renamed from: b */
        public final C24084f.C24086b<?> f61057b = null;

        /* renamed from: c */
        public final int f61058c;

        /* renamed from: d */
        public final WireFormat$FieldType f61059d;

        /* renamed from: e */
        public final boolean f61060e;

        /* renamed from: f */
        public final boolean f61061f;

        public C24068d(int i, WireFormat$FieldType wireFormat$FieldType, boolean z) {
            this.f61058c = i;
            this.f61059d = wireFormat$FieldType;
            this.f61060e = z;
            this.f61061f = false;
        }

        /* renamed from: B */
        public final WireFormat$JavaType mo60000B() {
            return this.f61059d.getJavaType();
        }

        /* renamed from: S0 */
        public final C24066b mo60001S0(C24090h.C24091a aVar, C24090h hVar) {
            return ((C24066b) aVar).mo59648g((GeneratedMessageLite) hVar);
        }

        public final int compareTo(Object obj) {
            return this.f61058c - ((C24068d) obj).f61058c;
        }

        public final int getNumber() {
            return this.f61058c;
        }

        public final boolean isPacked() {
            return this.f61061f;
        }

        /* renamed from: x */
        public final boolean mo60005x() {
            return this.f61060e;
        }

        /* renamed from: z */
        public final WireFormat$FieldType mo60006z() {
            return this.f61059d;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e */
    public static class C24069e<ContainingType extends C24090h, Type> {

        /* renamed from: a */
        public final ContainingType f61062a;

        /* renamed from: b */
        public final Type f61063b;

        /* renamed from: c */
        public final C24090h f61064c;

        /* renamed from: d */
        public final C24068d f61065d;

        /* renamed from: e */
        public final Method f61066e;

        public C24069e(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, C24068d dVar, Class cls) {
            if (extendableMessage == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.f61059d == WireFormat$FieldType.MESSAGE && generatedMessageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f61062a = extendableMessage;
                this.f61063b = obj;
                this.f61064c = generatedMessageLite;
                this.f61065d = dVar;
                if (C24084f.C24085a.class.isAssignableFrom(cls)) {
                    try {
                        this.f61066e = cls.getMethod("valueOf", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(name.length() + 45 + 7);
                        C0017h.m61R(sb, "Generated message class \"", name, "\" missing method \"", "valueOf");
                        sb.append("\".");
                        throw new RuntimeException(sb.toString(), e);
                    }
                } else {
                    this.f61066e = null;
                }
            }
        }

        /* renamed from: a */
        public final Object mo60007a(Object obj) {
            if (this.f61065d.mo60000B() != WireFormat$JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f61066e.invoke((Object) null, new Object[]{(Integer) obj});
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

        /* renamed from: b */
        public final Object mo60008b(Object obj) {
            if (this.f61065d.mo60000B() == WireFormat$JavaType.ENUM) {
                return Integer.valueOf(((C24084f.C24085a) obj).getNumber());
            }
            return obj;
        }
    }

    public GeneratedMessageLite() {
    }

    /* renamed from: b */
    public static C24069e m60049b(ExtendableMessage extendableMessage, GeneratedMessageLite generatedMessageLite, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C24069e(extendableMessage, Collections.emptyList(), generatedMessageLite, new C24068d(i, wireFormat$FieldType, true), cls);
    }

    /* renamed from: c */
    public static C24069e m60050c(ExtendableMessage extendableMessage, Serializable serializable, GeneratedMessageLite generatedMessageLite, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C24069e(extendableMessage, serializable, generatedMessageLite, new C24068d(i, wireFormat$FieldType, false), cls);
    }

    public GeneratedMessageLite(int i) {
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements C25099f {
        /* access modifiers changed from: private */
        public final C24081e<C24068d> extensions;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C24064a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C24068d, Object>> f61050a;

            /* renamed from: b */
            public Map.Entry<C24068d, Object> f61051b;

            /* renamed from: c */
            public final boolean f61052c;

            public C24064a(ExtendableMessage extendableMessage) {
                Iterator<Map.Entry<C24068d, Object>> it;
                C24081e d = extendableMessage.extensions;
                if (d.f61084c) {
                    it = new C24087g.C24089b<>(((C24093j.C24099d) d.f61082a.entrySet()).iterator());
                } else {
                    it = ((C24093j.C24099d) d.f61082a.entrySet()).iterator();
                }
                this.f61050a = it;
                if (it.hasNext()) {
                    this.f61051b = it.next();
                }
                this.f61052c = false;
            }

            /* renamed from: a */
            public final void mo59998a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C24068d, Object> entry = this.f61051b;
                    if (entry != null && entry.getKey().f61058c < i) {
                        C24068d key = this.f61051b.getKey();
                        int i2 = 0;
                        if (!this.f61052c || key.mo60000B() != WireFormat$JavaType.MESSAGE || key.f61060e) {
                            Object value = this.f61051b.getValue();
                            C24081e eVar = C24081e.f61081d;
                            WireFormat$FieldType z = key.mo60006z();
                            int number = key.getNumber();
                            if (key.mo60005x()) {
                                List<Object> list = (List) value;
                                if (key.isPacked()) {
                                    codedOutputStream.mo59987x(number, 2);
                                    for (Object c : list) {
                                        i2 += C24081e.m60099c(z, c);
                                    }
                                    codedOutputStream.mo59985v(i2);
                                    for (Object m : list) {
                                        C24081e.m60105m(codedOutputStream, z, m);
                                    }
                                } else {
                                    for (Object l : list) {
                                        C24081e.m60104l(codedOutputStream, z, number, l);
                                    }
                                }
                            } else if (value instanceof C24087g) {
                                C24081e.m60104l(codedOutputStream, z, number, ((C24087g) value).mo60048a());
                            } else {
                                C24081e.m60104l(codedOutputStream, z, number, value);
                            }
                        } else {
                            int i3 = key.f61058c;
                            codedOutputStream.mo59987x(1, 3);
                            codedOutputStream.mo59987x(2, 0);
                            codedOutputStream.mo59985v(i3);
                            codedOutputStream.mo59978o(3, (C24090h) this.f61051b.getValue());
                            codedOutputStream.mo59987x(1, 4);
                        }
                        if (this.f61050a.hasNext()) {
                            this.f61051b = this.f61050a.next();
                        } else {
                            this.f61051b = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.extensions = new C24081e<>();
        }

        /* renamed from: e */
        public final boolean mo59988e() {
            C24081e<C24068d> eVar = this.extensions;
            for (int i = 0; i < eVar.f61082a.f61092c.size(); i++) {
                if (!C24081e.m60101f(eVar.f61082a.f61092c.get(i))) {
                    return false;
                }
            }
            for (Map.Entry f : eVar.f61082a.mo60059c()) {
                if (!C24081e.m60101f(f)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int mo59989f() {
            C24081e<C24068d> eVar = this.extensions;
            int i = 0;
            for (int i2 = 0; i2 < eVar.f61082a.f61092c.size(); i2++) {
                Map.Entry entry = eVar.f61082a.f61092c.get(i2);
                i += C24081e.m60100d((C24081e.C24083b) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : eVar.f61082a.mo60059c()) {
                i += C24081e.m60100d((C24081e.C24083b) entry2.getKey(), entry2.getValue());
            }
            return i;
        }

        /* renamed from: g */
        public final <Type> Type mo59990g(C24069e<MessageType, Type> eVar) {
            mo59997o(eVar);
            Type e = this.extensions.mo60044e(eVar.f61065d);
            if (e == null) {
                return eVar.f61063b;
            }
            C24068d dVar = eVar.f61065d;
            if (!dVar.f61060e) {
                return eVar.mo60007a(e);
            }
            if (dVar.mo60000B() != WireFormat$JavaType.ENUM) {
                return e;
            }
            Type arrayList = new ArrayList();
            for (Object a : (List) e) {
                arrayList.add(eVar.mo60007a(a));
            }
            return arrayList;
        }

        /* renamed from: h */
        public final <Type> Type mo59991h(C24069e<MessageType, List<Type>> eVar, int i) {
            mo59997o(eVar);
            C24081e<C24068d> eVar2 = this.extensions;
            C24068d dVar = eVar.f61065d;
            eVar2.getClass();
            if (dVar.f61060e) {
                Object e = eVar2.mo60044e(dVar);
                if (e != null) {
                    return eVar.mo60007a(((List) e).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: i */
        public final <Type> int mo59992i(C24069e<MessageType, List<Type>> eVar) {
            mo59997o(eVar);
            C24081e<C24068d> eVar2 = this.extensions;
            C24068d dVar = eVar.f61065d;
            eVar2.getClass();
            if (dVar.f61060e) {
                Object e = eVar2.mo60044e(dVar);
                if (e == null) {
                    return 0;
                }
                return ((List) e).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        /* renamed from: j */
        public final <Type> boolean mo59993j(C24069e<MessageType, Type> eVar) {
            mo59997o(eVar);
            C24081e<C24068d> eVar2 = this.extensions;
            C24068d dVar = eVar.f61065d;
            eVar2.getClass();
            if (dVar.f61060e) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            } else if (eVar2.f61082a.get(dVar) != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: k */
        public final void mo59994k() {
            this.extensions.mo60045g();
        }

        /* renamed from: l */
        public final ExtendableMessage<MessageType>.C25541a mo59995l() {
            return new C24064a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo59996m(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r9, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r10, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r11, int r12) throws java.io.IOException {
            /*
                r8 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.e<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r0 = r8.extensions
                kotlin.reflect.jvm.internal.impl.protobuf.h r1 = r8.getDefaultInstanceForType()
                r2 = r12 & 7
                int r3 = r12 >>> 3
                java.util.Map<kotlin.reflect.jvm.internal.impl.protobuf.d$a, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<?, ?>> r4 = r11.f61078a
                kotlin.reflect.jvm.internal.impl.protobuf.d$a r5 = new kotlin.reflect.jvm.internal.impl.protobuf.d$a
                r5.<init>(r1, r3)
                java.lang.Object r1 = r4.get(r5)
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C24069e) r1
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 != 0) goto L_0x001d
                goto L_0x0042
            L_0x001d:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r6 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = r6.f61059d
                kotlin.reflect.jvm.internal.impl.protobuf.e r7 = kotlin.reflect.jvm.internal.impl.protobuf.C24081e.f61081d
                int r6 = r6.getWireType()
                if (r2 != r6) goto L_0x002b
                r2 = 0
                goto L_0x0043
            L_0x002b:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r6 = r1.f61065d
                boolean r7 = r6.f61060e
                if (r7 == 0) goto L_0x0042
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = r6.f61059d
                boolean r6 = r6.isPackable()
                if (r6 == 0) goto L_0x0042
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r6 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r6 = r6.f61059d
                if (r2 != r3) goto L_0x0042
                r2 = 0
                r6 = 1
                goto L_0x0044
            L_0x0042:
                r2 = 1
            L_0x0043:
                r6 = 0
            L_0x0044:
                if (r2 == 0) goto L_0x004c
                boolean r4 = r9.mo60035q(r12, r10)
                goto L_0x014b
            L_0x004c:
                if (r6 == 0) goto L_0x0097
                int r10 = r9.mo60029k()
                int r10 = r9.mo60022d(r10)
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r11 = r11.f61059d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r12 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.ENUM
                if (r11 != r12) goto L_0x007e
            L_0x005e:
                int r11 = r9.mo60020b()
                if (r11 <= 0) goto L_0x0092
                int r11 = r9.mo60029k()
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r12 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.f$b<?> r12 = r12.f61057b
                kotlin.reflect.jvm.internal.impl.protobuf.f$a r11 = r12.mo59642a(r11)
                if (r11 != 0) goto L_0x0074
                goto L_0x014b
            L_0x0074:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r12 = r1.f61065d
                java.lang.Object r11 = r1.mo60008b(r11)
                r0.mo60041a(r12, r11)
                goto L_0x005e
            L_0x007e:
                int r11 = r9.mo60020b()
                if (r11 <= 0) goto L_0x0092
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r11 = r11.f61059d
                java.lang.Object r11 = kotlin.reflect.jvm.internal.impl.protobuf.C24081e.m60102i(r9, r11)
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r12 = r1.f61065d
                r0.mo60041a(r12, r11)
                goto L_0x007e
            L_0x0092:
                r9.mo60021c(r10)
                goto L_0x014b
            L_0x0097:
                int[] r2 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C24065a.f61053a
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r6 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r6 = r6.mo60000B()
                int r6 = r6.ordinal()
                r2 = r2[r6]
                if (r2 == r4) goto L_0x00cb
                if (r2 == r3) goto L_0x00b3
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = r10.f61059d
                java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.protobuf.C24081e.m60102i(r9, r10)
                goto L_0x0136
            L_0x00b3:
                int r9 = r9.mo60029k()
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.f$b<?> r11 = r11.f61057b
                kotlin.reflect.jvm.internal.impl.protobuf.f$a r11 = r11.mo59642a(r9)
                if (r11 != 0) goto L_0x00c9
                r10.mo59985v(r12)
                r10.mo59985v(r9)
                goto L_0x014b
            L_0x00c9:
                r9 = r11
                goto L_0x0136
            L_0x00cb:
                r10 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r12 = r1.f61065d
                boolean r2 = r12.f61060e
                if (r2 != 0) goto L_0x00de
                java.lang.Object r12 = r0.mo60044e(r12)
                kotlin.reflect.jvm.internal.impl.protobuf.h r12 = (kotlin.reflect.jvm.internal.impl.protobuf.C24090h) r12
                if (r12 == 0) goto L_0x00de
                kotlin.reflect.jvm.internal.impl.protobuf.h$a r10 = r12.toBuilder()
            L_0x00de:
                if (r10 != 0) goto L_0x00e6
                kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r1.f61064c
                kotlin.reflect.jvm.internal.impl.protobuf.h$a r10 = r10.newBuilderForType()
            L_0x00e6:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r12 = r1.f61065d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = r12.f61059d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.GROUP
                r6 = 64
                java.lang.String r7 = "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."
                if (r2 != r3) goto L_0x0112
                int r12 = r12.f61058c
                int r2 = r9.f61076i
                if (r2 >= r6) goto L_0x010c
                int r2 = r2 + r4
                r9.f61076i = r2
                r10.mo59652n(r9, r11)
                int r11 = r12 << 3
                r11 = r11 | 4
                r9.mo60019a(r11)
                int r11 = r9.f61076i
                int r11 = r11 + -1
                r9.f61076i = r11
                goto L_0x0132
            L_0x010c:
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
                r9.<init>(r7)
                throw r9
            L_0x0112:
                int r12 = r9.mo60029k()
                int r2 = r9.f61076i
                if (r2 >= r6) goto L_0x014c
                int r12 = r9.mo60022d(r12)
                int r2 = r9.f61076i
                int r2 = r2 + r4
                r9.f61076i = r2
                r10.mo59652n(r9, r11)
                r9.mo60019a(r5)
                int r11 = r9.f61076i
                int r11 = r11 + -1
                r9.f61076i = r11
                r9.mo60021c(r12)
            L_0x0132:
                kotlin.reflect.jvm.internal.impl.protobuf.h r9 = r10.build()
            L_0x0136:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r1.f61065d
                boolean r11 = r10.f61060e
                if (r11 == 0) goto L_0x0144
                java.lang.Object r9 = r1.mo60008b(r9)
                r0.mo60041a(r10, r9)
                goto L_0x014b
            L_0x0144:
                java.lang.Object r9 = r1.mo60008b(r9)
                r0.mo60047j(r10, r9)
            L_0x014b:
                return r4
            L_0x014c:
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
                r9.<init>(r7)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.mo59996m(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.d, int):boolean");
        }

        /* renamed from: o */
        public final void mo59997o(C24069e<MessageType, ?> eVar) {
            if (eVar.f61062a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public ExtendableMessage(C24067c<MessageType, ?> cVar) {
            cVar.f61055c.mo60045g();
            cVar.f61056d = false;
            this.extensions = cVar.f61055c;
        }
    }
}
