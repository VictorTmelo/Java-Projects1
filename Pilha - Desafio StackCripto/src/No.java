public class No {
	
    private String letter;
    private Pilha element;
    private int position;
    private No address;
    

    public No(String letter) {
        this.letter = letter;
    }

    public No(Pilha element) {
        this.element = element;
    }

    public No(int position) {
        this.position = position;
    }

    public No(Pilha element, int position) {
        this.element = element;
        this.position = position;
    }

    public No() {
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public No getAddress() {
        return address;
    }

    public void setAddress(No address) {
        this.address = address;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Pilha getElement() {
        return element;
    }

    public void setElement(Pilha element) {
        this.element = element;
    }

    public void push(String letter){
        element.push(letter);
    }

    public Boolean isEmpty(){
        return element.isEmpty();
    }

    public void pop(){
        element.pop();
    }

    public No top(){
        return element.top();
    }

    public void print_all(){
        element.print_all();
    }
}
