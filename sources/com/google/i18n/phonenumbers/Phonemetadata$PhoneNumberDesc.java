package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Phonemetadata$PhoneNumberDesc implements Externalizable {
    private static final long serialVersionUID = 1;
    private String exampleNumber_ = "";
    private boolean hasExampleNumber;
    private boolean hasNationalNumberPattern;
    private String nationalNumberPattern_ = "";
    private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
    private List<Integer> possibleLength_ = new ArrayList();

    /* renamed from: a */
    public final String mo43828a() {
        return this.exampleNumber_;
    }

    /* renamed from: b */
    public final String mo43829b() {
        return this.nationalNumberPattern_;
    }

    /* renamed from: c */
    public final int mo43830c() {
        return this.possibleLength_.get(0).intValue();
    }

    /* renamed from: d */
    public final int mo43831d() {
        return this.possibleLength_.size();
    }

    /* renamed from: e */
    public final List<Integer> mo43832e() {
        return this.possibleLength_;
    }

    /* renamed from: f */
    public final List<Integer> mo43833f() {
        return this.possibleLengthLocalOnly_;
    }

    /* renamed from: g */
    public final boolean mo43834g() {
        return this.hasExampleNumber;
    }

    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.hasExampleNumber = true;
            this.exampleNumber_ = readUTF2;
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.hasNationalNumberPattern);
        if (this.hasNationalNumberPattern) {
            objectOutput.writeUTF(this.nationalNumberPattern_);
        }
        int d = mo43831d();
        objectOutput.writeInt(d);
        for (int i = 0; i < d; i++) {
            objectOutput.writeInt(this.possibleLength_.get(i).intValue());
        }
        int size = this.possibleLengthLocalOnly_.size();
        objectOutput.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i2).intValue());
        }
        objectOutput.writeBoolean(this.hasExampleNumber);
        if (this.hasExampleNumber) {
            objectOutput.writeUTF(this.exampleNumber_);
        }
    }
}
