package com.company;

public class RomanMounth {
    private int jours;
    private int annee;
    private String mois;
    private String nextMois;
    private boolean isFull;
    RomanMounth(int jours, int mois, int annee){
      switch (mois){
          case 1:
              this.isFull = true;
              this.mois = "Mars";
              this.mois = "Avril";
              break;
          case 2:
              this.isFull = false;
              this.mois = "Avril";
              this.mois = "Maia";
              break;
          case 3:
              this.isFull = false;
              this.mois = "Maia";
              this.mois = "Junon";
              break;
          case 4:
              this.isFull = false;
              this.mois = "Junon";
              this.mois = "Jules";
              break;
          case 5:
              this.isFull = true;
              this.mois = "Jules";
              this.mois = "Auguste";
              break;
          case 6:
              this.isFull = false;
              this.mois = "Auguste";
              this.mois = "7eme mois";
              break;
          case 7:
              this.isFull = true;
              this.mois = "7eme mois";
              this.mois = "8eme mois";
              break;
          case 8:
              this.isFull = true;
              this.mois = "8eme mois";
              this.mois = "9eme mois";
              break;
          case 9:
              this.isFull = false;
              this.mois = "9eme mois";
              this.mois = "10eme mois";
              break;
          case 10:
              this.isFull = false;
              this.mois = "10eme mois";
              this.mois = "Janus";
              break;
          case 11:
              this.isFull = false;
              this.mois = "Janus";
              this.mois = "La purification";
              break;
          case 12:
              this.isFull = false;
              this.mois = "La purification";
              this.mois = "Mars";
              break;
          default:
              this.isFull = false;
              break;
      }
      this.jours = jours;
      this.annee = annee+753;
    }
    public String toString(){
        if (this.jours == 1){
            return "nous somme le jours des calende de "+this.mois+" de l'année de "+this.annee;
        }
        boolean isBisse = isBissectile(this.annee);
        if (this.isFull){
            if (this.jours == 7){
                return "nous somme le jours des nones de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours == 6){
                return "nous somme a la veille des nones de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours == 15){
                return "nous somme le jours des ides de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours == 14){
                return "nous somme ala veille des ides de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours < 6){
                return "nous somme a "+(7-this.jours)+" jours avant les nones de "+this.mois+" de l'année de "+this.annee;
            }else {
                if (this.jours < 14){
                    return "nous somme a "+(15-this.jours)+" jours avant les ides de "+this.mois+" de l'année de "+this.annee;
                }else{
                    if (this.mois.equals("La purification")){
                        if (isBisse){
                            return "nous somme a "+(29-this.jours)+" jours avant les calende de "+this.nextMois+" de l'année de "+this.annee;
                        }else{
                            return "nous somme a "+(28-this.jours)+" jours avant les calende de "+this.nextMois+" de l'année de "+this.annee;
                        }
                    }else{
                        return "nous somme a "+(31-this.jours)+" jours avant les calende de "+this.nextMois+" de l'année de "+this.annee;
                    }
                }
            }
        }else{
            if (this.jours == 5){
                return "nous somme le jours des nones de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours == 4){
                return "nous somme a la veille des nones de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours == 13){
                return "nous somme le jours des ides de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours == 12){
                return "nous somme a la vaille des ides de "+this.mois+" de l'année de "+this.annee;
            }
            if (this.jours < 4){
                return "nous somme a "+(5-this.jours)+" jours avant les nones de "+this.mois+" de l'année de "+this.annee;
            }else {
                if (this.jours < 12){
                    return "nous somme a "+(13-this.jours)+" jours avant les ides de "+this.mois+" de l'année de "+this.annee;
                }else{
                    if (this.mois == "La purification"){
                    if (isBisse){
                        return "nous somme a "+(29-this.jours)+" jours avant les calende de "+this.nextMois+" de l'année de "+this.annee;
                    }else{
                        return "nous somme a "+(28-this.jours)+" jours avant les calende de "+this.nextMois+" de l'année de "+this.annee;
                    }
                }else{
                    return "nous somme a "+(30-this.jours)+" jours avant les calende de "+this.nextMois+" de l'année de "+this.annee;
                }
                }
            }
        }
    }
    public boolean isBissectile(int annee){
        boolean bisec = false;
        if(annee %4 == 0  && annee % 100 != 0){
            bisec= true;
        }
        if (annee %400 == 0){
            bisec = true;
        }
        return bisec;
    }
}
