public class Main {
    public static void main(String[] args) {

        Employe e1 = new Employe(16533353L,57057,"oualhi","eya");
        Employe e3 = new Employe(16544443L,50057,"khayat","ameni");
        Employe e4 = new Employe(16588853L,57097,"dahmeni","nourhene");
        Departement d1 = new Departement(1,"Informatique");
        Departement d3 = new Departement(3,"Design");
        System.out.println("En implementant la gestion du HashMap");
        SocieteHashMap sc = new SocieteHashMap();
        sc.ajouterEmployeDepartement(e1,d1);
        sc.ajouterEmployeDepartement(e3,d3);
        sc.ajouterEmployeDepartement(e4,d3);
        sc.afficherLesEmployesLeursDepartements();

        sc.supprimerEmploye(e3);
        sc.afficherLesEmployesLeursDepartements();


        sc.afficherLesEmployes();
        sc.afficherLesDepartements();

        sc.rechercherDepartement(d1);
        System.out.println(sc.rechercherEmploye(e1));
        System.out.println(sc.rechercherEmploye(e3));
        System.out.println("En implementant la gestion du TreeMap");
        SocieteTreeMap scTree = new SocieteTreeMap();
        scTree.ajouterEmployeDepartement(e1,d1);
        scTree.ajouterEmployeDepartement(e3,d3);
        scTree.ajouterEmployeDepartement(e4,d3);

        scTree.afficherLesEmployesLeursDepartements();

        scTree.supprimerEmploye(e3);
        scTree.afficherLesEmployesLeursDepartements();


        scTree.afficherLesEmployes();
        scTree.afficherLesDepartements();

        scTree.rechercherDepartement(d1);
        System.out.println(scTree.rechercherEmploye(e1));
        System.out.println(scTree.rechercherEmploye(e3));
    }
}