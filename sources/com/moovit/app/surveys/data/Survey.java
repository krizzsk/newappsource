package com.moovit.app.surveys.data;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.MoovitNotificationChannel;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.SurveyManagerReceiver;
import com.moovit.app.surveys.SurveyType;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.io.IOException;
import k10.C17993a;
import p067e1.C4522y;
import p389bl.C13641g;
import p543hq.C17474b;
import p595jw.C17948a;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20927a0;
import p977zz.C20941h;

public abstract class Survey implements Parcelable {

    /* renamed from: b */
    public final C15389Id f39851b;

    /* renamed from: c */
    public final String f39852c;

    /* renamed from: com.moovit.app.surveys.data.Survey$Id */
    public static class C15389Id implements Parcelable {
        public static final Parcelable.Creator<C15389Id> CREATOR = new C15390a();

        /* renamed from: f */
        public static C15391b f39853f = new C15391b(C15389Id.class);

        /* renamed from: b */
        public final ServerId f39854b;

        /* renamed from: c */
        public final ServerId f39855c;

        /* renamed from: d */
        public final String f39856d;

        /* renamed from: e */
        public final SurveyType f39857e;

        /* renamed from: com.moovit.app.surveys.data.Survey$Id$a */
        public class C15390a implements Parcelable.Creator<C15389Id> {
            public final Object createFromParcel(Parcel parcel) {
                return (C15389Id) C19612n.m46981v(parcel, C15389Id.f39853f);
            }

            public final Object[] newArray(int i) {
                return new C15389Id[i];
            }
        }

        /* renamed from: com.moovit.app.surveys.data.Survey$Id$b */
        public class C15391b extends C19619s<C15389Id> {
            public C15391b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                pVar.getClass();
                return new C15389Id(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51948t(), (SurveyType) SurveyType.CODER.read(pVar));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                C15389Id id = (C15389Id) obj;
                ServerId serverId = id.f39854b;
                qVar.getClass();
                qVar.mo51939l(serverId.f15142b);
                qVar.mo51939l(id.f39855c.f15142b);
                qVar.mo51955t(id.f39856d);
                SurveyType.CODER.write(id.f39857e, qVar);
            }
        }

        public C15389Id(ServerId serverId, ServerId serverId2, String str, SurveyType surveyType) {
            C21100e.m49373x(serverId, "metroId");
            this.f39854b = serverId;
            this.f39855c = serverId2;
            this.f39856d = str;
            C21100e.m49373x(surveyType, "surveyType");
            this.f39857e = surveyType;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("SurveyId[");
            k.append(this.f39854b);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f39855c);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f39856d);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f39857e);
            k.append("]");
            return k.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f39853f);
        }
    }

    public Survey(C15389Id id, String str) {
        C21100e.m49373x(id, "id");
        this.f39851b = id;
        C21100e.m49373x(str, "serverContext");
        this.f39852c = str;
    }

    /* renamed from: g */
    public static void m39400g(Intent intent) {
        intent.putExtra(C17993a.f46076b, "suppress_popups");
        intent.putExtra("SUPPRESS_ONBOARDING", true);
        intent.putExtra("suppress_genie_extra", true);
    }

    /* renamed from: b */
    public abstract Notification mo46004b(SurveyManager surveyManager);

    /* renamed from: c */
    public final C4522y mo46011c(SurveyManager surveyManager) {
        int f = C20941h.m49043f(R.attr.colorSecondary, surveyManager);
        C4522y build = MoovitNotificationChannel.SURVEYS.build(surveyManager);
        build.f15644y.icon = R.drawable.ic_notification_alert;
        build.f15636q = f;
        build.mo20033e(-1);
        String str = SurveyManagerReceiver.f39830a;
        String str2 = SurveyManagerReceiver.f39831b;
        Bundle bundle = new Bundle(1);
        bundle.putByteArray(SurveyManagerReceiver.f39832c, C13641g.m34110B(this, C17948a.f46011a));
        build.f15644y.deleteIntent = C20927a0.m49008c(surveyManager, SurveyManagerReceiver.class, str2, bundle, (Uri) null);
        build.mo20034f(8, true);
        return build;
    }

    /* renamed from: d */
    public abstract C17474b mo46005d();

    /* renamed from: f */
    public abstract void mo46007f(AppCompatActivity appCompatActivity);

    public final String toString() {
        return getClass().getSimpleName();
    }
}
