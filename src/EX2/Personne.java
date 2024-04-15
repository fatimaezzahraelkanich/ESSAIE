public class Personne{
    public String CIN;
    public String Nom;
    public String Prenom;
    public String Email;
    public int  age = 20;
    public Personne(String CIN,String Nom,String Prenom,String Email,int age) {
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.age = age;
    }
    public void initialiserpersonne(String CIN, String Nom, String Prenom, String Email, int age) {
        this.CIN = CIN;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.age = age;
    }
    public void afficher(){
        System.out.println("cin="+CIN);
        System.out.println("Nom="+Nom);
        System.out.println("Prenom="+Prenom);
        System.out.println("Email="+Email);
        System.out.println("age="+age);
    }}
