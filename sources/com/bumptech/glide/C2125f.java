package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.load.engine.C2172e;
import java.util.List;
import java.util.Map;
import p072e6.C4564b;
import p241s0.C6302b;
import p258t4.C6589c;
import p260t6.C6601f;
import p260t6.C6602g;

/* renamed from: com.bumptech.glide.f */
public final class C2125f extends ContextWrapper {

    /* renamed from: k */
    public static final C2115b f6907k = new C2115b();

    /* renamed from: a */
    public final C4564b f6908a;

    /* renamed from: b */
    public final Registry f6909b;

    /* renamed from: c */
    public final C6589c f6910c;

    /* renamed from: d */
    public final C2116c.C2117a f6911d;

    /* renamed from: e */
    public final List<C6601f<Object>> f6912e;

    /* renamed from: f */
    public final Map<Class<?>, C2135k<?, ?>> f6913f;

    /* renamed from: g */
    public final C2172e f6914g;

    /* renamed from: h */
    public final C2126g f6915h;

    /* renamed from: i */
    public final int f6916i;

    /* renamed from: j */
    public C6602g f6917j;

    public C2125f(Context context, C4564b bVar, Registry registry, C6589c cVar, C2116c.C2117a aVar, C6302b bVar2, List list, C2172e eVar, C2126g gVar, int i) {
        super(context.getApplicationContext());
        this.f6908a = bVar;
        this.f6909b = registry;
        this.f6910c = cVar;
        this.f6911d = aVar;
        this.f6912e = list;
        this.f6913f = bVar2;
        this.f6914g = eVar;
        this.f6915h = gVar;
        this.f6916i = i;
    }
}
