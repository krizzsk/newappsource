package com.moovit.inputfields;

import aa0.C7546q;
import p810sz.C19577c;
import p977zz.C20943i;

public enum InputFieldType {
    ;
    
    public static final C19577c<InputFieldType> CODER = null;
    public final String autoFillHint;
    public final int inputType;
    public final C7546q.C7547a validator;

    /* access modifiers changed from: public */
    static {
        String str;
        String str2;
        String str3;
        C7546q.C7547a.C7548a aVar = C7546q.C7547a.f23031a;
        if (C20943i.m49051d(26)) {
            str = "username";
        } else {
            str = null;
        }
        InputFieldType inputFieldType = new InputFieldType("USERNAME", 0, aVar, 1, str);
        USERNAME = inputFieldType;
        C7546q.C7547a.C7550c cVar = C7546q.C7547a.f23032b;
        if (C20943i.m49051d(26)) {
            str2 = "emailAddress";
        } else {
            str2 = null;
        }
        InputFieldType inputFieldType2 = new InputFieldType("EMAIL", 1, cVar, 33, str2);
        EMAIL = inputFieldType2;
        if (C20943i.m49051d(26)) {
            str3 = "password";
        } else {
            str3 = null;
        }
        C7546q.C7547a.C7548a aVar2 = aVar;
        InputFieldType inputFieldType3 = new InputFieldType("PASSWORD", 2, aVar2, 129, str3);
        PASSWORD = inputFieldType3;
        InputFieldType inputFieldType4 = new InputFieldType("TEXT", 3, aVar2, 1, (String) null);
        TEXT = inputFieldType4;
        InputFieldType inputFieldType5 = new InputFieldType("NUMBER", 4, aVar2, 2, (String) null);
        NUMBER = inputFieldType5;
        $VALUES = new InputFieldType[]{inputFieldType, inputFieldType2, inputFieldType3, inputFieldType4, inputFieldType5};
        CODER = new C19577c<>(InputFieldType.class, inputFieldType, inputFieldType2, inputFieldType3, inputFieldType4, inputFieldType5);
    }

    private InputFieldType(C7546q.C7547a aVar, int i, String str) {
        this.validator = aVar;
        this.inputType = i;
        this.autoFillHint = str;
    }
}
