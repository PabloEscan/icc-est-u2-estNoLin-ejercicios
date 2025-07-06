package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
    //Si el árbol está vacío, se crea un nuevo nodo como raíz
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.getValue()) {
            //El valor es menor entonces se inserta en la izqueirda
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            //El valor es mayor se inserta a la derecha
            root.setRight(insert(root.getRight(), value));
        }
        //Se retorna la raiz
        return root;
    }
}
