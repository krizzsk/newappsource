package com.veriff.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/uploadmediastore/SessionUploadData;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lbf0/d;", "writeToParcel", "", "isSubmitForApprovalRequestDone", "Z", "()Z", "setSubmitForApprovalRequestDone", "(Z)V", "<init>", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.no */
public final class C22083no implements Parcelable {
    public static final Parcelable.Creator<C22083no> CREATOR = new C22084a();

    /* renamed from: a */
    private boolean f55714a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.no$a */
    public static class C22084a implements Parcelable.Creator<C22083no> {
        /* renamed from: a */
        public final C22083no createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "in");
            return new C22083no(parcel.readInt() != 0);
        }

        /* renamed from: a */
        public final C22083no[] newArray(int i) {
            return new C22083no[i];
        }
    }

    public C22083no() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public C22083no(boolean z) {
        this.f55714a = z;
    }

    /* renamed from: a */
    public final void mo55967a(boolean z) {
        this.f55714a = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "parcel");
        parcel.writeInt(this.f55714a ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22083no(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* renamed from: a */
    public final boolean mo55968a() {
        return this.f55714a;
    }
}
