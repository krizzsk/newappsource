package p291w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p066e0.C4425e0;

/* renamed from: w.c */
public final class C6959c extends C4425e0<C6958b> {
    public C6959c(C6958b... bVarArr) {
        this.f15497a.addAll(Arrays.asList(bVarArr));
    }

    /* renamed from: a */
    public final C6959c clone() {
        C6959c cVar = new C6959c(new C6958b[0]);
        cVar.f15497a.addAll(Collections.unmodifiableList(new ArrayList(this.f15497a)));
        return cVar;
    }
}
