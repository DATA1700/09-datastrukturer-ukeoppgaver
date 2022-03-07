package oslomet.webprog;

public class MinListe {
    private Node hode = null;
    private Node hale = null;

    public void leggTilNode(int verdi) {
        Node nyNode = new Node(verdi);

        if (hode == null) {
            hode = nyNode;
        } else {
            hale.neste = nyNode;
        }

        hale = nyNode;
        hale.neste = null; // hode
    }

    public boolean inneholderNode(int sokeVerdi) {
        Node denneNoden = hode;

        if (hode == null) {
            return false; // tom liste
        } else {
            do {
                if (denneNoden.data == sokeVerdi) {
                    return true; // sokeVerdi funnet
                }
                denneNoden = denneNoden.neste;
            } while (denneNoden != null); // hode
            return false; // sokeVerdi ikke funnet
        }
    }

    public void slettNode(int slettVerdi) {
        Node denneNoden = hode;

        if (hode == null) { // tom liste
            return;
        }

        if (denneNoden.data == slettVerdi) { // treff på første element
            hode = denneNoden.neste;
            return;
        }

        while (denneNoden.neste != null) {
            Node nesteNode = denneNoden.neste;
            if (nesteNode.data == slettVerdi) {

                // oppdater neste peker, hopp over slettet element
                denneNoden.neste = nesteNode.neste;

                if (hale == nesteNode) { // siste node slettes
                    hale = denneNoden;
                    denneNoden.neste = null;
                }

                break;
            }
            denneNoden = nesteNode;
        }

        return;
    }

    public void skrivUt() {
        Node denneNoden = hode;

        if (hode != null) { // tom liste
            do {
                System.out.println(denneNoden.data + " ");
                denneNoden = denneNoden.neste;
            } while (denneNoden != null); // hode
        }
    }
}
