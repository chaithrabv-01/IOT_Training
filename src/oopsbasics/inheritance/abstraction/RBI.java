package oopsbasics.inheritance.abstraction;

abstract class RBI {

    RBI() {
        System.out.println("RBI constructor");
    }

    abstract int ROI();

    void welcome() {
        System.out.println("welcome");
    }

    static void termsAndConditions() {
        System.out.println("some terms and conditions are applied");
    }
}

class HDFC extends RBI {

    HDFC() {
        System.out.println("HDFC constructor");
    }

    @Override
    int ROI() {
        return 8;
    }

    @Override
    void welcome() {
        System.out.println("welcome HDFC");
    }
}

class SBI extends RBI {

    @Override
    int ROI() {
        return 9;
    }

    @Override
    void welcome() {
        System.out.println("welcome SBI");
    }
}

class drivercode {

    public static void main(String[] args) {

        HDFC h = new HDFC();

        h.welcome();
        RBI.termsAndConditions();
        System.out.println(h.ROI());

        SBI s = new SBI();

        s.welcome();
        RBI.termsAndConditions();
        System.out.println(s.ROI());
    }
}