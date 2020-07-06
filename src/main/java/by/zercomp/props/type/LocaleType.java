package by.zercomp.props.type;

public enum LocaleType {

    BELARUS("RU", "BY"), GERMANY("DE", "DE"),
    FRANCE("FR", "FR"), SWEDEN("SV", "SE"),
    DEFAULT("", "");

    String lang;
    String country;

    LocaleType(String lang, String country) {
        this.lang = lang;
        this.country = country;
    }

    public String getLang() {
        return lang;
    }

    public String getCountry() {
        return country;
    }
}
