
public class Main {

    public static void main(String[] args) {

        Tree arvore = new Tree();
        
        Tree arvore2 = new Tree();

        arvore.adicionar(6);
        arvore.adicionar(8);
        arvore.adicionar(2);
        arvore.adicionar(7);
        arvore.adicionar(9);
        arvore.adicionar(1);
        arvore.adicionar(4);
        arvore.adicionar(3);
        arvore.adicionar(5);
        
        
        arvore.preOrdem(arvore.getRaiz());
        
        System.out.println();
        
        arvore.emOrdem(arvore.getRaiz());
        
        System.out.println();
        
        arvore.posOrdem(arvore.getRaiz());
        
        System.out.println();
        
        System.out.println("Proxima arvore");
        
        arvore2.adicionar(7);
        arvore2.adicionar(12);
        arvore2.adicionar(5);
        arvore2.adicionar(2);
        arvore2.adicionar(6);
        arvore2.adicionar(9);
        arvore2.adicionar(21);
        arvore2.adicionar(25);
        arvore2.adicionar(19);
        
        arvore2.remover(12);

        arvore2.preOrdem(arvore2.getRaiz());
        
        System.out.println();
        
        arvore2.emOrdem(arvore2.getRaiz());
        
        System.out.println();
        
        arvore2.posOrdem(arvore2.getRaiz());
        

    }

}
