package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;

public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public abstract JSONObject toJson();
}
