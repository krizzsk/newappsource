package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C24074a;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType;
import vg0.C25091a;
import vg0.C25097e;
import vg0.C25099f;

public final class JvmProtoBuf {

    /* renamed from: a */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Constructor, JvmMethodSignature> f60999a;

    /* renamed from: b */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Function, JvmMethodSignature> f61000b;

    /* renamed from: c */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Function, Integer> f61001c;

    /* renamed from: d */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Property, JvmPropertySignature> f61002d;

    /* renamed from: e */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Property, Integer> f61003e;

    /* renamed from: f */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Type, List<ProtoBuf$Annotation>> f61004f;

    /* renamed from: g */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Type, Boolean> f61005g;

    /* renamed from: h */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> f61006h;

    /* renamed from: i */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Class, Integer> f61007i;

    /* renamed from: j */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Class, List<ProtoBuf$Property>> f61008j;

    /* renamed from: k */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Class, Integer> f61009k;

    /* renamed from: l */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Class, Integer> f61010l;

    /* renamed from: m */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Package, Integer> f61011m;

    /* renamed from: n */
    public static final GeneratedMessageLite.C24069e<ProtoBuf$Package, List<ProtoBuf$Property>> f61012n;

    static {
        ProtoBuf$Constructor protoBuf$Constructor = ProtoBuf$Constructor.f60836b;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f61018b;
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
        JvmMethodSignature jvmMethodSignature2 = jvmMethodSignature;
        f60999a = GeneratedMessageLite.m60050c(protoBuf$Constructor, jvmMethodSignature, jvmMethodSignature2, 100, wireFormat$FieldType, JvmMethodSignature.class);
        ProtoBuf$Function protoBuf$Function = ProtoBuf$Function.f60867b;
        f61000b = GeneratedMessageLite.m60050c(protoBuf$Function, jvmMethodSignature2, jvmMethodSignature, 100, wireFormat$FieldType, JvmMethodSignature.class);
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.INT32;
        f61001c = GeneratedMessageLite.m60050c(protoBuf$Function, (Serializable) null, (GeneratedMessageLite) null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Property protoBuf$Property = ProtoBuf$Property.f60897b;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.f61023b;
        f61002d = GeneratedMessageLite.m60050c(protoBuf$Property, jvmPropertySignature, jvmPropertySignature, 100, wireFormat$FieldType, JvmPropertySignature.class);
        f61003e = GeneratedMessageLite.m60050c(protoBuf$Property, (Serializable) null, (GeneratedMessageLite) null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
        ProtoBuf$Annotation protoBuf$Annotation = ProtoBuf$Annotation.f60790b;
        f61004f = GeneratedMessageLite.m60049b(protoBuf$Type, protoBuf$Annotation, 100, wireFormat$FieldType, ProtoBuf$Annotation.class);
        f61005g = GeneratedMessageLite.m60050c(protoBuf$Type, Boolean.FALSE, (GeneratedMessageLite) null, 101, WireFormat$FieldType.BOOL, Boolean.class);
        f61006h = GeneratedMessageLite.m60049b(ProtoBuf$TypeParameter.f60962b, protoBuf$Annotation, 100, wireFormat$FieldType, ProtoBuf$Annotation.class);
        ProtoBuf$Class protoBuf$Class = ProtoBuf$Class.f60814b;
        WireFormat$FieldType wireFormat$FieldType3 = wireFormat$FieldType2;
        f61007i = GeneratedMessageLite.m60050c(protoBuf$Class, (Serializable) null, (GeneratedMessageLite) null, 101, wireFormat$FieldType3, Integer.class);
        f61008j = GeneratedMessageLite.m60049b(protoBuf$Class, protoBuf$Property, 102, wireFormat$FieldType, ProtoBuf$Property.class);
        f61009k = GeneratedMessageLite.m60050c(protoBuf$Class, (Serializable) null, (GeneratedMessageLite) null, 103, wireFormat$FieldType3, Integer.class);
        f61010l = GeneratedMessageLite.m60050c(protoBuf$Class, (Serializable) null, (GeneratedMessageLite) null, 104, wireFormat$FieldType3, Integer.class);
        ProtoBuf$Package protoBuf$Package = ProtoBuf$Package.f60882b;
        f61011m = GeneratedMessageLite.m60050c(protoBuf$Package, (Serializable) null, (GeneratedMessageLite) null, 101, wireFormat$FieldType3, Integer.class);
        f61012n = GeneratedMessageLite.m60049b(protoBuf$Package, protoBuf$Property, 102, wireFormat$FieldType, ProtoBuf$Property.class);
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final JvmFieldSignature f61013b;

        /* renamed from: c */
        public static C24051a f61014c = new C24051a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$a */
        public static class C24051a extends C24077b<JvmFieldSignature> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(cVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b */
        public static final class C24052b extends GeneratedMessageLite.C24066b<JvmFieldSignature, C24052b> implements C25099f {

            /* renamed from: c */
            public int f61015c;

            /* renamed from: d */
            public int f61016d;

            /* renamed from: e */
            public int f61017e;

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59932j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                JvmFieldSignature h = mo59930h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C24052b bVar = new C24052b();
                bVar.mo59931i(mo59930h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C24052b bVar = new C24052b();
                bVar.mo59931i(mo59930h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59931i((JvmFieldSignature) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final JvmFieldSignature mo59930h() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature((GeneratedMessageLite.C24066b) this);
                int i = this.f61015c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmFieldSignature.name_ = this.f61016d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.desc_ = this.f61017e;
                jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            /* renamed from: i */
            public final void mo59931i(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature != JvmFieldSignature.f61013b) {
                    if (jvmFieldSignature.mo59929k()) {
                        int i = jvmFieldSignature.mo59927i();
                        this.f61015c |= 1;
                        this.f61016d = i;
                    }
                    if (jvmFieldSignature.mo59928j()) {
                        int h = jvmFieldSignature.mo59926h();
                        this.f61015c |= 2;
                        this.f61017e = h;
                    }
                    this.f61054b = this.f61054b.mo61617b(jvmFieldSignature.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59932j(C24078c cVar, C24079d dVar) throws IOException {
                JvmFieldSignature jvmFieldSignature;
                try {
                    JvmFieldSignature.f61014c.getClass();
                    mo59931i(new JvmFieldSignature(cVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    jvmFieldSignature = (JvmFieldSignature) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (jvmFieldSignature != null) {
                    mo59931i(jvmFieldSignature);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59932j(cVar, dVar);
                return this;
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f61013b = jvmFieldSignature;
            jvmFieldSignature.name_ = 0;
            jvmFieldSignature.desc_ = 0;
        }

        public JvmFieldSignature(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo59976m(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo59976m(2, this.desc_);
            }
            codedOutputStream.mo59981r(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m60026b(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m60026b(2, this.desc_);
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: h */
        public final int mo59926h() {
            return this.desc_;
        }

        /* renamed from: i */
        public final int mo59927i() {
            return this.name_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        /* renamed from: j */
        public final boolean mo59928j() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: k */
        public final boolean mo59929k() {
            return (this.bitField0_ & 1) == 1;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C24052b();
        }

        public final C24090h.C24091a toBuilder() {
            C24052b bVar = new C24052b();
            bVar.mo59931i(this);
            return bVar;
        }

        public JvmFieldSignature() {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        public JvmFieldSignature(C24078c cVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.name_ = 0;
            this.desc_ = 0;
            C25091a.C25093b bVar = new C25091a.C25093b();
            CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
            while (!z) {
                try {
                    int n = cVar.mo60032n();
                    if (n != 0) {
                        if (n == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = cVar.mo60029k();
                        } else if (n == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = cVar.mo60029k();
                        } else if (!cVar.mo60035q(n, j)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.mo60010b(this);
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.mo60010b(this);
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    try {
                        j.mo59973i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bVar.mo61632i();
                        throw th2;
                    }
                    this.unknownFields = bVar.mo61632i();
                    throw th;
                }
            }
            try {
                j.mo59973i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bVar.mo61632i();
                throw th3;
            }
            this.unknownFields = bVar.mo61632i();
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final JvmMethodSignature f61018b;

        /* renamed from: c */
        public static C24053a f61019c = new C24053a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a */
        public static class C24053a extends C24077b<JvmMethodSignature> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(cVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b */
        public static final class C24054b extends GeneratedMessageLite.C24066b<JvmMethodSignature, C24054b> implements C25099f {

            /* renamed from: c */
            public int f61020c;

            /* renamed from: d */
            public int f61021d;

            /* renamed from: e */
            public int f61022e;

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59939j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                JvmMethodSignature h = mo59937h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C24054b bVar = new C24054b();
                bVar.mo59938i(mo59937h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C24054b bVar = new C24054b();
                bVar.mo59938i(mo59937h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59938i((JvmMethodSignature) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final JvmMethodSignature mo59937h() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature((GeneratedMessageLite.C24066b) this);
                int i = this.f61020c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmMethodSignature.name_ = this.f61021d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.desc_ = this.f61022e;
                jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            /* renamed from: i */
            public final void mo59938i(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature != JvmMethodSignature.f61018b) {
                    if (jvmMethodSignature.mo59936k()) {
                        int i = jvmMethodSignature.mo59934i();
                        this.f61020c |= 1;
                        this.f61021d = i;
                    }
                    if (jvmMethodSignature.mo59935j()) {
                        int h = jvmMethodSignature.mo59933h();
                        this.f61020c |= 2;
                        this.f61022e = h;
                    }
                    this.f61054b = this.f61054b.mo61617b(jvmMethodSignature.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59939j(C24078c cVar, C24079d dVar) throws IOException {
                JvmMethodSignature jvmMethodSignature;
                try {
                    JvmMethodSignature.f61019c.getClass();
                    mo59938i(new JvmMethodSignature(cVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    jvmMethodSignature = (JvmMethodSignature) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (jvmMethodSignature != null) {
                    mo59938i(jvmMethodSignature);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59939j(cVar, dVar);
                return this;
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f61018b = jvmMethodSignature;
            jvmMethodSignature.name_ = 0;
            jvmMethodSignature.desc_ = 0;
        }

        public JvmMethodSignature(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: l */
        public static C24054b m59934l(JvmMethodSignature jvmMethodSignature) {
            C24054b bVar = new C24054b();
            bVar.mo59938i(jvmMethodSignature);
            return bVar;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo59976m(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo59976m(2, this.desc_);
            }
            codedOutputStream.mo59981r(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m60026b(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m60026b(2, this.desc_);
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: h */
        public final int mo59933h() {
            return this.desc_;
        }

        /* renamed from: i */
        public final int mo59934i() {
            return this.name_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        /* renamed from: j */
        public final boolean mo59935j() {
            return (this.bitField0_ & 2) == 2;
        }

        /* renamed from: k */
        public final boolean mo59936k() {
            return (this.bitField0_ & 1) == 1;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C24054b();
        }

        public final C24090h.C24091a toBuilder() {
            return m59934l(this);
        }

        public JvmMethodSignature() {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        public JvmMethodSignature(C24078c cVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.name_ = 0;
            this.desc_ = 0;
            C25091a.C25093b bVar = new C25091a.C25093b();
            CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
            while (!z) {
                try {
                    int n = cVar.mo60032n();
                    if (n != 0) {
                        if (n == 8) {
                            this.bitField0_ |= 1;
                            this.name_ = cVar.mo60029k();
                        } else if (n == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = cVar.mo60029k();
                        } else if (!cVar.mo60035q(n, j)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.mo60010b(this);
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.mo60010b(this);
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    try {
                        j.mo59973i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bVar.mo61632i();
                        throw th2;
                    }
                    this.unknownFields = bVar.mo61632i();
                    throw th;
                }
            }
            try {
                j.mo59973i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bVar.mo61632i();
                throw th3;
            }
            this.unknownFields = bVar.mo61632i();
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final JvmPropertySignature f61023b;

        /* renamed from: c */
        public static C24055a f61024c = new C24055a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public JvmMethodSignature delegateMethod_;
        /* access modifiers changed from: private */
        public JvmFieldSignature field_;
        /* access modifiers changed from: private */
        public JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public JvmMethodSignature setter_;
        /* access modifiers changed from: private */
        public JvmMethodSignature syntheticMethod_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$a */
        public static class C24055a extends C24077b<JvmPropertySignature> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$b */
        public static final class C24056b extends GeneratedMessageLite.C24066b<JvmPropertySignature, C24056b> implements C25099f {

            /* renamed from: c */
            public int f61025c;

            /* renamed from: d */
            public JvmFieldSignature f61026d = JvmFieldSignature.f61013b;

            /* renamed from: e */
            public JvmMethodSignature f61027e;

            /* renamed from: f */
            public JvmMethodSignature f61028f;

            /* renamed from: g */
            public JvmMethodSignature f61029g;

            /* renamed from: h */
            public JvmMethodSignature f61030h;

            public C24056b() {
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f61018b;
                this.f61027e = jvmMethodSignature;
                this.f61028f = jvmMethodSignature;
                this.f61029g = jvmMethodSignature;
                this.f61030h = jvmMethodSignature;
            }

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59952j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                JvmPropertySignature h = mo59950h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C24056b bVar = new C24056b();
                bVar.mo59951i(mo59950h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C24056b bVar = new C24056b();
                bVar.mo59951i(mo59950h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59951i((JvmPropertySignature) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final JvmPropertySignature mo59950h() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i = this.f61025c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmPropertySignature.field_ = this.f61026d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.syntheticMethod_ = this.f61027e;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.getter_ = this.f61028f;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.setter_ = this.f61029g;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                jvmPropertySignature.delegateMethod_ = this.f61030h;
                jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            /* renamed from: i */
            public final void mo59951i(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmMethodSignature jvmMethodSignature4;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature != JvmPropertySignature.f61023b) {
                    if (jvmPropertySignature.mo59946r()) {
                        JvmFieldSignature l = jvmPropertySignature.mo59941l();
                        if ((this.f61025c & 1) != 1 || (jvmFieldSignature = this.f61026d) == JvmFieldSignature.f61013b) {
                            this.f61026d = l;
                        } else {
                            JvmFieldSignature.C24052b bVar = new JvmFieldSignature.C24052b();
                            bVar.mo59931i(jvmFieldSignature);
                            bVar.mo59931i(l);
                            this.f61026d = bVar.mo59930h();
                        }
                        this.f61025c |= 1;
                    }
                    if (jvmPropertySignature.mo59949u()) {
                        JvmMethodSignature p = jvmPropertySignature.mo59944p();
                        if ((this.f61025c & 2) != 2 || (jvmMethodSignature4 = this.f61027e) == JvmMethodSignature.f61018b) {
                            this.f61027e = p;
                        } else {
                            JvmMethodSignature.C24054b l2 = JvmMethodSignature.m59934l(jvmMethodSignature4);
                            l2.mo59938i(p);
                            this.f61027e = l2.mo59937h();
                        }
                        this.f61025c |= 2;
                    }
                    if (jvmPropertySignature.mo59947s()) {
                        JvmMethodSignature m = jvmPropertySignature.mo59942m();
                        if ((this.f61025c & 4) != 4 || (jvmMethodSignature3 = this.f61028f) == JvmMethodSignature.f61018b) {
                            this.f61028f = m;
                        } else {
                            JvmMethodSignature.C24054b l3 = JvmMethodSignature.m59934l(jvmMethodSignature3);
                            l3.mo59938i(m);
                            this.f61028f = l3.mo59937h();
                        }
                        this.f61025c |= 4;
                    }
                    if (jvmPropertySignature.mo59948t()) {
                        JvmMethodSignature o = jvmPropertySignature.mo59943o();
                        if ((this.f61025c & 8) != 8 || (jvmMethodSignature2 = this.f61029g) == JvmMethodSignature.f61018b) {
                            this.f61029g = o;
                        } else {
                            JvmMethodSignature.C24054b l4 = JvmMethodSignature.m59934l(jvmMethodSignature2);
                            l4.mo59938i(o);
                            this.f61029g = l4.mo59937h();
                        }
                        this.f61025c |= 8;
                    }
                    if (jvmPropertySignature.mo59945q()) {
                        JvmMethodSignature k = jvmPropertySignature.mo59940k();
                        if ((this.f61025c & 16) != 16 || (jvmMethodSignature = this.f61030h) == JvmMethodSignature.f61018b) {
                            this.f61030h = k;
                        } else {
                            JvmMethodSignature.C24054b l5 = JvmMethodSignature.m59934l(jvmMethodSignature);
                            l5.mo59938i(k);
                            this.f61030h = l5.mo59937h();
                        }
                        this.f61025c |= 16;
                    }
                    this.f61054b = this.f61054b.mo61617b(jvmPropertySignature.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59952j(C24078c cVar, C24079d dVar) throws IOException {
                JvmPropertySignature jvmPropertySignature;
                try {
                    JvmPropertySignature.f61024c.getClass();
                    mo59951i(new JvmPropertySignature(cVar, dVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    jvmPropertySignature = (JvmPropertySignature) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (jvmPropertySignature != null) {
                    mo59951i(jvmPropertySignature);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59952j(cVar, dVar);
                return this;
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f61023b = jvmPropertySignature;
            jvmPropertySignature.field_ = JvmFieldSignature.f61013b;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f61018b;
            jvmPropertySignature.syntheticMethod_ = jvmMethodSignature;
            jvmPropertySignature.getter_ = jvmMethodSignature;
            jvmPropertySignature.setter_ = jvmMethodSignature;
            jvmPropertySignature.delegateMethod_ = jvmMethodSignature;
        }

        public JvmPropertySignature(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo59978o(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo59978o(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo59978o(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.mo59978o(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.mo59978o(5, this.delegateMethod_);
            }
            codedOutputStream.mo59981r(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m60028d(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m60028d(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m60028d(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.m60028d(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.m60028d(5, this.delegateMethod_);
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        /* renamed from: k */
        public final JvmMethodSignature mo59940k() {
            return this.delegateMethod_;
        }

        /* renamed from: l */
        public final JvmFieldSignature mo59941l() {
            return this.field_;
        }

        /* renamed from: m */
        public final JvmMethodSignature mo59942m() {
            return this.getter_;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C24056b();
        }

        /* renamed from: o */
        public final JvmMethodSignature mo59943o() {
            return this.setter_;
        }

        /* renamed from: p */
        public final JvmMethodSignature mo59944p() {
            return this.syntheticMethod_;
        }

        /* renamed from: q */
        public final boolean mo59945q() {
            return (this.bitField0_ & 16) == 16;
        }

        /* renamed from: r */
        public final boolean mo59946r() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: s */
        public final boolean mo59947s() {
            return (this.bitField0_ & 4) == 4;
        }

        /* renamed from: t */
        public final boolean mo59948t() {
            return (this.bitField0_ & 8) == 8;
        }

        public final C24090h.C24091a toBuilder() {
            C24056b bVar = new C24056b();
            bVar.mo59951i(this);
            return bVar;
        }

        /* renamed from: u */
        public final boolean mo59949u() {
            return (this.bitField0_ & 2) == 2;
        }

        public JvmPropertySignature() {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: type inference failed for: r6v13 */
        /* JADX WARNING: type inference failed for: r6v14 */
        /* JADX WARNING: type inference failed for: r6v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r8, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.memoizedIsInitialized = r0
                r7.memoizedSerializedSize = r0
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.f61013b
                r7.field_ = r0
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f61018b
                r7.syntheticMethod_ = r0
                r7.getter_ = r0
                r7.setter_ = r0
                r7.delegateMethod_ = r0
                vg0.a$b r0 = new vg0.a$b
                r0.<init>()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m60033j(r0, r1)
                r3 = 0
            L_0x0021:
                if (r3 != 0) goto L_0x014f
                int r4 = r8.mo60032n()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r4 == 0) goto L_0x0127
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00f9
                r5 = 18
                if (r4 == r5) goto L_0x00ce
                r5 = 26
                if (r4 == r5) goto L_0x00a3
                r5 = 34
                if (r4 == r5) goto L_0x0077
                r5 = 42
                if (r4 == r5) goto L_0x0046
                boolean r4 = r8.mo60035q(r4, r2)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r4 != 0) goto L_0x0021
                goto L_0x0127
            L_0x0046:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r5 = 16
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0056
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.delegateMethod_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m59934l(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x0056:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f61019c     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo60025g(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.delegateMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r6 == 0) goto L_0x006b
                r6.mo59938i(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo59937h()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.delegateMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x006b:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                goto L_0x0021
            L_0x0071:
                r8 = move-exception
                goto L_0x013c
            L_0x0074:
                r8 = move-exception
                goto L_0x012a
            L_0x0077:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0087
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.setter_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m59934l(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x0087:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f61019c     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo60025g(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r6 == 0) goto L_0x009c
                r6.mo59938i(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo59937h()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x009c:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                goto L_0x0021
            L_0x00a3:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x00b2
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.getter_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m59934l(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x00b2:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f61019c     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo60025g(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r6 == 0) goto L_0x00c7
                r6.mo59938i(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo59937h()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x00c7:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                goto L_0x0021
            L_0x00ce:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x00dd
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.syntheticMethod_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m59934l(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x00dd:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f61019c     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo60025g(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r6 == 0) goto L_0x00f2
                r6.mo59938i(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo59937h()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x00f2:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                goto L_0x0021
            L_0x00f9:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x010b
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r7.field_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b r6 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r6.mo59931i(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x010b:
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$a r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.f61014c     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo60025g(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                if (r6 == 0) goto L_0x0120
                r6.mo59931i(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r6.mo59930h()     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
            L_0x0120:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                r4 = r4 | r1
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0137, IOException -> 0x0074 }
                goto L_0x0021
            L_0x0127:
                r3 = 1
                goto L_0x0021
            L_0x012a:
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0071 }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0071 }
                r9.<init>(r8)     // Catch:{ all -> 0x0071 }
                r9.mo60010b(r7)     // Catch:{ all -> 0x0071 }
                throw r9     // Catch:{ all -> 0x0071 }
            L_0x0137:
                r8 = move-exception
                r8.mo60010b(r7)     // Catch:{ all -> 0x0071 }
                throw r8     // Catch:{ all -> 0x0071 }
            L_0x013c:
                r2.mo59973i()     // Catch:{ IOException -> 0x0148, all -> 0x0140 }
                goto L_0x0148
            L_0x0140:
                r8 = move-exception
                vg0.a r9 = r0.mo61632i()
                r7.unknownFields = r9
                throw r8
            L_0x0148:
                vg0.a r9 = r0.mo61632i()
                r7.unknownFields = r9
                throw r8
            L_0x014f:
                r2.mo59973i()     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
                goto L_0x015b
            L_0x0153:
                r8 = move-exception
                vg0.a r9 = r0.mo61632i()
                r7.unknownFields = r9
                throw r8
            L_0x015b:
                vg0.a r8 = r0.mo61632i()
                r7.unknownFields = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final StringTableTypes f61031b;

        /* renamed from: c */
        public static C24060a f61032c = new C24060a();
        private int localNameMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Record> record_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$a */
        public static class C24060a extends C24077b<StringTableTypes> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new StringTableTypes(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$b */
        public static final class C24061b extends GeneratedMessageLite.C24066b<StringTableTypes, C24061b> implements C25099f {

            /* renamed from: c */
            public int f61042c;

            /* renamed from: d */
            public List<Record> f61043d = Collections.emptyList();

            /* renamed from: e */
            public List<Integer> f61044e = Collections.emptyList();

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59972j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                StringTableTypes h = mo59970h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C24061b bVar = new C24061b();
                bVar.mo59971i(mo59970h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C24061b bVar = new C24061b();
                bVar.mo59971i(mo59970h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59971i((StringTableTypes) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final StringTableTypes mo59970h() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f61042c & 1) == 1) {
                    this.f61043d = Collections.unmodifiableList(this.f61043d);
                    this.f61042c &= -2;
                }
                stringTableTypes.record_ = this.f61043d;
                if ((this.f61042c & 2) == 2) {
                    this.f61044e = Collections.unmodifiableList(this.f61044e);
                    this.f61042c &= -3;
                }
                stringTableTypes.localName_ = this.f61044e;
                return stringTableTypes;
            }

            /* renamed from: i */
            public final void mo59971i(StringTableTypes stringTableTypes) {
                if (stringTableTypes != StringTableTypes.f61031b) {
                    if (!stringTableTypes.record_.isEmpty()) {
                        if (this.f61043d.isEmpty()) {
                            this.f61043d = stringTableTypes.record_;
                            this.f61042c &= -2;
                        } else {
                            if ((this.f61042c & 1) != 1) {
                                this.f61043d = new ArrayList(this.f61043d);
                                this.f61042c |= 1;
                            }
                            this.f61043d.addAll(stringTableTypes.record_);
                        }
                    }
                    if (!stringTableTypes.localName_.isEmpty()) {
                        if (this.f61044e.isEmpty()) {
                            this.f61044e = stringTableTypes.localName_;
                            this.f61042c &= -3;
                        } else {
                            if ((this.f61042c & 2) != 2) {
                                this.f61044e = new ArrayList(this.f61044e);
                                this.f61042c |= 2;
                            }
                            this.f61044e.addAll(stringTableTypes.localName_);
                        }
                    }
                    this.f61054b = this.f61054b.mo61617b(stringTableTypes.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59972j(C24078c cVar, C24079d dVar) throws IOException {
                StringTableTypes stringTableTypes;
                try {
                    StringTableTypes.f61032c.getClass();
                    mo59971i(new StringTableTypes(cVar, dVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    stringTableTypes = (StringTableTypes) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (stringTableTypes != null) {
                    mo59971i(stringTableTypes);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59972j(cVar, dVar);
                return this;
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f61031b = stringTableTypes;
            stringTableTypes.record_ = Collections.emptyList();
            stringTableTypes.localName_ = Collections.emptyList();
        }

        public StringTableTypes(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i = 0; i < this.record_.size(); i++) {
                codedOutputStream.mo59978o(1, this.record_.get(i));
            }
            if (this.localName_.size() > 0) {
                codedOutputStream.mo59985v(42);
                codedOutputStream.mo59985v(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.mo59977n(this.localName_.get(i2).intValue());
            }
            codedOutputStream.mo59981r(this.unknownFields);
        }

        public final int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.record_.size(); i3++) {
                i2 += CodedOutputStream.m60028d(1, this.record_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.localName_.size(); i5++) {
                i4 += CodedOutputStream.m60027c(this.localName_.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!this.localName_.isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.m60027c(i4);
            }
            this.localNameMemoizedSerializedSize = i4;
            int size = this.unknownFields.size() + i6;
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: i */
        public final List<Integer> mo59953i() {
            return this.localName_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        /* renamed from: j */
        public final List<Record> mo59954j() {
            return this.record_;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C24061b();
        }

        public final C24090h.C24091a toBuilder() {
            C24061b bVar = new C24061b();
            bVar.mo59971i(this);
            return bVar;
        }

        public static final class Record extends GeneratedMessageLite implements C25099f {

            /* renamed from: b */
            public static final Record f61033b;

            /* renamed from: c */
            public static C24058a f61034c = new C24058a();
            /* access modifiers changed from: private */
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public Operation operation_;
            /* access modifiers changed from: private */
            public int predefinedIndex_;
            /* access modifiers changed from: private */
            public int range_;
            private int replaceCharMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> replaceChar_;
            /* access modifiers changed from: private */
            public Object string_;
            private int substringIndexMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> substringIndex_;
            /* access modifiers changed from: private */
            public final C25091a unknownFields;

            public enum Operation implements C24084f.C24085a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static C24084f.C24086b<Operation> internalValueMap;
                private final int value;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$a */
                public static class C24057a implements C24084f.C24086b<Operation> {
                    /* renamed from: a */
                    public final C24084f.C24085a mo59642a(int i) {
                        return Operation.valueOf(i);
                    }
                }

                /* access modifiers changed from: public */
                static {
                    internalValueMap = new C24057a();
                }

                private Operation(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$a */
            public static class C24058a extends C24077b<Record> {
                /* renamed from: a */
                public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                    return new Record(cVar);
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$b */
            public static final class C24059b extends GeneratedMessageLite.C24066b<Record, C24059b> implements C25099f {

                /* renamed from: c */
                public int f61035c;

                /* renamed from: d */
                public int f61036d = 1;

                /* renamed from: e */
                public int f61037e;

                /* renamed from: f */
                public Object f61038f = "";

                /* renamed from: g */
                public Operation f61039g = Operation.NONE;

                /* renamed from: h */
                public List<Integer> f61040h = Collections.emptyList();

                /* renamed from: i */
                public List<Integer> f61041i = Collections.emptyList();

                /* renamed from: b */
                public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                    mo59969j(cVar, dVar);
                    return this;
                }

                public final C24090h build() {
                    Record h = mo59967h();
                    if (h.isInitialized()) {
                        return h;
                    }
                    throw new UninitializedMessageException();
                }

                public final Object clone() throws CloneNotSupportedException {
                    C24059b bVar = new C24059b();
                    bVar.mo59968i(mo59967h());
                    return bVar;
                }

                /* renamed from: f */
                public final GeneratedMessageLite.C24066b mo59647f() {
                    C24059b bVar = new C24059b();
                    bVar.mo59968i(mo59967h());
                    return bVar;
                }

                /* renamed from: g */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                    mo59968i((Record) generatedMessageLite);
                    return this;
                }

                /* renamed from: h */
                public final Record mo59967h() {
                    Record record = new Record((GeneratedMessageLite.C24066b) this);
                    int i = this.f61035c;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    record.range_ = this.f61036d;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.predefinedIndex_ = this.f61037e;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.string_ = this.f61038f;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.operation_ = this.f61039g;
                    if ((this.f61035c & 16) == 16) {
                        this.f61040h = Collections.unmodifiableList(this.f61040h);
                        this.f61035c &= -17;
                    }
                    record.substringIndex_ = this.f61040h;
                    if ((this.f61035c & 32) == 32) {
                        this.f61041i = Collections.unmodifiableList(this.f61041i);
                        this.f61035c &= -33;
                    }
                    record.replaceChar_ = this.f61041i;
                    record.bitField0_ = i2;
                    return record;
                }

                /* renamed from: i */
                public final void mo59968i(Record record) {
                    if (record != Record.f61033b) {
                        if (record.mo59966z()) {
                            int r = record.mo59958r();
                            this.f61035c |= 1;
                            this.f61036d = r;
                        }
                        if (record.mo59965y()) {
                            int q = record.mo59957q();
                            this.f61035c |= 2;
                            this.f61037e = q;
                        }
                        if (record.mo59955A()) {
                            this.f61035c |= 4;
                            this.f61038f = record.string_;
                        }
                        if (record.mo59964x()) {
                            Operation p = record.mo59956p();
                            p.getClass();
                            this.f61035c |= 8;
                            this.f61039g = p;
                        }
                        if (!record.substringIndex_.isEmpty()) {
                            if (this.f61040h.isEmpty()) {
                                this.f61040h = record.substringIndex_;
                                this.f61035c &= -17;
                            } else {
                                if ((this.f61035c & 16) != 16) {
                                    this.f61040h = new ArrayList(this.f61040h);
                                    this.f61035c |= 16;
                                }
                                this.f61040h.addAll(record.substringIndex_);
                            }
                        }
                        if (!record.replaceChar_.isEmpty()) {
                            if (this.f61041i.isEmpty()) {
                                this.f61041i = record.replaceChar_;
                                this.f61035c &= -33;
                            } else {
                                if ((this.f61035c & 32) != 32) {
                                    this.f61041i = new ArrayList(this.f61041i);
                                    this.f61035c |= 32;
                                }
                                this.f61041i.addAll(record.replaceChar_);
                            }
                        }
                        this.f61054b = this.f61054b.mo61617b(record.unknownFields);
                    }
                }

                /* renamed from: j */
                public final void mo59969j(C24078c cVar, C24079d dVar) throws IOException {
                    Record record;
                    try {
                        Record.f61034c.getClass();
                        mo59968i(new Record(cVar));
                        return;
                    } catch (InvalidProtocolBufferException e) {
                        record = (Record) e.mo60009a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (record != null) {
                        mo59968i(record);
                    }
                    throw th;
                }

                /* renamed from: n */
                public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                    mo59969j(cVar, dVar);
                    return this;
                }
            }

            static {
                Record record = new Record();
                f61033b = record;
                record.range_ = 1;
                record.predefinedIndex_ = 0;
                record.string_ = "";
                record.operation_ = Operation.NONE;
                record.substringIndex_ = Collections.emptyList();
                record.replaceChar_ = Collections.emptyList();
            }

            public Record(GeneratedMessageLite.C24066b bVar) {
                super(0);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.f61054b;
            }

            /* renamed from: A */
            public final boolean mo59955A() {
                return (this.bitField0_ & 4) == 4;
            }

            /* renamed from: a */
            public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
                C25091a aVar;
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.mo59976m(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.mo59976m(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.mo59975l(3, this.operation_.getNumber());
                }
                if (this.substringIndex_.size() > 0) {
                    codedOutputStream.mo59985v(34);
                    codedOutputStream.mo59985v(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.mo59977n(this.substringIndex_.get(i).intValue());
                }
                if (this.replaceChar_.size() > 0) {
                    codedOutputStream.mo59985v(42);
                    codedOutputStream.mo59985v(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.mo59977n(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    Object obj = this.string_;
                    if (obj instanceof String) {
                        try {
                            aVar = new C25097e(((String) obj).getBytes("UTF-8"));
                            this.string_ = aVar;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException("UTF-8 not supported?", e);
                        }
                    } else {
                        aVar = (C25091a) obj;
                    }
                    codedOutputStream.mo59987x(6, 2);
                    codedOutputStream.mo59985v(aVar.size());
                    codedOutputStream.mo59981r(aVar);
                }
                codedOutputStream.mo59981r(this.unknownFields);
            }

            public final int getSerializedSize() {
                int i;
                C25091a aVar;
                int i2 = this.memoizedSerializedSize;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.bitField0_ & 1) == 1) {
                    i = CodedOutputStream.m60026b(1, this.range_) + 0;
                } else {
                    i = 0;
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.m60026b(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    i += CodedOutputStream.m60025a(3, this.operation_.getNumber());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.substringIndex_.size(); i4++) {
                    i3 += CodedOutputStream.m60027c(this.substringIndex_.get(i4).intValue());
                }
                int i5 = i + i3;
                if (!this.substringIndex_.isEmpty()) {
                    i5 = i5 + 1 + CodedOutputStream.m60027c(i3);
                }
                this.substringIndexMemoizedSerializedSize = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.replaceChar_.size(); i7++) {
                    i6 += CodedOutputStream.m60027c(this.replaceChar_.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!this.replaceChar_.isEmpty()) {
                    i8 = i8 + 1 + CodedOutputStream.m60027c(i6);
                }
                this.replaceCharMemoizedSerializedSize = i6;
                if ((this.bitField0_ & 4) == 4) {
                    Object obj = this.string_;
                    if (obj instanceof String) {
                        try {
                            aVar = new C25097e(((String) obj).getBytes("UTF-8"));
                            this.string_ = aVar;
                        } catch (UnsupportedEncodingException e) {
                            throw new RuntimeException("UTF-8 not supported?", e);
                        }
                    } else {
                        aVar = (C25091a) obj;
                    }
                    i8 += aVar.size() + CodedOutputStream.m60030f(aVar.size()) + CodedOutputStream.m60032h(6);
                }
                int size = this.unknownFields.size() + i8;
                this.memoizedSerializedSize = size;
                return size;
            }

            public final boolean isInitialized() {
                byte b = this.memoizedIsInitialized;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            public final C24090h.C24091a newBuilderForType() {
                return new C24059b();
            }

            /* renamed from: p */
            public final Operation mo59956p() {
                return this.operation_;
            }

            /* renamed from: q */
            public final int mo59957q() {
                return this.predefinedIndex_;
            }

            /* renamed from: r */
            public final int mo59958r() {
                return this.range_;
            }

            /* renamed from: s */
            public final int mo59959s() {
                return this.replaceChar_.size();
            }

            /* renamed from: t */
            public final List<Integer> mo59960t() {
                return this.replaceChar_;
            }

            public final C24090h.C24091a toBuilder() {
                C24059b bVar = new C24059b();
                bVar.mo59968i(this);
                return bVar;
            }

            /* renamed from: u */
            public final String mo59961u() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C25091a aVar = (C25091a) obj;
                aVar.getClass();
                try {
                    String B = aVar.mo61615B();
                    if (aVar.mo61623n()) {
                        this.string_ = B;
                    }
                    return B;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            }

            /* renamed from: v */
            public final int mo59962v() {
                return this.substringIndex_.size();
            }

            /* renamed from: w */
            public final List<Integer> mo59963w() {
                return this.substringIndex_;
            }

            /* renamed from: x */
            public final boolean mo59964x() {
                return (this.bitField0_ & 8) == 8;
            }

            /* renamed from: y */
            public final boolean mo59965y() {
                return (this.bitField0_ & 2) == 2;
            }

            /* renamed from: z */
            public final boolean mo59966z() {
                return (this.bitField0_ & 1) == 1;
            }

            public Record() {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = C25091a.f63298b;
            }

            public Record(C24078c cVar) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.range_ = 1;
                boolean z = false;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                this.substringIndex_ = Collections.emptyList();
                this.replaceChar_ = Collections.emptyList();
                C25091a.C25093b bVar = new C25091a.C25093b();
                CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
                boolean z2 = false;
                while (!z) {
                    try {
                        int n = cVar.mo60032n();
                        if (n != 0) {
                            if (n == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = cVar.mo60029k();
                            } else if (n == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = cVar.mo60029k();
                            } else if (n == 24) {
                                int k = cVar.mo60029k();
                                Operation valueOf = Operation.valueOf(k);
                                if (valueOf == null) {
                                    j.mo59985v(n);
                                    j.mo59985v(k);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = valueOf;
                                }
                            } else if (n == 32) {
                                if (!(z2 & true)) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.substringIndex_.add(Integer.valueOf(cVar.mo60029k()));
                            } else if (n == 34) {
                                int d = cVar.mo60022d(cVar.mo60029k());
                                if (!(z2 & true) && cVar.mo60020b() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (cVar.mo60020b() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(cVar.mo60029k()));
                                }
                                cVar.mo60021c(d);
                            } else if (n == 40) {
                                if (!(z2 & true)) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.replaceChar_.add(Integer.valueOf(cVar.mo60029k()));
                            } else if (n == 42) {
                                int d2 = cVar.mo60022d(cVar.mo60029k());
                                if (!(z2 & true) && cVar.mo60020b() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (cVar.mo60020b() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(cVar.mo60029k()));
                                }
                                cVar.mo60021c(d2);
                            } else if (n == 50) {
                                C25097e e = cVar.mo60023e();
                                this.bitField0_ |= 4;
                                this.string_ = e;
                            } else if (!cVar.mo60035q(n, j)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        e2.mo60010b(this);
                        throw e2;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.mo60010b(this);
                        throw invalidProtocolBufferException;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if (z2 & true) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                        }
                        try {
                            j.mo59973i();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.unknownFields = bVar.mo61632i();
                            throw th2;
                        }
                        this.unknownFields = bVar.mo61632i();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if (z2 & true) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                }
                try {
                    j.mo59973i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.unknownFields = bVar.mo61632i();
                    throw th3;
                }
                this.unknownFields = bVar.mo61632i();
            }
        }

        public StringTableTypes() {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        public StringTableTypes(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.record_ = Collections.emptyList();
            this.localName_ = Collections.emptyList();
            C25091a.C25093b bVar = new C25091a.C25093b();
            CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int n = cVar.mo60032n();
                    if (n != 0) {
                        if (n == 10) {
                            if (!z2 || !true) {
                                this.record_ = new ArrayList();
                                z2 |= true;
                            }
                            this.record_.add(cVar.mo60025g(Record.f61034c, dVar));
                        } else if (n == 40) {
                            if (!(z2 & true)) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.localName_.add(Integer.valueOf(cVar.mo60029k()));
                        } else if (n == 42) {
                            int d = cVar.mo60022d(cVar.mo60029k());
                            if (!(z2 & true) && cVar.mo60020b() > 0) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            while (cVar.mo60020b() > 0) {
                                this.localName_.add(Integer.valueOf(cVar.mo60029k()));
                            }
                            cVar.mo60021c(d);
                        } else if (!cVar.mo60035q(n, j)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.mo60010b(this);
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.mo60010b(this);
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if (z2 & true) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
                    }
                    try {
                        j.mo59973i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = bVar.mo61632i();
                        throw th2;
                    }
                    this.unknownFields = bVar.mo61632i();
                    throw th;
                }
            }
            if (z2 && true) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if (z2 & true) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
            }
            try {
                j.mo59973i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bVar.mo61632i();
                throw th3;
            }
            this.unknownFields = bVar.mo61632i();
        }
    }
}
