package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.VeriffBranding;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.DrawableProvider;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0014HÆ\u0001R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo59060d2 = {"Lcom/veriff/sdk/legacy/LegacyDrawableProvider;", "Lmobi/lab/veriff/data/DrawableProvider;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "loadImage", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "Lcom/veriff/VeriffBranding$DrawableProvider;", "component1", "wrapped", "copy", "Lcom/veriff/VeriffBranding$DrawableProvider;", "getWrapped", "()Lcom/veriff/VeriffBranding$DrawableProvider;", "<init>", "(Lcom/veriff/VeriffBranding$DrawableProvider;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.np */
public final class C22085np implements DrawableProvider {
    public static final Parcelable.Creator<C22085np> CREATOR = new C22086a();

    /* renamed from: a */
    private final VeriffBranding.DrawableProvider f55715a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.np$a */
    public static class C22086a implements Parcelable.Creator<C22085np> {
        /* renamed from: a */
        public final C22085np createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22085np((VeriffBranding.DrawableProvider) parcel.readParcelable(C22085np.class.getClassLoader()));
        }

        /* renamed from: a */
        public final C22085np[] newArray(int i) {
            return new C22085np[i];
        }
    }

    public C22085np(VeriffBranding.DrawableProvider drawableProvider) {
        C24362h.m61211f(drawableProvider, "wrapped");
        this.f55715a = drawableProvider;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22085np) && C24362h.m61206a(this.f55715a, ((C22085np) obj).f55715a);
        }
        return true;
    }

    public int hashCode() {
        VeriffBranding.DrawableProvider drawableProvider = this.f55715a;
        if (drawableProvider != null) {
            return drawableProvider.hashCode();
        }
        return 0;
    }

    public Drawable loadImage(Context context) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        Drawable x0 = this.f55715a.mo38185x0();
        C24362h.m61210e(x0, "wrapped.loadImage(context)");
        return x0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("LegacyDrawableProvider(wrapped=");
        k.append(this.f55715a);
        k.append(")");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeParcelable(this.f55715a, i);
    }
}
