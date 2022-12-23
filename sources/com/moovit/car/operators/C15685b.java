package com.moovit.car.operators;

import android.content.Intent;
import android.net.Uri;
import com.moovit.MoovitActivity;
import com.moovit.car.operators.CarOperator;
import com.moovit.car.requests.CarDetails;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.Locale;
import p824tp.C19739q;
import p977zz.C20964s0;
import p977zz.C20975x0;

/* renamed from: com.moovit.car.operators.b */
public final class C15685b implements CarOperator {
    /* renamed from: a */
    public final CarOperator.Operator mo46800a() {
        return CarOperator.Operator.DRIVE_NOW;
    }

    /* renamed from: b */
    public final Intent mo46801b(MoovitActivity moovitActivity, CarDetails carDetails) {
        if (!C20975x0.m49121h(moovitActivity, "com.dn.drivenow")) {
            return new Intent("android.intent.action.VIEW", Uri.parse("https://app.adjust.com/2nr04y"));
        }
        Object[] objArr = {carDetails.f40839b};
        String str = C20964s0.f52718a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format((Locale) null, "drivenow://mobile.details?vin=%1$s", objArr)));
        intent.addFlags(268435456);
        if (!moovitActivity.getPackageManager().queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX).isEmpty()) {
            return intent;
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("https://app.adjust.com/2nr04y"));
    }

    /* renamed from: c */
    public final void mo46802c() {
    }

    /* renamed from: d */
    public final int mo46803d(byte b) {
        if (b == 0) {
            return C19739q.img_drive_now_interior_00;
        }
        if (b == 1 || b == 2) {
            return C19739q.img_drive_now_interior_01;
        }
        if (b == 3) {
            return C19739q.img_drive_now_interior_02;
        }
        if (b == 4) {
            return C19739q.img_drive_now_interior_03;
        }
        if (b != 5) {
            return C19739q.img_drive_now_interior_01;
        }
        return C19739q.img_drive_now_interior_04;
    }

    /* renamed from: e */
    public final int mo46804e() {
        return C19739q.img_drive_now_logo;
    }
}
