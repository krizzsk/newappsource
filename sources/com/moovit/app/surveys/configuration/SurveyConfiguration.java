package com.moovit.app.surveys.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.surveys.SurveyType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class SurveyConfiguration implements Parcelable {
    public static final Parcelable.Creator<SurveyConfiguration> CREATOR = new C15384a();

    /* renamed from: d */
    public static final C15385b f39845d = new C15385b();

    /* renamed from: e */
    public static final C15386c f39846e = new C15386c(SurveyConfiguration.class);

    /* renamed from: b */
    public Set<SurveyType> f39847b;

    /* renamed from: c */
    public int f39848c;

    /* renamed from: com.moovit.app.surveys.configuration.SurveyConfiguration$a */
    public class C15384a implements Parcelable.Creator<SurveyConfiguration> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyConfiguration) C19612n.m46981v(parcel, SurveyConfiguration.f39846e);
        }

        public final Object[] newArray(int i) {
            return new SurveyConfiguration[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.configuration.SurveyConfiguration$b */
    public class C15385b extends C19621u<SurveyConfiguration> {
        public C15385b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            SurveyConfiguration surveyConfiguration = (SurveyConfiguration) obj;
            qVar.mo51965h(surveyConfiguration.f39847b, SurveyType.CODER);
            qVar.mo51939l(surveyConfiguration.f39848c);
        }
    }

    /* renamed from: com.moovit.app.surveys.configuration.SurveyConfiguration$c */
    public class C15386c extends C19620t<SurveyConfiguration> {
        public C15386c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new SurveyConfiguration((Set) pVar.mo51960h(SurveyType.CODER, new HashSet()), pVar.mo51924l());
        }
    }

    public SurveyConfiguration(Set<SurveyType> set, int i) {
        C21100e.m49373x(set, "supportedTypes");
        this.f39847b = Collections.unmodifiableSet(set);
        this.f39848c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39845d);
    }
}
