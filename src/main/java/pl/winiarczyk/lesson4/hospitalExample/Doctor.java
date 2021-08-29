package pl.winiarczyk.lesson4.hospitalExample;

class Doctor extends Employee {

    //jako public dostęp jest dla każdej klasy
//    public String specialization;
//    public String license;

    //protected daje dostęp tylko dla obrębu pakietu
    protected String specialization;
    protected String license;

    //private ogranicza dostęp tylko do klasy w której się znajduje
//    private String specialization;
//    private String license;

    Doctor(final String specialization, final String license) {

        this.specialization = specialization;
        this.license = license;
    }

    @Override
    public double earnPayment() {
        return 4 * basicPayment;
    }

    //gettery
    public String getLicense() {
        return this.license;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    //settery

    public void setLicense(String license) {
        this.license = license;
    }


}
