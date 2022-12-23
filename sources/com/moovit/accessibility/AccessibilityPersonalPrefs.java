package com.moovit.accessibility;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import f00.C16913a;
import f00.C16919g;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class AccessibilityPersonalPrefs implements Parcelable {
    public static final Parcelable.Creator<AccessibilityPersonalPrefs> CREATOR = new C14691a();

    /* renamed from: d */
    public static final C14692b f37351d = new C14692b(AccessibilityPersonalPrefs.class);

    /* renamed from: b */
    public final boolean f37352b;

    /* renamed from: c */
    public final boolean f37353c;

    /* renamed from: com.moovit.accessibility.AccessibilityPersonalPrefs$a */
    public class C14691a implements Parcelable.Creator<AccessibilityPersonalPrefs> {
        public final Object createFromParcel(Parcel parcel) {
            return (AccessibilityPersonalPrefs) C19612n.m46981v(parcel, AccessibilityPersonalPrefs.f37351d);
        }

        public final Object[] newArray(int i) {
            return new AccessibilityPersonalPrefs[i];
        }
    }

    /* renamed from: com.moovit.accessibility.AccessibilityPersonalPrefs$b */
    public class C14692b extends C19619s<AccessibilityPersonalPrefs> {
        public C14692b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new AccessibilityPersonalPrefs(pVar.mo51919b(), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            AccessibilityPersonalPrefs accessibilityPersonalPrefs = (AccessibilityPersonalPrefs) obj;
            qVar.mo51934b(accessibilityPersonalPrefs.f37352b);
            qVar.mo51934b(accessibilityPersonalPrefs.f37353c);
        }
    }

    /* renamed from: com.moovit.accessibility.AccessibilityPersonalPrefs$c */
    public static class C14693c extends C16913a<AccessibilityPersonalPrefs> {

        /* renamed from: d */
        public final C16919g.C16920a f37354d = new C16919g.C16920a(C16913a.m42705e("accessibility_prefs", "accessible_routes"), false);

        /* renamed from: e */
        public final C16919g.C16920a f37355e = new C16919g.C16920a(C16913a.m42705e("accessibility_prefs", "train_assistance"), false);

        public C14693c(AccessibilityPersonalPrefs accessibilityPersonalPrefs) {
            super("accessibility_prefs", accessibilityPersonalPrefs);
        }

        /* renamed from: f */
        public final Object mo24471f(SharedPreferences sharedPreferences) {
            return new AccessibilityPersonalPrefs(this.f37354d.mo19759a(sharedPreferences).booleanValue(), this.f37355e.mo19759a(sharedPreferences).booleanValue());
        }

        /* renamed from: h */
        public final void mo24472h(SharedPreferences.Editor editor) {
            editor.remove(this.f37354d.f43935a);
            editor.remove(this.f37355e.f43935a);
        }

        /* renamed from: i */
        public final void mo24473i(SharedPreferences.Editor editor, Object obj) {
            AccessibilityPersonalPrefs accessibilityPersonalPrefs = (AccessibilityPersonalPrefs) obj;
            this.f37354d.mo19760c(editor, Boolean.valueOf(accessibilityPersonalPrefs.f37352b));
            this.f37355e.mo19760c(editor, Boolean.valueOf(accessibilityPersonalPrefs.f37353c));
        }
    }

    public AccessibilityPersonalPrefs() {
        this(false, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityPersonalPrefs)) {
            return false;
        }
        AccessibilityPersonalPrefs accessibilityPersonalPrefs = (AccessibilityPersonalPrefs) obj;
        if (this.f37352b == accessibilityPersonalPrefs.f37352b && this.f37353c == accessibilityPersonalPrefs.f37353c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.f37352b;
        return C17884p.m44333D(z ? 1 : 0, this.f37353c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37351d);
    }

    public AccessibilityPersonalPrefs(boolean z, boolean z2) {
        this.f37352b = z;
        this.f37353c = z2;
    }
}
