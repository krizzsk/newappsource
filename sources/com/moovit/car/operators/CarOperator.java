package com.moovit.car.operators;

import android.content.Intent;
import com.moovit.MoovitActivity;
import com.moovit.car.requests.CarDetails;

public interface CarOperator {

    public enum Operator {
        DRIVE_NOW("Drive-Now");
        

        /* renamed from: id */
        private String f40834id;

        private Operator(String str) {
            this.f40834id = str;
        }

        public String getId() {
            return this.f40834id;
        }
    }

    /* renamed from: a */
    Operator mo46800a();

    /* renamed from: b */
    Intent mo46801b(MoovitActivity moovitActivity, CarDetails carDetails);

    /* renamed from: c */
    void mo46802c();

    /* renamed from: d */
    int mo46803d(byte b);

    /* renamed from: e */
    int mo46804e();
}
