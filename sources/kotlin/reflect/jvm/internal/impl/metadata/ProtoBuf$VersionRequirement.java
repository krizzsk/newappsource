package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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
import vg0.C25091a;
import vg0.C25099f;

public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$VersionRequirement f60986b;

    /* renamed from: c */
    public static C24046a f60987c = new C24046a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int errorCode_;
    /* access modifiers changed from: private */
    public Level level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int message_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public int versionFull_;
    /* access modifiers changed from: private */
    public VersionKind versionKind_;
    /* access modifiers changed from: private */
    public int version_;

    public enum Level implements C24084f.C24085a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        
        private static C24084f.C24086b<Level> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$a */
        public static class C24044a implements C24084f.C24086b<Level> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return Level.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C24044a();
        }

        private Level(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Level valueOf(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }
    }

    public enum VersionKind implements C24084f.C24085a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        
        private static C24084f.C24086b<VersionKind> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$a */
        public static class C24045a implements C24084f.C24086b<VersionKind> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return VersionKind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C24045a();
        }

        private VersionKind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static VersionKind valueOf(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$a */
    public static class C24046a extends C24077b<ProtoBuf$VersionRequirement> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirement(cVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$b */
    public static final class C24047b extends GeneratedMessageLite.C24066b<ProtoBuf$VersionRequirement, C24047b> implements C25099f {

        /* renamed from: c */
        public int f60988c;

        /* renamed from: d */
        public int f60989d;

        /* renamed from: e */
        public int f60990e;

        /* renamed from: f */
        public Level f60991f = Level.ERROR;

        /* renamed from: g */
        public int f60992g;

        /* renamed from: h */
        public int f60993h;

        /* renamed from: i */
        public VersionKind f60994i = VersionKind.LANGUAGE_VERSION;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59920j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$VersionRequirement h = mo59918h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24047b bVar = new C24047b();
            bVar.mo59919i(mo59918h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24047b bVar = new C24047b();
            bVar.mo59919i(mo59918h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59919i((ProtoBuf$VersionRequirement) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$VersionRequirement mo59918h() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement((GeneratedMessageLite.C24066b) this);
            int i = this.f60988c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$VersionRequirement.version_ = this.f60989d;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$VersionRequirement.versionFull_ = this.f60990e;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$VersionRequirement.level_ = this.f60991f;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$VersionRequirement.errorCode_ = this.f60992g;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$VersionRequirement.message_ = this.f60993h;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            protoBuf$VersionRequirement.versionKind_ = this.f60994i;
            protoBuf$VersionRequirement.bitField0_ = i2;
            return protoBuf$VersionRequirement;
        }

        /* renamed from: i */
        public final void mo59919i(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            if (protoBuf$VersionRequirement != ProtoBuf$VersionRequirement.f60986b) {
                if (protoBuf$VersionRequirement.mo59915v()) {
                    int p = protoBuf$VersionRequirement.mo59909p();
                    this.f60988c |= 1;
                    this.f60989d = p;
                }
                if (protoBuf$VersionRequirement.mo59916w()) {
                    int q = protoBuf$VersionRequirement.mo59910q();
                    this.f60988c |= 2;
                    this.f60990e = q;
                }
                if (protoBuf$VersionRequirement.mo59913t()) {
                    Level m = protoBuf$VersionRequirement.mo59907m();
                    m.getClass();
                    this.f60988c |= 4;
                    this.f60991f = m;
                }
                if (protoBuf$VersionRequirement.mo59912s()) {
                    int l = protoBuf$VersionRequirement.mo59906l();
                    this.f60988c |= 8;
                    this.f60992g = l;
                }
                if (protoBuf$VersionRequirement.mo59914u()) {
                    int o = protoBuf$VersionRequirement.mo59908o();
                    this.f60988c |= 16;
                    this.f60993h = o;
                }
                if (protoBuf$VersionRequirement.mo59917x()) {
                    VersionKind r = protoBuf$VersionRequirement.mo59911r();
                    r.getClass();
                    this.f60988c |= 32;
                    this.f60994i = r;
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$VersionRequirement.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59920j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement;
            try {
                ProtoBuf$VersionRequirement.f60987c.getClass();
                mo59919i(new ProtoBuf$VersionRequirement(cVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$VersionRequirement != null) {
                mo59919i(protoBuf$VersionRequirement);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59920j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement();
        f60986b = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.version_ = 0;
        protoBuf$VersionRequirement.versionFull_ = 0;
        protoBuf$VersionRequirement.level_ = Level.ERROR;
        protoBuf$VersionRequirement.errorCode_ = 0;
        protoBuf$VersionRequirement.message_ = 0;
        protoBuf$VersionRequirement.versionKind_ = VersionKind.LANGUAGE_VERSION;
    }

    public ProtoBuf$VersionRequirement(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59975l(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59976m(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59976m(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo59975l(6, this.versionKind_.getNumber());
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
            i2 = 0 + CodedOutputStream.m60026b(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m60026b(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i2 += CodedOutputStream.m60025a(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            i2 += CodedOutputStream.m60026b(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i2 += CodedOutputStream.m60026b(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i2 += CodedOutputStream.m60025a(6, this.versionKind_.getNumber());
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

    /* renamed from: l */
    public final int mo59906l() {
        return this.errorCode_;
    }

    /* renamed from: m */
    public final Level mo59907m() {
        return this.level_;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24047b();
    }

    /* renamed from: o */
    public final int mo59908o() {
        return this.message_;
    }

    /* renamed from: p */
    public final int mo59909p() {
        return this.version_;
    }

    /* renamed from: q */
    public final int mo59910q() {
        return this.versionFull_;
    }

    /* renamed from: r */
    public final VersionKind mo59911r() {
        return this.versionKind_;
    }

    /* renamed from: s */
    public final boolean mo59912s() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: t */
    public final boolean mo59913t() {
        return (this.bitField0_ & 4) == 4;
    }

    public final C24090h.C24091a toBuilder() {
        C24047b bVar = new C24047b();
        bVar.mo59919i(this);
        return bVar;
    }

    /* renamed from: u */
    public final boolean mo59914u() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: v */
    public final boolean mo59915v() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: w */
    public final boolean mo59916w() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: x */
    public final boolean mo59917x() {
        return (this.bitField0_ & 32) == 32;
    }

    public ProtoBuf$VersionRequirement() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$VersionRequirement(C24078c cVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = Level.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = VersionKind.LANGUAGE_VERSION;
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        this.bitField0_ |= 1;
                        this.version_ = cVar.mo60029k();
                    } else if (n == 16) {
                        this.bitField0_ |= 2;
                        this.versionFull_ = cVar.mo60029k();
                    } else if (n == 24) {
                        int k = cVar.mo60029k();
                        Level valueOf = Level.valueOf(k);
                        if (valueOf == null) {
                            j.mo59985v(n);
                            j.mo59985v(k);
                        } else {
                            this.bitField0_ |= 4;
                            this.level_ = valueOf;
                        }
                    } else if (n == 32) {
                        this.bitField0_ |= 8;
                        this.errorCode_ = cVar.mo60029k();
                    } else if (n == 40) {
                        this.bitField0_ |= 16;
                        this.message_ = cVar.mo60029k();
                    } else if (n == 48) {
                        int k2 = cVar.mo60029k();
                        VersionKind valueOf2 = VersionKind.valueOf(k2);
                        if (valueOf2 == null) {
                            j.mo59985v(n);
                            j.mo59985v(k2);
                        } else {
                            this.bitField0_ |= 32;
                            this.versionKind_ = valueOf2;
                        }
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
