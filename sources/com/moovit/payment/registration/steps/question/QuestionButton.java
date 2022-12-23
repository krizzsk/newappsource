package com.moovit.payment.registration.steps.question;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.MessageButton;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class QuestionButton implements Parcelable {
    public static final Parcelable.Creator<QuestionButton> CREATOR = new C16404a();

    /* renamed from: d */
    public static final C16405b f42861d = new C16405b(QuestionButton.class);

    /* renamed from: b */
    public final String f42862b;

    /* renamed from: c */
    public final String f42863c;

    /* renamed from: com.moovit.payment.registration.steps.question.QuestionButton$a */
    public class C16404a implements Parcelable.Creator<QuestionButton> {
        public final Object createFromParcel(Parcel parcel) {
            return (QuestionButton) C19612n.m46981v(parcel, QuestionButton.f42861d);
        }

        public final Object[] newArray(int i) {
            return new QuestionButton[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.question.QuestionButton$b */
    public class C16405b extends C19619s<QuestionButton> {
        public C16405b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new QuestionButton(pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            QuestionButton questionButton = (QuestionButton) obj;
            qVar.mo51954p(questionButton.f42862b);
            qVar.mo51954p(questionButton.f42863c);
        }
    }

    public QuestionButton(String str, String str2) {
        C21100e.m49373x(str, "id");
        this.f42862b = str;
        C21100e.m49373x(str2, MessageButton.TEXT);
        this.f42863c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42861d);
    }
}
