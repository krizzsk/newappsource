package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: com.bumptech.glide.load.data.d */
public interface C2142d<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    public interface C2143a<T> {
        /* renamed from: c */
        void mo10913c(Exception exc);

        /* renamed from: f */
        void mo10914f(T t);
    }

    /* renamed from: a */
    Class<T> mo6607a();

    /* renamed from: b */
    void mo6608b();

    void cancel();

    /* renamed from: d */
    DataSource mo6610d();

    /* renamed from: e */
    void mo6611e(Priority priority, C2143a<? super T> aVar);
}
