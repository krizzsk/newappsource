package com.fyber.inneractive.sdk.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.t1 */
public final class C3584t1 {

    /* renamed from: a */
    public static final int f12572a = m9573a(1, 3);

    /* renamed from: b */
    public static final int f12573b = m9573a(1, 4);

    /* renamed from: c */
    public static final int f12574c = m9573a(2, 0);

    /* renamed from: d */
    public static final int f12575d = m9573a(3, 2);

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$b */
    public enum C3586b {
        DOUBLE(C3591c.DOUBLE, 1),
        FLOAT(C3591c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C3591c.BOOLEAN, 0),
        STRING(C3591c.STRING, 2) {
        },
        GROUP(r13, 3) {
            /* renamed from: f */
            public boolean mo15210f() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            /* renamed from: f */
            public boolean mo15210f() {
                return false;
            }
        },
        BYTES(C3591c.BYTE_STRING, 2) {
            /* renamed from: f */
            public boolean mo15210f() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(C3591c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a */
        public final C3591c f12595a;

        /* renamed from: b */
        public final int f12596b;

        /* renamed from: f */
        public boolean mo15210f() {
            return !(this instanceof C3587a);
        }

        /* access modifiers changed from: public */
        C3586b(C3591c cVar, int i) {
            this.f12595a = cVar;
            this.f12596b = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$c */
    public enum C3591c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C3508i.f12443b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a */
        public final Object f12607a;

        /* access modifiers changed from: public */
        C3591c(Object obj) {
            this.f12607a = obj;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$d */
    public enum C3592d {
        LOOSE {
            /* renamed from: a */
            public Object mo15211a(C3529j jVar) throws IOException {
                return jVar.mo15009r();
            }
        },
        STRICT {
            /* renamed from: a */
            public Object mo15211a(C3529j jVar) throws IOException {
                return jVar.mo15010s();
            }
        };

        /* 'enum' modifier removed */
        /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$d$c */
        public final class C3595c extends C3592d {
            public C3595c(String str, int i) {
                super(str, i);
            }

            /* renamed from: a */
            public Object mo15211a(C3529j jVar) throws IOException {
                return jVar.mo14995e();
            }
        }

        /* renamed from: a */
        public abstract Object mo15211a(C3529j jVar) throws IOException;
    }

    /* renamed from: a */
    public static int m9573a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: a */
    public static Object m9574a(C3529j jVar, C3586b bVar, C3592d dVar) throws IOException {
        switch (bVar.ordinal()) {
            case 0:
                return Double.valueOf(jVar.mo14997f());
            case 1:
                return Float.valueOf(jVar.mo15001j());
            case 2:
                return Long.valueOf(jVar.mo15003l());
            case 3:
                return Long.valueOf(jVar.mo15013v());
            case 4:
                return Integer.valueOf(jVar.mo15002k());
            case 5:
                return Long.valueOf(jVar.mo15000i());
            case 6:
                return Integer.valueOf(jVar.mo14999h());
            case 7:
                return Boolean.valueOf(jVar.mo14994d());
            case 8:
                return dVar.mo15211a(jVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return jVar.mo14995e();
            case 12:
                return Integer.valueOf(jVar.mo15012u());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(jVar.mo15005n());
            case 15:
                return Long.valueOf(jVar.mo15006o());
            case 16:
                return Integer.valueOf(jVar.mo15007p());
            case 17:
                return Long.valueOf(jVar.mo15008q());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
