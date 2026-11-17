package construction.abstractFactory;

public abstract class ProduitC {
    public abstract void methodeC();
}

class ProduitC1 extends ProduitC {
    public void methodeC() {
        System.out.println("ProduitC1.methodeC()");
    }
}

class ProduitC2 extends ProduitC {
    public void methodeC() {
        System.out.println("ProduitC2.methodeC()");
    }
}

class ProduitC3 extends ProduitC {
    public void methodeC() {
        System.out.println("ProduitC3.methodeC()");
    }
}
