package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Phonemetadata$NumberFormat implements Externalizable {
    private static final long serialVersionUID = 1;
    private String domesticCarrierCodeFormattingRule_ = "";
    private String format_ = "";
    private boolean hasDomesticCarrierCodeFormattingRule;
    private boolean hasFormat;
    private boolean hasNationalPrefixFormattingRule;
    private boolean hasNationalPrefixOptionalWhenFormatting;
    private boolean hasPattern;
    private List<String> leadingDigitsPattern_ = new ArrayList();
    private String nationalPrefixFormattingRule_ = "";
    private boolean nationalPrefixOptionalWhenFormatting_ = false;
    private String pattern_ = "";

    public static final class Builder extends Phonemetadata$NumberFormat {
        /* renamed from: s */
        public final void mo43791s(Phonemetadata$NumberFormat phonemetadata$NumberFormat) {
            if (phonemetadata$NumberFormat.mo43783m()) {
                mo43788r(phonemetadata$NumberFormat.mo43778h());
            }
            if (phonemetadata$NumberFormat.mo43780j()) {
                mo43785o(phonemetadata$NumberFormat.getFormat());
            }
            for (int i = 0; i < phonemetadata$NumberFormat.mo43774e(); i++) {
                mo43770a(phonemetadata$NumberFormat.mo43773d(i));
            }
            if (phonemetadata$NumberFormat.mo43781k()) {
                mo43786p(phonemetadata$NumberFormat.mo43775f());
            }
            if (phonemetadata$NumberFormat.mo43779i()) {
                mo43784n(phonemetadata$NumberFormat.mo43772c());
            }
            if (phonemetadata$NumberFormat.mo43782l()) {
                mo43787q(phonemetadata$NumberFormat.mo43776g());
            }
        }
    }

    /* renamed from: a */
    public final void mo43770a(String str) {
        str.getClass();
        this.leadingDigitsPattern_.add(str);
    }

    /* renamed from: b */
    public final void mo43771b() {
        this.hasNationalPrefixFormattingRule = false;
        this.nationalPrefixFormattingRule_ = "";
    }

    /* renamed from: c */
    public final String mo43772c() {
        return this.domesticCarrierCodeFormattingRule_;
    }

    /* renamed from: d */
    public final String mo43773d(int i) {
        return this.leadingDigitsPattern_.get(i);
    }

    /* renamed from: e */
    public final int mo43774e() {
        return this.leadingDigitsPattern_.size();
    }

    /* renamed from: f */
    public final String mo43775f() {
        return this.nationalPrefixFormattingRule_;
    }

    /* renamed from: g */
    public final boolean mo43776g() {
        return this.nationalPrefixOptionalWhenFormatting_;
    }

    public final String getFormat() {
        return this.format_;
    }

    /* renamed from: h */
    public final String mo43778h() {
        return this.pattern_;
    }

    /* renamed from: i */
    public final boolean mo43779i() {
        return this.hasDomesticCarrierCodeFormattingRule;
    }

    /* renamed from: j */
    public final boolean mo43780j() {
        return this.hasFormat;
    }

    /* renamed from: k */
    public final boolean mo43781k() {
        return this.hasNationalPrefixFormattingRule;
    }

    /* renamed from: l */
    public final boolean mo43782l() {
        return this.hasNationalPrefixOptionalWhenFormatting;
    }

    /* renamed from: m */
    public final boolean mo43783m() {
        return this.hasPattern;
    }

    /* renamed from: n */
    public final void mo43784n(String str) {
        this.hasDomesticCarrierCodeFormattingRule = true;
        this.domesticCarrierCodeFormattingRule_ = str;
    }

    /* renamed from: o */
    public final void mo43785o(String str) {
        this.hasFormat = true;
        this.format_ = str;
    }

    /* renamed from: p */
    public final void mo43786p(String str) {
        this.hasNationalPrefixFormattingRule = true;
        this.nationalPrefixFormattingRule_ = str;
    }

    /* renamed from: q */
    public final void mo43787q(boolean z) {
        this.hasNationalPrefixOptionalWhenFormatting = true;
        this.nationalPrefixOptionalWhenFormatting_ = z;
    }

    /* renamed from: r */
    public final void mo43788r(String str) {
        this.hasPattern = true;
        this.pattern_ = str;
    }

    public final void readExternal(ObjectInput objectInput) throws IOException {
        mo43788r(objectInput.readUTF());
        mo43785o(objectInput.readUTF());
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.leadingDigitsPattern_.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            mo43786p(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            mo43784n(objectInput.readUTF());
        }
        mo43787q(objectInput.readBoolean());
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.pattern_);
        objectOutput.writeUTF(this.format_);
        int e = mo43774e();
        objectOutput.writeInt(e);
        for (int i = 0; i < e; i++) {
            objectOutput.writeUTF(this.leadingDigitsPattern_.get(i));
        }
        objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
        if (this.hasNationalPrefixFormattingRule) {
            objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
        }
        objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
        if (this.hasDomesticCarrierCodeFormattingRule) {
            objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
        }
        objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
    }
}
