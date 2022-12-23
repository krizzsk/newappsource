package com.moovit.payment.registration.steps.p419cc;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.util.Locale;
import p130j2.C5367a;

/* renamed from: com.moovit.payment.registration.steps.cc.WebInstruction */
public class WebInstruction implements Parcelable {
    public static final Parcelable.Creator<WebInstruction> CREATOR = new C16366a();

    /* renamed from: b */
    public final String f42777b;

    /* renamed from: c */
    public final String f42778c;

    /* renamed from: d */
    public final String f42779d;

    /* renamed from: e */
    public final String f42780e;

    /* renamed from: com.moovit.payment.registration.steps.cc.WebInstruction$a */
    public class C16366a implements Parcelable.Creator<WebInstruction> {
        public final Object createFromParcel(Parcel parcel) {
            return new WebInstruction(parcel);
        }

        public final Object[] newArray(int i) {
            return new WebInstruction[i];
        }
    }

    public WebInstruction(String str, String str2, String str3, String str4) {
        C21100e.m49373x(str, "successUrl");
        this.f42777b = str;
        C21100e.m49373x(str2, "failureUrl");
        this.f42778c = str2;
        C21100e.m49373x(str3, "rejectUrl");
        this.f42779d = str3;
        C21100e.m49373x(str4, "cancelUrl");
        this.f42780e = str4;
    }

    /* renamed from: b */
    public static WebInstruction m41734b(String str, String str2) {
        Locale locale = Locale.ENGLISH;
        return new WebInstruction(String.format(locale, "https://%s/%s/result/success", new Object[]{str, str2}), String.format(locale, "https://%s/%s/result/failure", new Object[]{str, str2}), String.format(locale, "https://%s/%s/result/reject", new Object[]{str, str2}), String.format(locale, "https://%s/%s/result/cancel", new Object[]{str, str2}));
    }

    /* renamed from: c */
    public static WebInstruction m41735c(String str, String str2) {
        Locale locale = Locale.ENGLISH;
        return new WebInstruction(String.format(locale, "%s://%s/result/success", new Object[]{str, str2}), String.format(locale, "%s://%s/result/failure", new Object[]{str, str2}), String.format(locale, "%s://%s/result/reject", new Object[]{str, str2}), String.format(locale, "%s://%s/result/cancel", new Object[]{str, str2}));
    }

    /* renamed from: d */
    public static IntentFilter m41736d(Context context) {
        return new IntentFilter(context.getPackageName() + ".webinstruction.result");
    }

    /* renamed from: f */
    public static void m41737f(Context context, Uri uri) {
        Intent intent = new Intent(context.getPackageName() + ".webinstruction.result");
        intent.putExtra("result", uri);
        C5367a.m13473a(context).mo21147c(intent);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42777b);
        parcel.writeString(this.f42778c);
        parcel.writeString(this.f42779d);
        parcel.writeString(this.f42780e);
    }

    public WebInstruction(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "successUrl");
        this.f42777b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "failureUrl");
        this.f42778c = readString2;
        String readString3 = parcel.readString();
        C21100e.m49373x(readString3, "rejectUrl");
        this.f42779d = readString3;
        String readString4 = parcel.readString();
        C21100e.m49373x(readString4, "cancelUrl");
        this.f42780e = readString4;
    }
}
