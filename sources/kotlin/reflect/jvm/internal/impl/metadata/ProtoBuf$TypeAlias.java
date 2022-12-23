package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
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

public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {

    /* renamed from: b */
    public static final ProtoBuf$TypeAlias f60950b;

    /* renamed from: c */
    public static C24035a f60951c = new C24035a();
    /* access modifiers changed from: private */
    public List<ProtoBuf$Annotation> annotation_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int expandedTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type expandedType_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public int underlyingTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type underlyingType_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a */
    public static class C24035a extends C24077b<ProtoBuf$TypeAlias> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeAlias(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$b */
    public static final class C24036b extends GeneratedMessageLite.C24067c<ProtoBuf$TypeAlias, C24036b> {

        /* renamed from: e */
        public int f60952e;

        /* renamed from: f */
        public int f60953f = 6;

        /* renamed from: g */
        public int f60954g;

        /* renamed from: h */
        public List<ProtoBuf$TypeParameter> f60955h = Collections.emptyList();

        /* renamed from: i */
        public ProtoBuf$Type f60956i;

        /* renamed from: j */
        public int f60957j;

        /* renamed from: k */
        public ProtoBuf$Type f60958k;

        /* renamed from: l */
        public int f60959l;

        /* renamed from: m */
        public List<ProtoBuf$Annotation> f60960m;

        /* renamed from: n */
        public List<Integer> f60961n;

        public C24036b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
            this.f60956i = protoBuf$Type;
            this.f60958k = protoBuf$Type;
            this.f60960m = Collections.emptyList();
            this.f60961n = Collections.emptyList();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59870k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$TypeAlias i = mo59868i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24036b bVar = new C24036b();
            bVar.mo59869j(mo59868i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24036b bVar = new C24036b();
            bVar.mo59869j(mo59868i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59869j((ProtoBuf$TypeAlias) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$TypeAlias mo59868i() {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias((GeneratedMessageLite.C24067c) this);
            int i = this.f60952e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$TypeAlias.flags_ = this.f60953f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$TypeAlias.name_ = this.f60954g;
            if ((this.f60952e & 4) == 4) {
                this.f60955h = Collections.unmodifiableList(this.f60955h);
                this.f60952e &= -5;
            }
            protoBuf$TypeAlias.typeParameter_ = this.f60955h;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$TypeAlias.underlyingType_ = this.f60956i;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            protoBuf$TypeAlias.underlyingTypeId_ = this.f60957j;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            protoBuf$TypeAlias.expandedType_ = this.f60958k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$TypeAlias.expandedTypeId_ = this.f60959l;
            if ((this.f60952e & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                this.f60960m = Collections.unmodifiableList(this.f60960m);
                this.f60952e &= -129;
            }
            protoBuf$TypeAlias.annotation_ = this.f60960m;
            if ((this.f60952e & 256) == 256) {
                this.f60961n = Collections.unmodifiableList(this.f60961n);
                this.f60952e &= -257;
            }
            protoBuf$TypeAlias.versionRequirement_ = this.f60961n;
            protoBuf$TypeAlias.bitField0_ = i2;
            return protoBuf$TypeAlias;
        }

        /* renamed from: j */
        public final void mo59869j(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$TypeAlias != ProtoBuf$TypeAlias.f60950b) {
                if (protoBuf$TypeAlias.mo59863N()) {
                    int G = protoBuf$TypeAlias.mo59856G();
                    this.f60952e |= 1;
                    this.f60953f = G;
                }
                if (protoBuf$TypeAlias.mo59864O()) {
                    int H = protoBuf$TypeAlias.mo59857H();
                    this.f60952e |= 2;
                    this.f60954g = H;
                }
                if (!protoBuf$TypeAlias.typeParameter_.isEmpty()) {
                    if (this.f60955h.isEmpty()) {
                        this.f60955h = protoBuf$TypeAlias.typeParameter_;
                        this.f60952e &= -5;
                    } else {
                        if ((this.f60952e & 4) != 4) {
                            this.f60955h = new ArrayList(this.f60955h);
                            this.f60952e |= 4;
                        }
                        this.f60955h.addAll(protoBuf$TypeAlias.typeParameter_);
                    }
                }
                if (protoBuf$TypeAlias.mo59865P()) {
                    ProtoBuf$Type J = protoBuf$TypeAlias.mo59859J();
                    if ((this.f60952e & 8) != 8 || (protoBuf$Type2 = this.f60956i) == ProtoBuf$Type.f60926b) {
                        this.f60956i = J;
                    } else {
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type2);
                        j0.mo59851j(J);
                        this.f60956i = j0.mo59850i();
                    }
                    this.f60952e |= 8;
                }
                if (protoBuf$TypeAlias.mo59866Q()) {
                    int K = protoBuf$TypeAlias.mo59860K();
                    this.f60952e |= 16;
                    this.f60957j = K;
                }
                if (protoBuf$TypeAlias.mo59861L()) {
                    ProtoBuf$Type E = protoBuf$TypeAlias.mo59854E();
                    if ((this.f60952e & 32) != 32 || (protoBuf$Type = this.f60958k) == ProtoBuf$Type.f60926b) {
                        this.f60958k = E;
                    } else {
                        ProtoBuf$Type.C24034b j02 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j02.mo59851j(E);
                        this.f60958k = j02.mo59850i();
                    }
                    this.f60952e |= 32;
                }
                if (protoBuf$TypeAlias.mo59862M()) {
                    int F = protoBuf$TypeAlias.mo59855F();
                    this.f60952e |= 64;
                    this.f60959l = F;
                }
                if (!protoBuf$TypeAlias.annotation_.isEmpty()) {
                    if (this.f60960m.isEmpty()) {
                        this.f60960m = protoBuf$TypeAlias.annotation_;
                        this.f60952e &= -129;
                    } else {
                        if ((this.f60952e & RecyclerView.C1119a0.FLAG_IGNORE) != 128) {
                            this.f60960m = new ArrayList(this.f60960m);
                            this.f60952e |= RecyclerView.C1119a0.FLAG_IGNORE;
                        }
                        this.f60960m.addAll(protoBuf$TypeAlias.annotation_);
                    }
                }
                if (!protoBuf$TypeAlias.versionRequirement_.isEmpty()) {
                    if (this.f60961n.isEmpty()) {
                        this.f60961n = protoBuf$TypeAlias.versionRequirement_;
                        this.f60952e &= -257;
                    } else {
                        if ((this.f60952e & 256) != 256) {
                            this.f60961n = new ArrayList(this.f60961n);
                            this.f60952e |= 256;
                        }
                        this.f60961n.addAll(protoBuf$TypeAlias.versionRequirement_);
                    }
                }
                mo59999h(protoBuf$TypeAlias);
                this.f61054b = this.f61054b.mo61617b(protoBuf$TypeAlias.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59870k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$TypeAlias protoBuf$TypeAlias;
            try {
                ProtoBuf$TypeAlias.f60951c.getClass();
                mo59869j(new ProtoBuf$TypeAlias(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeAlias = (ProtoBuf$TypeAlias) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$TypeAlias != null) {
                mo59869j(protoBuf$TypeAlias);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59870k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(0);
        f60950b = protoBuf$TypeAlias;
        protoBuf$TypeAlias.mo59867R();
    }

    public ProtoBuf$TypeAlias() {
        throw null;
    }

    public ProtoBuf$TypeAlias(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: D */
    public final List<ProtoBuf$Annotation> mo59853D() {
        return this.annotation_;
    }

    /* renamed from: E */
    public final ProtoBuf$Type mo59854E() {
        return this.expandedType_;
    }

    /* renamed from: F */
    public final int mo59855F() {
        return this.expandedTypeId_;
    }

    /* renamed from: G */
    public final int mo59856G() {
        return this.flags_;
    }

    /* renamed from: H */
    public final int mo59857H() {
        return this.name_;
    }

    /* renamed from: I */
    public final List<ProtoBuf$TypeParameter> mo59858I() {
        return this.typeParameter_;
    }

    /* renamed from: J */
    public final ProtoBuf$Type mo59859J() {
        return this.underlyingType_;
    }

    /* renamed from: K */
    public final int mo59860K() {
        return this.underlyingTypeId_;
    }

    /* renamed from: L */
    public final boolean mo59861L() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: M */
    public final boolean mo59862M() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: N */
    public final boolean mo59863N() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: O */
    public final boolean mo59864O() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: P */
    public final boolean mo59865P() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: Q */
    public final boolean mo59866Q() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: R */
    public final void mo59867R() {
        this.flags_ = 6;
        this.name_ = 0;
        this.typeParameter_ = Collections.emptyList();
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
        this.underlyingType_ = protoBuf$Type;
        this.underlyingTypeId_ = 0;
        this.expandedType_ = protoBuf$Type;
        this.expandedTypeId_ = 0;
        this.annotation_ = Collections.emptyList();
        this.versionRequirement_ = Collections.emptyList();
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(2, this.name_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.mo59978o(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59978o(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59976m(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59978o(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo59976m(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            codedOutputStream.mo59978o(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            codedOutputStream.mo59976m(31, this.versionRequirement_.get(i3).intValue());
        }
        aVar.mo59998a(200, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60950b;
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
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m60026b(2, this.name_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            i += CodedOutputStream.m60028d(3, this.typeParameter_.get(i3));
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60028d(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m60026b(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m60028d(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i += CodedOutputStream.m60026b(7, this.expandedTypeId_);
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            i += CodedOutputStream.m60028d(8, this.annotation_.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
            i5 += CodedOutputStream.m60027c(this.versionRequirement_.get(i6).intValue());
        }
        int size = this.unknownFields.size() + mo59989f() + (this.versionRequirement_.size() * 2) + i + i5;
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
        if (!mo59864O()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (mo59865P() && !this.underlyingType_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59861L() || this.expandedType_.isInitialized()) {
            for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
                if (!this.annotation_.get(i2).isInitialized()) {
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
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24036b();
    }

    public final C24090h.C24091a toBuilder() {
        C24036b bVar = new C24036b();
        bVar.mo59869j(this);
        return bVar;
    }

    public ProtoBuf$TypeAlias(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$TypeAlias(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo59867R();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                ProtoBuf$Type.C24034b bVar2 = null;
                switch (n) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.bitField0_ |= 1;
                        this.flags_ = cVar.mo60029k();
                        break;
                    case 16:
                        this.bitField0_ |= 2;
                        this.name_ = cVar.mo60029k();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.typeParameter_ = new ArrayList();
                            z2 |= true;
                        }
                        this.typeParameter_.add(cVar.mo60025g(ProtoBuf$TypeParameter.f60963c, dVar));
                        break;
                    case 34:
                        if ((this.bitField0_ & 4) == 4) {
                            ProtoBuf$Type protoBuf$Type = this.underlyingType_;
                            protoBuf$Type.getClass();
                            bVar2 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        }
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo60025g(ProtoBuf$Type.f60927c, dVar);
                        this.underlyingType_ = protoBuf$Type2;
                        if (bVar2 != null) {
                            bVar2.mo59851j(protoBuf$Type2);
                            this.underlyingType_ = bVar2.mo59850i();
                        }
                        this.bitField0_ |= 4;
                        break;
                    case 40:
                        this.bitField0_ |= 8;
                        this.underlyingTypeId_ = cVar.mo60029k();
                        break;
                    case 50:
                        if ((this.bitField0_ & 16) == 16) {
                            ProtoBuf$Type protoBuf$Type3 = this.expandedType_;
                            protoBuf$Type3.getClass();
                            bVar2 = ProtoBuf$Type.m59679j0(protoBuf$Type3);
                        }
                        ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) cVar.mo60025g(ProtoBuf$Type.f60927c, dVar);
                        this.expandedType_ = protoBuf$Type4;
                        if (bVar2 != null) {
                            bVar2.mo59851j(protoBuf$Type4);
                            this.expandedType_ = bVar2.mo59850i();
                        }
                        this.bitField0_ |= 16;
                        break;
                    case 56:
                        this.bitField0_ |= 32;
                        this.expandedTypeId_ = cVar.mo60029k();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.annotation_ = new ArrayList();
                            z2 |= true;
                        }
                        this.annotation_.add(cVar.mo60025g(ProtoBuf$Annotation.f60791c, dVar));
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.versionRequirement_.add(Integer.valueOf(cVar.mo60029k()));
                        break;
                    case 250:
                        int d = cVar.mo60022d(cVar.mo60029k());
                        if (!(z2 & true) && cVar.mo60020b() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        while (cVar.mo60020b() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(cVar.mo60029k()));
                        }
                        cVar.mo60021c(d);
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
                if (z2 & true) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (z2 & true) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
        }
        if (z2 & true) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
