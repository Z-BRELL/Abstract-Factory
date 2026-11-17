package construction.abstractFactory;

public interface IProduitFactory {
    public ProduitA getProduitA();
    public ProduitB getProduitB();
    public ProduitC getProduitC();
}

class ProduitFactory1 implements IProduitFactory {
    public ProduitA getProduitA() { return new ProduitA1(); }
    public ProduitB getProduitB() { return new ProduitB1(); }
    public ProduitC getProduitC() { return new ProduitC1(); }
}

class ProduitFactory2 implements IProduitFactory {
    public ProduitA getProduitA() { return new ProduitA2(); }
    public ProduitB getProduitB() { return new ProduitB2(); }
    public ProduitC getProduitC() { return new ProduitC2(); }
}

class ProduitFactory3 implements IProduitFactory {
    public ProduitA getProduitA() { return new ProduitA3(); }
    public ProduitB getProduitB() { return new ProduitB3(); }
    public ProduitC getProduitC() { return new ProduitC3(); }
}
