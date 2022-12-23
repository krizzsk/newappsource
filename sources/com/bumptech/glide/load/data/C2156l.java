package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.data.l */
public abstract class C2156l<T> implements C2142d<T> {

    /* renamed from: b */
    public final Uri f6976b;

    /* renamed from: c */
    public final ContentResolver f6977c;

    /* renamed from: d */
    public T f6978d;

    public C2156l(ContentResolver contentResolver, Uri uri) {
        this.f6977c = contentResolver;
        this.f6976b = uri;
    }

    /* renamed from: b */
    public final void mo6608b() {
        T t = this.f6978d;
        if (t != null) {
            try {
                mo10904c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo10904c(T t) throws IOException;

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo6610d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo6611e(Priority priority, C2142d.C2143a<? super T> aVar) {
        try {
            T f = mo10905f(this.f6977c, this.f6976b);
            this.f6978d = f;
            aVar.mo10914f(f);
        } catch (FileNotFoundException e) {
            aVar.mo10913c(e);
        }
    }

    /* renamed from: f */
    public abstract Object mo10905f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException;
}
