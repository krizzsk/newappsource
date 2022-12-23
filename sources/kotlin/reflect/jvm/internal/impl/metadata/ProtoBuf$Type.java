package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
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
import vg0.C25099f;

public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> {

    /* renamed from: b */
    public static final ProtoBuf$Type f60926b;

    /* renamed from: c */
    public static C24033a f60927c = new C24033a();
    /* access modifiers changed from: private */
    public int abbreviatedTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type abbreviatedType_;
    /* access modifiers changed from: private */
    public List<Argument> argument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int className_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int flexibleTypeCapabilitiesId_;
    /* access modifiers changed from: private */
    public int flexibleUpperBoundId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public boolean nullable_;
    /* access modifiers changed from: private */
    public int outerTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type outerType_;
    /* access modifiers changed from: private */
    public int typeAliasName_;
    /* access modifiers changed from: private */
    public int typeParameterName_;
    /* access modifiers changed from: private */
    public int typeParameter_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a */
    public static class C24033a extends C24077b<ProtoBuf$Type> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Type(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b */
    public static final class C24034b extends GeneratedMessageLite.C24067c<ProtoBuf$Type, C24034b> {

        /* renamed from: e */
        public int f60935e;

        /* renamed from: f */
        public List<Argument> f60936f = Collections.emptyList();

        /* renamed from: g */
        public boolean f60937g;

        /* renamed from: h */
        public int f60938h;

        /* renamed from: i */
        public ProtoBuf$Type f60939i;

        /* renamed from: j */
        public int f60940j;

        /* renamed from: k */
        public int f60941k;

        /* renamed from: l */
        public int f60942l;

        /* renamed from: m */
        public int f60943m;

        /* renamed from: n */
        public int f60944n;

        /* renamed from: o */
        public ProtoBuf$Type f60945o;

        /* renamed from: p */
        public int f60946p;

        /* renamed from: q */
        public ProtoBuf$Type f60947q;

        /* renamed from: r */
        public int f60948r;

        /* renamed from: s */
        public int f60949s;

        public C24034b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
            this.f60939i = protoBuf$Type;
            this.f60945o = protoBuf$Type;
            this.f60947q = protoBuf$Type;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59852k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Type i = mo59850i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24034b bVar = new C24034b();
            bVar.mo59851j(mo59850i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24034b bVar = new C24034b();
            bVar.mo59851j(mo59850i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59851j((ProtoBuf$Type) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$Type mo59850i() {
            ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type((GeneratedMessageLite.C24067c) this);
            int i = this.f60935e;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f60936f = Collections.unmodifiableList(this.f60936f);
                this.f60935e &= -2;
            }
            protoBuf$Type.argument_ = this.f60936f;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            protoBuf$Type.nullable_ = this.f60937g;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            protoBuf$Type.flexibleTypeCapabilitiesId_ = this.f60938h;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$Type.flexibleUpperBound_ = this.f60939i;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            protoBuf$Type.flexibleUpperBoundId_ = this.f60940j;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            protoBuf$Type.className_ = this.f60941k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$Type.typeParameter_ = this.f60942l;
            if ((i & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                i2 |= 64;
            }
            protoBuf$Type.typeParameterName_ = this.f60943m;
            if ((i & 256) == 256) {
                i2 |= RecyclerView.C1119a0.FLAG_IGNORE;
            }
            protoBuf$Type.typeAliasName_ = this.f60944n;
            if ((i & 512) == 512) {
                i2 |= 256;
            }
            protoBuf$Type.outerType_ = this.f60945o;
            if ((i & 1024) == 1024) {
                i2 |= 512;
            }
            protoBuf$Type.outerTypeId_ = this.f60946p;
            if ((i & 2048) == 2048) {
                i2 |= 1024;
            }
            protoBuf$Type.abbreviatedType_ = this.f60947q;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            protoBuf$Type.abbreviatedTypeId_ = this.f60948r;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            protoBuf$Type.flags_ = this.f60949s;
            protoBuf$Type.bitField0_ = i2;
            return protoBuf$Type;
        }

        /* renamed from: j */
        public final C24034b mo59851j(ProtoBuf$Type protoBuf$Type) {
            ProtoBuf$Type protoBuf$Type2;
            ProtoBuf$Type protoBuf$Type3;
            ProtoBuf$Type protoBuf$Type4;
            ProtoBuf$Type protoBuf$Type5 = ProtoBuf$Type.f60926b;
            if (protoBuf$Type == protoBuf$Type5) {
                return this;
            }
            if (!protoBuf$Type.argument_.isEmpty()) {
                if (this.f60936f.isEmpty()) {
                    this.f60936f = protoBuf$Type.argument_;
                    this.f60935e &= -2;
                } else {
                    if ((this.f60935e & 1) != 1) {
                        this.f60936f = new ArrayList(this.f60936f);
                        this.f60935e |= 1;
                    }
                    this.f60936f.addAll(protoBuf$Type.argument_);
                }
            }
            if (protoBuf$Type.mo59833c0()) {
                boolean P = protoBuf$Type.mo59820P();
                this.f60935e |= 2;
                this.f60937g = P;
            }
            if (protoBuf$Type.mo59830Z()) {
                int M = protoBuf$Type.mo59817M();
                this.f60935e |= 4;
                this.f60938h = M;
            }
            if (protoBuf$Type.mo59831a0()) {
                ProtoBuf$Type N = protoBuf$Type.mo59818N();
                if ((this.f60935e & 8) != 8 || (protoBuf$Type4 = this.f60939i) == protoBuf$Type5) {
                    this.f60939i = N;
                } else {
                    C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type4);
                    j0.mo59851j(N);
                    this.f60939i = j0.mo59850i();
                }
                this.f60935e |= 8;
            }
            if (protoBuf$Type.mo59832b0()) {
                int O = protoBuf$Type.mo59819O();
                this.f60935e |= 16;
                this.f60940j = O;
            }
            if (protoBuf$Type.mo59828X()) {
                int K = protoBuf$Type.mo59815K();
                this.f60935e |= 32;
                this.f60941k = K;
            }
            if (protoBuf$Type.mo59837g0()) {
                int T = protoBuf$Type.mo59824T();
                this.f60935e |= 64;
                this.f60942l = T;
            }
            if (protoBuf$Type.mo59838h0()) {
                int U = protoBuf$Type.mo59825U();
                this.f60935e |= RecyclerView.C1119a0.FLAG_IGNORE;
                this.f60943m = U;
            }
            if (protoBuf$Type.mo59836f0()) {
                int S = protoBuf$Type.mo59823S();
                this.f60935e |= 256;
                this.f60944n = S;
            }
            if (protoBuf$Type.mo59834d0()) {
                ProtoBuf$Type Q = protoBuf$Type.mo59821Q();
                if ((this.f60935e & 512) != 512 || (protoBuf$Type3 = this.f60945o) == protoBuf$Type5) {
                    this.f60945o = Q;
                } else {
                    C24034b j02 = ProtoBuf$Type.m59679j0(protoBuf$Type3);
                    j02.mo59851j(Q);
                    this.f60945o = j02.mo59850i();
                }
                this.f60935e |= 512;
            }
            if (protoBuf$Type.mo59835e0()) {
                int R = protoBuf$Type.mo59822R();
                this.f60935e |= 1024;
                this.f60946p = R;
            }
            if (protoBuf$Type.mo59826V()) {
                ProtoBuf$Type G = protoBuf$Type.mo59811G();
                if ((this.f60935e & 2048) != 2048 || (protoBuf$Type2 = this.f60947q) == protoBuf$Type5) {
                    this.f60947q = G;
                } else {
                    C24034b j03 = ProtoBuf$Type.m59679j0(protoBuf$Type2);
                    j03.mo59851j(G);
                    this.f60947q = j03.mo59850i();
                }
                this.f60935e |= 2048;
            }
            if (protoBuf$Type.mo59827W()) {
                int H = protoBuf$Type.mo59812H();
                this.f60935e |= 4096;
                this.f60948r = H;
            }
            if (protoBuf$Type.mo59829Y()) {
                int L = protoBuf$Type.mo59816L();
                this.f60935e |= 8192;
                this.f60949s = L;
            }
            mo59999h(protoBuf$Type);
            this.f61054b = this.f61054b.mo61617b(protoBuf$Type.unknownFields);
            return this;
        }

        /* renamed from: k */
        public final void mo59852k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Type protoBuf$Type;
            try {
                ProtoBuf$Type.f60927c.getClass();
                mo59851j(new ProtoBuf$Type(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Type = (ProtoBuf$Type) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Type != null) {
                mo59851j(protoBuf$Type);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59852k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(0);
        f60926b = protoBuf$Type;
        protoBuf$Type.mo59839i0();
    }

    public ProtoBuf$Type() {
        throw null;
    }

    public ProtoBuf$Type(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: j0 */
    public static C24034b m59679j0(ProtoBuf$Type protoBuf$Type) {
        C24034b bVar = new C24034b();
        bVar.mo59851j(protoBuf$Type);
        return bVar;
    }

    /* renamed from: G */
    public final ProtoBuf$Type mo59811G() {
        return this.abbreviatedType_;
    }

    /* renamed from: H */
    public final int mo59812H() {
        return this.abbreviatedTypeId_;
    }

    /* renamed from: I */
    public final int mo59813I() {
        return this.argument_.size();
    }

    /* renamed from: J */
    public final List<Argument> mo59814J() {
        return this.argument_;
    }

    /* renamed from: K */
    public final int mo59815K() {
        return this.className_;
    }

    /* renamed from: L */
    public final int mo59816L() {
        return this.flags_;
    }

    /* renamed from: M */
    public final int mo59817M() {
        return this.flexibleTypeCapabilitiesId_;
    }

    /* renamed from: N */
    public final ProtoBuf$Type mo59818N() {
        return this.flexibleUpperBound_;
    }

    /* renamed from: O */
    public final int mo59819O() {
        return this.flexibleUpperBoundId_;
    }

    /* renamed from: P */
    public final boolean mo59820P() {
        return this.nullable_;
    }

    /* renamed from: Q */
    public final ProtoBuf$Type mo59821Q() {
        return this.outerType_;
    }

    /* renamed from: R */
    public final int mo59822R() {
        return this.outerTypeId_;
    }

    /* renamed from: S */
    public final int mo59823S() {
        return this.typeAliasName_;
    }

    /* renamed from: T */
    public final int mo59824T() {
        return this.typeParameter_;
    }

    /* renamed from: U */
    public final int mo59825U() {
        return this.typeParameterName_;
    }

    /* renamed from: V */
    public final boolean mo59826V() {
        return (this.bitField0_ & 1024) == 1024;
    }

    /* renamed from: W */
    public final boolean mo59827W() {
        return (this.bitField0_ & 2048) == 2048;
    }

    /* renamed from: X */
    public final boolean mo59828X() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: Y */
    public final boolean mo59829Y() {
        return (this.bitField0_ & 4096) == 4096;
    }

    /* renamed from: Z */
    public final boolean mo59830Z() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 4096) == 4096) {
            codedOutputStream.mo59976m(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.mo59978o(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            boolean z = this.nullable_;
            codedOutputStream.mo59987x(3, 0);
            codedOutputStream.mo59980q(z ? 1 : 0);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59978o(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59976m(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo59976m(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59976m(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo59976m(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo59978o(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            codedOutputStream.mo59976m(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            codedOutputStream.mo59976m(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            codedOutputStream.mo59978o(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            codedOutputStream.mo59976m(14, this.abbreviatedTypeId_);
        }
        aVar.mo59998a(200, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: a0 */
    public final boolean mo59831a0() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: b0 */
    public final boolean mo59832b0() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: c0 */
    public final boolean mo59833c0() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: d0 */
    public final boolean mo59834d0() {
        return (this.bitField0_ & 256) == 256;
    }

    /* renamed from: e0 */
    public final boolean mo59835e0() {
        return (this.bitField0_ & 512) == 512;
    }

    /* renamed from: f0 */
    public final boolean mo59836f0() {
        return (this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128;
    }

    /* renamed from: g0 */
    public final boolean mo59837g0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final C24090h getDefaultInstanceForType() {
        return f60926b;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 4096) == 4096) {
            i = CodedOutputStream.m60026b(1, this.flags_) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.argument_.size(); i3++) {
            i += CodedOutputStream.m60028d(2, this.argument_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            i += CodedOutputStream.m60032h(3) + 1;
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m60026b(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60028d(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m60026b(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i += CodedOutputStream.m60026b(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m60026b(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i += CodedOutputStream.m60026b(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            i += CodedOutputStream.m60028d(10, this.outerType_);
        }
        if ((this.bitField0_ & 512) == 512) {
            i += CodedOutputStream.m60026b(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            i += CodedOutputStream.m60026b(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & 1024) == 1024) {
            i += CodedOutputStream.m60028d(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            i += CodedOutputStream.m60026b(14, this.abbreviatedTypeId_);
        }
        int size = this.unknownFields.size() + mo59989f() + i;
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: h0 */
    public final boolean mo59838h0() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: i0 */
    public final void mo59839i0() {
        this.argument_ = Collections.emptyList();
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        ProtoBuf$Type protoBuf$Type = f60926b;
        this.flexibleUpperBound_ = protoBuf$Type;
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = protoBuf$Type;
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = protoBuf$Type;
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo59813I(); i++) {
            if (!this.argument_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo59831a0() && !this.flexibleUpperBound_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo59834d0() && !this.outerType_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo59826V() && !this.abbreviatedType_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59988e()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            this.memoizedIsInitialized = 1;
            return true;
        }
    }

    /* renamed from: k0 */
    public final C24034b mo59840k0() {
        return m59679j0(this);
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24034b();
    }

    public final C24090h.C24091a toBuilder() {
        return m59679j0(this);
    }

    public static final class Argument extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final Argument f60928b;

        /* renamed from: c */
        public static C24031a f60929c = new C24031a();
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public Projection projection_;
        /* access modifiers changed from: private */
        public int typeId_;
        /* access modifiers changed from: private */
        public ProtoBuf$Type type_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;

        public enum Projection implements C24084f.C24085a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
            private static C24084f.C24086b<Projection> internalValueMap;
            private final int value;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$a */
            public static class C24030a implements C24084f.C24086b<Projection> {
                /* renamed from: a */
                public final C24084f.C24085a mo59642a(int i) {
                    return Projection.valueOf(i);
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C24030a();
            }

            private Projection(int i, int i2) {
                this.value = i2;
            }

            public final int getNumber() {
                return this.value;
            }

            public static Projection valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$a */
        public static class C24031a extends C24077b<Argument> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new Argument(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$b */
        public static final class C24032b extends GeneratedMessageLite.C24066b<Argument, C24032b> implements C25099f {

            /* renamed from: c */
            public int f60931c;

            /* renamed from: d */
            public Projection f60932d = Projection.INV;

            /* renamed from: e */
            public ProtoBuf$Type f60933e = ProtoBuf$Type.f60926b;

            /* renamed from: f */
            public int f60934f;

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59849j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                Argument h = mo59847h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C24032b bVar = new C24032b();
                bVar.mo59848i(mo59847h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C24032b bVar = new C24032b();
                bVar.mo59848i(mo59847h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59848i((Argument) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final Argument mo59847h() {
                Argument argument = new Argument(this);
                int i = this.f60931c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                argument.projection_ = this.f60932d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                argument.type_ = this.f60933e;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                argument.typeId_ = this.f60934f;
                argument.bitField0_ = i2;
                return argument;
            }

            /* renamed from: i */
            public final void mo59848i(Argument argument) {
                ProtoBuf$Type protoBuf$Type;
                if (argument != Argument.f60928b) {
                    if (argument.mo59844l()) {
                        Projection i = argument.mo59841i();
                        i.getClass();
                        this.f60931c |= 1;
                        this.f60932d = i;
                    }
                    if (argument.mo59845m()) {
                        ProtoBuf$Type j = argument.mo59842j();
                        if ((this.f60931c & 2) != 2 || (protoBuf$Type = this.f60933e) == ProtoBuf$Type.f60926b) {
                            this.f60933e = j;
                        } else {
                            C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                            j0.mo59851j(j);
                            this.f60933e = j0.mo59850i();
                        }
                        this.f60931c |= 2;
                    }
                    if (argument.mo59846o()) {
                        int k = argument.mo59843k();
                        this.f60931c |= 4;
                        this.f60934f = k;
                    }
                    this.f61054b = this.f61054b.mo61617b(argument.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59849j(C24078c cVar, C24079d dVar) throws IOException {
                Argument argument;
                try {
                    Argument.f60929c.getClass();
                    mo59848i(new Argument(cVar, dVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    argument = (Argument) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (argument != null) {
                    mo59848i(argument);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59849j(cVar, dVar);
                return this;
            }
        }

        static {
            Argument argument = new Argument();
            f60928b = argument;
            argument.projection_ = Projection.INV;
            argument.type_ = ProtoBuf$Type.f60926b;
            argument.typeId_ = 0;
        }

        public Argument(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo59975l(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo59978o(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo59976m(3, this.typeId_);
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
                i2 = 0 + CodedOutputStream.m60025a(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m60028d(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m60026b(3, this.typeId_);
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: i */
        public final Projection mo59841i() {
            return this.projection_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo59845m() || this.type_.isInitialized()) {
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        /* renamed from: j */
        public final ProtoBuf$Type mo59842j() {
            return this.type_;
        }

        /* renamed from: k */
        public final int mo59843k() {
            return this.typeId_;
        }

        /* renamed from: l */
        public final boolean mo59844l() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: m */
        public final boolean mo59845m() {
            return (this.bitField0_ & 2) == 2;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C24032b();
        }

        /* renamed from: o */
        public final boolean mo59846o() {
            return (this.bitField0_ & 4) == 4;
        }

        public final C24090h.C24091a toBuilder() {
            C24032b bVar = new C24032b();
            bVar.mo59848i(this);
            return bVar;
        }

        public Argument() {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        public Argument(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.projection_ = Projection.INV;
            this.type_ = ProtoBuf$Type.f60926b;
            boolean z = false;
            this.typeId_ = 0;
            C25091a.C25093b bVar = new C25091a.C25093b();
            CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
            while (!z) {
                try {
                    int n = cVar.mo60032n();
                    if (n != 0) {
                        if (n == 8) {
                            int k = cVar.mo60029k();
                            Projection valueOf = Projection.valueOf(k);
                            if (valueOf == null) {
                                j.mo59985v(n);
                                j.mo59985v(k);
                            } else {
                                this.bitField0_ |= 1;
                                this.projection_ = valueOf;
                            }
                        } else if (n == 18) {
                            C24034b bVar2 = null;
                            if ((this.bitField0_ & 2) == 2) {
                                ProtoBuf$Type protoBuf$Type = this.type_;
                                protoBuf$Type.getClass();
                                bVar2 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo60025g(ProtoBuf$Type.f60927c, dVar);
                            this.type_ = protoBuf$Type2;
                            if (bVar2 != null) {
                                bVar2.mo59851j(protoBuf$Type2);
                                this.type_ = bVar2.mo59850i();
                            }
                            this.bitField0_ |= 2;
                        } else if (n == 24) {
                            this.bitField0_ |= 4;
                            this.typeId_ = cVar.mo60029k();
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

    public ProtoBuf$Type(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$Type(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo59839i0();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                C24034b bVar2 = null;
                switch (n) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.bitField0_ |= 4096;
                        this.flags_ = cVar.mo60029k();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.argument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.argument_.add(cVar.mo60025g(Argument.f60929c, dVar));
                        break;
                    case 24:
                        this.bitField0_ |= 1;
                        this.nullable_ = cVar.mo60030l() != 0;
                        break;
                    case 32:
                        this.bitField0_ |= 2;
                        this.flexibleTypeCapabilitiesId_ = cVar.mo60029k();
                        break;
                    case 42:
                        if ((this.bitField0_ & 4) == 4) {
                            ProtoBuf$Type protoBuf$Type = this.flexibleUpperBound_;
                            protoBuf$Type.getClass();
                            bVar2 = m59679j0(protoBuf$Type);
                        }
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo60025g(f60927c, dVar);
                        this.flexibleUpperBound_ = protoBuf$Type2;
                        if (bVar2 != null) {
                            bVar2.mo59851j(protoBuf$Type2);
                            this.flexibleUpperBound_ = bVar2.mo59850i();
                        }
                        this.bitField0_ |= 4;
                        break;
                    case 48:
                        this.bitField0_ |= 16;
                        this.className_ = cVar.mo60029k();
                        break;
                    case 56:
                        this.bitField0_ |= 32;
                        this.typeParameter_ = cVar.mo60029k();
                        break;
                    case 64:
                        this.bitField0_ |= 8;
                        this.flexibleUpperBoundId_ = cVar.mo60029k();
                        break;
                    case 72:
                        this.bitField0_ |= 64;
                        this.typeParameterName_ = cVar.mo60029k();
                        break;
                    case 82:
                        if ((this.bitField0_ & 256) == 256) {
                            ProtoBuf$Type protoBuf$Type3 = this.outerType_;
                            protoBuf$Type3.getClass();
                            bVar2 = m59679j0(protoBuf$Type3);
                        }
                        ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) cVar.mo60025g(f60927c, dVar);
                        this.outerType_ = protoBuf$Type4;
                        if (bVar2 != null) {
                            bVar2.mo59851j(protoBuf$Type4);
                            this.outerType_ = bVar2.mo59850i();
                        }
                        this.bitField0_ |= 256;
                        break;
                    case 88:
                        this.bitField0_ |= 512;
                        this.outerTypeId_ = cVar.mo60029k();
                        break;
                    case 96:
                        this.bitField0_ |= RecyclerView.C1119a0.FLAG_IGNORE;
                        this.typeAliasName_ = cVar.mo60029k();
                        break;
                    case 106:
                        if ((this.bitField0_ & 1024) == 1024) {
                            ProtoBuf$Type protoBuf$Type5 = this.abbreviatedType_;
                            protoBuf$Type5.getClass();
                            bVar2 = m59679j0(protoBuf$Type5);
                        }
                        ProtoBuf$Type protoBuf$Type6 = (ProtoBuf$Type) cVar.mo60025g(f60927c, dVar);
                        this.abbreviatedType_ = protoBuf$Type6;
                        if (bVar2 != null) {
                            bVar2.mo59851j(protoBuf$Type6);
                            this.abbreviatedType_ = bVar2.mo59850i();
                        }
                        this.bitField0_ |= 1024;
                        break;
                    case 112:
                        this.bitField0_ |= 2048;
                        this.abbreviatedTypeId_ = cVar.mo60029k();
                        break;
                    default:
                        if (mo59996m(cVar, j, dVar, n)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e) {
                e.mo60010b(this);
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.mo60010b(this);
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
        if (z2 && true) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
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
