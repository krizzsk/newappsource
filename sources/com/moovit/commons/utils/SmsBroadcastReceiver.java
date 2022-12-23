package com.moovit.commons.utils;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import mf0.C24361g;
import p977zz.C20943i;

@SuppressLint({"NewApi"})
public abstract class SmsBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public abstract void mo46996a();

    public final void onReceive(Context context, Intent intent) {
        if (C20943i.m49051d(19)) {
            Telephony.Sms.Intents.getMessagesFromIntent(intent);
        } else {
            Object[] objArr = (Object[]) intent.getExtras().get("pdus");
            if (!C24361g.m61154X(objArr)) {
                SmsMessage[] smsMessageArr = new SmsMessage[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                }
            }
        }
        mo46996a();
    }
}
