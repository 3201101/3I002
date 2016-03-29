
# 3I002 - TP 08

_Sources fournies dans le fichier **pobj.algogen-LOGLISCI-NASTURAS-08.jar** ci-joint, ou dans **[le dépôt](http://github.com/3201101/3I002/tree/master/Devoirs/08)**._


## Questions

**Copiez-collez le code de votre opération add de MyArrayList et le code de vos opérations next() et hasNext() dans l’itérateur.**

    public boolean add(T object){
        if(list.getLast().size() >= taille){
            list.addLast(new Vector<T>(taille));
        }
        return list.getLast().add(object);
    }

    @Override
    public boolean hasNext() {
        return listIT.hasNext() || vectorIT.hasNext();
    }

    @Override
    public T next() {
        if(vectorIT.hasNext())
            return vectorIT.next();
        else if(listIT.hasNext()){
            vectorIT = listIT.next().iterator();
            return vectorIT.next();
        }
        else
            throw new NoSuchElementException();
    }

**Donnez les résultats de votre étude de performance de vos deux implémentations de la population.**

    $> java MyArrayTest
    temps écoulé : 80 millisecondes
    temps écoulé : 17 millisecondes

On constate que l'implémentation fournie par ArrayList est largement mieux optimisée que notre MyArrayList.