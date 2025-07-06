package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node root){
        //Si la raiz esta vacia entonce la altura sera 0 al no contener nada
        if(root == null){
            return 0;
        }

        // Calcular la profundidad de los subárboles izquierdo y derecho
        int porfundidadIzq = maxDepth(root.getLeft());
        int porfundidadDer = maxDepth(root.getRight());
        return Math.max(porfundidadIzq, porfundidadDer) +1;
    }
}
