package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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
import vg0.C25095c;
import vg0.C25096d;
import vg0.C25097e;
import vg0.C25099f;

public final class ProtoBuf$StringTable extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$StringTable f60922b;

    /* renamed from: c */
    public static C24028a f60923c = new C24028a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public C25096d string_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$a */
    public static class C24028a extends C24077b<ProtoBuf$StringTable> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$StringTable(cVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b */
    public static final class C24029b extends GeneratedMessageLite.C24066b<ProtoBuf$StringTable, C24029b> implements C25099f {

        /* renamed from: c */
        public int f60924c;

        /* renamed from: d */
        public C25096d f60925d = C25095c.f63307c;

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59810j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$StringTable h = mo59808h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24029b bVar = new C24029b();
            bVar.mo59809i(mo59808h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24029b bVar = new C24029b();
            bVar.mo59809i(mo59808h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59809i((ProtoBuf$StringTable) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$StringTable mo59808h() {
            ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable((GeneratedMessageLite.C24066b) this);
            if ((this.f60924c & 1) == 1) {
                this.f60925d = this.f60925d.mo61636A();
                this.f60924c &= -2;
            }
            protoBuf$StringTable.string_ = this.f60925d;
            return protoBuf$StringTable;
        }

        /* renamed from: i */
        public final void mo59809i(ProtoBuf$StringTable protoBuf$StringTable) {
            if (protoBuf$StringTable != ProtoBuf$StringTable.f60922b) {
                if (!protoBuf$StringTable.string_.isEmpty()) {
                    if (this.f60925d.isEmpty()) {
                        this.f60925d = protoBuf$StringTable.string_;
                        this.f60924c &= -2;
                    } else {
                        if ((this.f60924c & 1) != 1) {
                            this.f60925d = new C25095c(this.f60925d);
                            this.f60924c |= 1;
                        }
                        this.f60925d.addAll(protoBuf$StringTable.string_);
                    }
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$StringTable.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59810j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$StringTable protoBuf$StringTable;
            try {
                ProtoBuf$StringTable.f60923c.getClass();
                mo59809i(new ProtoBuf$StringTable(cVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$StringTable = (ProtoBuf$StringTable) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$StringTable != null) {
                mo59809i(protoBuf$StringTable);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59810j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable();
        f60922b = protoBuf$StringTable;
        protoBuf$StringTable.string_ = C25095c.f63307c;
    }

    public ProtoBuf$StringTable(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.string_.size(); i++) {
            C25091a B0 = this.string_.mo61637B0(i);
            codedOutputStream.mo59987x(1, 2);
            codedOutputStream.mo59985v(B0.size());
            codedOutputStream.mo59981r(B0);
        }
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: g */
    public final String mo59807g(int i) {
        return (String) this.string_.get(i);
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.string_.size(); i3++) {
            C25091a B0 = this.string_.mo61637B0(i3);
            i2 += B0.size() + CodedOutputStream.m60030f(B0.size());
        }
        int size = this.unknownFields.size() + (this.string_.size() * 1) + 0 + i2;
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
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24029b();
    }

    public final C24090h.C24091a toBuilder() {
        C24029b bVar = new C24029b();
        bVar.mo59809i(this);
        return bVar;
    }

    public ProtoBuf$StringTable() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$StringTable(C24078c cVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.string_ = C25095c.f63307c;
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 10) {
                        C25097e e = cVar.mo60023e();
                        if (!z2 || !true) {
                            this.string_ = new C25095c();
                            z2 |= true;
                        }
                        this.string_.mo61643p1(e);
                    } else if (!cVar.mo60035q(n, j)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e2) {
                e2.mo60010b(this);
                throw e2;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.mo60010b(this);
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.string_ = this.string_.mo61636A();
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
            this.string_ = this.string_.mo61636A();
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
