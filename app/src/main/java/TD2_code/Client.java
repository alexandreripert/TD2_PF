package TD2_code;

public class Client<T,U> {
    public T taille;
    public U poids;
    public Client(T taille, U poids) {
    this.taille = taille;
    this.poids = poids;
    }
    @Override public String toString() {
    return String.format("(%s,%s)",taille.toString(),poids.toString());
    }
  }