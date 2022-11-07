import java.util.Random;

class SpiceMixListNode {
    private Attempt payload;
    private SpiceMixListNode next;
    
    public SpiceMixListNode(Attempt payload, SpiceMixListNode next) {
        this.payload = payload;
        this.next = next;
    }
    public SpiceMixListNode(Attempt payload) {
        this.payload = payload;
        this.next = null;
    }
    public Attempt getPayload() { return payload; }

    public SpiceMixListNode getNext() { return next; }  
    
    public String toString() {
        SpiceMixListNode cur = this;
        String string = "";
        while (cur != null) {
            string += cur.getPayload().toString() + "\n";
            cur = cur.getNext();

        } return string;

    }
}




public class SpiceMixGame {
    SpiceMix solution;
    private SpiceMixListNode head = null;
    private char[] randomSpice = new char[5];
    
    public SpiceMixGame(SpiceMix solution) {
        this.solution = solution;
    }

    public SpiceMixGame() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            char randomCharacter = (char) (random.nextInt(6) + 'N');
            randomSpice[i] = randomCharacter;
        }
        solution = new SpiceMix(randomSpice);
    }
    
    public SpiceMixListNode getPreviousAttempts() { return head; }

    public SpiceMix getSolution() {return solution; }
    
    public boolean attemptSpiceMix(SpiceMix spiceMix) {
        Attempt varriable = new Attempt(spiceMix, solution);
        SpiceMixListNode Store = new SpiceMixListNode(varriable, head);
        head = Store;
        if (varriable.isCorrect() == true) {
            return true;
        }
        else {
            return false;
        }
    }
}

