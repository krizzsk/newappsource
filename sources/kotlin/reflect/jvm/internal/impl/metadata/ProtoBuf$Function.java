package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
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

public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> {

    /* renamed from: b */
    public static final ProtoBuf$Function f60867b;

    /* renamed from: c */
    public static C24013a f60868c = new C24013a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public ProtoBuf$Contract contract_;
    /* access modifiers changed from: private */
    public int flags_;
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
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public ProtoBuf$TypeTable typeTable_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public List<ProtoBuf$ValueParameter> valueParameter_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a */
    public static class C24013a extends C24077b<ProtoBuf$Function> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Function(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$b */
    public static final class C24014b extends GeneratedMessageLite.C24067c<ProtoBuf$Function, C24014b> {

        /* renamed from: e */
        public int f60869e;

        /* renamed from: f */
        public int f60870f = 6;

        /* renamed from: g */
        public int f60871g = 6;

        /* renamed from: h */
        public int f60872h;

        /* renamed from: i */
        public ProtoBuf$Type f60873i;

        /* renamed from: j */
        public int f60874j;

        /* renamed from: k */
        public List<ProtoBuf$TypeParameter> f60875k;

        /* renamed from: l */
        public ProtoBuf$Type f60876l;

        /* renamed from: m */
        public int f60877m;

        /* renamed from: n */
        public List<ProtoBuf$ValueParameter> f60878n;

        /* renamed from: o */
        public ProtoBuf$TypeTable f60879o;

        /* renamed from: p */
        public List<Integer> f60880p;

        /* renamed from: q */
        public ProtoBuf$Contract f60881q;

        public C24014b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
            this.f60873i = protoBuf$Type;
            this.f60875k = Collections.emptyList();
            this.f60876l = protoBuf$Type;
            this.f60878n = Collections.emptyList();
            this.f60879o = ProtoBuf$TypeTable.f60972b;
            this.f60880p = Collections.emptyList();
            this.f60881q = ProtoBuf$Contract.f60842b;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59748k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Function i = mo59746i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24014b bVar = new C24014b();
            bVar.mo59747j(mo59746i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24014b bVar = new C24014b();
            bVar.mo59747j(mo59746i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59747j((ProtoBuf$Function) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$Function mo59746i() {
            ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function((GeneratedMessageLite.C24067c) this);
            int i = this.f60869e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Function.flags_ = this.f60870f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Function.oldFlags_ = this.f60871g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Function.name_ = this.f60872h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Function.returnType_ = this.f60873i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Function.returnTypeId_ = this.f60874j;
            if ((this.f60869e & 32) == 32) {
                this.f60875k = Collections.unmodifiableList(this.f60875k);
                this.f60869e &= -33;
            }
            protoBuf$Function.typeParameter_ = this.f60875k;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$Function.receiverType_ = this.f60876l;
            if ((i & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                i2 |= 64;
            }
            protoBuf$Function.receiverTypeId_ = this.f60877m;
            if ((this.f60869e & 256) == 256) {
                this.f60878n = Collections.unmodifiableList(this.f60878n);
                this.f60869e &= -257;
            }
            protoBuf$Function.valueParameter_ = this.f60878n;
            if ((i & 512) == 512) {
                i2 |= RecyclerView.C1119a0.FLAG_IGNORE;
            }
            protoBuf$Function.typeTable_ = this.f60879o;
            if ((this.f60869e & 1024) == 1024) {
                this.f60880p = Collections.unmodifiableList(this.f60880p);
                this.f60869e &= -1025;
            }
            protoBuf$Function.versionRequirement_ = this.f60880p;
            if ((i & 2048) == 2048) {
                i2 |= 256;
            }
            protoBuf$Function.contract_ = this.f60881q;
            protoBuf$Function.bitField0_ = i2;
            return protoBuf$Function;
        }

        /* renamed from: j */
        public final void mo59747j(ProtoBuf$Function protoBuf$Function) {
            ProtoBuf$Contract protoBuf$Contract;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Function != ProtoBuf$Function.f60867b) {
                if (protoBuf$Function.mo59737S()) {
                    int H = protoBuf$Function.mo59726H();
                    this.f60869e |= 1;
                    this.f60870f = H;
                }
                if (protoBuf$Function.mo59739U()) {
                    int J = protoBuf$Function.mo59728J();
                    this.f60869e |= 2;
                    this.f60871g = J;
                }
                if (protoBuf$Function.mo59738T()) {
                    int I = protoBuf$Function.mo59727I();
                    this.f60869e |= 4;
                    this.f60872h = I;
                }
                if (protoBuf$Function.mo59742X()) {
                    ProtoBuf$Type M = protoBuf$Function.mo59731M();
                    if ((this.f60869e & 8) != 8 || (protoBuf$Type2 = this.f60873i) == ProtoBuf$Type.f60926b) {
                        this.f60873i = M;
                    } else {
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type2);
                        j0.mo59851j(M);
                        this.f60873i = j0.mo59850i();
                    }
                    this.f60869e |= 8;
                }
                if (protoBuf$Function.mo59743Y()) {
                    int N = protoBuf$Function.mo59732N();
                    this.f60869e |= 16;
                    this.f60874j = N;
                }
                if (!protoBuf$Function.typeParameter_.isEmpty()) {
                    if (this.f60875k.isEmpty()) {
                        this.f60875k = protoBuf$Function.typeParameter_;
                        this.f60869e &= -33;
                    } else {
                        if ((this.f60869e & 32) != 32) {
                            this.f60875k = new ArrayList(this.f60875k);
                            this.f60869e |= 32;
                        }
                        this.f60875k.addAll(protoBuf$Function.typeParameter_);
                    }
                }
                if (protoBuf$Function.mo59740V()) {
                    ProtoBuf$Type K = protoBuf$Function.mo59729K();
                    if ((this.f60869e & 64) != 64 || (protoBuf$Type = this.f60876l) == ProtoBuf$Type.f60926b) {
                        this.f60876l = K;
                    } else {
                        ProtoBuf$Type.C24034b j02 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j02.mo59851j(K);
                        this.f60876l = j02.mo59850i();
                    }
                    this.f60869e |= 64;
                }
                if (protoBuf$Function.mo59741W()) {
                    int L = protoBuf$Function.mo59730L();
                    this.f60869e |= RecyclerView.C1119a0.FLAG_IGNORE;
                    this.f60877m = L;
                }
                if (!protoBuf$Function.valueParameter_.isEmpty()) {
                    if (this.f60878n.isEmpty()) {
                        this.f60878n = protoBuf$Function.valueParameter_;
                        this.f60869e &= -257;
                    } else {
                        if ((this.f60869e & 256) != 256) {
                            this.f60878n = new ArrayList(this.f60878n);
                            this.f60869e |= 256;
                        }
                        this.f60878n.addAll(protoBuf$Function.valueParameter_);
                    }
                }
                if (protoBuf$Function.mo59744Z()) {
                    ProtoBuf$TypeTable P = protoBuf$Function.mo59734P();
                    if ((this.f60869e & 512) != 512 || (protoBuf$TypeTable = this.f60879o) == ProtoBuf$TypeTable.f60972b) {
                        this.f60879o = P;
                    } else {
                        ProtoBuf$TypeTable.C24041b l = ProtoBuf$TypeTable.m59824l(protoBuf$TypeTable);
                        l.mo59889i(P);
                        this.f60879o = l.mo59888h();
                    }
                    this.f60869e |= 512;
                }
                if (!protoBuf$Function.versionRequirement_.isEmpty()) {
                    if (this.f60880p.isEmpty()) {
                        this.f60880p = protoBuf$Function.versionRequirement_;
                        this.f60869e &= -1025;
                    } else {
                        if ((this.f60869e & 1024) != 1024) {
                            this.f60880p = new ArrayList(this.f60880p);
                            this.f60869e |= 1024;
                        }
                        this.f60880p.addAll(protoBuf$Function.versionRequirement_);
                    }
                }
                if (protoBuf$Function.mo59736R()) {
                    ProtoBuf$Contract G = protoBuf$Function.mo59725G();
                    if ((this.f60869e & 2048) != 2048 || (protoBuf$Contract = this.f60881q) == ProtoBuf$Contract.f60842b) {
                        this.f60881q = G;
                    } else {
                        ProtoBuf$Contract.C24003b bVar = new ProtoBuf$Contract.C24003b();
                        bVar.mo59697i(protoBuf$Contract);
                        bVar.mo59697i(G);
                        this.f60881q = bVar.mo59696h();
                    }
                    this.f60869e |= 2048;
                }
                mo59999h(protoBuf$Function);
                this.f61054b = this.f61054b.mo61617b(protoBuf$Function.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59748k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Function protoBuf$Function;
            try {
                ProtoBuf$Function.f60868c.getClass();
                mo59747j(new ProtoBuf$Function(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Function = (ProtoBuf$Function) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Function != null) {
                mo59747j(protoBuf$Function);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59748k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(0);
        f60867b = protoBuf$Function;
        protoBuf$Function.mo59745a0();
    }

    public ProtoBuf$Function() {
        throw null;
    }

    public ProtoBuf$Function(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: G */
    public final ProtoBuf$Contract mo59725G() {
        return this.contract_;
    }

    /* renamed from: H */
    public final int mo59726H() {
        return this.flags_;
    }

    /* renamed from: I */
    public final int mo59727I() {
        return this.name_;
    }

    /* renamed from: J */
    public final int mo59728J() {
        return this.oldFlags_;
    }

    /* renamed from: K */
    public final ProtoBuf$Type mo59729K() {
        return this.receiverType_;
    }

    /* renamed from: L */
    public final int mo59730L() {
        return this.receiverTypeId_;
    }

    /* renamed from: M */
    public final ProtoBuf$Type mo59731M() {
        return this.returnType_;
    }

    /* renamed from: N */
    public final int mo59732N() {
        return this.returnTypeId_;
    }

    /* renamed from: O */
    public final List<ProtoBuf$TypeParameter> mo59733O() {
        return this.typeParameter_;
    }

    /* renamed from: P */
    public final ProtoBuf$TypeTable mo59734P() {
        return this.typeTable_;
    }

    /* renamed from: Q */
    public final List<ProtoBuf$ValueParameter> mo59735Q() {
        return this.valueParameter_;
    }

    /* renamed from: R */
    public final boolean mo59736R() {
        return (this.bitField0_ & 256) == 256;
    }

    /* renamed from: S */
    public final boolean mo59737S() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: T */
    public final boolean mo59738T() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: U */
    public final boolean mo59739U() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: V */
    public final boolean mo59740V() {
        return (this.bitField0_ & 32) == 32;
    }

    /* renamed from: W */
    public final boolean mo59741W() {
        return (this.bitField0_ & 64) == 64;
    }

    /* renamed from: X */
    public final boolean mo59742X() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: Y */
    public final boolean mo59743Y() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: Z */
    public final boolean mo59744Z() {
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            codedOutputStream.mo59978o(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59976m(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo59976m(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(9, this.flags_);
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            codedOutputStream.mo59978o(30, this.typeTable_);
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            codedOutputStream.mo59976m(31, this.versionRequirement_.get(i3).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo59978o(32, this.contract_);
        }
        aVar.mo59998a(19000, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: a0 */
    public final void mo59745a0() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
        this.name_ = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
        this.returnType_ = protoBuf$Type;
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.receiverType_ = protoBuf$Type;
        this.receiverTypeId_ = 0;
        this.valueParameter_ = Collections.emptyList();
        this.typeTable_ = ProtoBuf$TypeTable.f60972b;
        this.versionRequirement_ = Collections.emptyList();
        this.contract_ = ProtoBuf$Contract.f60842b;
    }

    public final C24090h getDefaultInstanceForType() {
        return f60867b;
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
        for (int i4 = 0; i4 < this.valueParameter_.size(); i4++) {
            i += CodedOutputStream.m60028d(6, this.valueParameter_.get(i4));
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m60026b(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i += CodedOutputStream.m60026b(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            i += CodedOutputStream.m60026b(9, this.flags_);
        }
        if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            i += CodedOutputStream.m60028d(30, this.typeTable_);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
            i5 += CodedOutputStream.m60027c(this.versionRequirement_.get(i6).intValue());
        }
        int size = (this.versionRequirement_.size() * 2) + i + i5;
        if ((this.bitField0_ & 256) == 256) {
            size += CodedOutputStream.m60028d(32, this.contract_);
        }
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
        if (!mo59738T()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!mo59742X() || this.returnType_.isInitialized()) {
            for (int i = 0; i < this.typeParameter_.size(); i++) {
                if (!this.typeParameter_.get(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!mo59740V() || this.receiverType_.isInitialized()) {
                for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
                    if (!this.valueParameter_.get(i2).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (mo59744Z() && !this.typeTable_.isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (mo59736R() && !this.contract_.isInitialized()) {
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
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24014b();
    }

    public final C24090h.C24091a toBuilder() {
        C24014b bVar = new C24014b();
        bVar.mo59747j(this);
        return bVar;
    }

    public ProtoBuf$Function(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Function(kotlin.reflect.jvm.internal.impl.protobuf.C24078c r12, kotlin.reflect.jvm.internal.impl.protobuf.C24079d r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r11 = this;
            r11.<init>()
            r0 = -1
            r11.memoizedIsInitialized = r0
            r11.memoizedSerializedSize = r0
            r11.mo59745a0()
            vg0.a$b r0 = new vg0.a$b
            r0.<init>()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m60033j(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0017:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 32
            r7 = 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x01fc
            int r8 = r12.mo60032n()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r9 = 0
            switch(r8) {
                case 0: goto L_0x01ad;
                case 8: goto L_0x019d;
                case 16: goto L_0x018f;
                case 26: goto L_0x0163;
                case 34: goto L_0x0149;
                case 42: goto L_0x011f;
                case 50: goto L_0x0105;
                case 56: goto L_0x00f7;
                case 64: goto L_0x00e9;
                case 72: goto L_0x00dc;
                case 242: goto L_0x00b0;
                case 248: goto L_0x0094;
                case 250: goto L_0x0061;
                case 258: goto L_0x002d;
                default: goto L_0x0027;
            }     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x0027:
            boolean r5 = r11.mo59996m(r12, r2, r13, r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x01ab
        L_0x002d:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 & r5
            if (r8 != r5) goto L_0x0046
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r8 = r11.contract_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b r9 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r9.mo59697i(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0046
        L_0x0040:
            r12 = move-exception
            goto L_0x01c2
        L_0x0043:
            r12 = move-exception
            goto L_0x01b0
        L_0x0046:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract.f60843c     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r12.mo60025g(r8, r13)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract) r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.contract_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            if (r9 == 0) goto L_0x005b
            r9.mo59697i(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r8 = r9.mo59696h()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.contract_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x005b:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | r5
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x0061:
            int r8 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r8 = r12.mo60022d(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r9 = r4 & 1024(0x400, float:1.435E-42)
            if (r9 == r7) goto L_0x007c
            int r9 = r12.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            if (r9 <= 0) goto L_0x007c
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.versionRequirement_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x007c:
            int r9 = r12.mo60020b()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            if (r9 <= 0) goto L_0x0090
            java.util.List<java.lang.Integer> r9 = r11.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r10 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x007c
        L_0x0090:
            r12.mo60021c(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x0094:
            r8 = r4 & 1024(0x400, float:1.435E-42)
            if (r8 == r7) goto L_0x00a1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.versionRequirement_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x00a1:
            java.util.List<java.lang.Integer> r8 = r11.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r9 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x00b0:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r10 = 128(0x80, float:1.794E-43)
            r8 = r8 & r10
            if (r8 != r10) goto L_0x00c0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r8 = r11.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.m59824l(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x00c0:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.f60973c     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r12.mo60025g(r8, r13)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.typeTable_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            if (r9 == 0) goto L_0x00d5
            r9.mo59889i(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r8 = r9.mo59888h()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.typeTable_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x00d5:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | r10
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x00dc:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | r1
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r8 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.flags_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x00e9:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | 64
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r8 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.receiverTypeId_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x00f7:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | 16
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r8 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.returnTypeId_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x0105:
            r8 = r4 & 256(0x100, float:3.59E-43)
            if (r8 == r5) goto L_0x0112
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.valueParameter_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x0112:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r8 = r11.valueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.f60978c     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r9 = r12.mo60025g(r9, r13)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x011f:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 & r6
            if (r8 != r6) goto L_0x012d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r11.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.m59679j0(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x012d:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.f60927c     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r12.mo60025g(r8, r13)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.receiverType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            if (r9 == 0) goto L_0x0142
            r9.mo59851j(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r9.mo59850i()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.receiverType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x0142:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | r6
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x0149:
            r8 = r4 & 32
            if (r8 == r6) goto L_0x0156
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.typeParameter_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r4 = r4 | 32
        L_0x0156:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r8 = r11.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.f60963c     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r9 = r12.mo60025g(r9, r13)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x0163:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r10 = 8
            r8 = r8 & r10
            if (r8 != r10) goto L_0x0173
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r11.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8.getClass()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.m59679j0(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x0173:
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.f60927c     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r12.mo60025g(r8, r13)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.returnType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            if (r9 == 0) goto L_0x0188
            r9.mo59851j(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r8 = r9.mo59850i()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.returnType_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
        L_0x0188:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | r10
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x018f:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | 4
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r8 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.name_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x019d:
            int r8 = r11.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r8 = r8 | 2
            r11.bitField0_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            int r8 = r12.mo60029k()     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            r11.oldFlags_ = r8     // Catch:{ InvalidProtocolBufferException -> 0x01bd, IOException -> 0x0043 }
            goto L_0x0017
        L_0x01ab:
            if (r5 != 0) goto L_0x0017
        L_0x01ad:
            r3 = 1
            goto L_0x0017
        L_0x01b0:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0040 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0040 }
            r13.<init>(r12)     // Catch:{ all -> 0x0040 }
            r13.mo60010b(r11)     // Catch:{ all -> 0x0040 }
            throw r13     // Catch:{ all -> 0x0040 }
        L_0x01bd:
            r12 = move-exception
            r12.mo60010b(r11)     // Catch:{ all -> 0x0040 }
            throw r12     // Catch:{ all -> 0x0040 }
        L_0x01c2:
            r13 = r4 & 32
            if (r13 != r6) goto L_0x01ce
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r13 = r11.typeParameter_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.typeParameter_ = r13
        L_0x01ce:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L_0x01da
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r13 = r11.valueParameter_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.valueParameter_ = r13
        L_0x01da:
            r13 = r4 & 1024(0x400, float:1.435E-42)
            if (r13 != r7) goto L_0x01e6
            java.util.List<java.lang.Integer> r13 = r11.versionRequirement_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.versionRequirement_ = r13
        L_0x01e6:
            r2.mo59973i()     // Catch:{ IOException -> 0x01f2, all -> 0x01ea }
            goto L_0x01f2
        L_0x01ea:
            r12 = move-exception
            vg0.a r13 = r0.mo61632i()
            r11.unknownFields = r13
            throw r12
        L_0x01f2:
            vg0.a r13 = r0.mo61632i()
            r11.unknownFields = r13
            r11.mo59994k()
            throw r12
        L_0x01fc:
            r12 = r4 & 32
            if (r12 != r6) goto L_0x0208
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = r11.typeParameter_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.typeParameter_ = r12
        L_0x0208:
            r12 = r4 & 256(0x100, float:3.59E-43)
            if (r12 != r5) goto L_0x0214
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r12 = r11.valueParameter_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.valueParameter_ = r12
        L_0x0214:
            r12 = r4 & 1024(0x400, float:1.435E-42)
            if (r12 != r7) goto L_0x0220
            java.util.List<java.lang.Integer> r12 = r11.versionRequirement_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.versionRequirement_ = r12
        L_0x0220:
            r2.mo59973i()     // Catch:{ IOException -> 0x022c, all -> 0x0224 }
            goto L_0x022c
        L_0x0224:
            r12 = move-exception
            vg0.a r13 = r0.mo61632i()
            r11.unknownFields = r13
            throw r12
        L_0x022c:
            vg0.a r12 = r0.mo61632i()
            r11.unknownFields = r12
            r11.mo59994k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
