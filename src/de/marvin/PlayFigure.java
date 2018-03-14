

package de.marvin;

import java.io.Serializable;

public class PlayFigure implements Serializable {
        int strenght;
        String typ;
        String [] weapons;

        public PlayFigure( int s, String t, String[] w){
            strenght = s;
            typ = t;
            weapons = w;

        }
        public int getStrenght(){
            return strenght;
        }
        public String getTyp(){
            return typ;
        }
        public String getWeapon(){
            String weaponlist = "";
            for(int i = 0; i <weapons.length; i++){
                weaponlist += weapons[i]+"";
            }
            return weaponlist;
        }

    }



