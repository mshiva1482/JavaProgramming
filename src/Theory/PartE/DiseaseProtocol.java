package Theory.PartE;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

class PatientData{
    Scanner sc = new Scanner(System.in);
    String patientName, patientLocation;
    String symptoms;
    //Headache, cough, cold, fever
    int codedSym[] = {0, 0, 0, 0};


    public void initiateProtocol(){
        System.out.println("Welcome to emergency Disease Protocol system");
        System.out.print("Enter your name: ");
        patientName = sc.next();
        System.out.print("Enter your location: ");
        patientLocation = sc.next();
        System.out.println("List out your current symptoms: ");
        for(int i=0;i<2;i++){
            symptoms = sc.next();
            if(symptoms.equals("Headache"))
                codedSym[0] = 1;
            else if(symptoms.equals("Cough"))
                codedSym[1] = 1;
            else if(symptoms.equals("Cold"))
                codedSym[2] = 1;
            else if(symptoms.equals("Fever"))
                codedSym[3] = 1;
        }

        System.out.println("\nTreatment initiating...");
        EmergencyTreatment();
    }

    private void EmergencyTreatment(){
        if(codedSym[0]==1 && codedSym[1]==0 && codedSym[2]==0 && codedSym[3]==1){
            System.out.println("Treatment: Dolo650 for 3 days (1-1-1)");
            System.exit(0);
        }
        else if(codedSym[0]==0 && codedSym[1]==1 && codedSym[2]==1 && codedSym[3]==0){
            System.out.println("Treatment: CofStop Z Syrup 5ml 3 times a day");
            System.exit(0);
        }
        else{
            if(patientLocation.equals("Chennai"))
                System.out.println("Please visit the nearest hospital - Apollo Healthcare");
            else if(patientLocation.equals("Mumbai"))
                System.out.println("Please visit the nearest hospital - Jupiter Hospital");
            else
                System.out.println("Please visit the nearest hospital - call 1001001 to find your nearest hospital");
        }
    }

}


public class DiseaseProtocol extends PatientData{
    public static void main(String[] args) {
         DiseaseProtocol ob = new DiseaseProtocol();

         ob.initiateProtocol();
    }
}
