package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bf0.C21049c;
import kotlin.C23812a;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mg0.C24371a;
import zf0.C25448i0;

public final class TypeParameterUpperBoundEraser {

    /* renamed from: a */
    public final C21049c f60715a = C23812a.m58432b(new TypeParameterUpperBoundEraser$erroneousErasedBound$2(this));

    /* renamed from: b */
    public final RawSubstitution f60716b;

    /* renamed from: c */
    public final LockBasedStorageManager.C24148k f60717c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$a */
    public static final class C23942a {

        /* renamed from: a */
        public final C25448i0 f60718a;

        /* renamed from: b */
        public final boolean f60719b;

        /* renamed from: c */
        public final C24371a f60720c;

        public C23942a(C25448i0 i0Var, boolean z, C24371a aVar) {
            C24362h.m61211f(i0Var, "typeParameter");
            C24362h.m61211f(aVar, "typeAttr");
            this.f60718a = i0Var;
            this.f60719b = z;
            this.f60720c = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C23942a)) {
                return false;
            }
            C23942a aVar = (C23942a) obj;
            if (!C24362h.m61206a(aVar.f60718a, this.f60718a) || aVar.f60719b != this.f60719b) {
                return false;
            }
            C24371a aVar2 = aVar.f60720c;
            JavaTypeFlexibility javaTypeFlexibility = aVar2.f61707b;
            C24371a aVar3 = this.f60720c;
            if (javaTypeFlexibility == aVar3.f61707b && aVar2.f61706a == aVar3.f61706a && aVar2.f61708c == aVar3.f61708c && C24362h.m61206a(aVar2.f61710e, aVar3.f61710e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.f60718a.hashCode();
            int i2 = (hashCode * 31) + (this.f60719b ? 1 : 0) + hashCode;
            int hashCode2 = this.f60720c.f61707b.hashCode() + (i2 * 31) + i2;
            int hashCode3 = this.f60720c.f61706a.hashCode() + (hashCode2 * 31) + hashCode2;
            C24371a aVar = this.f60720c;
            int i3 = (hashCode3 * 31) + (aVar.f61708c ? 1 : 0) + hashCode3;
            int i4 = i3 * 31;
            C24312z zVar = aVar.f61710e;
            if (zVar == null) {
                i = 0;
            } else {
                i = zVar.hashCode();
            }
            return i4 + i + i3;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("DataToEraseUpperBound(typeParameter=");
            k.append(this.f60718a);
            k.append(", isRaw=");
            k.append(this.f60719b);
            k.append(", typeAttr=");
            k.append(this.f60720c);
            k.append(')');
            return k.toString();
        }
    }

    public TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution) {
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasion results");
        this.f60716b = rawSubstitution == null ? new RawSubstitution(this) : rawSubstitution;
        this.f60717c = lockBasedStorageManager.mo59020e(new TypeParameterUpperBoundEraser$getErasedUpperBound$1(this));
    }

    /* renamed from: a */
    public final C24307v mo59565a(C25448i0 i0Var, boolean z, C24371a aVar) {
        C24362h.m61211f(i0Var, "typeParameter");
        C24362h.m61211f(aVar, "typeAttr");
        return (C24307v) this.f60717c.invoke(new C23942a(i0Var, z, aVar));
    }
}
