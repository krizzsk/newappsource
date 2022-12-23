package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
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

public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> {

    /* renamed from: b */
    public static final ProtoBuf$Property f60897b;

    /* renamed from: c */
    public static C24021a f60898c = new C24021a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public int oldFlags_;
    /* access modifiers changed from: private */
    public int receiverTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type receiverType_;
    /* access modifiers changed from: private */
    public int returnTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type returnType_;
    /* access modifiers changed from: private */
    public int setterFlags_;
    /* access modifiers changed from: private */
    public ProtoBuf$ValueParameter setterValueParameter_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a */
    public static class C24021a extends C24077b<ProtoBuf$Property> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Property(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$b */
    public static final class C24022b extends GeneratedMessageLite.C24067c<ProtoBuf$Property, C24022b> {

        /* renamed from: e */
        public int f60899e;

        /* renamed from: f */
        public int f60900f = 518;

        /* renamed from: g */
        public int f60901g = 2054;

        /* renamed from: h */
        public int f60902h;

        /* renamed from: i */
        public ProtoBuf$Type f60903i;

        /* renamed from: j */
        public int f60904j;

        /* renamed from: k */
        public List<ProtoBuf$TypeParameter> f60905k;

        /* renamed from: l */
        public ProtoBuf$Type f60906l;

        /* renamed from: m */
        public int f60907m;

        /* renamed from: n */
        public ProtoBuf$ValueParameter f60908n;

        /* renamed from: o */
        public int f60909o;

        /* renamed from: p */
        public int f60910p;

        /* renamed from: q */
        public List<Integer> f60911q;

        public C24022b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
            this.f60903i = protoBuf$Type;
            this.f60905k = Collections.emptyList();
            this.f60906l = protoBuf$Type;
            this.f60908n = ProtoBuf$ValueParameter.f60977b;
            this.f60911q = Collections.emptyList();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59793k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Property i = mo59791i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24022b bVar = new C24022b();
            bVar.mo59792j(mo59791i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24022b bVar = new C24022b();
            bVar.mo59792j(mo59791i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59792j((ProtoBuf$Property) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$Property mo59791i() {
            ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property((GeneratedMessageLite.C24067c) this);
            int i = this.f60899e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Property.flags_ = this.f60900f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Property.oldFlags_ = this.f60901g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Property.name_ = this.f60902h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Property.returnType_ = this.f60903i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Property.returnTypeId_ = this.f60904j;
            if ((this.f60899e & 32) == 32) {
                this.f60905k = Collections.unmodifiableList(this.f60905k);
                this.f60899e &= -33;
            }
            protoBuf$Property.typeParameter_ = this.f60905k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$Property.receiverType_ = this.f60906l;
            if ((i & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                i2 |= 64;
            }
            protoBuf$Property.receiverTypeId_ = this.f60907m;
            if ((i & 256) == 256) {
                i2 |= RecyclerView.C1119a0.FLAG_IGNORE;
            }
            protoBuf$Property.setterValueParameter_ = this.f60908n;
            if ((i & 512) == 512) {
                i2 |= 256;
            }
            protoBuf$Property.getterFlags_ = this.f60909o;
            if ((i & 1024) == 1024) {
                i2 |= 512;
            }
            protoBuf$Property.setterFlags_ = this.f60910p;
            if ((this.f60899e & 2048) == 2048) {
                this.f60911q = Collections.unmodifiableList(this.f60911q);
                this.f60899e &= -2049;
            }
            protoBuf$Property.versionRequirement_ = this.f60911q;
            protoBuf$Property.bitField0_ = i2;
            return protoBuf$Property;
        }

        /* renamed from: j */
        public final void mo59792j(ProtoBuf$Property protoBuf$Property) {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Property != ProtoBuf$Property.f60897b) {
                if (protoBuf$Property.mo59780Q()) {
                    int F = protoBuf$Property.mo59769F();
                    this.f60899e |= 1;
                    this.f60900f = F;
                }
                if (protoBuf$Property.mo59783T()) {
                    int I = protoBuf$Property.mo59772I();
                    this.f60899e |= 2;
                    this.f60901g = I;
                }
                if (protoBuf$Property.mo59782S()) {
                    int H = protoBuf$Property.mo59771H();
                    this.f60899e |= 4;
                    this.f60902h = H;
                }
                if (protoBuf$Property.mo59786W()) {
                    ProtoBuf$Type L = protoBuf$Property.mo59775L();
                    if ((this.f60899e & 8) != 8 || (protoBuf$Type2 = this.f60903i) == ProtoBuf$Type.f60926b) {
                        this.f60903i = L;
                    } else {
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type2);
                        j0.mo59851j(L);
                        this.f60903i = j0.mo59850i();
                    }
                    this.f60899e |= 8;
                }
                if (protoBuf$Property.mo59787X()) {
                    int M = protoBuf$Property.mo59776M();
                    this.f60899e |= 16;
                    this.f60904j = M;
                }
                if (!protoBuf$Property.typeParameter_.isEmpty()) {
                    if (this.f60905k.isEmpty()) {
                        this.f60905k = protoBuf$Property.typeParameter_;
                        this.f60899e &= -33;
                    } else {
                        if ((this.f60899e & 32) != 32) {
                            this.f60905k = new ArrayList(this.f60905k);
                            this.f60899e |= 32;
                        }
                        this.f60905k.addAll(protoBuf$Property.typeParameter_);
                    }
                }
                if (protoBuf$Property.mo59784U()) {
                    ProtoBuf$Type J = protoBuf$Property.mo59773J();
                    if ((this.f60899e & 64) != 64 || (protoBuf$Type = this.f60906l) == ProtoBuf$Type.f60926b) {
                        this.f60906l = J;
                    } else {
                        ProtoBuf$Type.C24034b j02 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j02.mo59851j(J);
                        this.f60906l = j02.mo59850i();
                    }
                    this.f60899e |= 64;
                }
                if (protoBuf$Property.mo59785V()) {
                    int K = protoBuf$Property.mo59774K();
                    this.f60899e |= RecyclerView.C1119a0.FLAG_IGNORE;
                    this.f60907m = K;
                }
                if (protoBuf$Property.mo59789Z()) {
                    ProtoBuf$ValueParameter O = protoBuf$Property.mo59778O();
                    if ((this.f60899e & 256) != 256 || (protoBuf$ValueParameter = this.f60908n) == ProtoBuf$ValueParameter.f60977b) {
                        this.f60908n = O;
                    } else {
                        ProtoBuf$ValueParameter.C24043b bVar = new ProtoBuf$ValueParameter.C24043b();
                        bVar.mo59904j(protoBuf$ValueParameter);
                        bVar.mo59904j(O);
                        this.f60908n = bVar.mo59903i();
                    }
                    this.f60899e |= 256;
                }
                if (protoBuf$Property.mo59781R()) {
                    int G = protoBuf$Property.mo59770G();
                    this.f60899e |= 512;
                    this.f60909o = G;
                }
                if (protoBuf$Property.mo59788Y()) {
                    int N = protoBuf$Property.mo59777N();
                    this.f60899e |= 1024;
                    this.f60910p = N;
                }
                if (!protoBuf$Property.versionRequirement_.isEmpty()) {
                    if (this.f60911q.isEmpty()) {
                        this.f60911q = protoBuf$Property.versionRequirement_;
                        this.f60899e &= -2049;
                    } else {
                        if ((this.f60899e & 2048) != 2048) {
                            this.f60911q = new ArrayList(this.f60911q);
                            this.f60899e |= 2048;
                        }
                        this.f60911q.addAll(protoBuf$Property.versionRequirement_);
                    }
                }
                mo59999h(protoBuf$Property);
                this.f61054b = this.f61054b.mo61617b(protoBuf$Property.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59793k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Property protoBuf$Property;
            try {
                ProtoBuf$Property.f60898c.getClass();
                mo59792j(new ProtoBuf$Property(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Property = (ProtoBuf$Property) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Property != null) {
                mo59792j(protoBuf$Property);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59793k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(0);
        f60897b = protoBuf$Property;
        protoBuf$Property.mo59790a0();
    }

    public ProtoBuf$Property() {
        throw null;
    }

    public ProtoBuf$Property(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: F */
    public final int mo59769F() {
        return this.flags_;
    }

    /* renamed from: G */
    public final int mo59770G() {
        return this.getterFlags_;
    }

    /* renamed from: H */
    public final int mo59771H() {
        return this.name_;
    }

    /* renamed from: I */
    public final int mo59772I() {
        return this.oldFlags_;
    }

    /* renamed from: J */
    public final ProtoBuf$Type mo59773J() {
        return this.receiverType_;
    }

    /* renamed from: K */
    public final int mo59774K() {
        return this.receiverTypeId_;
    }

    /* renamed from: L */
    public final ProtoBuf$Type mo59775L() {
        return this.returnType_;
    }

    /* renamed from: M */
    public final int mo59776M() {
        return this.returnTypeId_;
    }

    /* renamed from: N */
    public final int mo59777N() {
        return this.setterFlags_;
    }

    /* renamed from: O */
    public final ProtoBuf$ValueParameter mo59778O() {
        return this.setterValueParameter_;
    }

    /* renamed from: P */
    public final List<ProtoBuf$TypeParameter> mo59779P() {
        return this.typeParameter_;
    }

    /* renamed from: Q */
    public final boolean mo59780Q() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: R */
    public final boolean mo59781R() {
        return (this.bitField0_ & 256) == 256;
    }

    /* renamed from: S */
    public final boolean mo59782S() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: T */
    public final boolean mo59783T() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: U */
    public final boolean mo59784U() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: V */
    public final boolean mo59785V() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: W */
    public final boolean mo59786W() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: X */
    public final boolean mo59787X() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: Y */
    public final boolean mo59788Y() {
        return (this.bitField0_ & 512) == 512;
    }

    /* renamed from: Z */
    public final boolean mo59789Z() {
        return (this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage.C24064a aVar = new GeneratedMessageLite.ExtendableMessage.C24064a(this);
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59976m(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59978o(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.mo59978o(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo59978o(5, this.receiverType_);
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            codedOutputStream.mo59978o(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo59976m(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            codedOutputStream.mo59976m(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59976m(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo59976m(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
            codedOutputStream.mo59976m(31, this.versionRequirement_.get(i2).intValue());
        }
        aVar.mo59998a(19000, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: a0 */
    public final void mo59790a0() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
        this.returnType_ = protoBuf$Type;
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.receiverType_ = protoBuf$Type;
        this.receiverTypeId_ = 0;
        this.setterValueParameter_ = ProtoBuf$ValueParameter.f60977b;
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = Collections.emptyList();
    }

    public final C24090h getDefaultInstanceForType() {
        return f60897b;
    }

    public final int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 2) == 2) {
            i = CodedOutputStream.m60026b(1, this.oldFlags_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60026b(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m60028d(3, this.returnType_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            i += CodedOutputStream.m60028d(4, this.typeParameter_.get(i3));
        }
        if ((this.bitField0_ & 32) == 32) {
            i += CodedOutputStream.m60028d(5, this.receiverType_);
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            i += CodedOutputStream.m60028d(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            i += CodedOutputStream.m60026b(7, this.getterFlags_);
        }
        if ((this.bitField0_ & 512) == 512) {
            i += CodedOutputStream.m60026b(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m60026b(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i += CodedOutputStream.m60026b(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            i += CodedOutputStream.m60026b(11, this.flags_);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            i4 += CodedOutputStream.m60027c(this.versionRequirement_.get(i5).intValue());
        }
        int size = (this.versionRequirement_.size() * 2) + i + i4;
        int size2 = this.unknownFields.size() + mo59989f() + size;
        this.memoizedSerializedSize = size2;
        return size2;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo59782S()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59786W() || this.returnType_.isInitialized()) {
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                if (!this.typeParameter_.get(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (mo59784U() && !this.receiverType_.isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (mo59789Z() && !this.setterValueParameter_.isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!mo59988e()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24022b();
    }

    public final C24090h.C24091a toBuilder() {
        C24022b bVar = new C24022b();
        bVar.mo59792j(this);
        return bVar;
    }

    public ProtoBuf$Property(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Property(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r11, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.memoizedIsInitialized = r0
            r10.memoizedSerializedSize = r0
            r10.mo59790a0()
            vg0.a$b r0 = new vg0.a$b
            r0.<init>()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m60033j(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0017:
            r5 = 32
            r6 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x01c4
            int r7 = r11.mo60032n()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r8 = 0
            switch(r7) {
                case 0: goto L_0x0181;
                case 8: goto L_0x0171;
                case 16: goto L_0x0163;
                case 26: goto L_0x0137;
                case 34: goto L_0x011d;
                case 42: goto L_0x00f3;
                case 50: goto L_0x00bc;
                case 56: goto L_0x00ae;
                case 64: goto L_0x00a0;
                case 72: goto L_0x0092;
                case 80: goto L_0x0085;
                case 88: goto L_0x0079;
                case 248: goto L_0x005e;
                case 250: goto L_0x002b;
                default: goto L_0x0025;
            }     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
        L_0x0025:
            boolean r5 = r10.mo59996m(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x017f
        L_0x002b:
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60022d(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r8 = r4 & 2048(0x800, float:2.87E-42)
            if (r8 == r6) goto L_0x0046
            int r8 = r11.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            if (r8 <= 0) goto L_0x0046
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.versionRequirement_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r4 = r4 | 2048(0x800, float:2.87E-42)
        L_0x0046:
            int r8 = r11.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            if (r8 <= 0) goto L_0x005a
            java.util.List<java.lang.Integer> r8 = r10.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r9 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0046
        L_0x005a:
            r11.mo60021c(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x005e:
            r7 = r4 & 2048(0x800, float:2.87E-42)
            if (r7 == r6) goto L_0x006b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.versionRequirement_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r4 = r4 | 2048(0x800, float:2.87E-42)
        L_0x006b:
            java.util.List<java.lang.Integer> r7 = r10.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r8 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x0079:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | r1
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.flags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x0085:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | 64
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.receiverTypeId_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x0092:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | 16
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.returnTypeId_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x00a0:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | 512(0x200, float:7.175E-43)
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.setterFlags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x00ae:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.getterFlags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x00bc:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r9 = 128(0x80, float:1.794E-43)
            r7 = r7 & r9
            if (r7 != r9) goto L_0x00d7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = r10.setterValueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b r8 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r8.mo59904j(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x00d7
        L_0x00d1:
            r11 = move-exception
            goto L_0x0196
        L_0x00d4:
            r11 = move-exception
            goto L_0x0184
        L_0x00d7:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.f60978c     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo60025g(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.setterValueParameter_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            if (r8 == 0) goto L_0x00ec
            r8.mo59904j(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r7 = r8.mo59903i()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.setterValueParameter_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
        L_0x00ec:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | r9
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x00f3:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 & r5
            if (r7 != r5) goto L_0x0101
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r10.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.m59679j0(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
        L_0x0101:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.f60927c     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo60025g(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.receiverType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            if (r8 == 0) goto L_0x0116
            r8.mo59851j(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r8.mo59850i()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.receiverType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
        L_0x0116:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | r5
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x011d:
            r7 = r4 & 32
            if (r7 == r5) goto L_0x012a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.typeParameter_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r4 = r4 | 32
        L_0x012a:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r7 = r10.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.f60963c     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo60025g(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x0137:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r9 = 8
            r7 = r7 & r9
            if (r7 != r9) goto L_0x0147
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r10.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.m59679j0(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
        L_0x0147:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.f60927c     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo60025g(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.returnType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            if (r8 == 0) goto L_0x015c
            r8.mo59851j(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r8.mo59850i()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.returnType_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
        L_0x015c:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | r9
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x0163:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | 4
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.name_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x0171:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r7 = r7 | 2
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            int r7 = r11.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            r10.oldFlags_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x0191, IOException -> 0x00d4 }
            goto L_0x0017
        L_0x017f:
            if (r5 != 0) goto L_0x0017
        L_0x0181:
            r3 = 1
            goto L_0x0017
        L_0x0184:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00d1 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00d1 }
            r12.<init>(r11)     // Catch:{ all -> 0x00d1 }
            r12.mo60010b(r10)     // Catch:{ all -> 0x00d1 }
            throw r12     // Catch:{ all -> 0x00d1 }
        L_0x0191:
            r11 = move-exception
            r11.mo60010b(r10)     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x0196:
            r12 = r4 & 32
            if (r12 != r5) goto L_0x01a2
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = r10.typeParameter_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.typeParameter_ = r12
        L_0x01a2:
            r12 = r4 & 2048(0x800, float:2.87E-42)
            if (r12 != r6) goto L_0x01ae
            java.util.List<java.lang.Integer> r12 = r10.versionRequirement_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.versionRequirement_ = r12
        L_0x01ae:
            r2.mo59973i()     // Catch:{ IOException -> 0x01ba, all -> 0x01b2 }
            goto L_0x01ba
        L_0x01b2:
            r11 = move-exception
            vg0.a r12 = r0.mo61632i()
            r10.unknownFields = r12
            throw r11
        L_0x01ba:
            vg0.a r12 = r0.mo61632i()
            r10.unknownFields = r12
            r10.mo59994k()
            throw r11
        L_0x01c4:
            r11 = r4 & 32
            if (r11 != r5) goto L_0x01d0
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = r10.typeParameter_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.typeParameter_ = r11
        L_0x01d0:
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 != r6) goto L_0x01dc
            java.util.List<java.lang.Integer> r11 = r10.versionRequirement_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.versionRequirement_ = r11
        L_0x01dc:
            r2.mo59973i()     // Catch:{ IOException -> 0x01e8, all -> 0x01e0 }
            goto L_0x01e8
        L_0x01e0:
            r11 = move-exception
            vg0.a r12 = r0.mo61632i()
            r10.unknownFields = r12
            throw r11
        L_0x01e8:
            vg0.a r11 = r0.mo61632i()
            r10.unknownFields = r11
            r10.mo59994k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
