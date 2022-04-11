package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaencadeada = new ListaDuplamenteEncadeada<>();

        minhaListaencadeada.add("c1");
        minhaListaencadeada.add("c2");
        minhaListaencadeada.add("c3");
        minhaListaencadeada.add("c4");
        minhaListaencadeada.add("c5");
        minhaListaencadeada.add("c6");
        minhaListaencadeada.add("c7");

        System.out.println(minhaListaencadeada);

        minhaListaencadeada.remove(3);
        minhaListaencadeada.add(3, "77");

        System.out.println(minhaListaencadeada);
        System.out.println(minhaListaencadeada.get(3));

    }
}
