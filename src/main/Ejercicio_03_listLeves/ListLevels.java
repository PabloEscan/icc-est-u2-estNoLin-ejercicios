package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> resultado = new ArrayList<>();
        if (root == null) return resultado;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int nivelSize = queue.size();
            List<Node> nivelActual = new LinkedList<>();

            for (int i = 0; i < nivelSize; i++) {
                Node actual = queue.poll();
                nivelActual.add(actual);

                if (actual.getLeft() != null) queue.add(actual.getLeft());
                if (actual.getRight() != null) queue.add(actual.getRight());
            }

            resultado.add(nivelActual);
        }

        return resultado;
    }
}
