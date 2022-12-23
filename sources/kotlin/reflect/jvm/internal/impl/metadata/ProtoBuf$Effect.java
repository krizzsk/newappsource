package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
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

public final class ProtoBuf$Effect extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$Effect f60846b;

    /* renamed from: c */
    public static C24006a f60847c = new C24006a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public ProtoBuf$Expression conclusionOfConditionalEffect_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Expression> effectConstructorArgument_;
    /* access modifiers changed from: private */
    public EffectType effectType_;
    /* access modifiers changed from: private */
    public InvocationKind kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    public enum EffectType implements C24084f.C24085a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        
        private static C24084f.C24086b<EffectType> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$a */
        public static class C24004a implements C24084f.C24086b<EffectType> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return EffectType.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C24004a();
        }

        private EffectType(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static EffectType valueOf(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }
    }

    public enum InvocationKind implements C24084f.C24085a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        
        private static C24084f.C24086b<InvocationKind> internalValueMap;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$a */
        public static class C24005a implements C24084f.C24086b<InvocationKind> {
            /* renamed from: a */
            public final C24084f.C24085a mo59642a(int i) {
                return InvocationKind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C24005a();
        }

        private InvocationKind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static InvocationKind valueOf(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$a */
    public static class C24006a extends C24077b<ProtoBuf$Effect> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Effect(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$b */
    public static final class C24007b extends GeneratedMessageLite.C24066b<ProtoBuf$Effect, C24007b> implements C25099f {

        /* renamed from: c */
        public int f60848c;

        /* renamed from: d */
        public EffectType f60849d = EffectType.RETURNS_CONSTANT;

        /* renamed from: e */
        public List<ProtoBuf$Expression> f60850e = Collections.emptyList();

        /* renamed from: f */
        public ProtoBuf$Expression f60851f = ProtoBuf$Expression.f60857b;

        /* renamed from: g */
        public InvocationKind f60852g = InvocationKind.AT_MOST_ONCE;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59707j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Effect h = mo59705h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24007b bVar = new C24007b();
            bVar.mo59706i(mo59705h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24007b bVar = new C24007b();
            bVar.mo59706i(mo59705h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59706i((ProtoBuf$Effect) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$Effect mo59705h() {
            ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
            int i = this.f60848c;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Effect.effectType_ = this.f60849d;
            if ((this.f60848c & 2) == 2) {
                this.f60850e = Collections.unmodifiableList(this.f60850e);
                this.f60848c &= -3;
            }
            protoBuf$Effect.effectConstructorArgument_ = this.f60850e;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            protoBuf$Effect.conclusionOfConditionalEffect_ = this.f60851f;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$Effect.kind_ = this.f60852g;
            protoBuf$Effect.bitField0_ = i2;
            return protoBuf$Effect;
        }

        /* renamed from: i */
        public final void mo59706i(ProtoBuf$Effect protoBuf$Effect) {
            ProtoBuf$Expression protoBuf$Expression;
            if (protoBuf$Effect != ProtoBuf$Effect.f60846b) {
                if (protoBuf$Effect.mo59703p()) {
                    EffectType l = protoBuf$Effect.mo59700l();
                    l.getClass();
                    this.f60848c |= 1;
                    this.f60849d = l;
                }
                if (!protoBuf$Effect.effectConstructorArgument_.isEmpty()) {
                    if (this.f60850e.isEmpty()) {
                        this.f60850e = protoBuf$Effect.effectConstructorArgument_;
                        this.f60848c &= -3;
                    } else {
                        if ((this.f60848c & 2) != 2) {
                            this.f60850e = new ArrayList(this.f60850e);
                            this.f60848c |= 2;
                        }
                        this.f60850e.addAll(protoBuf$Effect.effectConstructorArgument_);
                    }
                }
                if (protoBuf$Effect.mo59702o()) {
                    ProtoBuf$Expression k = protoBuf$Effect.mo59699k();
                    if ((this.f60848c & 4) != 4 || (protoBuf$Expression = this.f60851f) == ProtoBuf$Expression.f60857b) {
                        this.f60851f = k;
                    } else {
                        ProtoBuf$Expression.C24012b bVar = new ProtoBuf$Expression.C24012b();
                        bVar.mo59723i(protoBuf$Expression);
                        bVar.mo59723i(k);
                        this.f60851f = bVar.mo59722h();
                    }
                    this.f60848c |= 4;
                }
                if (protoBuf$Effect.mo59704q()) {
                    InvocationKind m = protoBuf$Effect.mo59701m();
                    m.getClass();
                    this.f60848c |= 8;
                    this.f60852g = m;
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$Effect.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59707j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Effect protoBuf$Effect;
            try {
                ProtoBuf$Effect.f60847c.getClass();
                mo59706i(new ProtoBuf$Effect(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Effect = (ProtoBuf$Effect) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Effect != null) {
                mo59706i(protoBuf$Effect);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59707j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect();
        f60846b = protoBuf$Effect;
        protoBuf$Effect.effectType_ = EffectType.RETURNS_CONSTANT;
        protoBuf$Effect.effectConstructorArgument_ = Collections.emptyList();
        protoBuf$Effect.conclusionOfConditionalEffect_ = ProtoBuf$Expression.f60857b;
        protoBuf$Effect.kind_ = InvocationKind.AT_MOST_ONCE;
    }

    public ProtoBuf$Effect(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59975l(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            codedOutputStream.mo59978o(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo59978o(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo59975l(4, this.kind_.getNumber());
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
            i = CodedOutputStream.m60025a(1, this.effectType_.getNumber()) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.effectConstructorArgument_.size(); i3++) {
            i += CodedOutputStream.m60028d(2, this.effectConstructorArgument_.get(i3));
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m60028d(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m60025a(4, this.kind_.getNumber());
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
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            if (!this.effectConstructorArgument_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (!mo59702o() || this.conclusionOfConditionalEffect_.isInitialized()) {
            this.memoizedIsInitialized = 1;
            return true;
        }
        this.memoizedIsInitialized = 0;
        return false;
    }

    /* renamed from: k */
    public final ProtoBuf$Expression mo59699k() {
        return this.conclusionOfConditionalEffect_;
    }

    /* renamed from: l */
    public final EffectType mo59700l() {
        return this.effectType_;
    }

    /* renamed from: m */
    public final InvocationKind mo59701m() {
        return this.kind_;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24007b();
    }

    /* renamed from: o */
    public final boolean mo59702o() {
        return (this.bitField0_ & 2) == 2;
    }

    /* renamed from: p */
    public final boolean mo59703p() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: q */
    public final boolean mo59704q() {
        return (this.bitField0_ & 4) == 4;
    }

    public final C24090h.C24091a toBuilder() {
        C24007b bVar = new C24007b();
        bVar.mo59706i(this);
        return bVar;
    }

    public ProtoBuf$Effect() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$Effect(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.effectType_ = EffectType.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.emptyList();
        this.conclusionOfConditionalEffect_ = ProtoBuf$Expression.f60857b;
        this.kind_ = InvocationKind.AT_MOST_ONCE;
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        int k = cVar.mo60029k();
                        EffectType valueOf = EffectType.valueOf(k);
                        if (valueOf == null) {
                            j.mo59985v(n);
                            j.mo59985v(k);
                        } else {
                            this.bitField0_ |= 1;
                            this.effectType_ = valueOf;
                        }
                    } else if (n == 18) {
                        if (!(z2 & true)) {
                            this.effectConstructorArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.effectConstructorArgument_.add(cVar.mo60025g(ProtoBuf$Expression.f60858c, dVar));
                    } else if (n == 26) {
                        ProtoBuf$Expression.C24012b bVar2 = null;
                        if ((this.bitField0_ & 2) == 2) {
                            ProtoBuf$Expression protoBuf$Expression = this.conclusionOfConditionalEffect_;
                            protoBuf$Expression.getClass();
                            ProtoBuf$Expression.C24012b bVar3 = new ProtoBuf$Expression.C24012b();
                            bVar3.mo59723i(protoBuf$Expression);
                            bVar2 = bVar3;
                        }
                        ProtoBuf$Expression protoBuf$Expression2 = (ProtoBuf$Expression) cVar.mo60025g(ProtoBuf$Expression.f60858c, dVar);
                        this.conclusionOfConditionalEffect_ = protoBuf$Expression2;
                        if (bVar2 != null) {
                            bVar2.mo59723i(protoBuf$Expression2);
                            this.conclusionOfConditionalEffect_ = bVar2.mo59722h();
                        }
                        this.bitField0_ |= 2;
                    } else if (n == 32) {
                        int k2 = cVar.mo60029k();
                        InvocationKind valueOf2 = InvocationKind.valueOf(k2);
                        if (valueOf2 == null) {
                            j.mo59985v(n);
                            j.mo59985v(k2);
                        } else {
                            this.bitField0_ |= 4;
                            this.kind_ = valueOf2;
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
                if (z2 & true) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
