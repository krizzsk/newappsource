package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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

public final class ProtoBuf$Annotation extends GeneratedMessageLite implements C25099f {

    /* renamed from: b */
    public static final ProtoBuf$Annotation f60790b;

    /* renamed from: c */
    public static C23995a f60791c = new C23995a();
    /* access modifiers changed from: private */
    public List<Argument> argument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final C25091a unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$a */
    public static class C23995a extends C24077b<ProtoBuf$Annotation> {
        /* renamed from: a */
        public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Annotation(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b */
    public static final class C23996b extends GeneratedMessageLite.C24066b<ProtoBuf$Annotation, C23996b> implements C25099f {

        /* renamed from: c */
        public int f60811c;

        /* renamed from: d */
        public int f60812d;

        /* renamed from: e */
        public List<Argument> f60813e = Collections.emptyList();

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
            mo59658j(cVar, dVar);
            return this;
        }

        public final C24090h build() {
            ProtoBuf$Annotation h = mo59656h();
            if (h.isInitialized()) {
                return h;
            }
            throw new UninitializedMessageException();
        }

        public final Object clone() throws CloneNotSupportedException {
            C23996b bVar = new C23996b();
            bVar.mo59657i(mo59656h());
            return bVar;
        }

        /* renamed from: f */
        public final GeneratedMessageLite.C24066b mo59647f() {
            C23996b bVar = new C23996b();
            bVar.mo59657i(mo59656h());
            return bVar;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
            mo59657i((ProtoBuf$Annotation) generatedMessageLite);
            return this;
        }

        /* renamed from: h */
        public final ProtoBuf$Annotation mo59656h() {
            ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(this);
            int i = 1;
            if ((this.f60811c & 1) != 1) {
                i = 0;
            }
            protoBuf$Annotation.id_ = this.f60812d;
            if ((this.f60811c & 2) == 2) {
                this.f60813e = Collections.unmodifiableList(this.f60813e);
                this.f60811c &= -3;
            }
            protoBuf$Annotation.argument_ = this.f60813e;
            protoBuf$Annotation.bitField0_ = i;
            return protoBuf$Annotation;
        }

        /* renamed from: i */
        public final void mo59657i(ProtoBuf$Annotation protoBuf$Annotation) {
            if (protoBuf$Annotation != ProtoBuf$Annotation.f60790b) {
                if (protoBuf$Annotation.mo59611l()) {
                    int k = protoBuf$Annotation.mo59610k();
                    this.f60811c |= 1;
                    this.f60812d = k;
                }
                if (!protoBuf$Annotation.argument_.isEmpty()) {
                    if (this.f60813e.isEmpty()) {
                        this.f60813e = protoBuf$Annotation.argument_;
                        this.f60811c &= -3;
                    } else {
                        if ((this.f60811c & 2) != 2) {
                            this.f60813e = new ArrayList(this.f60813e);
                            this.f60811c |= 2;
                        }
                        this.f60813e.addAll(protoBuf$Annotation.argument_);
                    }
                }
                this.f61054b = this.f61054b.mo61617b(protoBuf$Annotation.unknownFields);
            }
        }

        /* renamed from: j */
        public final void mo59658j(C24078c cVar, C24079d dVar) throws IOException {
            ProtoBuf$Annotation protoBuf$Annotation;
            try {
                mo59657i((ProtoBuf$Annotation) ProtoBuf$Annotation.f60791c.mo59643a(cVar, dVar));
                return;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Annotation = (ProtoBuf$Annotation) e.mo60009a();
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (protoBuf$Annotation != null) {
                mo59657i(protoBuf$Annotation);
            }
            throw th;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
            mo59658j(cVar, dVar);
            return this;
        }
    }

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation();
        f60790b = protoBuf$Annotation;
        protoBuf$Annotation.id_ = 0;
        protoBuf$Annotation.argument_ = Collections.emptyList();
    }

    public ProtoBuf$Annotation(GeneratedMessageLite.C24066b bVar) {
        super(0);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.f61054b;
    }

    /* renamed from: a */
    public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo59976m(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.mo59978o(2, this.argument_.get(i));
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
            i = CodedOutputStream.m60026b(1, this.id_) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.argument_.size(); i3++) {
            i += CodedOutputStream.m60028d(2, this.argument_.get(i3));
        }
        int size = this.unknownFields.size() + i;
        this.memoizedSerializedSize = size;
        return size;
    }

    /* renamed from: i */
    public final int mo59607i() {
        return this.argument_.size();
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo59611l()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < mo59607i(); i++) {
            if (!this.argument_.get(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    /* renamed from: j */
    public final List<Argument> mo59609j() {
        return this.argument_;
    }

    /* renamed from: k */
    public final int mo59610k() {
        return this.id_;
    }

    /* renamed from: l */
    public final boolean mo59611l() {
        return (this.bitField0_ & 1) == 1;
    }

    public final C24090h.C24091a newBuilderForType() {
        return new C23996b();
    }

    public final C24090h.C24091a toBuilder() {
        C23996b bVar = new C23996b();
        bVar.mo59657i(this);
        return bVar;
    }

    public static final class Argument extends GeneratedMessageLite implements C25099f {

        /* renamed from: b */
        public static final Argument f60792b;

        /* renamed from: c */
        public static C23993a f60793c = new C23993a();
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int nameId_;
        /* access modifiers changed from: private */
        public final C25091a unknownFields;
        /* access modifiers changed from: private */
        public Value value_;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$a */
        public static class C23993a extends C24077b<Argument> {
            /* renamed from: a */
            public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                return new Argument(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$b */
        public static final class C23994b extends GeneratedMessageLite.C24066b<Argument, C23994b> implements C25099f {

            /* renamed from: c */
            public int f60808c;

            /* renamed from: d */
            public int f60809d;

            /* renamed from: e */
            public Value f60810e = Value.f60794b;

            /* renamed from: b */
            public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                mo59655j(cVar, dVar);
                return this;
            }

            public final C24090h build() {
                Argument h = mo59653h();
                if (h.isInitialized()) {
                    return h;
                }
                throw new UninitializedMessageException();
            }

            public final Object clone() throws CloneNotSupportedException {
                C23994b bVar = new C23994b();
                bVar.mo59654i(mo59653h());
                return bVar;
            }

            /* renamed from: f */
            public final GeneratedMessageLite.C24066b mo59647f() {
                C23994b bVar = new C23994b();
                bVar.mo59654i(mo59653h());
                return bVar;
            }

            /* renamed from: g */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                mo59654i((Argument) generatedMessageLite);
                return this;
            }

            /* renamed from: h */
            public final Argument mo59653h() {
                Argument argument = new Argument(this);
                int i = this.f60808c;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                argument.nameId_ = this.f60809d;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                argument.value_ = this.f60810e;
                argument.bitField0_ = i2;
                return argument;
            }

            /* renamed from: i */
            public final void mo59654i(Argument argument) {
                Value value;
                if (argument != Argument.f60792b) {
                    if (argument.mo59616j()) {
                        int h = argument.mo59614h();
                        this.f60808c |= 1;
                        this.f60809d = h;
                    }
                    if (argument.mo59617k()) {
                        Value i = argument.mo59615i();
                        if ((this.f60808c & 2) != 2 || (value = this.f60810e) == Value.f60794b) {
                            this.f60810e = i;
                        } else {
                            Value.C23992b bVar = new Value.C23992b();
                            bVar.mo59650i(value);
                            bVar.mo59650i(i);
                            this.f60810e = bVar.mo59649h();
                        }
                        this.f60808c |= 2;
                    }
                    this.f61054b = this.f61054b.mo61617b(argument.unknownFields);
                }
            }

            /* renamed from: j */
            public final void mo59655j(C24078c cVar, C24079d dVar) throws IOException {
                Argument argument;
                try {
                    Argument.f60793c.getClass();
                    mo59654i(new Argument(cVar, dVar));
                    return;
                } catch (InvalidProtocolBufferException e) {
                    argument = (Argument) e.mo60009a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
                if (argument != null) {
                    mo59654i(argument);
                }
                throw th;
            }

            /* renamed from: n */
            public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                mo59655j(cVar, dVar);
                return this;
            }
        }

        static {
            Argument argument = new Argument();
            f60792b = argument;
            argument.nameId_ = 0;
            argument.value_ = Value.f60794b;
        }

        public Argument(GeneratedMessageLite.C24066b bVar) {
            super(0);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.f61054b;
        }

        /* renamed from: a */
        public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo59976m(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo59978o(2, this.value_);
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
                i2 = 0 + CodedOutputStream.m60026b(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m60028d(2, this.value_);
            }
            int size = this.unknownFields.size() + i2;
            this.memoizedSerializedSize = size;
            return size;
        }

        /* renamed from: h */
        public final int mo59614h() {
            return this.nameId_;
        }

        /* renamed from: i */
        public final Value mo59615i() {
            return this.value_;
        }

        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo59616j()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!mo59617k()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!this.value_.isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        /* renamed from: j */
        public final boolean mo59616j() {
            return (this.bitField0_ & 1) == 1;
        }

        /* renamed from: k */
        public final boolean mo59617k() {
            return (this.bitField0_ & 2) == 2;
        }

        public final C24090h.C24091a newBuilderForType() {
            return new C23994b();
        }

        public final C24090h.C24091a toBuilder() {
            C23994b bVar = new C23994b();
            bVar.mo59654i(this);
            return bVar;
        }

        public static final class Value extends GeneratedMessageLite implements C25099f {

            /* renamed from: b */
            public static final Value f60794b;

            /* renamed from: c */
            public static C23991a f60795c = new C23991a();
            /* access modifiers changed from: private */
            public ProtoBuf$Annotation annotation_;
            /* access modifiers changed from: private */
            public int arrayDimensionCount_;
            /* access modifiers changed from: private */
            public List<Value> arrayElement_;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public int classId_;
            /* access modifiers changed from: private */
            public double doubleValue_;
            /* access modifiers changed from: private */
            public int enumValueId_;
            /* access modifiers changed from: private */
            public int flags_;
            /* access modifiers changed from: private */
            public float floatValue_;
            /* access modifiers changed from: private */
            public long intValue_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public int stringValue_;
            /* access modifiers changed from: private */
            public Type type_;
            /* access modifiers changed from: private */
            public final C25091a unknownFields;

            public enum Type implements C24084f.C24085a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                
                private static C24084f.C24086b<Type> internalValueMap;
                private final int value;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$a */
                public static class C23990a implements C24084f.C24086b<Type> {
                    /* renamed from: a */
                    public final C24084f.C24085a mo59642a(int i) {
                        return Type.valueOf(i);
                    }
                }

                /* access modifiers changed from: public */
                static {
                    internalValueMap = new C23990a();
                }

                private Type(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Type valueOf(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$a */
            public static class C23991a extends C24077b<Value> {
                /* renamed from: a */
                public final Object mo59643a(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                    return new Value(cVar, dVar);
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b */
            public static final class C23992b extends GeneratedMessageLite.C24066b<Value, C23992b> implements C25099f {

                /* renamed from: c */
                public int f60796c;

                /* renamed from: d */
                public Type f60797d = Type.BYTE;

                /* renamed from: e */
                public long f60798e;

                /* renamed from: f */
                public float f60799f;

                /* renamed from: g */
                public double f60800g;

                /* renamed from: h */
                public int f60801h;

                /* renamed from: i */
                public int f60802i;

                /* renamed from: j */
                public int f60803j;

                /* renamed from: k */
                public ProtoBuf$Annotation f60804k = ProtoBuf$Annotation.f60790b;

                /* renamed from: l */
                public List<Value> f60805l = Collections.emptyList();

                /* renamed from: m */
                public int f60806m;

                /* renamed from: n */
                public int f60807n;

                /* renamed from: b */
                public final /* bridge */ /* synthetic */ C24074a.C24075a mo59644b(C24078c cVar, C24079d dVar) throws IOException {
                    mo59651j(cVar, dVar);
                    return this;
                }

                public final C24090h build() {
                    Value h = mo59649h();
                    if (h.isInitialized()) {
                        return h;
                    }
                    throw new UninitializedMessageException();
                }

                public final Object clone() throws CloneNotSupportedException {
                    C23992b bVar = new C23992b();
                    bVar.mo59650i(mo59649h());
                    return bVar;
                }

                /* renamed from: f */
                public final GeneratedMessageLite.C24066b mo59647f() {
                    C23992b bVar = new C23992b();
                    bVar.mo59650i(mo59649h());
                    return bVar;
                }

                /* renamed from: g */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.C24066b mo59648g(GeneratedMessageLite generatedMessageLite) {
                    mo59650i((Value) generatedMessageLite);
                    return this;
                }

                /* renamed from: h */
                public final Value mo59649h() {
                    Value value = new Value(this);
                    int i = this.f60796c;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    value.type_ = this.f60797d;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    value.intValue_ = this.f60798e;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    value.floatValue_ = this.f60799f;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    value.doubleValue_ = this.f60800g;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    value.stringValue_ = this.f60801h;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    value.classId_ = this.f60802i;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    value.enumValueId_ = this.f60803j;
                    if ((i & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                        i2 |= RecyclerView.C1119a0.FLAG_IGNORE;
                    }
                    value.annotation_ = this.f60804k;
                    if ((this.f60796c & 256) == 256) {
                        this.f60805l = Collections.unmodifiableList(this.f60805l);
                        this.f60796c &= -257;
                    }
                    value.arrayElement_ = this.f60805l;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    value.arrayDimensionCount_ = this.f60806m;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    value.flags_ = this.f60807n;
                    value.bitField0_ = i2;
                    return value;
                }

                /* renamed from: i */
                public final void mo59650i(Value value) {
                    ProtoBuf$Annotation protoBuf$Annotation;
                    if (value != Value.f60794b) {
                        if (value.mo59631N()) {
                            Type D = value.mo59621D();
                            D.getClass();
                            this.f60796c |= 1;
                            this.f60797d = D;
                        }
                        if (value.mo59629L()) {
                            long B = value.mo59619B();
                            this.f60796c |= 2;
                            this.f60798e = B;
                        }
                        if (value.mo59628K()) {
                            float A = value.mo59618A();
                            this.f60796c |= 4;
                            this.f60799f = A;
                        }
                        if (value.mo59625H()) {
                            double x = value.mo59638x();
                            this.f60796c |= 8;
                            this.f60800g = x;
                        }
                        if (value.mo59630M()) {
                            int C = value.mo59620C();
                            this.f60796c |= 16;
                            this.f60801h = C;
                        }
                        if (value.mo59624G()) {
                            int w = value.mo59637w();
                            this.f60796c |= 32;
                            this.f60802i = w;
                        }
                        if (value.mo59626I()) {
                            int y = value.mo59639y();
                            this.f60796c |= 64;
                            this.f60803j = y;
                        }
                        if (value.mo59622E()) {
                            ProtoBuf$Annotation s = value.mo59633s();
                            if ((this.f60796c & RecyclerView.C1119a0.FLAG_IGNORE) != 128 || (protoBuf$Annotation = this.f60804k) == ProtoBuf$Annotation.f60790b) {
                                this.f60804k = s;
                            } else {
                                C23996b bVar = new C23996b();
                                bVar.mo59657i(protoBuf$Annotation);
                                bVar.mo59657i(s);
                                this.f60804k = bVar.mo59656h();
                            }
                            this.f60796c |= RecyclerView.C1119a0.FLAG_IGNORE;
                        }
                        if (!value.arrayElement_.isEmpty()) {
                            if (this.f60805l.isEmpty()) {
                                this.f60805l = value.arrayElement_;
                                this.f60796c &= -257;
                            } else {
                                if ((this.f60796c & 256) != 256) {
                                    this.f60805l = new ArrayList(this.f60805l);
                                    this.f60796c |= 256;
                                }
                                this.f60805l.addAll(value.arrayElement_);
                            }
                        }
                        if (value.mo59623F()) {
                            int t = value.mo59634t();
                            this.f60796c |= 512;
                            this.f60806m = t;
                        }
                        if (value.mo59627J()) {
                            int z = value.mo59640z();
                            this.f60796c |= 1024;
                            this.f60807n = z;
                        }
                        this.f61054b = this.f61054b.mo61617b(value.unknownFields);
                    }
                }

                /* renamed from: j */
                public final void mo59651j(C24078c cVar, C24079d dVar) throws IOException {
                    Value value;
                    try {
                        Value.f60795c.getClass();
                        mo59650i(new Value(cVar, dVar));
                        return;
                    } catch (InvalidProtocolBufferException e) {
                        value = (Value) e.mo60009a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (value != null) {
                        mo59650i(value);
                    }
                    throw th;
                }

                /* renamed from: n */
                public final /* bridge */ /* synthetic */ C24090h.C24091a mo59652n(C24078c cVar, C24079d dVar) throws IOException {
                    mo59651j(cVar, dVar);
                    return this;
                }
            }

            static {
                Value value = new Value();
                f60794b = value;
                value.mo59632O();
            }

            public Value(GeneratedMessageLite.C24066b bVar) {
                super(0);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.f61054b;
            }

            /* renamed from: A */
            public final float mo59618A() {
                return this.floatValue_;
            }

            /* renamed from: B */
            public final long mo59619B() {
                return this.intValue_;
            }

            /* renamed from: C */
            public final int mo59620C() {
                return this.stringValue_;
            }

            /* renamed from: D */
            public final Type mo59621D() {
                return this.type_;
            }

            /* renamed from: E */
            public final boolean mo59622E() {
                return (this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128;
            }

            /* renamed from: F */
            public final boolean mo59623F() {
                return (this.bitField0_ & 256) == 256;
            }

            /* renamed from: G */
            public final boolean mo59624G() {
                return (this.bitField0_ & 32) == 32;
            }

            /* renamed from: H */
            public final boolean mo59625H() {
                return (this.bitField0_ & 8) == 8;
            }

            /* renamed from: I */
            public final boolean mo59626I() {
                return (this.bitField0_ & 64) == 64;
            }

            /* renamed from: J */
            public final boolean mo59627J() {
                return (this.bitField0_ & 512) == 512;
            }

            /* renamed from: K */
            public final boolean mo59628K() {
                return (this.bitField0_ & 4) == 4;
            }

            /* renamed from: L */
            public final boolean mo59629L() {
                return (this.bitField0_ & 2) == 2;
            }

            /* renamed from: M */
            public final boolean mo59630M() {
                return (this.bitField0_ & 16) == 16;
            }

            /* renamed from: N */
            public final boolean mo59631N() {
                return (this.bitField0_ & 1) == 1;
            }

            /* renamed from: O */
            public final void mo59632O() {
                this.type_ = Type.BYTE;
                this.intValue_ = 0;
                this.floatValue_ = BitmapDescriptorFactory.HUE_RED;
                this.doubleValue_ = 0.0d;
                this.stringValue_ = 0;
                this.classId_ = 0;
                this.enumValueId_ = 0;
                this.annotation_ = ProtoBuf$Annotation.f60790b;
                this.arrayElement_ = Collections.emptyList();
                this.arrayDimensionCount_ = 0;
                this.flags_ = 0;
            }

            /* renamed from: a */
            public final void mo59605a(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.mo59975l(1, this.type_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    codedOutputStream.mo59987x(2, 0);
                    codedOutputStream.mo59986w((j >> 63) ^ (j << 1));
                }
                if ((this.bitField0_ & 4) == 4) {
                    float f = this.floatValue_;
                    codedOutputStream.mo59987x(3, 5);
                    codedOutputStream.mo59983t(Float.floatToRawIntBits(f));
                }
                if ((this.bitField0_ & 8) == 8) {
                    double d = this.doubleValue_;
                    codedOutputStream.mo59987x(4, 1);
                    codedOutputStream.mo59984u(Double.doubleToRawLongBits(d));
                }
                if ((this.bitField0_ & 16) == 16) {
                    codedOutputStream.mo59976m(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    codedOutputStream.mo59976m(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    codedOutputStream.mo59976m(7, this.enumValueId_);
                }
                if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                    codedOutputStream.mo59978o(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    codedOutputStream.mo59978o(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & 512) == 512) {
                    codedOutputStream.mo59976m(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    codedOutputStream.mo59976m(11, this.arrayDimensionCount_);
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
                    i = CodedOutputStream.m60025a(1, this.type_.getNumber()) + 0;
                } else {
                    i = 0;
                }
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    i += CodedOutputStream.m60031g((j >> 63) ^ (j << 1)) + CodedOutputStream.m60032h(2);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i += CodedOutputStream.m60032h(3) + 4;
                }
                if ((this.bitField0_ & 8) == 8) {
                    i += CodedOutputStream.m60032h(4) + 8;
                }
                if ((this.bitField0_ & 16) == 16) {
                    i += CodedOutputStream.m60026b(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    i += CodedOutputStream.m60026b(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    i += CodedOutputStream.m60026b(7, this.enumValueId_);
                }
                if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                    i += CodedOutputStream.m60028d(8, this.annotation_);
                }
                for (int i3 = 0; i3 < this.arrayElement_.size(); i3++) {
                    i += CodedOutputStream.m60028d(9, this.arrayElement_.get(i3));
                }
                if ((this.bitField0_ & 512) == 512) {
                    i += CodedOutputStream.m60026b(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    i += CodedOutputStream.m60026b(11, this.arrayDimensionCount_);
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
                if (!mo59622E() || this.annotation_.isInitialized()) {
                    for (int i = 0; i < this.arrayElement_.size(); i++) {
                        if (!mo59635u(i).isInitialized()) {
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
                return new C23992b();
            }

            /* renamed from: s */
            public final ProtoBuf$Annotation mo59633s() {
                return this.annotation_;
            }

            /* renamed from: t */
            public final int mo59634t() {
                return this.arrayDimensionCount_;
            }

            public final C24090h.C24091a toBuilder() {
                C23992b bVar = new C23992b();
                bVar.mo59650i(this);
                return bVar;
            }

            /* renamed from: u */
            public final Value mo59635u(int i) {
                return this.arrayElement_.get(i);
            }

            /* renamed from: v */
            public final List<Value> mo59636v() {
                return this.arrayElement_;
            }

            /* renamed from: w */
            public final int mo59637w() {
                return this.classId_;
            }

            /* renamed from: x */
            public final double mo59638x() {
                return this.doubleValue_;
            }

            /* renamed from: y */
            public final int mo59639y() {
                return this.enumValueId_;
            }

            /* renamed from: z */
            public final int mo59640z() {
                return this.flags_;
            }

            public Value() {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = C25091a.f63298b;
            }

            public Value(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                mo59632O();
                C25091a.C25093b bVar = new C25091a.C25093b();
                CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int n = cVar.mo60032n();
                        switch (n) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int k = cVar.mo60029k();
                                Type valueOf = Type.valueOf(k);
                                if (valueOf != null) {
                                    this.bitField0_ |= 1;
                                    this.type_ = valueOf;
                                    break;
                                } else {
                                    j.mo59985v(n);
                                    j.mo59985v(k);
                                    break;
                                }
                            case 16:
                                this.bitField0_ |= 2;
                                long l = cVar.mo60030l();
                                this.intValue_ = (-(l & 1)) ^ (l >>> 1);
                                break;
                            case 29:
                                this.bitField0_ |= 4;
                                this.floatValue_ = Float.intBitsToFloat(cVar.mo60027i());
                                break;
                            case 33:
                                this.bitField0_ |= 8;
                                this.doubleValue_ = Double.longBitsToDouble(cVar.mo60028j());
                                break;
                            case 40:
                                this.bitField0_ |= 16;
                                this.stringValue_ = cVar.mo60029k();
                                break;
                            case 48:
                                this.bitField0_ |= 32;
                                this.classId_ = cVar.mo60029k();
                                break;
                            case 56:
                                this.bitField0_ |= 64;
                                this.enumValueId_ = cVar.mo60029k();
                                break;
                            case 66:
                                C23996b bVar2 = null;
                                if ((this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
                                    ProtoBuf$Annotation protoBuf$Annotation = this.annotation_;
                                    protoBuf$Annotation.getClass();
                                    C23996b bVar3 = new C23996b();
                                    bVar3.mo59657i(protoBuf$Annotation);
                                    bVar2 = bVar3;
                                }
                                ProtoBuf$Annotation protoBuf$Annotation2 = (ProtoBuf$Annotation) cVar.mo60025g(ProtoBuf$Annotation.f60791c, dVar);
                                this.annotation_ = protoBuf$Annotation2;
                                if (bVar2 != null) {
                                    bVar2.mo59657i(protoBuf$Annotation2);
                                    this.annotation_ = bVar2.mo59656h();
                                }
                                this.bitField0_ |= RecyclerView.C1119a0.FLAG_IGNORE;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.arrayElement_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.arrayElement_.add(cVar.mo60025g(f60795c, dVar));
                                break;
                            case 80:
                                this.bitField0_ |= 512;
                                this.flags_ = cVar.mo60029k();
                                break;
                            case 88:
                                this.bitField0_ |= 256;
                                this.arrayDimensionCount_ = cVar.mo60029k();
                                break;
                            default:
                                if (cVar.mo60035q(n, j)) {
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
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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

        public Argument() {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = C25091a.f63298b;
        }

        public Argument(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.nameId_ = 0;
            this.value_ = Value.f60794b;
            C25091a.C25093b bVar = new C25091a.C25093b();
            CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
            while (!z) {
                try {
                    int n = cVar.mo60032n();
                    if (n != 0) {
                        if (n == 8) {
                            this.bitField0_ |= 1;
                            this.nameId_ = cVar.mo60029k();
                        } else if (n == 18) {
                            Value.C23992b bVar2 = null;
                            if ((this.bitField0_ & 2) == 2) {
                                Value value = this.value_;
                                value.getClass();
                                Value.C23992b bVar3 = new Value.C23992b();
                                bVar3.mo59650i(value);
                                bVar2 = bVar3;
                            }
                            Value value2 = (Value) cVar.mo60025g(Value.f60795c, dVar);
                            this.value_ = value2;
                            if (bVar2 != null) {
                                bVar2.mo59650i(value2);
                                this.value_ = bVar2.mo59649h();
                            }
                            this.bitField0_ |= 2;
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

    public ProtoBuf$Annotation() {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C25091a.f63298b;
    }

    public ProtoBuf$Annotation(C24078c cVar, C24079d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.id_ = 0;
        this.argument_ = Collections.emptyList();
        C25091a.C25093b bVar = new C25091a.C25093b();
        CodedOutputStream j = CodedOutputStream.m60033j(bVar, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int n = cVar.mo60032n();
                if (n != 0) {
                    if (n == 8) {
                        this.bitField0_ |= 1;
                        this.id_ = cVar.mo60029k();
                    } else if (n == 18) {
                        if (!(z2 & true)) {
                            this.argument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.argument_.add(cVar.mo60025g(Argument.f60793c, dVar));
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
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
            this.argument_ = Collections.unmodifiableList(this.argument_);
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
