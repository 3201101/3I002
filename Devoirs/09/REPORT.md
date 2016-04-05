
# 3I002 - TP 09

_Sources fournies dans le fichier **pobj.algogen-LOGLISCI-NASTURAS-09.jar** ci-joint, ou dans **[le dépôt](http://github.com/3201101/3I002/tree/master/Devoirs/09)**._


## Questions

**Copiez-collez le code de votre classe IndividuControleur.**

    public class IndividuControleur extends AbstractIndividu<IControleur> {
        
        private IControleur control;
        
        static double mutationProba = 0.2;
        
        public IndividuControleur(IControleur c) {
            control = c;
        }
        
        @Override
        public void muter() {
            control.muter(mutationProba);
        }

        @Override
        public IIndividu<IControleur> croiser(IIndividu<IControleur> autre) {
            return new IndividuControleur(control.creeFils(autre.getValeur(), mutationProba));
        }

        @Override
        public IIndividu<IControleur> clone() {
            return new IndividuControleur(control.clone());
        }

        @Override
        public String toString() {
            //return control.toString();
            return "";
        }

        @Override
        public IControleur getValeur() {
            return control;
        }
        
    }

**Après avoir spécifié les valeurs que vous avez choisies pour tous les paramètres, indiquez dans votre mail le nombre de cases visitables que contient le labyrinthe que vous avez créé et le score obtenu par le meilleur individu à la fin.**

    $> java PopulationMain.java 100

    Population de génération 99

     >  > 18.0 >  > 16.0 >  > 7.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 2.0 >  > 1.0 >  > 1.0 >  > 1.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0 >  > 0.0
    Meilleur : 
    18

Le meilleur individu obtient un score de 18 sur 75 cases visitables.