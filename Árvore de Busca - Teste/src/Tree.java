
public class Tree {

    private No raiz;
    private int quantidade;

    public Tree() {

        raiz = null;

        quantidade = 0;

    }



    public void adicionar(int n) {

        if(raiz == null) {

            raiz = new No(n);

        }else {

            raiz.add(n);


        }



    }



    public void preOrdem(No n) {

        System.out.print(" " + n.getNum());

        if(n.getFilho1() != null){

            preOrdem(n.getFilho1());

        }

        if(n.getFilho2() != null){

            preOrdem(n.getFilho2());

        }


    }


    public void emOrdem(No n) {

        if(n.getFilho1() != null){

            emOrdem(n.getFilho1());

        }

        System.out.print(" " + n.getNum());

        if(n.getFilho2() != null){

            emOrdem(n.getFilho2());

        }


    }


    public void posOrdem(No n) {

        if(n.getFilho1() != null){

            posOrdem(n.getFilho1());

        }

        if(n.getFilho2() != null){

            posOrdem(n.getFilho2());

        }

        System.out.print(" " + n.getNum());

    }


    

    public No getRaiz() {
        return raiz;
    }



    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}
