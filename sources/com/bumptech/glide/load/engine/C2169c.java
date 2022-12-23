package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import p025b6.C1487b;

/* renamed from: com.bumptech.glide.load.engine.c */
public interface C2169c {

    /* renamed from: com.bumptech.glide.load.engine.c$a */
    public interface C2170a {
        /* renamed from: a */
        void mo10922a(C1487b bVar, Object obj, C2142d<?> dVar, DataSource dataSource, C1487b bVar2);

        /* renamed from: b */
        void mo10923b(C1487b bVar, Exception exc, C2142d<?> dVar, DataSource dataSource);

        /* renamed from: g */
        void mo10928g();
    }

    void cancel();

    /* renamed from: d */
    boolean mo10954d();
}
