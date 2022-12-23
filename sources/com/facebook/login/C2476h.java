package com.facebook.login;

import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.C23825c;
import kotlin.random.Random;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24362h;
import rf0.C24801c;
import rf0.C24806h;

/* renamed from: com.facebook.login.h */
public final class C2476h {

    /* renamed from: a */
    public final Set<String> f8859a;

    /* renamed from: b */
    public final String f8860b;

    /* renamed from: c */
    public final String f8861c;

    public C2476h(List list) {
        boolean z;
        boolean z2;
        boolean z3;
        String uuid = UUID.randomUUID().toString();
        C24362h.m61210e(uuid, "randomUUID().toString()");
        C24806h hVar = new C24806h(43, RecyclerView.C1119a0.FLAG_IGNORE);
        Random.Default defaultR = Random.f60192b;
        C24362h.m61211f(defaultR, "random");
        try {
            int q0 = C21100e.m49360q0(defaultR, hVar);
            ArrayList y0 = C23825c.m58528y0('~', C23825c.m58528y0('_', C23825c.m58528y0('.', C23825c.m58528y0('-', C23825c.m58527x0(new C24801c('0', '9'), C23825c.m58525v0(new C24801c('a', 'z'), new C24801c('A', 'Z')))))));
            ArrayList arrayList = new ArrayList(q0);
            boolean z4 = false;
            for (int i = 0; i < q0; i++) {
                arrayList.add(Character.valueOf(((Character) C23825c.m58529z0(y0, Random.f60192b)).charValue()));
            }
            String q02 = C23825c.m58520q0(arrayList, "", (String) null, (String) null, (C24236l) null, 62);
            if (uuid.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = false;
            } else {
                if (C24179b.m60564L(uuid, ' ', 0, false, 6) >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = !z3;
            }
            if (z2 && C2488p.m6523b(q02)) {
                z4 = true;
            }
            if (z4) {
                HashSet hashSet = new HashSet(list);
                hashSet.add(Scopes.OPEN_ID);
                Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
                C24362h.m61210e(unmodifiableSet, "unmodifiableSet(permissions)");
                this.f8859a = unmodifiableSet;
                this.f8860b = uuid;
                this.f8861c = q02;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
