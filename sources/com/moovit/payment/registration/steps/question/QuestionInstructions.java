package com.moovit.payment.registration.steps.question;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.payment.registration.steps.question.QuestionButton;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class QuestionInstructions implements Parcelable {
    public static final Parcelable.Creator<QuestionInstructions> CREATOR = new C16406a();

    /* renamed from: h */
    public static final C16407b f42864h = new C16407b(QuestionInstructions.class);

    /* renamed from: b */
    public final String f42865b;

    /* renamed from: c */
    public final Image f42866c;

    /* renamed from: d */
    public final String f42867d;

    /* renamed from: e */
    public final String f42868e;

    /* renamed from: f */
    public final QuestionButton f42869f;

    /* renamed from: g */
    public final QuestionButton f42870g;

    /* renamed from: com.moovit.payment.registration.steps.question.QuestionInstructions$a */
    public class C16406a implements Parcelable.Creator<QuestionInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (QuestionInstructions) C19612n.m46981v(parcel, QuestionInstructions.f42864h);
        }

        public final Object[] newArray(int i) {
            return new QuestionInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.question.QuestionInstructions$b */
    public class C16407b extends C19619s<QuestionInstructions> {
        public C16407b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            QuestionButton.C16405b bVar = QuestionButton.f42861d;
            return new QuestionInstructions(pVar.mo51947p(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d), t, t2, (QuestionButton) pVar.mo51962q(bVar), (QuestionButton) pVar.mo51962q(bVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            QuestionInstructions questionInstructions = (QuestionInstructions) obj;
            qVar.mo51954p(questionInstructions.f42865b);
            qVar.mo51967q(questionInstructions.f42866c, C16019d.m40803a().f41718d);
            qVar.mo51955t(questionInstructions.f42867d);
            qVar.mo51955t(questionInstructions.f42868e);
            QuestionButton questionButton = questionInstructions.f42869f;
            QuestionButton.C16405b bVar = QuestionButton.f42861d;
            qVar.mo51967q(questionButton, bVar);
            qVar.mo51967q(questionInstructions.f42870g, bVar);
        }
    }

    public QuestionInstructions(String str, Image image, String str2, String str3, QuestionButton questionButton, QuestionButton questionButton2) {
        C21100e.m49373x(str, "questionId");
        this.f42865b = str;
        this.f42866c = image;
        this.f42867d = str2;
        this.f42868e = str3;
        this.f42869f = questionButton;
        this.f42870g = questionButton2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42864h);
    }
}
