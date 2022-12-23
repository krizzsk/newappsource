package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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

public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {

    /* renamed from: b */
    public static final ProtoBuf$ValueParameter f60977b;

    /* renamed from: c */
    public static C24042a f60978c = new C24042a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public int typeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type type_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public int varargElementTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type varargElementType_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a */
    public static class C24042a extends C24077b<ProtoBuf$ValueParameter> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$ValueParameter(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b */
    public static final class C24043b extends GeneratedMessageLite.C24067c<ProtoBuf$ValueParameter, C24043b> {

        /* renamed from: e */
        public int f60979e;

        /* renamed from: f */
        public int f60980f;

        /* renamed from: g */
        public int f60981g;

        /* renamed from: h */
        public ProtoBuf$Type f60982h;

        /* renamed from: i */
        public int f60983i;

        /* renamed from: j */
        public ProtoBuf$Type f60984j;

        /* renamed from: k */
        public int f60985k;

        public C24043b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
            this.f60982h = protoBuf$Type;
            this.f60984j = protoBuf$Type;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59905k(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$ValueParameter i = mo59903i();
            if (i.isInitialized()) {
                return i;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24043b bVar = new C24043b();
            bVar.mo59904j(mo59903i());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24043b bVar = new C24043b();
            bVar.mo59904j(mo59903i());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59904j((ProtoBuf$ValueParameter) generatedMessageLite);
            return this;
        }

        /* renamed from: i */
        public final ProtoBuf$ValueParameter mo59903i() {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter((GeneratedMessageLite.C24067c) this);
            int i = this.f60979e;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$ValueParameter.flags_ = this.f60980f;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$ValueParameter.name_ = this.f60981g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$ValueParameter.type_ = this.f60982h;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$ValueParameter.typeId_ = this.f60983i;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$ValueParameter.varargElementType_ = this.f60984j;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            protoBuf$ValueParameter.varargElementTypeId_ = this.f60985k;
            protoBuf$ValueParameter.bitField0_ = i2;
            return protoBuf$ValueParameter;
        }

        /* renamed from: j */
        public final void mo59904j(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$ValueParameter != ProtoBuf$ValueParameter.f60977b) {
                if (protoBuf$ValueParameter.mo59894D()) {
                    int x = protoBuf$ValueParameter.mo59900x();
                    this.f60979e |= 1;
                    this.f60980f = x;
                }
                if (protoBuf$ValueParameter.mo59895E()) {
                    int y = protoBuf$ValueParameter.mo59901y();
                    this.f60979e |= 2;
                    this.f60981g = y;
                }
                if (protoBuf$ValueParameter.mo59896F()) {
                    ProtoBuf$Type z = protoBuf$ValueParameter.mo59902z();
                    if ((this.f60979e & 4) != 4 || (protoBuf$Type2 = this.f60982h) == ProtoBuf$Type.f60926b) {
                        this.f60982h = z;
                    } else {
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type2);
                        j0.mo59851j(z);
                        this.f60982h = j0.mo59850i();
                    }
                    this.f60979e |= 4;
                }
                if (protoBuf$ValueParameter.mo59897G()) {
                    int A = protoBuf$ValueParameter.mo59891A();
                    this.f60979e |= 8;
                    this.f60983i = A;
                }
                if (protoBuf$ValueParameter.mo59898H()) {
                    ProtoBuf$Type B = protoBuf$ValueParameter.mo59892B();
                    if ((this.f60979e & 16) != 16 || (protoBuf$Type = this.f60984j) == ProtoBuf$Type.f60926b) {
                        this.f60984j = B;
                    } else {
                        ProtoBuf$Type.C24034b j02 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j02.mo59851j(B);
                        this.f60984j = j02.mo59850i();
                    }
                    this.f60979e |= 16;
                }
                if (protoBuf$ValueParameter.mo59899I()) {
                    int C = protoBuf$ValueParameter.mo59893C();
                    this.f60979e |= 32;
                    this.f60985k = C;
                }
                mo59999h(protoBuf$ValueParameter);
                this.f61054b = this.f61054b.mo61617b(protoBuf$ValueParameter.unknownFields);
            }
        }

        /* renamed from: k */
        public final void mo59905k(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            try {
                ProtoBuf$ValueParameter.f60978c.getClass();
                mo59904j(new ProtoBuf$ValueParameter(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$ValueParameter = (ProtoBuf$ValueParameter) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$ValueParameter != null) {
                mo59904j(protoBuf$ValueParameter);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59905k(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(0);
        f60977b = protoBuf$ValueParameter;
        protoBuf$ValueParameter.flags_ = 0;
        protoBuf$ValueParameter.name_ = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
        protoBuf$ValueParameter.type_ = protoBuf$Type;
        protoBuf$ValueParameter.typeId_ = 0;
        protoBuf$ValueParameter.varargElementType_ = protoBuf$Type;
        protoBuf$ValueParameter.varargElementTypeId_ = 0;
    }

    public ProtoBuf$ValueParameter() {
        throw null;
    }

    public ProtoBuf$ValueParameter(GeneratedMessageLite.C24067c cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.f61054b;
    }

    /* renamed from: A */
    public final int mo59891A() {
        return this.typeId_;
    }

    /* renamed from: B */
    public final ProtoBuf$Type mo59892B() {
        return this.varargElementType_;
    }

    /* renamed from: C */
    public final int mo59893C() {
        return this.varargElementTypeId_;
    }

    /* renamed from: D */
    public final boolean mo59894D() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: E */
    public final boolean mo59895E() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: F */
    public final boolean mo59896F() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: G */
    public final boolean mo59897G() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: H */
    public final boolean mo59898H() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: I */
    public final boolean mo59899I() {
        return (this.bitField0_ & 32) == 32;
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
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59978o(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59978o(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59976m(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo59976m(6, this.varargElementTypeId_);
        }
        aVar.mo59998a(200, codedOutputStream);
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final C24090h getDefaultInstanceForType() {
        return f60977b;
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m60026b(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m60026b(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i2 += CodedOutputStream.m60028d(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i2 += CodedOutputStream.m60028d(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i2 += CodedOutputStream.m60026b(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i2 += CodedOutputStream.m60026b(6, this.varargElementTypeId_);
        }
        int size = this.unknownFields.size() + mo59989f() + i2;
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
        if (!mo59895E()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo59896F() && !this.type_.isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (mo59898H() && !this.varargElementType_.isInitialized()) {
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

    public final C24090h.C24091a newBuilderForType() {
        return new C24043b();
    }

    public final C24090h.C24091a toBuilder() {
        C24043b bVar = new C24043b();
        bVar.mo59904j(this);
        return bVar;
    }

    /* renamed from: x */
    public final int mo59900x() {
        return this.flags_;
    }

    /* renamed from: y */
    public final int mo59901y() {
        return this.name_;
    }

    /* renamed from: z */
    public final ProtoBuf$Type mo59902z() {
        return this.type_;
    }

    public ProtoBuf$ValueParameter(int i) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$ValueParameter(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.flags_ = 0;
        this.name_ = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f60926b;
        this.type_ = protoBuf$Type;
        this.typeId_ = 0;
        this.varargElementType_ = protoBuf$Type;
        this.varargElementTypeId_ = 0;
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        this.bitField0_ |= 1;
                        this.flags_ = cVar.mo60029k();
                    } else if (n != 16) {
                        ProtoBuf$Type.C24034b bVar2 = null;
                        if (n == 26) {
                            if ((this.bitField0_ & 4) == 4) {
                                ProtoBuf$Type protoBuf$Type2 = this.type_;
                                protoBuf$Type2.getClass();
                                bVar2 = ProtoBuf$Type.m59679j0(protoBuf$Type2);
                            }
                            ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) cVar.mo60025g(ProtoBuf$Type.f60927c, dVar);
                            this.type_ = protoBuf$Type3;
                            if (bVar2 != null) {
                                bVar2.mo59851j(protoBuf$Type3);
                                this.type_ = bVar2.mo59850i();
                            }
                            this.bitField0_ |= 4;
                        } else if (n == 34) {
                            if ((this.bitField0_ & 16) == 16) {
                                ProtoBuf$Type protoBuf$Type4 = this.varargElementType_;
                                protoBuf$Type4.getClass();
                                bVar2 = ProtoBuf$Type.m59679j0(protoBuf$Type4);
                            }
                            ProtoBuf$Type protoBuf$Type5 = (ProtoBuf$Type) cVar.mo60025g(ProtoBuf$Type.f60927c, dVar);
                            this.varargElementType_ = protoBuf$Type5;
                            if (bVar2 != null) {
                                bVar2.mo59851j(protoBuf$Type5);
                                this.varargElementType_ = bVar2.mo59850i();
                            }
                            this.bitField0_ |= 16;
                        } else if (n == 40) {
                            this.bitField0_ |= 8;
                            this.typeId_ = cVar.mo60029k();
                        } else if (n == 48) {
                            this.bitField0_ |= 32;
                            this.varargElementTypeId_ = cVar.mo60029k();
                        } else if (!mo59996m(cVar, j, dVar, n)) {
                        }
                    } else {
                        this.bitField0_ |= 2;
                        this.name_ = cVar.mo60029k();
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
                mo59994k();
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
        mo59994k();
    }
}
