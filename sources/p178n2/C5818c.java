package p178n2;

import androidx.paging.C1103a;
import androidx.paging.ContiguousPagedList;
import androidx.paging.DiffingChangePayload;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.C1241u;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.Collection;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import rf0.C24805g;
import rf0.C24806h;

/* renamed from: n2.c */
public final class C5818c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ PagedList<Object> f18765b;

    /* renamed from: c */
    public final /* synthetic */ PagedList<Object> f18766c;

    /* renamed from: d */
    public final /* synthetic */ C1103a<Object> f18767d;

    /* renamed from: e */
    public final /* synthetic */ int f18768e;

    /* renamed from: f */
    public final /* synthetic */ PagedList<Object> f18769f;

    /* renamed from: g */
    public final /* synthetic */ C5840q f18770g;

    /* renamed from: h */
    public final /* synthetic */ Runnable f18771h = null;

    /* renamed from: n2.c$a */
    public static final class C5819a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C1103a<Object> f18772b;

        /* renamed from: c */
        public final /* synthetic */ int f18773c;

        /* renamed from: d */
        public final /* synthetic */ PagedList<Object> f18774d;

        /* renamed from: e */
        public final /* synthetic */ PagedList<Object> f18775e;

        /* renamed from: f */
        public final /* synthetic */ C5827i f18776f;

        /* renamed from: g */
        public final /* synthetic */ C5840q f18777g;

        /* renamed from: h */
        public final /* synthetic */ PagedList<Object> f18778h;

        /* renamed from: i */
        public final /* synthetic */ Runnable f18779i;

        public C5819a(C1103a<Object> aVar, int i, PagedList<Object> pagedList, PagedList<Object> pagedList2, C5827i iVar, C5840q qVar, PagedList<Object> pagedList3, Runnable runnable) {
            this.f18772b = aVar;
            this.f18773c = i;
            this.f18774d = pagedList;
            this.f18775e = pagedList2;
            this.f18776f = iVar;
            this.f18777g = qVar;
            this.f18778h = pagedList3;
            this.f18779i = runnable;
        }

        public final void run() {
            C5827i iVar;
            int i;
            Runnable runnable;
            int i2;
            int i3;
            boolean z;
            int i4;
            int a;
            boolean z2;
            int i5;
            C1103a<Object> aVar = this.f18772b;
            if (aVar.f4167g == this.f18773c) {
                PagedList<Object> pagedList = this.f18774d;
                PagedList<Object> pagedList2 = this.f18775e;
                C5827i iVar2 = this.f18776f;
                C5840q qVar = this.f18777g;
                C5831m<T> mVar = this.f18778h.f4122e;
                int i6 = mVar.f18807c + mVar.f18812h;
                Runnable runnable2 = this.f18779i;
                C24362h.m61211f(pagedList, "newList");
                C24362h.m61211f(pagedList2, "diffSnapshot");
                C24362h.m61211f(iVar2, "diffResult");
                C24362h.m61211f(qVar, "recordingCallback");
                PagedList<T> pagedList3 = aVar.f4166f;
                if (pagedList3 == null || aVar.f4165e != null) {
                    throw new IllegalStateException("must be in snapshot state to apply diff");
                }
                aVar.f4165e = pagedList;
                pagedList.mo4408i((C24240p) aVar.f4168h);
                aVar.f4166f = null;
                C5831m<T> mVar2 = pagedList3.f4122e;
                C1241u a2 = aVar.mo4427a();
                C5831m<T> mVar3 = pagedList2.f4122e;
                C24362h.m61211f(mVar2, "<this>");
                C24362h.m61211f(mVar3, "newList");
                if (iVar2.f18793b) {
                    C5830l lVar = new C5830l(mVar2, mVar3, a2);
                    iVar2.f18792a.mo5103b(lVar);
                    int min = Math.min(mVar2.mo21704m(), lVar.f18801c);
                    runnable = runnable2;
                    int m = mVar3.mo21704m() - lVar.f18801c;
                    if (m > 0) {
                        if (min > 0) {
                            i = i6;
                            i5 = 0;
                            a2.mo5013c(0, min, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                        } else {
                            i = i6;
                            i5 = 0;
                        }
                        a2.mo5011a(i5, m);
                    } else {
                        i = i6;
                        if (m < 0) {
                            a2.mo5012b(0, -m);
                            int i7 = min + m;
                            if (i7 > 0) {
                                a2.mo5013c(0, i7, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                            }
                        }
                    }
                    lVar.f18801c = mVar3.mo21704m();
                    int min2 = Math.min(mVar2.mo21705p(), lVar.f18802d);
                    int p = mVar3.mo21705p();
                    int i8 = lVar.f18802d;
                    int i9 = p - i8;
                    iVar = iVar2;
                    int i11 = lVar.f18801c + lVar.f18803e + i8;
                    int i12 = i11 - min2;
                    if (i12 != mVar2.mo21703e() - min2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i9 > 0) {
                        a2.mo5011a(i11, i9);
                    } else if (i9 < 0) {
                        a2.mo5012b(i11 + i9, -i9);
                        min2 += i9;
                    }
                    if (min2 > 0 && z2) {
                        a2.mo5013c(i12, min2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                    }
                    lVar.f18802d = mVar3.mo21705p();
                } else {
                    iVar = iVar2;
                    runnable = runnable2;
                    i = i6;
                    int max = Math.max(mVar2.f18807c, mVar3.f18807c);
                    int min3 = Math.min(mVar2.f18811g + mVar2.f18807c, mVar3.f18811g + mVar3.f18807c);
                    int i13 = min3 - max;
                    if (i13 > 0) {
                        a2.mo5012b(max, i13);
                        a2.mo5011a(max, i13);
                    }
                    int min4 = Math.min(max, min3);
                    int max2 = Math.max(max, min3);
                    int i14 = mVar2.f18807c;
                    int e = mVar3.mo21703e();
                    if (i14 > e) {
                        i14 = e;
                    }
                    int i15 = mVar2.f18811g + mVar2.f18807c;
                    int e2 = mVar3.mo21703e();
                    if (i15 > e2) {
                        i15 = e2;
                    }
                    DiffingChangePayload diffingChangePayload = DiffingChangePayload.ITEM_TO_PLACEHOLDER;
                    int i16 = min4 - i14;
                    if (i16 > 0) {
                        a2.mo5013c(i14, i16, diffingChangePayload);
                    }
                    int i17 = i15 - max2;
                    if (i17 > 0) {
                        a2.mo5013c(max2, i17, diffingChangePayload);
                    }
                    int i18 = mVar3.f18807c;
                    int e3 = mVar2.mo21703e();
                    if (i18 > e3) {
                        i18 = e3;
                    }
                    int i19 = mVar3.f18811g + mVar3.f18807c;
                    int e4 = mVar2.mo21703e();
                    if (i19 > e4) {
                        i19 = e4;
                    }
                    DiffingChangePayload diffingChangePayload2 = DiffingChangePayload.PLACEHOLDER_TO_ITEM;
                    int i21 = min4 - i18;
                    if (i21 > 0) {
                        a2.mo5013c(i18, i21, diffingChangePayload2);
                    }
                    int i22 = i19 - max2;
                    if (i22 > 0) {
                        a2.mo5013c(max2, i22, diffingChangePayload2);
                    }
                    int e5 = mVar3.mo21703e() - mVar2.mo21703e();
                    if (e5 > 0) {
                        a2.mo5011a(mVar2.mo21703e(), e5);
                    } else if (e5 < 0) {
                        a2.mo5012b(mVar2.mo21703e() + e5, -e5);
                    }
                }
                C5817b bVar = aVar.f4170j;
                C24362h.m61211f(bVar, InneractiveMediationNameConsts.OTHER);
                C24806h C0 = C17885a.m44393C0(0, qVar.f18822a.size());
                C24362h.m61211f(C0, "<this>");
                int i23 = 3;
                C24362h.m61211f(3, "step");
                int i24 = C0.f62728b;
                int i25 = C0.f62729c;
                if (C0.f62730d <= 0) {
                    i23 = -3;
                }
                if (i23 == 0) {
                    throw new IllegalArgumentException("Step must be non-zero.");
                } else if (i23 != Integer.MIN_VALUE) {
                    int f = C14256d1.m35488f(i24, i25, i23);
                    if ((i23 > 0 && i24 <= f) || (i23 < 0 && f <= i24)) {
                        while (true) {
                            int i26 = i24 + i23;
                            int intValue = ((Number) qVar.f18822a.get(i24)).intValue();
                            if (intValue == 0) {
                                bVar.mo4415a(((Number) qVar.f18822a.get(i24 + 1)).intValue(), ((Number) qVar.f18822a.get(i24 + 2)).intValue());
                            } else if (intValue == 1) {
                                bVar.mo4416b(((Number) qVar.f18822a.get(i24 + 1)).intValue(), ((Number) qVar.f18822a.get(i24 + 2)).intValue());
                            } else if (intValue == 2) {
                                bVar.mo4417c(((Number) qVar.f18822a.get(i24 + 1)).intValue(), ((Number) qVar.f18822a.get(i24 + 2)).intValue());
                            } else {
                                throw new IllegalStateException("Unexpected recording value");
                            }
                            if (i24 == f) {
                                break;
                            }
                            i24 = i26;
                        }
                    }
                    qVar.f18822a.clear();
                    pagedList.mo4406e(aVar.f4170j);
                    if (!pagedList.isEmpty()) {
                        C5831m<T> mVar4 = pagedList3.f4122e;
                        C5831m<T> mVar5 = pagedList2.f4122e;
                        C24362h.m61211f(mVar4, "<this>");
                        C24362h.m61211f(mVar5, "newList");
                        C5827i iVar3 = iVar;
                        if (!iVar3.f18793b) {
                            i3 = C17885a.m44466v(i, C17885a.m44393C0(0, mVar5.mo21703e()));
                        } else {
                            int i27 = i;
                            int i28 = i27 - mVar4.f18807c;
                            int i29 = mVar4.f18811g;
                            if (i28 < 0 || i28 >= i29) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                int i31 = 0;
                                while (true) {
                                    int i32 = i31 + 1;
                                    int i33 = i31 / 2;
                                    if (i31 % 2 == 1) {
                                        i4 = -1;
                                    } else {
                                        i4 = 1;
                                    }
                                    int i34 = (i33 * i4) + i28;
                                    if (i34 >= 0 && i34 < mVar4.f18811g && (a = iVar3.f18792a.mo5102a(i34)) != -1) {
                                        i3 = mVar5.f18807c + a;
                                        break;
                                    } else if (i32 > 29) {
                                        break;
                                    } else {
                                        i31 = i32;
                                    }
                                }
                            }
                            int e6 = mVar5.mo21703e();
                            i2 = 0;
                            i3 = C17885a.m44466v(i27, C17885a.m44393C0(0, e6));
                            pagedList.mo4412u(C17885a.m44464u(i3, i2, pagedList.size() - 1));
                        }
                        i2 = 0;
                        pagedList.mo4412u(C17885a.m44464u(i3, i2, pagedList.size() - 1));
                    }
                    aVar.mo4428b(pagedList3, aVar.f4165e, runnable);
                } else {
                    throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
                }
            }
        }
    }

    public C5818c(PagedList pagedList, PagedList pagedList2, C1103a aVar, int i, ContiguousPagedList contiguousPagedList, C5840q qVar) {
        this.f18765b = pagedList;
        this.f18766c = pagedList2;
        this.f18767d = aVar;
        this.f18768e = i;
        this.f18769f = contiguousPagedList;
        this.f18770g = qVar;
    }

    public final void run() {
        boolean z;
        C5831m<T> mVar = this.f18765b.f4122e;
        C5831m<T> mVar2 = this.f18766c.f4122e;
        C1208m.C1213e<T> eVar = this.f18767d.f4162b.f4438b;
        C24362h.m61210e(eVar, "config.diffCallback");
        C24362h.m61211f(mVar, "<this>");
        C24362h.m61211f(mVar2, "newList");
        boolean z2 = true;
        C1208m.C1212d a = C1208m.m3293a(new C5829k(mVar, mVar2, eVar, mVar.f18811g, mVar2.f18811g), true);
        C24806h C0 = C17885a.m44393C0(0, mVar.f18811g);
        if (!(C0 instanceof Collection) || !((Collection) C0).isEmpty()) {
            C24805g p = C0.iterator();
            while (true) {
                if (!p.f62733d) {
                    break;
                }
                if (a.mo5102a(p.nextInt()) != -1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        C5827i iVar = new C5827i(a, z2);
        C1103a<Object> aVar = this.f18767d;
        aVar.f4163c.execute(new C5819a(aVar, this.f18768e, this.f18769f, this.f18766c, iVar, this.f18770g, this.f18765b, this.f18771h));
    }
}
