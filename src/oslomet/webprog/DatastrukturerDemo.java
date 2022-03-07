package oslomet.webprog;

import java.util.*;

public class DatastrukturerDemo {

    public static void main(String[] args) {
        System.out.println("Live-koding - datastrukturer");

        // deklarering og initialisering
        int[] array = {1,34,5,42,54,23,8,66,99,87};

        List<Integer> enkelListe = new ArrayList<>();
        List<Integer> enkelListe2 = new ArrayList<>(Arrays.asList(1, 34));
        List<Integer> sammenkjedetListe = new LinkedList<>();
        List<Integer> stakk = new Stack<>();

        // sett inn
        enkelListe.add(array[0]);
        sammenkjedetListe.add(array[0]);
        stakk.add(array[0]);

        // skriv ut
        System.out.println(enkelListe.toString());
        System.out.println(enkelListe2.toString());
        System.out.println(sammenkjedetListe.toString());
        System.out.println(stakk.toString());

        // finn
        System.out.println(enkelListe.get(0));
        System.out.println(sammenkjedetListe.get(0));
        System.out.println(stakk.get(0));

        // slett
        enkelListe.remove(0);
        sammenkjedetListe.remove(0);
        stakk.remove(0);

        // størrelse/lengde
        System.out.println(enkelListe.size());
        System.out.println(sammenkjedetListe.size());
        System.out.println(stakk.size());

        // funksjoner for stakk
        Stack<Integer> stakk2 = (Stack<Integer>) stakk;
        stakk2.push(1);
        stakk2.push(2);
        stakk2.push(3);
        System.out.println(stakk2.size());
        System.out.println(stakk2.pop());
        System.out.println(stakk2.size());

        System.out.println("Ukeoppgaver - datastrukturer");

        // Sirkulær enveis liste
        System.out.println("Sirkulær enveis liste");

        MinSirkelListe minSirkelListe = new MinSirkelListe();

        minSirkelListe.leggTilNode(13);
        minSirkelListe.leggTilNode(7);
        minSirkelListe.leggTilNode(24);
        minSirkelListe.leggTilNode(1);
        minSirkelListe.leggTilNode(8);
        minSirkelListe.leggTilNode(37);
        minSirkelListe.leggTilNode(46);

        int tall = 8;

        if(minSirkelListe.inneholderNode(tall))
            System.out.println("Listen inneholder " + tall);
        else
            System.out.println("Listen inneholder ikke " + tall);

        minSirkelListe.slettNode(tall);

        if(minSirkelListe.inneholderNode(tall))
            System.out.println("Listen inneholder " + tall);
        else
            System.out.println("Listen inneholder ikke " + tall);

        minSirkelListe.skrivUt();

        // Stack
        System.out.println("Stakk!");

        MinStakk minStakk = new MinStakk();

        minStakk.push(11);
        minStakk.push(22);
        minStakk.push(33);
        minStakk.push(44);

        minStakk.skrivUt();

        System.out.println("Første tall i stakken er " + minStakk.se());

        minStakk.pop();
        minStakk.pop();

        minStakk.skrivUt();

        System.out.println("Første tall i stakken er " + minStakk.se());

        // enkel enveis liste
        System.out.println("Enkel enveis liste");

        MinListe minListe = new MinListe();

        minListe.leggTilNode(13);
        minListe.leggTilNode(7);
        minListe.leggTilNode(24);
        minListe.leggTilNode(1);
        minListe.leggTilNode(8);
        minListe.leggTilNode(37);
        minListe.leggTilNode(46);

        minListe.skrivUt();

        if(minListe.inneholderNode(tall))
            System.out.println("Listen inneholder " + tall);
        else
            System.out.println("Listen inneholder ikke " + tall);

        minListe.slettNode(tall);

        if(minListe.inneholderNode(tall))
            System.out.println("Listen inneholder " + tall);
        else
            System.out.println("Listen inneholder ikke " + tall);

        minListe.skrivUt();
    }
}