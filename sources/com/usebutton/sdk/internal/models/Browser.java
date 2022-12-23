package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.BrowserDTO;
import com.usebutton.sdk.internal.api.models.WidgetDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;
import java.util.ArrayList;
import java.util.List;

public class Browser implements Parcelable {
    public static final Parcelable.Creator<Browser> CREATOR = new Parcelable.Creator<Browser>() {
        public Browser createFromParcel(Parcel parcel) {
            return new Browser(parcel);
        }

        public Browser[] newArray(int i) {
            return new Browser[i];
        }
    };
    public static final String TARGET_BROWSER = "browser";
    public static final String TARGET_WEBVIEW = "webview";
    public static final String TARGET_WEBVIEW_ONLY = "webview-only";
    private final Text action;
    private final Autofill autofill;
    private final BrowserCardMap browserCardMap;
    private final InstallSheet installSheet;
    private final Widget launchWidget;
    private final int primaryColor;
    private final Text subtitle;
    private final String target;
    private final Text title;
    private final List<Widget> widgets;

    public Browser(int i, String str, Text text, Text text2, Text text3, InstallSheet installSheet2, BrowserCardMap browserCardMap2, Autofill autofill2, Widget widget, List<Widget> list) {
        this.primaryColor = i;
        this.target = str;
        this.title = text;
        this.subtitle = text2;
        this.action = text3;
        this.installSheet = installSheet2;
        this.browserCardMap = browserCardMap2;
        this.autofill = autofill2;
        this.launchWidget = widget;
        this.widgets = list;
    }

    public static Browser fromDTO(BrowserDTO browserDTO, String str, String str2) {
        if (browserDTO == null) {
            return null;
        }
        Text fromDTO = Text.fromDTO(browserDTO.titleText);
        Text text = new Text(fromDTO.getColor(), str2);
        Text fromDTO2 = Text.fromDTO(browserDTO.actionText);
        InstallSheet fromDTO3 = InstallSheet.fromDTO(browserDTO.installSheet);
        BrowserCardMap fromDTO4 = BrowserCardMap.fromDTO(browserDTO.browserCardMapDTO);
        Autofill fromDTO5 = Autofill.fromDTO(browserDTO.autofillDTO);
        Widget fromDTO6 = Widget.fromDTO(browserDTO.launchWidget);
        ArrayList arrayList = new ArrayList();
        for (WidgetDTO fromDTO7 : browserDTO.widgetDTOList) {
            arrayList.add(Widget.fromDTO(fromDTO7));
        }
        return new Browser(ButtonUtil.safeColorValue(browserDTO.primaryColor), str, text, fromDTO, fromDTO2, fromDTO3, fromDTO4, fromDTO5, fromDTO6, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Browser browser = (Browser) obj;
        if (this.primaryColor != browser.primaryColor) {
            return false;
        }
        String str = this.target;
        if (str == null ? browser.target != null : !str.equals(browser.target)) {
            return false;
        }
        Text text = this.title;
        if (text == null ? browser.title != null : !text.equals(browser.title)) {
            return false;
        }
        Text text2 = this.subtitle;
        if (text2 == null ? browser.subtitle != null : !text2.equals(browser.subtitle)) {
            return false;
        }
        Text text3 = this.action;
        if (text3 == null ? browser.action != null : !text3.equals(browser.action)) {
            return false;
        }
        InstallSheet installSheet2 = this.installSheet;
        if (installSheet2 == null ? browser.installSheet != null : !installSheet2.equals(browser.installSheet)) {
            return false;
        }
        BrowserCardMap browserCardMap2 = this.browserCardMap;
        if (browserCardMap2 == null ? browser.browserCardMap != null : !browserCardMap2.equals(browser.browserCardMap)) {
            return false;
        }
        Autofill autofill2 = this.autofill;
        if (autofill2 == null ? browser.autofill != null : !autofill2.equals(browser.autofill)) {
            return false;
        }
        Widget widget = this.launchWidget;
        if (widget == null ? browser.launchWidget != null : !widget.equals(browser.launchWidget)) {
            return false;
        }
        List<Widget> list = this.widgets;
        List<Widget> list2 = browser.widgets;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public Text getAction() {
        return this.action;
    }

    public Autofill getAutofill() {
        return this.autofill;
    }

    public BrowserCardMap getCardsMap() {
        return this.browserCardMap;
    }

    public InstallSheet getInstallSheet() {
        return this.installSheet;
    }

    public Widget getLaunchWidget() {
        return this.launchWidget;
    }

    public int getPrimaryColor() {
        return this.primaryColor;
    }

    public Text getSubtitle() {
        return this.subtitle;
    }

    public Text getTitle() {
        return this.title;
    }

    public List<Widget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.primaryColor * 31;
        String str = this.target;
        int i11 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i12 = (i9 + i) * 31;
        Text text = this.title;
        if (text != null) {
            i2 = text.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 31;
        Text text2 = this.subtitle;
        if (text2 != null) {
            i3 = text2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        Text text3 = this.action;
        if (text3 != null) {
            i4 = text3.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        InstallSheet installSheet2 = this.installSheet;
        if (installSheet2 != null) {
            i5 = installSheet2.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        BrowserCardMap browserCardMap2 = this.browserCardMap;
        if (browserCardMap2 != null) {
            i6 = browserCardMap2.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        Autofill autofill2 = this.autofill;
        if (autofill2 != null) {
            i7 = autofill2.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        Widget widget = this.launchWidget;
        if (widget != null) {
            i8 = widget.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        List<Widget> list = this.widgets;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i19 + i11;
    }

    public boolean isTargetBrowser() {
        return TARGET_BROWSER.equals(this.target);
    }

    public boolean isTargetWebView() {
        return TARGET_WEBVIEW.equals(this.target);
    }

    public boolean isTargetWebViewOnly() {
        return TARGET_WEBVIEW_ONLY.equals(this.target);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Browser{primaryColor=");
        k.append(this.primaryColor);
        k.append(", target='");
        C25541a.m63890u(k, this.target, '\'', ", title='");
        k.append(this.title);
        k.append('\'');
        k.append(", subtitle='");
        k.append(this.subtitle);
        k.append('\'');
        k.append(", action='");
        k.append(this.action);
        k.append('\'');
        k.append(", installSheet='");
        k.append(this.installSheet);
        k.append('\'');
        k.append(", cards='");
        k.append(this.browserCardMap);
        k.append(", autofill='");
        k.append(this.autofill);
        k.append(", launchWidget");
        k.append(this.launchWidget);
        k.append(", widgets");
        return C13555b.m33970i(k, this.widgets, '}');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.primaryColor);
        parcel.writeString(this.target);
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.subtitle, i);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.installSheet, i);
        parcel.writeParcelable(this.browserCardMap, i);
        parcel.writeParcelable(this.autofill, i);
        parcel.writeParcelable(this.launchWidget, i);
        parcel.writeList(this.widgets);
    }

    public Browser(Parcel parcel) {
        this.primaryColor = parcel.readInt();
        this.target = parcel.readString();
        this.title = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.subtitle = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.action = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.installSheet = (InstallSheet) parcel.readParcelable(InstallSheet.class.getClassLoader());
        this.browserCardMap = (BrowserCardMap) parcel.readParcelable(BrowserCardMap.class.getClassLoader());
        this.autofill = (Autofill) parcel.readParcelable(Autofill.class.getClassLoader());
        this.launchWidget = (Widget) parcel.readParcelable(Widget.class.getClassLoader());
        this.widgets = parcel.readArrayList(Widget.class.getClassLoader());
    }
}
