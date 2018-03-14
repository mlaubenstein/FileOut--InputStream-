package de.marvin;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        PlayFigure one      = new PlayFigure(500, "Drache", new String []{"Feuer","Bizeps"});
        PlayFigure two      = new PlayFigure(200, "Riese", new String []{"Keule","Bizeps"});
        PlayFigure three    = new PlayFigure(50, "Troll", new String []{"Geldsack","Spitze Fußnägel"});

        try{
            ObjectOutputStream os = new ObjectOutputStream ( new FileOutputStream ( "Game.ser" ) );

            os.write ( one );
            os.write ( two );
            os.write ( three );
            os.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }

        one = null;
        two = null;
        three = null;

        try{
            ObjectInputStream is = new ObjectInputStream ( new FileInputStream ( "Game.ser" ) );
            PlayFigure OneGet = (PlayFigure) is.readObject ();
            PlayFigure TwoGet = (PlayFigure) is.readObject ();
            PlayFigure ThreeGet = (PlayFigure) is.readObject ();


            System.out.println ( "Typ 1.Figure: " + OneGet.getTyp () );
            System.out.println ( "Typ 2.Figure: " + TwoGet.getTyp () );
            System.out.println ( "Typ 3.Figure: " + ThreeGet.getTyp () );
        }catch (Exception e){
            e.printStackTrace ();
        }

    }


}
