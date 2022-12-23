package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
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

public final class ProtoBuf$Expression extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$Expression f60857b;

    /* renamed from: c */
    public static C24011a f60858c = new C24011a();
    /* access modifiers changed from: private */
    public List<ProtoBuf$Expression> andArgument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public ConstantValue constantValue_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int isInstanceTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Expression> orArgument_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;
    /* access modifiers changed from: private */
    public int valueParameterReference_;

    public enum ConstantValue implements C24084f.C24085a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        
        private static C24084f.C24086b<ConstantValue> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$a */
        public static class C24010a implements C24084f.C24086b<ConstantValue> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return ConstantValue.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C24010a();
        }

        private ConstantValue(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static ConstantValue valueOf(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$a */
    public static class C24011a extends C24077b<ProtoBuf$Expression> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Expression(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$b */
    public static final class C24012b extends GeneratedMessageLite.C24066b<ProtoBuf$Expression, C24012b> implements C25099f {

        /* renamed from: c */
        public int f60859c;

        /* renamed from: d */
        public int f60860d;

        /* renamed from: e */
        public int f60861e;

        /* renamed from: f */
        public ConstantValue f60862f = ConstantValue.TRUE;

        /* renamed from: g */
        public ProtoBuf$Type f60863g = ProtoBuf$Type.f60926b;

        /* renamed from: h */
        public int f60864h;

        /* renamed from: i */
        public List<ProtoBuf$Expression> f60865i = Collections.emptyList();

        /* renamed from: j */
        public List<ProtoBuf$Expression> f60866j = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59724j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Expression h = mo59722h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24012b bVar = new C24012b();
            bVar.mo59723i(mo59722h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24012b bVar = new C24012b();
            bVar.mo59723i(mo59722h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59723i((ProtoBuf$Expression) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$Expression mo59722h() {
            ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
            int i = this.f60859c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Expression.flags_ = this.f60860d;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Expression.valueParameterReference_ = this.f60861e;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Expression.constantValue_ = this.f60862f;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Expression.isInstanceType_ = this.f60863g;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Expression.isInstanceTypeId_ = this.f60864h;
            if ((this.f60859c & 32) == 32) {
                this.f60865i = Collections.unmodifiableList(this.f60865i);
                this.f60859c &= -33;
            }
            protoBuf$Expression.andArgument_ = this.f60865i;
            if ((this.f60859c & 64) == 64) {
                this.f60866j = Collections.unmodifiableList(this.f60866j);
                this.f60859c &= -65;
            }
            protoBuf$Expression.orArgument_ = this.f60866j;
            protoBuf$Expression.bitField0_ = i2;
            return protoBuf$Expression;
        }

        /* renamed from: i */
        public final void mo59723i(ProtoBuf$Expression protoBuf$Expression) {
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Expression != ProtoBuf$Expression.f60857b) {
                if (protoBuf$Expression.mo59718v()) {
                    int q = protoBuf$Expression.mo59713q();
                    this.f60859c |= 1;
                    this.f60860d = q;
                }
                if (protoBuf$Expression.mo59721y()) {
                    int t = protoBuf$Expression.mo59716t();
                    this.f60859c |= 2;
                    this.f60861e = t;
                }
                if (protoBuf$Expression.mo59717u()) {
                    ConstantValue p = protoBuf$Expression.mo59712p();
                    p.getClass();
                    this.f60859c |= 4;
                    this.f60862f = p;
                }
                if (protoBuf$Expression.mo59719w()) {
                    ProtoBuf$Type r = protoBuf$Expression.mo59714r();
                    if ((this.f60859c & 8) != 8 || (protoBuf$Type = this.f60863g) == ProtoBuf$Type.f60926b) {
                        this.f60863g = r;
                    } else {
                        ProtoBuf$Type.C24034b j0 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        j0.mo59851j(r);
                        this.f60863g = j0.mo59850i();
                    }
                    this.f60859c |= 8;
                }
                if (protoBuf$Expression.mo59720x()) {
                    int s = protoBuf$Expression.mo59715s();
                    this.f60859c |= 16;
                    this.f60864h = s;
                }
                if (!protoBuf$Expression.andArgument_.isEmpty()) {
                    if (this.f60865i.isEmpty()) {
                        this.f60865i = protoBuf$Expression.andArgument_;
                        this.f60859c &= -33;
                    } else {
                        if ((this.f60859c & 32) != 32) {
                            this.f60865i = new ArrayList(this.f60865i);
                            this.f60859c |= 32;
                        }
                        this.f60865i.addAll(protoBuf$Expression.andArgument_);
                    }
                }
                if (!protoBuf$Expression.orArgument_.isEmpty()) {
                    if (this.f60866j.isEmpty()) {
                        this.f60866j = protoBuf$Expression.orArgument_;
                        this.f60859c &= -65;
                    } else {
                        if ((this.f60859c & 64) != 64) {
                            this.f60866j = new ArrayList(this.f60866j);
                            this.f60859c |= 64;
                        }
                        this.f60866j.addAll(protoBuf$Expression.orArgument_);
                    }
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$Expression.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59724j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Expression protoBuf$Expression;
            try {
                ProtoBuf$Expression.f60858c.getClass();
                mo59723i(new ProtoBuf$Expression(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Expression = (ProtoBuf$Expression) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Expression != null) {
                mo59723i(protoBuf$Expression);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59724j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression();
        f60857b = protoBuf$Expression;
        protoBuf$Expression.flags_ = 0;
        protoBuf$Expression.valueParameterReference_ = 0;
        protoBuf$Expression.constantValue_ = ConstantValue.TRUE;
        protoBuf$Expression.isInstanceType_ = ProtoBuf$Type.f60926b;
        protoBuf$Expression.isInstanceTypeId_ = 0;
        protoBuf$Expression.andArgument_ = Collections.emptyList();
        protoBuf$Expression.orArgument_ = Collections.emptyList();
    }

    public ProtoBuf$Expression(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59976m(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59975l(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo59978o(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo59976m(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            codedOutputStream.mo59978o(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            codedOutputStream.mo59978o(7, this.orArgument_.get(i2));
        }
        codedOutputStream.mo59981r(this.unknownFields);
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
            i += CodedOutputStream.m60026b(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60025a(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m60028d(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m60026b(5, this.isInstanceTypeId_);
        }
        for (int i3 = 0; i3 < this.andArgument_.size(); i3++) {
            i += CodedOutputStream.m60028d(6, this.andArgument_.get(i3));
        }
        for (int i4 = 0; i4 < this.orArgument_.size(); i4++) {
            i += CodedOutputStream.m60028d(7, this.orArgument_.get(i4));
        }
        int size = this.unknownFields.size() + i;
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
        if (!mo59719w() || this.isInstanceType_.isInitialized()) {
            for (int i = 0; i < this.andArgument_.size(); i++) {
                if (!this.andArgument_.get(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
                if (!this.orArgument_.get(i2).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        this.memoizedIsInitialized = 0;
        return false;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24012b();
    }

    /* renamed from: p */
    public final ConstantValue mo59712p() {
        return this.constantValue_;
    }

    /* renamed from: q */
    public final int mo59713q() {
        return this.flags_;
    }

    /* renamed from: r */
    public final ProtoBuf$Type mo59714r() {
        return this.isInstanceType_;
    }

    /* renamed from: s */
    public final int mo59715s() {
        return this.isInstanceTypeId_;
    }

    /* renamed from: t */
    public final int mo59716t() {
        return this.valueParameterReference_;
    }

    public final C24090h.C24091a toBuilder() {
        C24012b bVar = new C24012b();
        bVar.mo59723i(this);
        return bVar;
    }

    /* renamed from: u */
    public final boolean mo59717u() {
        return (this.bitField0_ & 4) == 4;
    }

    /* renamed from: v */
    public final boolean mo59718v() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: w */
    public final boolean mo59719w() {
        return (this.bitField0_ & 8) == 8;
    }

    /* renamed from: x */
    public final boolean mo59720x() {
        return (this.bitField0_ & 16) == 16;
    }

    /* renamed from: y */
    public final boolean mo59721y() {
        return (this.bitField0_ & 2) == 2;
    }

    public ProtoBuf$Expression() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$Expression(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        this.constantValue_ = ConstantValue.TRUE;
        this.isInstanceType_ = ProtoBuf$Type.f60926b;
        this.isInstanceTypeId_ = 0;
        this.andArgument_ = Collections.emptyList();
        this.orArgument_ = Collections.emptyList();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        this.bitField0_ |= 1;
                        this.flags_ = cVar.mo60029k();
                    } else if (n == 16) {
                        this.bitField0_ |= 2;
                        this.valueParameterReference_ = cVar.mo60029k();
                    } else if (n == 24) {
                        int k = cVar.mo60029k();
                        ConstantValue valueOf = ConstantValue.valueOf(k);
                        if (valueOf == null) {
                            j.mo59985v(n);
                            j.mo59985v(k);
                        } else {
                            this.bitField0_ |= 4;
                            this.constantValue_ = valueOf;
                        }
                    } else if (n == 34) {
                        ProtoBuf$Type.C24034b bVar2 = null;
                        if ((this.bitField0_ & 8) == 8) {
                            ProtoBuf$Type protoBuf$Type = this.isInstanceType_;
                            protoBuf$Type.getClass();
                            bVar2 = ProtoBuf$Type.m59679j0(protoBuf$Type);
                        }
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo60025g(ProtoBuf$Type.f60927c, dVar);
                        this.isInstanceType_ = protoBuf$Type2;
                        if (bVar2 != null) {
                            bVar2.mo59851j(protoBuf$Type2);
                            this.isInstanceType_ = bVar2.mo59850i();
                        }
                        this.bitField0_ |= 8;
                    } else if (n == 40) {
                        this.bitField0_ |= 16;
                        this.isInstanceTypeId_ = cVar.mo60029k();
                    } else if (n == 50) {
                        if (!(z2 & true)) {
                            this.andArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.andArgument_.add(cVar.mo60025g(f60858c, dVar));
                    } else if (n == 58) {
                        if (!(z2 & true)) {
                            this.orArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.orArgument_.add(cVar.mo60025g(f60858c, dVar));
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
                if (z2 & true) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                }
                if (z2 & true) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if (z2 & true) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
