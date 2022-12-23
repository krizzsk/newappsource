package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.response.C3652i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.h */
public class C2824h implements C3652i {

    /* renamed from: a */
    public final /* synthetic */ List f9696a;

    /* renamed from: b */
    public final /* synthetic */ C2826j f9697b;

    public C2824h(C2825i iVar, List list, C2826j jVar) {
        this.f9696a = list;
        this.f9697b = jVar;
    }

    /* renamed from: a */
    public List<String> mo13613a(C2850q qVar) {
        if (this.f9696a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f9696a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f9697b.f9708a)));
            }
        }
        return arrayList;
    }
}
