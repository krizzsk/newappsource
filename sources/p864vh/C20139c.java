package p864vh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import p746qh.C19123c;

/* renamed from: vh.c */
public final class C20139c {

    /* renamed from: a */
    public final HashMap<View, String> f51105a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<View, C20140a> f51106b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, View> f51107c = new HashMap<>();

    /* renamed from: d */
    public final HashSet<View> f51108d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f51109e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f51110f = new HashSet<>();

    /* renamed from: g */
    public final HashMap<String, String> f51111g = new HashMap<>();

    /* renamed from: h */
    public final WeakHashMap f51112h = new WeakHashMap();

    /* renamed from: i */
    public boolean f51113i;

    /* renamed from: vh.c$a */
    public static class C20140a {

        /* renamed from: a */
        public final C19123c f51114a;

        /* renamed from: b */
        public final ArrayList<String> f51115b;

        public C20140a(C19123c cVar, String str) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f51115b = arrayList;
            this.f51114a = cVar;
            arrayList.add(str);
        }
    }
}
