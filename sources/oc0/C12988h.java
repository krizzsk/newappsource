package oc0;

/* renamed from: oc0.h */
public class C12988h implements C12985e {
    public String _description;
    public Object[] _errorArguments;
    private Enum _errorCategory;

    public C12988h(Enum<?> enumR, String str, Object... objArr) {
        this._errorCategory = enumR;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public String getDomain() {
        return null;
    }

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
