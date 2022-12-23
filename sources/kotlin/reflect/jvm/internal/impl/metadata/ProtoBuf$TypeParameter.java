package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {

    /* renamed from: b */
    public static final ProtoBuf$TypeParameter f60962b;

    /* renamed from: c */
    public static C24038a f60963c = new C24038a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public boolean reified_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> upperBoundId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> upperBound_;
    /* access modifiers changed from: private */
    public Variance variance_;

    public enum Variance implements C24084f.C24085a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        
        private static C24084f.C24086b<Variance> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$a */
        public static class C24037a implements C24084f.C24086b<Variance> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return Variance.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C24037a();
        }

        private Variance(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Variance valueOf(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a */
    public static class C24038a extends C24077b<ProtoBuf$TypeParameter> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeParameter(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$b */
    public static final class C24039b extends GeneratedMessageLite.C24067c<ProtoBuf$TypeParameter, C24039b> {

        /* renamed from: e */
        public int f60965e;

        /* renamed from: f */
        public int f60966f;

        /* renamed from: g */
        public int f60967g;

        /* renamed from: h */
        public boolean f60968h;

        /* renamed from: i */
        public Variance f60969i = Variance.INV;

        /* renamed from: j */
        public List<ProtoBuf$Type> f60970j = Collections.emptyList();

        /* renamed from: k */
        public List<Integer> f60971k = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59883k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$TypeParameter i = mo59881i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24039b bVar = new C24039b();
            bVar.mo59882j(mo59881i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24039b bVar = new C24039b();
            bVar.mo59882j(mo59881i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59882j((ProtoBuf$TypeParameter) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$TypeParameter mo59881i() {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter((GeneratedMessageLite.C24067c) this);
            int i = this.f60965e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$TypeParameter.id_ = this.f60966f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$TypeParameter.name_ = this.f60967g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$TypeParameter.reified_ = this.f60968h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$TypeParameter.variance_ = this.f60969i;
            if ((this.f60965e & 16) == 16) {
                this.f60970j = Collections.unmodifiableList(this.f60970j);
                this.f60965e &= -17;
            }
            protoBuf$TypeParameter.upperBound_ = this.f60970j;
            if ((this.f60965e & 32) == 32) {
                this.f60971k = Collections.unmodifiableList(this.f60971k);
                this.f60965e &= -33;
            }
            protoBuf$TypeParameter.upperBoundId_ = this.f60971k;
            protoBuf$TypeParameter.bitField0_ = i2;
            return protoBuf$TypeParameter;
        }

        /* renamed from: j */
        public final void mo59882j(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
            if (protoBuf$TypeParameter != ProtoBuf$TypeParameter.f60962b) {
                if (protoBuf$TypeParameter.mo59876F()) {
                    int z = protoBuf$TypeParameter.mo59880z();
                    this.f60965e |= 1;
                    this.f60966f = z;
                }
                if (protoBuf$TypeParameter.mo59877G()) {
                    int A = protoBuf$TypeParameter.mo59871A();
                    this.f60965e |= 2;
                    this.f60967g = A;
                }
                if (protoBuf$TypeParameter.mo59878H()) {
                    boolean B = protoBuf$TypeParameter.mo59872B();
                    this.f60965e |= 4;
                    this.f60968h = B;
                }
                if (protoBuf$TypeParameter.mo59879I()) {
                    Variance E = protoBuf$TypeParameter.mo59875E();
                    E.getClass();
                    this.f60965e |= 8;
                    this.f60969i = E;
                }
                if (!protoBuf$TypeParameter.upperBound_.isEmpty()) {
                    if (this.f60970j.isEmpty()) {
                        this.f60970j = protoBuf$TypeParameter.upperBound_;
                        this.f60965e &= -17;
                    } else {
                        if ((this.f60965e & 16) != 16) {
                            this.f60970j = new ArrayList(this.f60970j);
                            this.f60965e |= 16;
                        }
                        this.f60970j.addAll(protoBuf$TypeParameter.upperBound_);
                    }
                }
                if (!protoBuf$TypeParameter.upperBoundId_.isEmpty()) {
                    if (this.f60971k.isEmpty()) {
                        this.f60971k = protoBuf$TypeParameter.upperBoundId_;
                        this.f60965e &= -33;
                    } else {
                        if ((this.f60965e & 32) != 32) {
                            this.f60971k = new ArrayList(this.f60971k);
                            this.f60965e |= 32;
                        }
                        this.f60971k.addAll(protoBuf$TypeParameter.upperBoundId_);
                    }
                }
                mo59999h(protoBuf$TypeParameter);
                this.f61054b = this.f61054b.mo61617b(protoBuf$TypeParameter.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59883k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$TypeParameter protoBuf$TypeParameter;
            try {
                ProtoBuf$TypeParameter.f60963c.getClass();
                mo59882j(new ProtoBuf$TypeParameter(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeParameter = (ProtoBuf$TypeParameter) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$TypeParameter != null) {
                mo59882j(protoBuf$TypeParameter);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59883k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(0);
        f60962b = protoBuf$TypeParameter;
        protoBuf$TypeParameter.id_ = 0;
        protoBuf$TypeParameter.name_ = 0;
        protoBuf$TypeParameter.reified_ = false;
        protoBuf$TypeParameter.variance_ = Variance.INV;
        protoBuf$TypeParameter.upperBound_ = Collections.emptyList();
        protoBuf$TypeParameter.upperBoundId_ = Collections.emptyList();
    }

    public ProtoBuf$TypeParameter() {
        throw null;
    }

    public ProtoBuf$TypeParameter(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: A */
    public final int mo59871A() {
        return this.name_;
    }

    /* renamed from: B */
    public final boolean mo59872B() {
        return this.reified_;
    }

    /* renamed from: C */
    public final List<Integer> mo59873C() {
        return this.upperBoundId_;
    }

    /* renamed from: D */
    public final List<ProtoBuf$Type> mo59874D() {
        return this.upperBound_;
    }

    /* renamed from: E */
    public final Variance mo59875E() {
        return this.variance_;
    }

    /* renamed from: F */
    public final boolean mo59876F() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: G */
    public final boolean mo59877G() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: H */
    public final boolean mo59878H() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: I */
    public final boolean mo59879I() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            boolean z = this.reified_;
            codedOutputStream.mo59987x(3, 0);
            codedOutputStream.mo59980q(z ? 1 : 0);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59975l(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            codedOutputStream.mo59978o(5, this.upperBound_.get(i));
        }
        if (this.upperBoundId_.size() > 0) {
            codedOutputStream.mo59985v(50);
            codedOutputStream.mo59985v(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            codedOutputStream.mo59977n(this.upperBoundId_.get(i2).intValue());
        }
        aVar.mo59998a(1000, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60962b;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m60026b(1, this.id_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m60026b(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60032h(3) + 1;
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m60025a(4, this.variance_.getNumber());
        }
        for (int i3 = 0; i3 < this.upperBound_.size(); i3++) {
            i += CodedOutputStream.m60028d(5, this.upperBound_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.upperBoundId_.size(); i5++) {
            i4 += CodedOutputStream.m60027c(this.upperBoundId_.get(i5).intValue());
        }
        int i6 = i + i4;
        if (!this.upperBoundId_.isEmpty()) {
            i6 = i6 + 1 + CodedOutputStream.m60027c(i4);
        }
        this.upperBoundIdMemoizedSerializedSize = i4;
        int size = this.unknownFields.size() + mo59989f() + i6;
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
        if (!mo59876F()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59877G()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            for (int i = 0; i < this.upperBound_.size(); i++) {
                if (!this.upperBound_.get(i).isInitialized()) {
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
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24039b();
    }

    public final C24090h.C24091a toBuilder() {
        C24039b bVar = new C24039b();
        bVar.mo59882j(this);
        return bVar;
    }

    /* renamed from: z */
    public final int mo59880z() {
        return this.id_;
    }

    public ProtoBuf$TypeParameter(int i) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$TypeParameter(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        this.variance_ = Variance.INV;
        this.upperBound_ = Collections.emptyList();
        this.upperBoundId_ = Collections.emptyList();
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
                        this.id_ = cVar.mo60029k();
                    } else if (n == 16) {
                        this.bitField0_ |= 2;
                        this.name_ = cVar.mo60029k();
                    } else if (n == 24) {
                        this.bitField0_ |= 4;
                        this.reified_ = cVar.mo60030l() != 0;
                    } else if (n == 32) {
                        int k = cVar.mo60029k();
                        Variance valueOf = Variance.valueOf(k);
                        if (valueOf == null) {
                            j.mo59985v(n);
                            j.mo59985v(k);
                        } else {
                            this.bitField0_ |= 8;
                            this.variance_ = valueOf;
                        }
                    } else if (n == 42) {
                        if (!(z2 & true)) {
                            this.upperBound_ = new ArrayList();
                            z2 |= true;
                        }
                        this.upperBound_.add(cVar.mo60025g(ProtoBuf$Type.f60927c, dVar));
                    } else if (n == 48) {
                        if (!(z2 & true)) {
                            this.upperBoundId_ = new ArrayList();
                            z2 |= true;
                        }
                        this.upperBoundId_.add(Integer.valueOf(cVar.mo60029k()));
                    } else if (n == 50) {
                        int d = cVar.mo60022d(cVar.mo60029k());
                        if (!(z2 & true) && cVar.mo60020b() > 0) {
                            this.upperBoundId_ = new ArrayList();
                            z2 |= true;
                        }
                        while (cVar.mo60020b() > 0) {
                            this.upperBoundId_.add(Integer.valueOf(cVar.mo60029k()));
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
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                }
                if (z2 & true) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if (z2 & true) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
