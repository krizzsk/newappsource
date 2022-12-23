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
import vg0.C25099f;

public final class ProtoBuf$Contract extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$Contract f60842b;

    /* renamed from: c */
    public static C24002a f60843c = new C24002a();
    /* access modifiers changed from: private */
    public List<ProtoBuf$Effect> effect_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$a */
    public static class C24002a extends C24077b<ProtoBuf$Contract> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Contract(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b */
    public static final class C24003b extends GeneratedMessageLite.C24066b<ProtoBuf$Contract, C24003b> implements C25099f {

        /* renamed from: c */
        public int f60844c;

        /* renamed from: d */
        public List<ProtoBuf$Effect> f60845d = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59698j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Contract h = mo59696h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24003b bVar = new C24003b();
            bVar.mo59697i(mo59696h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24003b bVar = new C24003b();
            bVar.mo59697i(mo59696h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59697i((ProtoBuf$Contract) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$Contract mo59696h() {
            ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(this);
            if ((this.f60844c & 1) == 1) {
                this.f60845d = Collections.unmodifiableList(this.f60845d);
                this.f60844c &= -2;
            }
            protoBuf$Contract.effect_ = this.f60845d;
            return protoBuf$Contract;
        }

        /* renamed from: i */
        public final void mo59697i(ProtoBuf$Contract protoBuf$Contract) {
            if (protoBuf$Contract != ProtoBuf$Contract.f60842b) {
                if (!protoBuf$Contract.effect_.isEmpty()) {
                    if (this.f60845d.isEmpty()) {
                        this.f60845d = protoBuf$Contract.effect_;
                        this.f60844c &= -2;
                    } else {
                        if ((this.f60844c & 1) != 1) {
                            this.f60845d = new ArrayList(this.f60845d);
                            this.f60844c |= 1;
                        }
                        this.f60845d.addAll(protoBuf$Contract.effect_);
                    }
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$Contract.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59698j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Contract protoBuf$Contract;
            try {
                ProtoBuf$Contract.f60843c.getClass();
                mo59697i(new ProtoBuf$Contract(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Contract = (ProtoBuf$Contract) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Contract != null) {
                mo59697i(protoBuf$Contract);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59698j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract();
        f60842b = protoBuf$Contract;
        protoBuf$Contract.effect_ = Collections.emptyList();
    }

    public ProtoBuf$Contract(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.effect_.size(); i++) {
            codedOutputStream.mo59978o(1, this.effect_.get(i));
        }
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.effect_.size(); i3++) {
            i2 += CodedOutputStream.m60028d(1, this.effect_.get(i3));
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
        for (int i = 0; i < this.effect_.size(); i++) {
            if (!this.effect_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24003b();
    }

    public final C24090h.C24091a toBuilder() {
        C24003b bVar = new C24003b();
        bVar.mo59697i(this);
        return bVar;
    }

    public ProtoBuf$Contract() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$Contract(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.effect_ = Collections.emptyList();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 10) {
                        if (!z2 || !true) {
                            this.effect_ = new ArrayList();
                            z2 |= true;
                        }
                        this.effect_.add(cVar.mo60025g(ProtoBuf$Effect.f60847c, dVar));
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
                if (z2 && true) {
                    this.effect_ = Collections.unmodifiableList(this.effect_);
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
        if (z2 && true) {
            this.effect_ = Collections.unmodifiableList(this.effect_);
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
