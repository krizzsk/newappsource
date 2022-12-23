package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.Build;
import android.p014os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.config.o */
public class C2680o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f9355a;

    /* renamed from: com.fyber.inneractive.sdk.config.o$a */
    public class C2681a implements Runnable {
        public C2681a() {
        }

        public void run() {
            IAConfigManager iAConfigManager = C2680o.this.f9355a;
            iAConfigManager.f9232t.mo13730c(iAConfigManager.f9205B);
        }
    }

    public C2680o(IAConfigManager iAConfigManager) {
        this.f9355a = iAConfigManager;
    }

    public void run() {
        IAConfigManager iAConfigManager = this.f9355a;
        if (iAConfigManager.f9229q == null) {
            Context context = iAConfigManager.f9218f;
            HashSet hashSet = new HashSet();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            List<InputMethodInfo> list = null;
            try {
                list = inputMethodManager.getEnabledInputMethodList();
            } catch (Throwable unused) {
            }
            if (list != null) {
                int i = 0;
                for (InputMethodInfo enabledInputMethodSubtypeList : list) {
                    for (InputMethodSubtype next : inputMethodManager.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                        if (next.getMode().equals("keyboard") && i < 10) {
                            String locale = next.getLocale();
                            if (!TextUtils.isEmpty(locale)) {
                                try {
                                    String replace = locale.replace("_", "-");
                                    hashSet.add(replace);
                                    IAlog.m9902a("Available input language: %s", replace);
                                    i++;
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)));
                } else {
                    Locale locale2 = Locale.getDefault();
                    if (locale2 != null) {
                        hashSet.add(locale2.toString().replace("_", "-"));
                    }
                }
            }
            iAConfigManager.f9229q = new ArrayList(hashSet);
        }
        C3714n.f12902b.post(new C2681a());
    }
}
