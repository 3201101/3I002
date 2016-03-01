
# 3I002 - TP 05

_Sources fournies dans le fichier **pobj.algogen-LOGLISCI-NASTURAS-05.jar** ci-joint, ou dans **[le dépôt](http://github.com/3201101/3I002/tree/master/Devoirs/05)**._


## Questions

**Copiez-collez le code de votre méthode de chargement du labyrinthe ainsi que le code de la méthode qui déclenche les réparations en cas de problème. Copiez-collez le code de votre classe de test SimulationTest**

    /**
     * Chargement d'un Labyrinthe
     * @param  args        Le premier argument du programme doit être l'adresse du fichier du Labyrinthe
     * @throws IOException Erreur de lecture
     */
    public static void main(String[] args) throws IOException 
    {
        Labyrinthe labi = ChargeurLabyrinthe.chargerLabyrinthe(args[0]);
        System.out.println("Labi avant :\n" + labi);
        try{
            verifierConditions(labi);
        }
        catch(Exception e){
            System.out.println(e);
        }
        corrigerConditions(labi);
        System.out.println("Labi apres :\n" + labi);
    }

    /**
     * La méthode corrigerConditions() tente de corriger un Labyrinthe invalide en corrigeant une à une les erreurs détectées.
     * @param  l Labyrinthe à corriger
     * @return   Nombre de corrections effectuées
     */
    public static int corrigerConditions(Labyrinthe l)
    {
        boolean x = true;
        int i = 0;
        while(x)
        {
            x = false;
            try
            {
                verifierConditions(l);
            }
            catch (LabyMalEntoureException e)
            {
                x = true;
                i++;
                
                l.setContenuCase(e.getP(), ContenuCase.MUR);
            }
            catch (CaseDepartNonVideException e)
            {
                x = true;
                i++;
                
                l.setContenuCase(e.getP(), ContenuCase.VIDE);
            } catch (LabyErroneException e) {}
        }
    
        return i;
    }

    package test.simulation;
    
    import static org.junit.Assert.*;
    
    import org.junit.Before;
    import org.junit.Test;
    
    import agent.Simulation;
    import agent.control.ControlFactory;
    import agent.control.IControleur;
    import agent.laby.ChargeurLabyrinthe;
    import agent.laby.Labyrinthe;
    import agent.laby.VerificationLaby;
    import agent.laby.exception.LabyErroneException;
    
    public class SimulationTestDroitier {
        
        private Simulation simul;
    
        @Before
        public void setUp() throws Exception {
            String labyFile = "goal.mze";
            Labyrinthe laby = ChargeurLabyrinthe.chargerLabyrinthe(labyFile);
            try{
                VerificationLaby.verifierConditions(laby);
            }
            catch(LabyErroneException e){
                VerificationLaby.corrigerConditions(laby);
            }
            IControleur sc = ControlFactory.createControleurDroitier();
            simul = new Simulation(laby, sc);
        }
    
        @Test
        public void testMesurePerf() {
            assertEquals(simul.mesurePerf(10), 4);
        }
    
    }
