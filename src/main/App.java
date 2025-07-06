package main;

import utils.StudentValidator;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        //Instancias
        InsertBST iB = new InsertBST();
        InvertBinaryTree iBT = new InvertBinaryTree();
        ListLevels lL = new ListLevels();
        Depth dE = new Depth();

        //Primer ejercicio
        Node BST = null;
        int[] values = { 5, 3, 7, 2, 4, 6, 8 };
        for (int value : values) {
            BST = iB.insert(BST, value);
        }

        System.out.println("Árbol BST por niveles:");
        printByLevels(BST);

        //Segundo ejercicio
        Node rootInvertir = new Node(4);
        rootInvertir.setLeft(new Node(2));
        rootInvertir.setRight(new Node(7));
        rootInvertir.getLeft().setLeft(new Node(1));
        rootInvertir.getLeft().setRight(new Node(3));
        rootInvertir.getRight().setLeft(new Node(6));
        rootInvertir.getRight().setRight(new Node(9));
        System.out.println("Árbol binario antes de invertir:");
        printByLevels(rootInvertir);
        System.out.println("Árbol binario despues de invertir:");
        iBT.invertTree(rootInvertir);
        printByLevels(rootInvertir);

        //Tercer ejercicio
        Node rootListarNiveles = new Node(4);
        rootListarNiveles.setLeft(new Node(2));
        rootListarNiveles.setRight(new Node(7));
        rootListarNiveles.getLeft().setLeft(new Node(1));
        rootListarNiveles.getLeft().setRight(new Node(3));
        rootListarNiveles.getRight().setLeft(new Node(6));
        rootListarNiveles.getRight().setRight(new Node(9));
        System.out.println("Arbol Binario antes de listar");
        printByLevels(rootListarNiveles);
        System.out.println("Arbol Binario despues de listar");
        List<List<Node>> niveles =lL.listLevels(rootListarNiveles);
        printWithArrows(niveles);

        //Cuarto ejercicio
        Node rootProfundidad = new Node(4);
        rootProfundidad.setLeft(new Node(2));
        rootProfundidad.setRight(new Node(7));
        rootProfundidad.getLeft().setLeft(new Node(1));
        rootProfundidad.getLeft().setRight(new Node(3));
        rootProfundidad.getLeft().getLeft().setLeft(new Node(8));
        System.out.println("Arbol Binario");
        printByLevels(rootProfundidad);
        int profudnidad = dE.maxDepth(rootProfundidad);
        System.out.println("Porfundidad de arbol: "+ profudnidad);
    }

    public static void printByLevels(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                System.out.print(current.getValue() + " ");

                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }
            System.out.println();
        }
    }

    public static void printWithArrows(List<List<Node>> niveles) {
        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

}
