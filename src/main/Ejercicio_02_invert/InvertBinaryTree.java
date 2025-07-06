package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        //Si la raiz esta vacia, entonces el arbol esta vacio
        if (root == null) {
            return null;
        }

        /*Aqui usamos un  nodo temporal para poder guardar el nodo 
        * izquierdo y al nod izquierdo se remplazap por el derecho
        * asi luego sentamos el nodo derecho por el temporal (izquierdo )
        */
        
        Node temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        //Llamamos el metodo de nuevo para ajustar los hijos
        invertTree(root.getLeft());
        invertTree(root.getRight());

        return root;
    }
}
