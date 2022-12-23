package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.measurement.C2825i;
import com.fyber.inneractive.sdk.response.C3652i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: com.fyber.inneractive.sdk.model.vast.b */
public class C2835b implements C3652i {

    /* renamed from: a */
    public String f9737a;

    /* renamed from: b */
    public String f9738b;

    /* renamed from: c */
    public Map<C2850q, List<String>> f9739c = new HashMap();

    /* renamed from: d */
    public PriorityQueue<C2846m> f9740d;

    /* renamed from: e */
    public final List<C2825i> f9741e = new ArrayList();

    /* renamed from: f */
    public PriorityQueue<C2836c> f9742f;

    /* renamed from: g */
    public C2836c f9743g = null;

    /* renamed from: h */
    public int f9744h = 0;

    /* renamed from: i */
    public int f9745i = 0;

    public C2835b(Comparator<C2846m> comparator, Comparator<C2836c> comparator2) {
        this.f9740d = new PriorityQueue<>(1, comparator);
        this.f9742f = new PriorityQueue<>(1, comparator2);
    }

    /* renamed from: a */
    public List<String> mo13613a(C2850q qVar) {
        Map<C2850q, List<String>> map = this.f9739c;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: b */
    public List<C2846m> mo13634b() {
        return new ArrayList(this.f9740d);
    }

    /* renamed from: c */
    public List<C2825i> mo13635c() {
        return this.f9741e;
    }

    /* renamed from: a */
    public int mo13632a() {
        return this.f9740d.size();
    }

    /* renamed from: a */
    public void mo13633a(C2850q qVar, String str) {
        List list = this.f9739c.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f9739c.put(qVar, list);
        }
        list.add(str);
    }
}
