package kotlin.reflect.jvm.internal.impl.metadata;

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

public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$QualifiedNameTable f60912b;

    /* renamed from: c */
    public static C24026a f60913c = new C24026a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<QualifiedName> qualifiedName_;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a */
    public static class C24026a extends C24077b<ProtoBuf$QualifiedNameTable> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$QualifiedNameTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b */
    public static final class C24027b extends GeneratedMessageLite.C24066b<ProtoBuf$QualifiedNameTable, C24027b> implements C25099f {

        /* renamed from: c */
        public int f60920c;

        /* renamed from: d */
        public List<QualifiedName> f60921d = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59806j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$QualifiedNameTable h = mo59804h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C24027b bVar = new C24027b();
            bVar.mo59805i(mo59804h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C24027b bVar = new C24027b();
            bVar.mo59805i(mo59804h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59805i((ProtoBuf$QualifiedNameTable) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$QualifiedNameTable mo59804h() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(this);
            if ((this.f60920c & 1) == 1) {
                this.f60921d = Collections.unmodifiableList(this.f60921d);
                this.f60920c &= -2;
            }
            protoBuf$QualifiedNameTable.qualifiedName_ = this.f60921d;
            return protoBuf$QualifiedNameTable;
        }

        /* renamed from: i */
        public final void mo59805i(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if (protoBuf$QualifiedNameTable != ProtoBuf$QualifiedNameTable.f60912b) {
                if (!protoBuf$QualifiedNameTable.qualifiedName_.isEmpty()) {
                    if (this.f60921d.isEmpty()) {
                        this.f60921d = protoBuf$QualifiedNameTable.qualifiedName_;
                        this.f60920c &= -2;
                    } else {
                        if ((this.f60920c & 1) != 1) {
                            this.f60921d = new ArrayList(this.f60921d);
                            this.f60920c |= 1;
                        }
                        this.f60921d.addAll(protoBuf$QualifiedNameTable.qualifiedName_);
                    }
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$QualifiedNameTable.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59806j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            try {
                ProtoBuf$QualifiedNameTable.f60913c.getClass();
                mo59805i(new ProtoBuf$QualifiedNameTable(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$QualifiedNameTable != null) {
                mo59805i(protoBuf$QualifiedNameTable);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59806j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable();
        f60912b = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.qualifiedName_ = Collections.emptyList();
    }

    public ProtoBuf$QualifiedNameTable(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            codedOutputStream.mo59978o(1, this.qualifiedName_.get(i));
        }
        codedOutputStream.mo59981r(this.unknownFields);
    }

    /* renamed from: g */
    public final QualifiedName mo59794g(int i) {
        return this.qualifiedName_.get(i);
    }

    public final int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.qualifiedName_.size(); i3++) {
            i2 += CodedOutputStream.m60028d(1, this.qualifiedName_.get(i3));
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
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            if (!mo59794g(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C24027b();
    }

    public final C24090h.C24091a toBuilder() {
        C24027b bVar = new C24027b();
        bVar.mo59805i(this);
        return bVar;
    }

    public static final class QualifiedName extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final QualifiedName f60914b;

        /* renamed from: c */
        public static C24024a f60915c = new C24024a();
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public Kind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int parentQualifiedName_;
        /* access modifiers changed from: private */
        public int shortName_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;

        public enum Kind implements C24084f.C24085a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            
            private static C24084f.C24086b<Kind> internalValueMap;
            private final int value;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$a */
            public static class C24023a implements C24084f.C24086b<Kind> {
                /* renamed from: a */
                public final C24084f.C24085a mo59642a(int i) {
                    return Kind.valueOf(i);
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C24023a();
            }

            private Kind(int i, int i2) {
                this.value = i2;
            }

            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$a */
        public static class C24024a extends C24077b<QualifiedName> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new QualifiedName(cVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$b */
        public static final class C24025b extends GeneratedMessageLite.C24066b<QualifiedName, C24025b> implements C25099f {

            /* renamed from: c */
            public int f60916c;

            /* renamed from: d */
            public int f60917d = -1;

            /* renamed from: e */
            public int f60918e;

            /* renamed from: f */
            public Kind f60919f = Kind.PACKAGE;

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59803j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                QualifiedName h = mo59801h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C24025b bVar = new C24025b();
                bVar.mo59802i(mo59801h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C24025b bVar = new C24025b();
                bVar.mo59802i(mo59801h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59802i((QualifiedName) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final QualifiedName mo59801h() {
                QualifiedName qualifiedName = new QualifiedName((GeneratedMessageLite.C24066b) this);
                int i = this.f60916c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                qualifiedName.parentQualifiedName_ = this.f60917d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                qualifiedName.shortName_ = this.f60918e;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                qualifiedName.kind_ = this.f60919f;
                qualifiedName.bitField0_ = i2;
                return qualifiedName;
            }

            /* renamed from: i */
            public final void mo59802i(QualifiedName qualifiedName) {
                if (qualifiedName != QualifiedName.f60914b) {
                    if (qualifiedName.mo59799m()) {
                        int j = qualifiedName.mo59796j();
                        this.f60916c |= 1;
                        this.f60917d = j;
                    }
                    if (qualifiedName.mo59800o()) {
                        int k = qualifiedName.mo59797k();
                        this.f60916c |= 2;
                        this.f60918e = k;
                    }
                    if (qualifiedName.mo59798l()) {
                        Kind i = qualifiedName.mo59795i();
                        i.getClass();
                        this.f60916c |= 4;
                        this.f60919f = i;
                    }
                    this.f61054b = this.f61054b.mo61617b(qualifiedName.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59803j(C24078c cVar, C24079d dVar) throws IOException {
                QualifiedName qualifiedName;
                try {
                    QualifiedName.f60915c.getClass();
                    mo59802i(new QualifiedName(cVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    qualifiedName = (QualifiedName) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (qualifiedName != null) {
                    mo59802i(qualifiedName);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59803j(cVar, dVar);
                return this;
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName();
            f60914b = qualifiedName;
            qualifiedName.parentQualifiedName_ = -1;
            qualifiedName.shortName_ = 0;
            qualifiedName.kind_ = Kind.PACKAGE;
        }

        public QualifiedName(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo59976m(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo59976m(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo59975l(3, this.kind_.getNumber());
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
                i2 = 0 + CodedOutputStream.m60026b(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m60026b(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m60025a(3, this.kind_.getNumber());
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: i */
        public final Kind mo59795i() {
            return this.kind_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo59800o()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        /* renamed from: j */
        public final int mo59796j() {
            return this.parentQualifiedName_;
        }

        /* renamed from: k */
        public final int mo59797k() {
            return this.shortName_;
        }

        /* renamed from: l */
        public final boolean mo59798l() {
            return (this.bitField0_ & 4) == 4;
        }

        /* renamed from: m */
        public final boolean mo59799m() {
            return (this.bitField0_ & 1) == 1;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C24025b();
        }

        /* renamed from: o */
        public final boolean mo59800o() {
            return (this.bitField0_ & 2) == 2;
        }

        public final C24090h.C24091a toBuilder() {
            C24025b bVar = new C24025b();
            bVar.mo59802i(this);
            return bVar;
        }

        public QualifiedName() {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        public QualifiedName(C24078c cVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.parentQualifiedName_ = -1;
            boolean z = false;
            this.shortName_ = 0;
            this.kind_ = Kind.PACKAGE;
            C25091a.C25093b bVar = new C25091a.C25093b();
            CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
            while (!z) {
                try {
                    int n = cVar.mo60032n();
                    if (n != 0) {
                        if (n == 8) {
                            this.bitField0_ |= 1;
                            this.parentQualifiedName_ = cVar.mo60029k();
                        } else if (n == 16) {
                            this.bitField0_ |= 2;
                            this.shortName_ = cVar.mo60029k();
                        } else if (n == 24) {
                            int k = cVar.mo60029k();
                            Kind valueOf = Kind.valueOf(k);
                            if (valueOf == null) {
                                j.mo59985v(n);
                                j.mo59985v(k);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = valueOf;
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

    public ProtoBuf$QualifiedNameTable() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$QualifiedNameTable(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.qualifiedName_ = Collections.emptyList();
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
                            this.qualifiedName_ = new ArrayList();
                            z2 |= true;
                        }
                        this.qualifiedName_.add(cVar.mo60025g(QualifiedName.f60915c, dVar));
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
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
