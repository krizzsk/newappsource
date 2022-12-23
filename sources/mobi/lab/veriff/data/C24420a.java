package mobi.lab.veriff.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b/\u00100B\u0017\b\u0016\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u0002010\u0013¢\u0006\u0004\b/\u00102J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004HÖ\u0001J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÂ\u0003J\t\u0010\u0016\u001a\u00020\bHÂ\u0003J-\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\bHÆ\u0001J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0006\u0010\u001d\u001a\u00020\u000eJ\u001a\u0010 \u001a\u00020\u000e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u001eJ\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0010R\u0011\u0010%\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0011\u0010)\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00063"}, mo59060d2 = {"Lmobi/lab/veriff/data/AuthenticationFlow;", "Landroid/os/Parcelable;", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "Lmobi/lab/veriff/data/AuthenticationFlowStep;", "step", "addStep", "", "component1", "component2", "component3", "flowSteps", "activeStepIndex", "isFinished", "copy", "stepIndex", "isLastStep", "moveToNextStep", "Lkotlin/Function1;", "predicate", "removeStepIf", "flow", "resetWith", "getActiveStep", "()Lmobi/lab/veriff/data/AuthenticationFlowStep;", "activeStep", "I", "getFinished", "()Z", "finished", "Ljava/util/List;", "Z", "getSteps", "()Ljava/util/List;", "steps", "<init>", "(Ljava/util/List;IZ)V", "Lcom/veriff/sdk/internal/data/FlowStep;", "(Ljava/util/List;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.data.a */
public final class C24420a implements Parcelable {
    public static final Parcelable.Creator<C24420a> CREATOR = new C24421a();

    /* renamed from: a */
    private List<? extends C24422b> f61808a;

    /* renamed from: b */
    private int f61809b;

    /* renamed from: c */
    private boolean f61810c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.data.a$a */
    public static class C24421a implements Parcelable.Creator<C24420a> {
        /* renamed from: a */
        public final C24420a createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((C24422b) parcel.readParcelable(C24420a.class.getClassLoader()));
                readInt--;
            }
            return new C24420a(arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        /* renamed from: a */
        public final C24420a[] newArray(int i) {
            return new C24420a[i];
        }
    }

    public C24420a(List<? extends C24422b> list, int i, boolean z) {
        C24362h.m61211f(list, "flowSteps");
        this.f61808a = list;
        this.f61809b = i;
        this.f61810c = z;
        if (!(!mo60556b().isEmpty())) {
            throw new IllegalArgumentException("Expected at least 1 flow step, got zero".toString());
        }
    }

    /* renamed from: a */
    public final boolean mo60555a() {
        return this.f61810c;
    }

    /* renamed from: b */
    public final List<C24422b> mo60556b() {
        return this.f61808a;
    }

    /* renamed from: c */
    public final void mo60558c() {
        if (m61403a(this.f61809b)) {
            this.f61810c = true;
        } else {
            this.f61809b++;
        }
    }

    /* renamed from: d */
    public final C24422b mo60559d() {
        return (C24422b) this.f61808a.get(this.f61809b);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24420a)) {
            return false;
        }
        C24420a aVar = (C24420a) obj;
        return C24362h.m61206a(this.f61808a, aVar.f61808a) && this.f61809b == aVar.f61809b && this.f61810c == aVar.f61810c;
    }

    public int hashCode() {
        List<? extends C24422b> list = this.f61808a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f61809b) * 31;
        boolean z = this.f61810c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AuthenticationFlow(flowSteps=");
        k.append(this.f61808a);
        k.append(", activeStepIndex=");
        k.append(this.f61809b);
        k.append(", isFinished=");
        return C25541a.m63885p(k, this.f61810c, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        List<? extends C24422b> list = this.f61808a;
        parcel.writeInt(list.size());
        for (C24422b writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f61809b);
        parcel.writeInt(this.f61810c ? 1 : 0);
    }

    /* renamed from: a */
    private final boolean m61403a(int i) {
        return i + 1 >= this.f61808a.size();
    }

    /* renamed from: b */
    public final void mo60557b(C24422b bVar) {
        C24362h.m61211f(bVar, "flow");
        this.f61808a = C17875h.m44280D(bVar);
        this.f61810c = false;
        this.f61809b = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24420a(List list, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z);
    }

    /* renamed from: a */
    public final void mo60554a(C24422b bVar) {
        C24362h.m61211f(bVar, "step");
        this.f61808a = C23825c.m58528y0(bVar, this.f61808a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24420a(java.util.List<? extends com.veriff.sdk.internal.C21791iy> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "steps"
            mf0.C24362h.m61211f(r8, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = cf0.C21136j.m49436X(r8, r0)
            r2.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x0014:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r8.next()
            com.veriff.sdk.internal.iy r0 = (com.veriff.sdk.internal.C21791iy) r0
            mobi.lab.veriff.data.b r1 = new mobi.lab.veriff.data.b
            r1.<init>((com.veriff.sdk.internal.C21791iy) r0)
            r2.add(r1)
            goto L_0x0014
        L_0x0029:
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.lab.veriff.data.C24420a.<init>(java.util.List):void");
    }

    /* renamed from: a */
    public final void mo60553a(C24236l<? super C24422b, Boolean> lVar) {
        C24362h.m61211f(lVar, "predicate");
        List<? extends C24422b> list = this.f61808a;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (!lVar.invoke((C24422b) next).booleanValue()) {
                arrayList.add(next);
            }
        }
        this.f61808a = arrayList;
    }
}
