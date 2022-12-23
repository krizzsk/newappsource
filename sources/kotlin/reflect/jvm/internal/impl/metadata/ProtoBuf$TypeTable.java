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

public final class ProtoBuf$TypeTable extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$TypeTable f60972b;

    /* renamed from: c */
    public static C24040a f60973c = new C24040a();
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> type_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a */
    public static class C24040a extends C24077b<ProtoBuf$TypeTable> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b */
    public static final class C24041b extends GeneratedMessageLite.C24066b<ProtoBuf$TypeTable, C24041b> implements C25099f {

        /* renamed from: c */
        public int f60974c;

        /* renamed from: d */
        public List<ProtoBuf$Type> f60975d = Collections.emptyList();

        /* renamed from: e */
        public int f60976e = -1;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59890j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$TypeTable h = mo59888h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24041b bVar = new C24041b();
            bVar.mo59889i(mo59888h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24041b bVar = new C24041b();
            bVar.mo59889i(mo59888h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59889i((ProtoBuf$TypeTable) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$TypeTable mo59888h() {
            ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(this);
            int i = this.f60974c;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f60975d = Collections.unmodifiableList(this.f60975d);
                this.f60974c &= -2;
            }
            protoBuf$TypeTable.type_ = this.f60975d;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            protoBuf$TypeTable.firstNullable_ = this.f60976e;
            protoBuf$TypeTable.bitField0_ = i2;
            return protoBuf$TypeTable;
        }

        /* renamed from: i */
        public final void mo59889i(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if (protoBuf$TypeTable != ProtoBuf$TypeTable.f60972b) {
                if (!protoBuf$TypeTable.type_.isEmpty()) {
                    if (this.f60975d.isEmpty()) {
                        this.f60975d = protoBuf$TypeTable.type_;
                        this.f60974c &= -2;
                    } else {
                        if ((this.f60974c & 1) != 1) {
                            this.f60975d = new ArrayList(this.f60975d);
                            this.f60974c |= 1;
                        }
                        this.f60975d.addAll(protoBuf$TypeTable.type_);
                    }
                }
                if (protoBuf$TypeTable.mo59886k()) {
                    int i = protoBuf$TypeTable.mo59884i();
                    this.f60974c |= 2;
                    this.f60976e = i;
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$TypeTable.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59890j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$TypeTable protoBuf$TypeTable;
            try {
                ProtoBuf$TypeTable.f60973c.getClass();
                mo59889i(new ProtoBuf$TypeTable(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeTable = (ProtoBuf$TypeTable) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$TypeTable != null) {
                mo59889i(protoBuf$TypeTable);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59890j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable();
        f60972b = protoBuf$TypeTable;
        protoBuf$TypeTable.type_ = Collections.emptyList();
        protoBuf$TypeTable.firstNullable_ = -1;
    }

    public ProtoBuf$TypeTable(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: l */
    public static C24041b m59824l(ProtoBuf$TypeTable protoBuf$TypeTable) {
        C24041b bVar = new C24041b();
        bVar.mo59889i(protoBuf$TypeTable);
        return bVar;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.type_.size(); i++) {
            codedOutputStream.mo59978o(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(2, this.firstNullable_);
        }
        codedOutputStream.mo59981r(this.unknownFields);
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.type_.size(); i3++) {
            i2 += CodedOutputStream.m60028d(1, this.type_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            i2 += CodedOutputStream.m60026b(2, this.firstNullable_);
        }
        int size = this.unknownFields.size() + i2;
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: i */
    public final int mo59884i() {
        return this.firstNullable_;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.type_.size(); i++) {
            if (!this.type_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    /* renamed from: j */
    public final List<ProtoBuf$Type> mo59885j() {
        return this.type_;
    }

    /* renamed from: k */
    public final boolean mo59886k() {
        return (this.bitField0_ & 1) == 1;
    }

    /* renamed from: m */
    public final C24041b mo59887m() {
        return m59824l(this);
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24041b();
    }

    public final C24090h.C24091a toBuilder() {
        return m59824l(this);
    }

    public ProtoBuf$TypeTable() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$TypeTable(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.type_ = Collections.emptyList();
        this.firstNullable_ = -1;
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
                            this.type_ = new ArrayList();
                            z2 |= true;
                        }
                        this.type_.add(cVar.mo60025g(ProtoBuf$Type.f60927c, dVar));
                    } else if (n == 16) {
                        this.bitField0_ |= 1;
                        this.firstNullable_ = cVar.mo60029k();
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
                    this.type_ = Collections.unmodifiableList(this.type_);
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
            this.type_ = Collections.unmodifiableList(this.type_);
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
