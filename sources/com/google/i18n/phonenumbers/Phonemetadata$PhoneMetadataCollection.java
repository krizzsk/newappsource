package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Phonemetadata$PhoneMetadataCollection implements Externalizable {
    private static final long serialVersionUID = 1;
    private List<Phonemetadata$PhoneMetadata> metadata_ = new ArrayList();

    /* renamed from: a */
    public final List<Phonemetadata$PhoneMetadata> mo43825a() {
        return this.metadata_;
    }

    public final void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = new Phonemetadata$PhoneMetadata();
            phonemetadata$PhoneMetadata.readExternal(objectInput);
            this.metadata_.add(phonemetadata$PhoneMetadata);
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        int size = this.metadata_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.metadata_.get(i).writeExternal(objectOutput);
        }
    }
}
