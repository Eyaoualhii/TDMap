import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete{
    Map<Departement, List<Employe>> employes = new HashMap();
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        List<Employe> employesList = employes.get(d);
        if (employesList == null) {
            employesList = new ArrayList<>();
            employes.put(d, employesList);
        }
        employesList.add(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        for (List<Employe> employesList : employes.values()) {
            employesList.remove(e);
        }
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Departement, List<Employe>> entry : employes.entrySet()) {
            System.out.println("Département : " + entry.getKey().getNom());
            for (Employe employe : entry.getValue()) {
                System.out.println("   Employé : " + employe.getCin());
            }
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (List<Employe> employesList : employes.values()) {
            for (Employe employe : employesList) {
                System.out.println("Employé : " + employe.getNom() +" "+ employe.getPrenom());
            }
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement departments : employes.keySet()) {
                System.out.println("Département : " + departments.getNom() );

        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        for (Map.Entry<Departement, List<Employe>> entry : employes.entrySet()) {
            if (entry.getValue().contains(e)) {
                Departement d = entry.getKey();
                System.out.println("Employe :" + e.getPrenom() + e.getNom());
            }
        }

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        for (List<Employe> employesList : employes.values()) {
            if (employesList.contains(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employes.containsKey(d);
    }
}
