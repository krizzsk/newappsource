package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C24074a;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import vg0.C25091a;

public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> {

    /* renamed from: b */
    public static final ProtoBuf$Constructor f60836b;

    /* renamed from: c */
    public static C24000a f60837c = new C24000a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public List<ProtoBuf$ValueParameter> valueParameter_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$a */
    public static class C24000a extends C24077b<ProtoBuf$Constructor> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Constructor(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$b */
    public static final class C24001b extends GeneratedMessageLite.C24067c<ProtoBuf$Constructor, C24001b> {

        /* renamed from: e */
        public int f60838e;

        /* renamed from: f */
        public int f60839f = 6;

        /* renamed from: g */
        public List<ProtoBuf$ValueParameter> f60840g = Collections.emptyList();

        /* renamed from: h */
        public List<Integer> f60841h = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59695k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Constructor i = mo59693i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24001b bVar = new C24001b();
            bVar.mo59694j(mo59693i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24001b bVar = new C24001b();
            bVar.mo59694j(mo59693i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59694j((ProtoBuf$Constructor) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$Constructor mo59693i() {
            ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor((GeneratedMessageLite.C24067c) this);
            int i = 1;
            if ((this.f60838e & 1) != 1) {
                i = 0;
            }
            protoBuf$Constructor.flags_ = this.f60839f;
            if ((this.f60838e & 2) == 2) {
                this.f60840g = Collections.unmodifiableList(this.f60840g);
                this.f60838e &= -3;
            }
            protoBuf$Constructor.valueParameter_ = this.f60840g;
            if ((this.f60838e & 4) == 4) {
                this.f60841h = Collections.unmodifiableList(this.f60841h);
                this.f60838e &= -5;
            }
            protoBuf$Constructor.versionRequirement_ = this.f60841h;
            protoBuf$Constructor.bitField0_ = i;
            return protoBuf$Constructor;
        }

        /* renamed from: j */
        public final void mo59694j(ProtoBuf$Constructor protoBuf$Constructor) {
            if (protoBuf$Constructor != ProtoBuf$Constructor.f60836b) {
                if (protoBuf$Constructor.mo59692y()) {
                    int w = protoBuf$Constructor.mo59690w();
                    this.f60838e |= 1;
                    this.f60839f = w;
                }
                if (!protoBuf$Constructor.valueParameter_.isEmpty()) {
                    if (this.f60840g.isEmpty()) {
                        this.f60840g = protoBuf$Constructor.valueParameter_;
                        this.f60838e &= -3;
                    } else {
                        if ((this.f60838e & 2) != 2) {
                            this.f60840g = new ArrayList(this.f60840g);
                            this.f60838e |= 2;
                        }
                        this.f60840g.addAll(protoBuf$Constructor.valueParameter_);
                    }
                }
                if (!protoBuf$Constructor.versionRequirement_.isEmpty()) {
                    if (this.f60841h.isEmpty()) {
                        this.f60841h = protoBuf$Constructor.versionRequirement_;
                        this.f60838e &= -5;
                    } else {
                        if ((this.f60838e & 4) != 4) {
                            this.f60841h = new ArrayList(this.f60841h);
                            this.f60838e |= 4;
                        }
                        this.f60841h.addAll(protoBuf$Constructor.versionRequirement_);
                    }
                }
                mo59999h(protoBuf$Constructor);
                this.f61054b = this.f61054b.mo61617b(protoBuf$Constructor.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59695k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Constructor protoBuf$Constructor;
            try {
                mo59694j((ProtoBuf$Constructor) ProtoBuf$Constructor.f60837c.mo59643a(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Constructor = (ProtoBuf$Constructor) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Constructor != null) {
                mo59694j(protoBuf$Constructor);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59695k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(0);
        f60836b = protoBuf$Constructor;
        protoBuf$Constructor.flags_ = 6;
        protoBuf$Constructor.valueParameter_ = Collections.emptyList();
        protoBuf$Constructor.versionRequirement_ = Collections.emptyList();
    }

    public ProtoBuf$Constructor() {
        throw null;
    }

    public ProtoBuf$Constructor(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            codedOutputStream.mo59978o(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
            codedOutputStream.mo59976m(31, this.versionRequirement_.get(i2).intValue());
        }
        aVar.mo59998a(19000, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60836b;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m60026b(1, this.flags_) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            i += CodedOutputStream.m60028d(2, this.valueParameter_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            i4 += CodedOutputStream.m60027c(this.versionRequirement_.get(i5).intValue());
        }
        int size = this.unknownFields.size() + mo59989f() + (this.versionRequirement_.size() * 2) + i + i4;
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
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            if (!this.valueParameter_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (!mo59988e()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24001b();
    }

    public final C24090h.C24091a toBuilder() {
        C24001b bVar = new C24001b();
        bVar.mo59694j(this);
        return bVar;
    }

    /* renamed from: w */
    public final int mo59690w() {
        return this.flags_;
    }

    /* renamed from: x */
    public final List<ProtoBuf$ValueParameter> mo59691x() {
        return this.valueParameter_;
    }

    /* renamed from: y */
    public final boolean mo59692y() {
        return (this.bitField0_ & 1) == 1;
    }

    public ProtoBuf$Constructor(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$Constructor(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.flags_ = 6;
        this.valueParameter_ = Collections.emptyList();
        this.versionRequirement_ = Collections.emptyList();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        this.bitField0_ |= 1;
                        this.flags_ = cVar.mo60029k();
                    } else if (n == 18) {
                        if (!(z2 & true)) {
                            this.valueParameter_ = new ArrayList();
                            z2 |= true;
                        }
                        this.valueParameter_.add(cVar.mo60025g(ProtoBuf$ValueParameter.f60978c, dVar));
                    } else if (n == 248) {
                        if (!(z2 & true)) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.versionRequirement_.add(Integer.valueOf(cVar.mo60029k()));
                    } else if (n == 250) {
                        int d = cVar.mo60022d(cVar.mo60029k());
                        if (!(z2 & true) && cVar.mo60020b() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        while (cVar.mo60020b() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(cVar.mo60029k()));
                        }
                        cVar.mo60021c(d);
                    } else if (!mo59996m(cVar, j, dVar, n)) {
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
                if (z2 & true) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if (z2 & true) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                try {
                    j.mo59973i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = bVar.mo61632i();
                    throw th2;
                }
                this.unknownFields = bVar.mo61632i();
                mo59994k();
                throw th;
            }
        }
        if (z2 & true) {
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if (z2 & true) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
        }
        try {
            j.mo59973i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVar.mo61632i();
            throw th3;
        }
        this.unknownFields = bVar.mo61632i();
        mo59994k();
    }
}
