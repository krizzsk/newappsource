package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.b */
public abstract class C2140b<T> implements C2142d<T> {

    /* renamed from: b */
    public final String f6955b;

    /* renamed from: c */
    public final AssetManager f6956c;

    /* renamed from: d */
    public T f6957d;

    public C2140b(AssetManager assetManager, String str) {
        this.f6956c = assetManager;
        this.f6955b = str;
    }

    /* renamed from: b */
    public final void mo6608b() {
        T t = this.f6957d;
        if (t != null) {
            try {
                mo10906c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo10906c(T t) throws IOException;

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo6610d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo6611e(Priority priority, C2142d.C2143a<? super T> aVar) {
        try {
            T f = mo10907f(this.f6956c, this.f6955b);
            this.f6957d = f;
            aVar.mo10914f(f);
        } catch (IOException e) {
            aVar.mo10913c(e);
        }
    }

    /* renamed from: f */
    public abstract T mo10907f(AssetManager assetManager, String str) throws IOException;
}
