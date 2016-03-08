
# 3I002 - TP 06

_Sources fournies dans le fichier **pobj.partiel2014nov-NASTURAS-06.tar.gz** ci-joint, ou dans **[le dépôt](http://github.com/3201101/3I002/tree/master/Devoirs/06)**._

## Liens utiles

Ce TME bénéficie d'une [correction automatique](https://www-licence.ufr-info-p6.jussieu.fr/lmd/licence/2015/ue/3I002-2016fev/auths/).

## Correction automatique

Rapport de correction automatique
Vous avez obtenu 5000 points sur 5000.
Partagez votre succès avec [Share with Twitter] Share on Google+ [Share with Facebook]

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 13:05 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  1 09:50 tests

./pobj/partiel2014nov/tests:
total 40
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 13:05 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  1 09:50 tests

./pobj/partiel2014nov/tests:
total 40
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.ArrayList;
   4 
   5 public class Env implements IEnv
   6 {
   7         ArrayList lettres = new ArrayList(9);
   8 
   9         public String get(int touche) throws MauvaiseTouche
  10         {
  11                 int t = touche-1;
  12                 if(t < 0 || t > 8)
  13                         throw new MauvaiseTouche();     
  14                 try
  15                 {
  16                         return this.lettres.get(t);
  17                 }
  18                 catch(Exception e)
  19                 {
  20                         throw new MauvaiseTouche();
  21                 }
  22         }
  23 
  24         public void set(int touche, String lettres) throws MauvaiseTouche
  25         {
  26                 int t = touche-1;
  27                 if(t < 0 || t > 8)
  28                         throw new MauvaiseTouche();     
  29                 try
  30                 {
  31                         if(t >= this.lettres.size())
  32                                 this.lettres.add(t, lettres);
  33                         else
  34                                 this.lettres.set(t, lettres);
  35                 }
  36                 catch(Exception e)
  37                 {
  38                         throw new MauvaiseTouche();
  39                 }
  40         }
  41 }
  42 

Je compile votre classe Env.java avec la commande:

javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Env.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion1.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 80
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1 1059 Mar  8 18:01 Env.class
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  259 Mar  8 18:01 IEnv.class
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1  225 Mar  8 18:01 MauvaiseTouche.class
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 44
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 200 point.

Voici ma classe de test TestQuestion1

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 
   3 import static org.fw4ex.junit.Assert.*;
   4 //import static org.junit.Assert.*;
   5 import org.junit.*;
   6 
   7 import pobj.partiel2014nov.*;
   8 
   9 public class TestQuestion1 {
  10 
  11         @Test
  12         public void test1() {
  13                 IEnv e = new Env();
  14                 try {
  15                         e.set(1, " ");
  16                         e.set(2, "ABC");
  17                         e.set(3, "DEF");
  18                         e.set(4, "GHI");
  19                         e.set(5, "JKL");
  20                         e.set(6, "MNO");
  21                         e.set(7, "PQRS");
  22                         e.set(8, "TUV");
  23                         assertTrue(true);
  24                 } catch (MauvaiseTouche mt) {
  25                         assertTrue(false);
  26                 }
  27 
  28                 try {
  29                         String s = e.get(7);
  30                         assertTrue(s.equals("PQRS"));
  31                 } catch (MauvaiseTouche mt) {
  32                         assertTrue(false);
  33                 } catch (Exception ex) {
  34                         assertTrue(false);
  35                 }
  36 
  37                 try {
  38                         e.get(10);
  39                         assertTrue(false);
  40                 } catch (MauvaiseTouche mt) {
  41                         assertTrue(true);
  42                 } catch (Exception ex) {
  43                         assertTrue(false);
  44                 }
  45                 
  46                 try {
  47                         String s = "PRE";
  48                         e.set(3,s);
  49                         assertTrue( e.get(3).equals(s) );
  50                 } catch (Exception ex) {
  51                         assertTrue(false);
  52                 }
  53                 
  54         }
  55 
  56 }
  57 

Je lance JUnit sur ma classe de tests avec

 java  -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion1

Votre commande produit un résultat (que j'affiche avec head --bytes 20000):

FW4EX JUnit version 4.11+qnc2.5
.
Time: 0.019

OK (1 test)

[[[ 4 Assertions testées, 1 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 400 point(s).

calcul des points = nombre d'assertions vraies.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 44
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 public class EnvFactory
   4 {
   5         public static IEnv creerEnv()
   6         {
   7                 try
   8                 {
   9                         IEnv e = new Env();
  10                         
  11                         e.set(1, " ");
  12                         e.set(2, "ABC");
  13                         e.set(3, "DEF");
  14                         e.set(4, "GHI");
  15                         e.set(5, "JKL");
  16                         e.set(6, "MNO");
  17                         e.set(7, "PQRS");
  18                         e.set(8, "TUV");
  19                         e.set(9, "WXYZ");
  20 
  21                         return e;
  22                 }
  23                 catch(MauvaiseTouche e)
  24                 {
  25                         System.out.println("Error");
  26 
  27                         return null;
  28                 }
  29         }
  30 }

Je compile votre classe EnvFactory.java avec la commande:

 javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/EnvFactory.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion2.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 84
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1 1059 Mar  8 18:01 Env.class
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  861 Mar  8 18:01 EnvFactory.class
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  259 Mar  8 18:01 IEnv.class
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1  225 Mar  8 18:01 MauvaiseTouche.class
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 48
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion2

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 
   3 import static org.fw4ex.junit.Assert.*;
   4 //import static org.junit.Assert.*;
   5 import org.junit.*;
   6 
   7 import pobj.partiel2014nov.EnvFactory;
   8 import pobj.partiel2014nov.IEnv;
   9 import pobj.partiel2014nov.MauvaiseTouche;
  10 
  11 
  12 public class TestQuestion2 {
  13 
  14   @Test
  15         public void test1() {
  16                 IEnv env = EnvFactory.creerEnv();
  17                 String s = "";
  18                 try {
  19                         s = env.get(2);
  20                         assertTrue(true);
  21                 } catch (MauvaiseTouche mt) {
  22                         s = "MauvaiseTouche - 2";
  23                         assertTrue(false);
  24                 }
  25                 System.out.println(s);
  26                 try {
  27                         s = env.get(12);
  28                         s = "Probleme";
  29                         assertTrue(false);
  30                 } catch (MauvaiseTouche mt) {
  31                         s = "Ok - 12";
  32                         assertTrue(true);
  33                 }
  34                 System.out.println(s);
  35         }
  36 
  37 }
  38 
  39 

Je lance JUnit sur ma classe de tests avec

 java  -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion2

Votre commande produit un résultat (que j'affiche avec head --bytes 10000):

FW4EX JUnit version 4.11+qnc2.5
.ABC
Ok - 12

Time: 0.026

OK (1 test)

[[[ 2 Assertions testées, 1 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 200 point(s).

calcul des points = nombre d'assertions vraies.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 48
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 
   5 public class Noeud implements INoeud
   6 {
   7         protected char lettre;
   8         protected boolean fin;
   9         protected List fils;
  10 
  11         public Noeud(char lettre, List fils, boolean isMarked)
  12         {
  13                 this.lettre = lettre;
  14                 this.fils = fils;
  15                 this.fin = isMarked;
  16         }
  17 
  18         /**
  19          * @return la lettre associée à ce noeud de l'arbre.
  20          */
  21         public char getLettre()
  22         {
  23                 return lettre;
  24         }
  25 
  26         /**
  27          * @return la liste des fils de ce noeud
  28          */
  29         public List getFils()
  30         {
  31                 return fils;
  32         }
  33 
  34         /**
  35          * @return true si le noeud est marqué (c'est la fin d'un mot) ou false s↩
↪inon.
  36          */
  37         public boolean isMarque()
  38         {
  39                 return fin;
  40         }
  41 
  42         /**
  43          * Met à jour la propriété marqué ou non du noeud.
  44          * @param isMarque la nouvelle valeur du marquage.
  45          */
  46         public void setMarque (boolean isMarque)
  47         {
  48                 this.fin = isMarque;
  49         }
  50 }
  51 

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 
   5 public class NoeudFactory
   6 {
   7         /**
   8          * Fabrique un nouveau noeud de l’arbre avec les caractéristiques souhaitée↩
↪s.
   9          * @param  lettre   lettre la lettre qui étiquette ce noeud
  10          * @param  fils     fils la liste des fils de ce noeud
  11          * @param  isMarked vrai si le noeud est marqué (c’est la fin d’un mot
  12          * @return          un noeud nouvellement créé
  13          */
  14         public static INoeud createNoeud(char lettre, List fils, boolean↩
↪ isMarked)
  15         {
  16                 return new Noeud(lettre, fils, isMarked);
  17         }
  18 }

Je compile vos classes Noeud.java et NoeudFactory.java avec la commande:

 javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Noeud.java pobj/partiel2014nov/NoeudFactory.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion3.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 80
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 52
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion3

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 import java.util.ArrayList;
   3 import java.util.List;
   4 
   5 import static org.fw4ex.junit.Assert.*;
   6 //import static org.junit.Assert.*;
   7 import org.junit.*;
   8 
   9 import pobj.partiel2014nov.INoeud;
  10 import pobj.partiel2014nov.NoeudFactory;
  11 
  12 
  13 public class TestQuestion3 {
  14 
  15   @Test
  16   public void test1() {
  17     List nil = new ArrayList();
  18     INoeud n = NoeudFactory.createNoeud('c',nil,false);
  19     assertTrue(n.getLettre() == 'c');
  20     assertTrue(! n.isMarque());
  21     assertTrue(n.getFils().isEmpty());
  22   }
  23 
  24   @Test
  25   public void test2() {
  26           List nil = new ArrayList();
  27           INoeud n = NoeudFactory.createNoeud('a',nil,false);
  28           assertTrue(n.getLettre() == 'a');
  29           //assertTrue(n.isMarque());
  30           assertTrue(n.getFils().isEmpty());
  31   }
  32 
  33 }
  34 
  35 

Je lance JUnit sur ma classe de tests avec

 java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion3 

Votre commande produit un résultat (que j'affiche avec head --bytes 10000):

FW4EX JUnit version 4.11+qnc2.5
..
Time: 0.026

OK (2 tests)

[[[ 5 Assertions testées, 2 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 500 point(s).

calcul des points = nombre d'assertions vraies.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 52
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 import java.util.ArrayList;
   5 
   6 public class Dico extends DicoAbs
   7 {
   8         public Dico()
   9         {
  10                 super();
  11         }
  12 
  13         public Dico(List dico)
  14         {
  15                 super(dico);
  16         }
  17 
  18         /**
  19          * Cherche un mot dans le dictionnaire.
  20          * @param s un mot à chercher
  21          * @return true si le mot est présent dans le dictionnaire
  22          */
  23         public boolean appartient(String s)
  24         {
  25                 List l = this.getDico();
  26                 INoeud n = this.chercheNoeud(l, s.charAt(0));
  27 
  28                 if(n == null)
  29                         return false;
  30 
  31                 for(int i = 0; i < s.length(); i++)
  32                 {
  33                         n = this.chercheNoeud(l, s.charAt(i));
  34 
  35                         if(n == null)
  36                                 return false;
  37 
  38                         l = n.getFils();
  39                 }
  40 
  41                 return n.isMarque();
  42         }
  43 
  44 }

Je compile votre classe Dico.java avec la commande:

 javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Dico.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion4.java 

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 88
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  890 Mar  8 18:01 Dico.class
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 1944 Mar  8 18:01 DicoAbs.class
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 56
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion4

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 import java.util.ArrayList;
   3 import java.util.List;
   4 
   5 import static org.fw4ex.junit.Assert.*;
   6 //import static org.junit.Assert.*;
   7 import org.junit.*;
   8 
   9 import pobj.partiel2014nov.Dico;
  10 import pobj.partiel2014nov.INoeud;
  11 
  12 
  13 public class TestQuestion4 {
  14 
  15   @Test
  16   public void test1() {
  17     List nil = new ArrayList();
  18     Dico d = new Dico(nil);
  19     d.ajoute("FA");     
  20     d.ajoute("FAR");
  21     d.ajoute("FAUX");
  22     d.ajoute("FRISE");
  23     d.ajoute("FRIT");
  24     d.ajoute("FRITE");
  25     assertTrue(d.appartient("FRIT")); 
  26     assertTrue(d.appartient("FRITE")); 
  27     assertTrue(! (d.appartient("FRIC")));
  28   }
  29 
  30   @Test
  31   public void test2() {
  32     List nil = new ArrayList();
  33     Dico d = new Dico(nil);
  34     d.ajoute("BRUNE");
  35     d.ajoute("BRUN");
  36     d.ajoute("LION");
  37     d.ajoute("LUNE");
  38     d.ajoute("PION");
  39     d.ajoute("PRUNE");
  40     assertTrue(d.appartient("BRUN")); 
  41     assertTrue(d.appartient("BRUNE")); 
  42     assertTrue(! (d.appartient("BRUNIE")));
  43   }
  44 
  45   @Test
  46   public void test3() {
  47     List nil = new ArrayList();
  48     Dico d = new Dico(nil);
  49     assertTrue(! (d.appartient("BONJOUR")));
  50     assertTrue(! (d.appartient("SALUT")));
  51     d.ajoute("BONJOUR");
  52     d.ajoute("SALUTATION");
  53     assertTrue(! (d.appartient("SALUT")));
  54     d.ajoute("SALUT");
  55     assertTrue((d.appartient("SALUT")));
  56   }
  57 
  58 }
  59 
  60 

Je lance JUnit sur ma classe de tests avec

 java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion4 

Votre commande produit un résultat (que j'affiche avec head --bytes 20000):

FW4EX JUnit version 4.11+qnc2.5
...
Time: 0.03

OK (3 tests)

[[[ 10 Assertions testées, 3 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 500 point(s).

calcul des points = nombre d'assertions vraies / 2.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 56
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 
   5 public class Question5
   6 {
   7         /**
   8          * Construit un dictionnaire d'exemple basé sur la figure 2 de l'énoncé
   9          * @return Dictionnaire construit
  10          */
  11         public static Dico creerDico()
  12         {
  13                 Dico d = new Dico();
  14 
  15                 d.ajoute("FA");
  16                 d.ajoute("FAR");
  17                 d.ajoute("FAUX");
  18                 d.ajoute("FRISE");
  19                 d.ajoute("FRIT");
  20                 d.ajoute("FRITE");
  21 
  22                 return d;
  23         }
  24 }
  25 

Je compile votre classe Question5.java avec la commande:

javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Question5.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion5.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 92
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  890 Mar  8 18:01 Dico.class
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 1944 Mar  8 18:01 DicoAbs.class
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  504 Mar  8 18:01 Question5.class
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 60
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion5

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 
   3 import static org.fw4ex.junit.Assert.*;
   4 //import static org.junit.Assert.*;
   5 import org.junit.*;
   6 
   7 import pobj.partiel2014nov.Dico;
   8 import pobj.partiel2014nov.Question5;
   9 
  10 
  11 public class TestQuestion5 {
  12 
  13   @Test
  14   public void test1() {
  15    Dico d5 = Question5.creerDico(); 
  16    assertTrue( ! (d5.appartient("BONJOUR")));
  17    assertTrue(d5.appartient("FRIT") || d5.appartient("BRUN"));
  18    assertTrue(d5.appartient("FRITE") || d5.appartient("BRUNE"));
  19    assertTrue( ! (d5.appartient("FRITO")));
  20   }
  21 
  22   @Test
  23   public void test2() {
  24    Dico d5 = Question5.creerDico(); 
  25    assertTrue(d5.appartient("FA") || d5.appartient("LION"));
  26    assertTrue( ! (d5.appartient("FAU")));
  27   }
  28 
  29 }
  30 

Je lance JUnit sur ma classe de tests avec

java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun  pobj.partiel2014nov.tests.TestQuestion5

Votre commande produit un résultat (que j'affiche avec head --bytes 10000):

FW4EX JUnit version 4.11+qnc2.5
..
Time: 0.027

OK (2 tests)

[[[ 6 Assertions testées, 2 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 200 point(s).

calcul des points = nombre d'assertions vraies / 3.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 60
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 import java.util.ArrayList;
   5 
   6 public class Compte
   7 {
   8         /**
   9          * Calcule le nombre de noeuds dans l'arbre dont "in" est la tête.
  10          * @param in un noeud, tête de l'arbre à dénombrer
  11          * @return le nombre de mots dans l'arbre
  12          */
  13         public static int nombreNoeud(INoeud in)
  14         {
  15                 int t = 1;
  16                 List f = in.getFils();
  17 
  18                 if(f != null)
  19                         for(int i = 0; i < f.size(); i++)
  20                                 t+= nombreNoeud(f.get(i));
  21 
  22                 return t;
  23         }
  24 
  25         /**
  26          * Calcule le nombre de mots dans l'arbre dont "in" est la tête.
  27          * @param in un noeud, tête de l'arbre à dénombrer
  28          * @return le nombre de mots dans l'arbre
  29          */    
  30         public static int nombreMot(INoeud in)
  31         {
  32                 int t = 0;
  33                 if(in.isMarque() == true)
  34                         t = 1;
  35 
  36         List f = in.getFils();
  37 
  38         if(f != null)
  39                 for(int i = 0; i < f.size(); i++)
  40                         t+= nombreMot(f.get(i));
  41 
  42         return t;
  43         }
  44 }
  45 

Je compile votre classe Compte.java avec la commande:

javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Compte.java  /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion6.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 96
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  771 Mar  8 18:01 Compte.class
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  890 Mar  8 18:01 Dico.class
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 1944 Mar  8 18:01 DicoAbs.class
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  504 Mar  8 18:01 Question5.class
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 64
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion6

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 import java.util.ArrayList;
   3 import java.util.List;
   4 
   5 import static org.fw4ex.junit.Assert.*;
   6 //import static org.junit.Assert.*;
   7 import org.junit.*;
   8 
   9 import pobj.partiel2014nov.Compte;
  10 import pobj.partiel2014nov.Dico;
  11 import pobj.partiel2014nov.DicoAbs;
  12 import pobj.partiel2014nov.INoeud;
  13 import pobj.partiel2014nov.Question5;
  14 
  15 
  16 public class TestQuestion6 {
  17 
  18   @Test
  19   public void test1() {
  20     Dico d = Question5.creerDico();
  21     INoeud x = DicoAbs.chercheNoeud(d.getDico(), 'F');
  22     assertTrue(x != null); 
  23     assertTrue ( ( Compte.nombreNoeud(x) == 11) || ( Compte.nombreMot(x) == 6));
  24     assertTrue ( ( Compte.nombreNoeud(x) == 11) && ( Compte.nombreMot(x) == 6));
  25   }
  26          
  27   @Test
  28   public void test2() {
  29     Dico d = new Dico(); 
  30     d.ajoute("BRUN");
  31     d.ajoute("BRUNE");
  32     d.ajoute("LION");
  33     d.ajoute("LUNE");
  34     d.ajoute("PION");
  35     d.ajoute("PRUNE");
  36     INoeud x = DicoAbs.chercheNoeud(d.getDico(), 'L');
  37     assertTrue(x != null); 
  38     assertTrue ( ( Compte.nombreNoeud(x) == 7) || ( Compte.nombreMot(x) == 2));
  39     assertTrue ( ( Compte.nombreNoeud(x) == 7) && ( Compte.nombreMot(x) == 2));
  40   }
  41 
  42 
  43   @Test
  44   public void test3() {
  45     List nil = new ArrayList();
  46     Dico d = new Dico(nil); 
  47     d.ajoute("BRUN");
  48     d.ajoute("BRUNE");
  49     d.ajoute("LION");
  50     d.ajoute("LUNE");
  51     d.ajoute("PION");
  52     d.ajoute("PRUNE");
  53     INoeud x = DicoAbs.chercheNoeud(d.getDico(), 'B');
  54     assertTrue(x != null); 
  55     assertTrue ( ( Compte.nombreNoeud(x) == 5) || ( Compte.nombreMot(x) == 2));
  56     assertTrue ( ( Compte.nombreNoeud(x) == 5)) ; 
  57     assertTrue ( ( Compte.nombreMot(x) == 2));
  58   }
  59 
  60 
  61 }
  62 

Je lance JUnit sur ma classe de tests avec

java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion6

[[[ 10 Assertions testées, 3 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 500 point(s).

calcul des points = nombre d'assertions vraies / 2.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 64
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 import java.util.ArrayList;
   5 
   6 public class DicoCompte extends Dico implements Comptable
   7 {
   8         private Compte c = new Compte();
   9 
  10         public DicoCompte()
  11         {
  12                 super();
  13         }
  14 
  15         public DicoCompte(List dico)
  16         {
  17                 super(dico);
  18         }
  19 
  20         /**
  21          * @return le nombre de noeuds total dans la représentation
  22          */
  23         public int nombreNoeud()
  24         {
  25                 int i = 0;
  26 
  27                 for (INoeud n : this.getDico())
  28                         i+= this.c.nombreNoeud(n);
  29 
  30                 return i;
  31         }
  32         
  33         /**
  34          * @return le nombre total de mots stockés 
  35          */    
  36         public int nombreMot()
  37         {
  38                 int i = 0;
  39 
  40                 for (INoeud n : this.getDico())
  41                         i+= this.c.nombreMot(n);
  42 
  43                 return i;
  44         }
  45 }

Je compile votre classe JoueurNaif.java avec la commande:

javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/DicoCompte.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion7.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 100
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  167 Mar  8 18:01 Comptable.class
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  771 Mar  8 18:01 Compte.class
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  890 Mar  8 18:01 Dico.class
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 1944 Mar  8 18:01 DicoAbs.class
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1 1101 Mar  8 18:01 DicoCompte.class
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 68
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1167 Mar  8 18:01 TestQuestion7.class
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion7

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 import java.util.ArrayList;
   3 import java.util.List;
   4 
   5 import static org.fw4ex.junit.Assert.*;
   6 //import static org.junit.Assert.*;
   7 import org.junit.*;
   8 
   9 import pobj.partiel2014nov.DicoCompte;
  10 import pobj.partiel2014nov.INoeud;
  11 
  12 
  13 public class TestQuestion7 {
  14 
  15   @Test
  16   public void test1() {
  17     List nil = new ArrayList();
  18     DicoCompte d = new DicoCompte(nil);
  19     d.ajoute("FA");     
  20     d.ajoute("FAR");
  21     d.ajoute("FAUX");
  22     d.ajoute("FRISE");
  23     d.ajoute("FRIT");
  24     d.ajoute("FRITE");
  25     assertTrue( d.nombreNoeud() == 11);
  26     assertTrue( d.nombreMot() == 6);
  27   }
  28 
  29   @Test
  30   public void test2() {
  31     List nil = new ArrayList();
  32     DicoCompte d = new DicoCompte(nil);
  33     d.ajoute("BRUN");
  34     d.ajoute("BRUNE");
  35     d.ajoute("LION");
  36     d.ajoute("LUNE");
  37     d.ajoute("PION");
  38     d.ajoute("PRUNE");
  39     assertTrue( d.nombreNoeud() == 20);
  40     assertTrue( d.nombreMot() == 6);
  41     d.ajoute("LIN");
  42     assertTrue( d.nombreNoeud() == 21);
  43     assertTrue( d.nombreMot() == 7);
  44 
  45   }
  46 
  47 }
  48 

Je lance JUnit sur ma classe de tests avec

java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion7

Votre commande produit un résultat (que j'affiche avec head --bytes 30000):

FW4EX JUnit version 4.11+qnc2.5
..
Time: 0.03

OK (2 tests)

[[[ 6 Assertions testées, 2 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 600 point(s).

calcul des points = nombre d'assertions vraies.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 68
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1167 Mar  8 18:01 TestQuestion7.class
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 
   5 public class Question8
   6 {
   7         private static String toSubString(INoeud n, String p)
   8         {
   9                 String s = "";
  10 
  11                 if(n.isMarque())
  12                         s+= p + n.getLettre() + "\n";
  13                 
  14                 for(INoeud i : n.getFils())
  15                         s+= toSubString(i, p + n.getLettre());
  16 
  17                 return s;
  18         }
  19 
  20         /**
  21          * Rend l'ensemble des mots dans l'arbre donné, ligne par ligne
  22          * @param  n Arbre de tête
  23          * @return   String contenant les mots séparés par des \n
  24          */
  25         public static String toString(INoeud n)
  26         {
  27                 return toSubString(n, "");
  28         }
  29 
  30         /**
  31          * Rend l'ensemble des mots dans le dictionnaire donné, ligne par ligne
  32          * @param  n Dictionnaire
  33          * @return   String contenant les mots séparés par des \n
  34          */
  35         public static String toString(Dico d)
  36         {
  37                 String s = "";
  38 
  39                 for(INoeud i : d.getDico())
  40                         s+= toString(i);
  41 
  42                 return s;
  43         }
  44 }
  45 

Je compile votre classe Question8.java avec la commande:

javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -Xlint:unchecked -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Question8.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion8.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 92
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  890 Mar  8 18:01 Dico.class
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 1944 Mar  8 18:01 DicoAbs.class
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1 1366 Mar  8 18:01 Question8.class
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 72
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1167 Mar  8 18:01 TestQuestion7.class
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1527 Mar  8 18:01 TestQuestion8.class
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion8

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 
   3 import static org.fw4ex.junit.Assert.*;
   4 //import static org.junit.Assert.*;
   5 import org.junit.*;
   6 
   7 import pobj.partiel2014nov.Dico;
   8 import pobj.partiel2014nov.DicoAbs;
   9 import pobj.partiel2014nov.INoeud;
  10 import pobj.partiel2014nov.Question8;
  11 
  12 
  13 public class TestQuestion8 {
  14 
  15   @Test
  16   public void test1() {
  17     Dico d = new Dico();
  18     d.ajoute("FA");     
  19     d.ajoute("FAR");
  20     d.ajoute("FAUX");
  21     d.ajoute("FRISE");
  22     d.ajoute("FRIT");
  23     d.ajoute("FRITE");
  24     INoeud n = DicoAbs.chercheNoeud(d.getDico(),'F');
  25     assertTrue(n!=null);
  26     String s = Question8.toString(n);  
  27     int len = s.length();
  28     assertTrue((len > 22) && (len < 30));
  29     assertTrue(s.indexOf("FAUX\n") >= 0);
  30 //    assertTrue(s.indexOf("FRISE") >= 0);
  31 //    assertTrue(s.indexOf("FAFAR") == -1);
  32   }
  33 
  34   @Test
  35   public void test2() {
  36     Dico d = new Dico();
  37     d.ajoute("BRUN");
  38     d.ajoute("BRUNE");
  39     d.ajoute("LION");
  40     d.ajoute("LUNE");
  41     d.ajoute("PION");
  42     d.ajoute("PRUNE");
  43     String s = Question8.toString(d);  
  44     assertTrue(s.indexOf("BRUN\n") >= 0);
  45     assertTrue(s.indexOf("BRUNE\n") >= 0);
  46     assertTrue(s.indexOf("BRUNBRUNE\n") == -1);
  47   }
  48 
  49 }
  50 

Je lance JUnit sur ma classe de tests avec

java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun  pobj.partiel2014nov.tests.TestQuestion8

Votre commande produit un résultat (que j'affiche avec head --bytes 20000):

FW4EX JUnit version 4.11+qnc2.5
..
Time: 0.027

OK (2 tests)

[[[ 6 Assertions testées, 2 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 600 point(s).

calcul des points = nombre d'assertions vraies.

Je supprime les classes compilées de votre catalogue.

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 68
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 72
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1167 Mar  8 18:01 TestQuestion7.class
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1527 Mar  8 18:01 TestQuestion8.class
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

Voici donc votre réponse:

   1 package pobj.partiel2014nov;
   2 
   3 import java.util.List;
   4 import java.util.ArrayList;
   5 
   6 public class Clavier implements Saisissable
   7 {
   8         IEnv env;
   9 
  10         public Clavier(IEnv env)
  11         {
  12                 this.env = env;
  13         }
  14 
  15         /**
  16          * Filtre parmi les noeuds de alc ceux qui pourraient correspondre) à la ↩
↪touche pressée.
  17          * @param alc une liste de noeuds : les complétions possibles
  18          * @param touche la touche préssée, comprise entre 1 et 9
  19          * @return le sous ensemble de alc dont la lettre correspond à la touche ↩
↪pressée selon l'environnement fourni.
  20          * @throws MauvaiseTouche si la touche n'est pas entre 1 et 9
  21          */
  22         public List uneTouche(List alc, int touche) throws Mauva↩
↪iseTouche
  23         {
  24                 String s = this.env.get(touche);
  25                 List l = new ArrayList();
  26 
  27                 for(int i = 0; i < alc.size(); i++)
  28                 {
  29                         for(int j = 0; j < s.length(); j++)
  30                         {
  31                                 if(alc.get(i).getLettre() == s.charAt(j))
  32                                         l.add(alc.get(i));
  33                         }
  34                 }
  35 
  36                 return l;
  37         }
  38 
  39         /**
  40      * Rend les noeuds qui permettent de compléter la séquence de touches donnée.
  41      * @param alc les têtes de mots du dictionnaire
  42      * @param touches une séquence de touches ayant été pressées
  43      * @return une liste de noeuds compatibles avec la séquence de touches pressée↩
↪.
  44          * @throws MauvaiseTouche si la touche n'est pas entre 1 et 9
  45      */
  46         public List seqTouche(List alc, int[] touches) throws Ma↩
↪uvaiseTouche
  47         {
  48                 List l = alc;
  49                 List t = new ArrayList();
  50 
  51                 for(int i = 0; i < touches.length; i++)
  52                 {
  53                         t.clear();
  54                         t = this.uneTouche(l, touches[i]);
  55                         l.clear();
  56 
  57                         if(i < touches.length-1)
  58                                 for(int j = 0; j < t.size(); j++)
  59                                         l.addAll(t.get(j).getFils());
  60                 }
  61 
  62                 return t;
  63         }
  64 }
  65 

Je compile votre classe Clavier.java avec la commande:

javac -Xmaxerrs 16 -Xmaxwarns 16 -encoding UTF-8 -d . -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:. pobj/partiel2014nov/Clavier.java /home/author01/tests/pobj/partiel2014nov/tests/TestQuestion9.java

Voici le contenu de votre répertoire:

.:
total 4
drwxr-xr-x 3 4096 Mar  8 13:58 pobj

./pobj:
total 4
drwxr-xr-x 3 4096 Mar  8 18:01 partiel2014nov

./pobj/partiel2014nov:
total 124
-rw-r--r-- 1 1645 Mar  8 18:01 Clavier.class
-rw-r--r-- 1 1706 Mar  8 18:00 Clavier.java
-rw-r--r-- 1  167 Mar  8 18:01 Comptable.class
-rw-r--r-- 1  237 Jan 18 17:34 Comptable.java
-rw-r--r-- 1  771 Mar  8 18:01 Compte.class
-rw-r--r-- 1  897 Mar  8 16:36 Compte.java
-rw-r--r-- 1  890 Mar  8 18:01 Dico.class
-rw-r--r-- 1  681 Mar  8 16:07 Dico.java
-rw-r--r-- 1 1944 Mar  8 18:01 DicoAbs.class
-rw-r--r-- 1 2546 Jan 18 17:34 DicoAbs.java
-rw-r--r-- 1 1101 Mar  8 18:01 DicoCompte.class
-rw-r--r-- 1  653 Mar  8 16:34 DicoCompte.java
-rw-r--r-- 1 1059 Mar  8 18:01 Env.class
-rw-r--r-- 1  718 Mar  8 16:01 Env.java
-rw-r--r-- 1  861 Mar  8 18:01 EnvFactory.class
-rw-r--r-- 1  412 Mar  8 15:19 EnvFactory.java
-rw-r--r-- 1  259 Mar  8 18:01 IEnv.class
-rw-r--r-- 1  976 Jan 18 17:34 IEnv.java
-rw-r--r-- 1  301 Mar  8 18:01 INoeud.class
-rw-r--r-- 1  513 Jan 18 17:34 INoeud.java
-rw-r--r-- 1  225 Mar  8 18:01 MauvaiseTouche.class
-rw-r--r-- 1   81 Feb 22 17:31 MauvaiseTouche.java
-rw-r--r-- 1  848 Mar  8 18:01 Noeud.class
-rw-r--r-- 1  860 Mar  8 15:30 Noeud.java
-rw-r--r-- 1  498 Mar  8 18:01 NoeudFactory.class
-rw-r--r-- 1  555 Mar  8 15:08 NoeudFactory.java
-rw-r--r-- 1  396 Mar  8 14:04 Question5.java
-rw-r--r-- 1  842 Mar  8 17:27 Question8.java
-rw-r--r-- 1  538 Mar  8 18:01 Saisissable.class
-rw-r--r-- 1 1021 Jan 18 17:34 Saisissable.java
drwxr-xr-x 2 4096 Mar  8 18:01 tests

./pobj/partiel2014nov/tests:
total 76
-rw-r--r-- 1 1200 Mar  8 18:01 TestQuestion1.class
-rw-r--r-- 1  962 Feb 21 20:00 TestQuestion1.java
-rw-r--r-- 1 1011 Mar  8 18:01 TestQuestion2.class
-rw-r--r-- 1  700 Feb 22 14:25 TestQuestion2.java
-rw-r--r-- 1  974 Mar  8 18:01 TestQuestion3.class
-rw-r--r-- 1  790 Feb 21 19:59 TestQuestion3.java
-rw-r--r-- 1 1370 Mar  8 18:01 TestQuestion4.class
-rw-r--r-- 1 1384 Feb 21 20:00 TestQuestion4.java
-rw-r--r-- 1  942 Mar  8 18:01 TestQuestion5.class
-rw-r--r-- 1  707 Feb 21 20:00 TestQuestion5.java
-rw-r--r-- 1 1655 Mar  8 18:01 TestQuestion6.class
-rw-r--r-- 1 1666 Feb 21 20:00 TestQuestion6.java
-rw-r--r-- 1 1167 Mar  8 18:01 TestQuestion7.class
-rw-r--r-- 1 1065 Feb 21 20:00 TestQuestion7.java
-rw-r--r-- 1 1527 Mar  8 18:01 TestQuestion8.class
-rw-r--r-- 1 1192 Feb 21 20:00 TestQuestion8.java
-rw-r--r-- 1 2130 Mar  8 18:01 TestQuestion9.class
-rw-r--r-- 1 1771 Feb 21 20:00 TestQuestion9.java
-rw-r--r-- 1  374 Feb 21 19:54 TestSuite.java

La compilation s'est bien passée, vous gagnez 100 point.

Voici ma classe de test TestQuestion9

Voici donc votre réponse:

   1 package pobj.partiel2014nov.tests;
   2 import java.util.ArrayList;
   3 import java.util.List;
   4 
   5 import static org.fw4ex.junit.Assert.*;
   6 //import static org.junit.Assert.*;
   7 import org.junit.*;
   8 
   9 import pobj.partiel2014nov.Clavier;
  10 import pobj.partiel2014nov.DicoCompte;
  11 import pobj.partiel2014nov.EnvFactory;
  12 import pobj.partiel2014nov.IEnv;
  13 import pobj.partiel2014nov.INoeud;
  14 import pobj.partiel2014nov.MauvaiseTouche;
  15 
  16 
  17 public class TestQuestion9 {
  18 
  19         @Test
  20         public void test1() {
  21                 IEnv env = EnvFactory.creerEnv();
  22                 Clavier cv = new Clavier(env);
  23                 List nil = new ArrayList();
  24 
  25                 DicoCompte d7 = new DicoCompte(nil);
  26                 d7.ajoute("BRUNE");
  27                 d7.ajoute("BRUN");
  28                 d7.ajoute("LION");
  29                 d7.ajoute("LUNE");
  30                 d7.ajoute("PION");
  31                 d7.ajoute("PRUNE");
  32                 List il8=new ArrayList();
  33                 try {
  34                         il8 = cv.uneTouche(d7.getDico(),7);
  35                 } catch (MauvaiseTouche e) {
  36                         assertTrue(false);
  37                 }
  38                 DicoCompte d8 = new DicoCompte(il8); 
  39                 System.out.println("===+>" + d8.nombreNoeud());
  40                 System.out.println("===+>" + d8.nombreMot());
  41                 assertTrue(d8.nombreMot() == 2);
  42                 assertTrue(d8.nombreMot() == 2);
  43                 assertTrue(d8.nombreNoeud() == 8);
  44         }
  45 
  46         @Test
  47         public void test2() {
  48                 IEnv env = EnvFactory.creerEnv();
  49                 Clavier cv = new Clavier(env);
  50                 List nil = new ArrayList();
  51 
  52                 DicoCompte d7 = new DicoCompte(nil);
  53                 d7.ajoute("BRUNE");
  54                 d7.ajoute("BRUN");
  55                 d7.ajoute("LION");
  56                 d7.ajoute("LUNE");
  57                 d7.ajoute("PION");
  58                 d7.ajoute("PRUNE");
  59 
  60 
  61                 int[] touches = {7, 4, 6}; 
  62                 List il9= new ArrayList()

;
  63                 try {
  64                         il9 = cv.seqTouche(d7.getDico(), touches);
  65                 } catch (MauvaiseTouche e) {
  66                         assertTrue(false);
  67                 }
  68                 DicoCompte  d9 = new DicoCompte(il9);
  69                 assertTrue(d9.nombreNoeud() == 2);
  70                 assertTrue(d9.nombreMot() == 1);
  71 
  72         }
  73 
  74 }
  75 

Je lance JUnit sur ma classe de tests avec

java -cp /home/author01/data:/home/fw4ex/lib/orgFW4EXjunitTest.jar:/home/author01/tests:.  org.fw4ex.junit.ProgressiveTestRun pobj.partiel2014nov.tests.TestQuestion9

Votre commande produit:

FW4EX JUnit version 4.11+qnc2.5
.===+>8
===+>2
.
Time: 0.03

OK (2 tests)

[[[ 5 Assertions testées, 2 Tests, 0 Failures ]]]

L'exécution s'est bien passée, vous gagnez 500 point(s).

calcul des points = nombre d'assertions vraies.