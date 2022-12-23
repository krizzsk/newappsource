package com.moovit.app.reports.service;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.MoovitActivity;
import com.moovit.app.reports.service.C15222d;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import p373au.C13535g;
import p618kv.C18152i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.moovit.app.reports.service.c */
public abstract class C15220c extends LinearLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f39242g = 0;

    /* renamed from: b */
    public final ListItemView f39243b;

    /* renamed from: c */
    public final EditText f39244c;

    /* renamed from: d */
    public final TextView f39245d;

    /* renamed from: e */
    public final FrameLayout f39246e = ((FrameLayout) findViewById(R.id.report_layout_content));

    /* renamed from: f */
    public final C15221a f39247f;

    /* renamed from: com.moovit.app.reports.service.c$a */
    public interface C15221a {
        /* renamed from: a */
        void mo45721a(C18152i iVar);

        /* renamed from: b */
        void mo45722b();
    }

    public C15220c(MoovitActivity moovitActivity, int i, int i2, C15222d.C15223a aVar) {
        super(moovitActivity);
        setOrientation(1);
        LayoutInflater.from(moovitActivity).inflate(R.layout.base_report_layout, this, true);
        this.f39247f = aVar;
        ListItemView listItemView = (ListItemView) findViewById(R.id.report_layout_title);
        this.f39243b = listItemView;
        listItemView.setTitle(i);
        ((TextInputLayout) findViewById(R.id.report_text_input)).setHint(i2);
        EditText editText = (EditText) findViewById(R.id.report_edit_text);
        this.f39244c = editText;
        editText.addTextChangedListener(new C15218a(this));
        TextView textView = (TextView) findViewById(R.id.send_button);
        this.f39245d = textView;
        textView.setOnClickListener(new C13535g(2, this, aVar));
    }

    /* renamed from: a */
    public void mo45719a(Editable editable) {
        this.f39245d.setEnabled(editable.length() > 0);
    }

    public abstract C18152i getResult();
}
