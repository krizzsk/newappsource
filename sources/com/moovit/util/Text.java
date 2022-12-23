package com.moovit.util;

import aa0.C7545p;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import java.io.IOException;
import ka0.C12824c;
import p001a0.C0016g;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20943i;

public class Text implements Parcelable {
    public static final Parcelable.Creator<Text> CREATOR = new C7897a();

    /* renamed from: e */
    public static final C7898b f23874e = new C7898b();

    /* renamed from: f */
    public static final C7899c f23875f = new C7899c(Text.class);

    /* renamed from: b */
    public final String f23876b;

    /* renamed from: c */
    public final TextFormat f23877c;

    /* renamed from: d */
    public final String f23878d;

    /* renamed from: com.moovit.util.Text$a */
    public class C7897a implements Parcelable.Creator<Text> {
        public final Object createFromParcel(Parcel parcel) {
            return (Text) C19612n.m46981v(parcel, Text.f23875f);
        }

        public final Object[] newArray(int i) {
            return new Text[i];
        }
    }

    /* renamed from: com.moovit.util.Text$b */
    public class C7898b extends C19621u<Text> {
        public C7898b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Text text = (Text) obj;
            qVar.mo51955t(text.f23876b);
            TextFormat.CODER.write(text.f23877c, qVar);
            qVar.mo51955t(text.f23878d);
        }
    }

    /* renamed from: com.moovit.util.Text$c */
    public class C7899c extends C19620t<Text> {
        public C7899c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new Text(pVar.mo51948t(), TextFormat.CODER.read(pVar), pVar.mo51948t());
        }
    }

    public Text(String str, TextFormat textFormat, String str2) {
        this.f23876b = str;
        C21100e.m49373x(textFormat, "format");
        this.f23877c = textFormat;
        this.f23878d = str2;
    }

    /* renamed from: b */
    public static void m17954b(WebView webView, Text text) {
        String str;
        if (text.f23877c != TextFormat.HTML) {
            StringBuilder k = C13555b.m33972k("Attempting to display ");
            k.append(text.f23877c);
            k.append(" text in a WebView");
            throw new IllegalArgumentException(k.toString());
        } else if (!C20943i.m49051d(19) || webView.isLayoutDirectionResolved()) {
            webView.setHorizontalScrollBarEnabled(false);
            webView.setVerticalScrollBarEnabled(false);
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(false);
            settings.setGeolocationEnabled(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccess(false);
            settings.setBuiltInZoomControls(false);
            settings.setSupportZoom(false);
            C12824c.m32626a(settings);
            if (C15780a.m40269b(webView)) {
                str = C0016g.m31o(C13555b.m33972k("<html><body style='margin:0px;padding:0px;direction:rtl;'>"), text.f23876b, "</body></html>");
            } else {
                str = C0016g.m31o(C13555b.m33972k("<html><body style='margin:0px;padding:0px'>"), text.f23876b, "</body></html>");
            }
            WebView webView2 = webView;
            webView2.loadDataWithBaseURL(text.f23878d, C25541a.m63881k("<head><meta name=\"color-scheme\" content=\"dark light\"><style>img{display: inline;height: auto;max-width: 100%;}</style>", str), "text/html", "UTF-8", (String) null);
        } else {
            UiUtils.m40259r(webView, new C7545p(webView, text));
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23874e);
    }
}
