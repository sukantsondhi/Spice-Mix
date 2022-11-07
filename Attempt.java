public class Attempt {
    private SpiceMix suggestion;
    private SpiceMix solution;

    public Attempt(SpiceMix suggestion, SpiceMix solution) {
        this.suggestion = suggestion;
        this.solution = solution;
    }

    public SpiceMix getSpiceMix() { return this.suggestion;}

    public int getQyt(char spice, SpiceMix spiceMix) {
        int Qty = 0;
        for (int i = 0; i < 5; i++) {
            if (spiceMix.getSpice(i) == spice) {
                Qty += i;
                Qty += 1;
            }
        }

        return Qty;
    }

    public int getNumGood() {
        int numofGood = 0;
        String Checked = "";
        for (int i = 0; i < 5; i++) {
            char spice = this.solution.getSpice(i);
            if (Checked.indexOf(spice) != -1) {
                continue;
            }
            
            int sugQty1 = this.getQyt(spice, this.suggestion);
            int solQty1 = this.getQyt(spice, this.solution);
            
            if (sugQty1 == solQty1) {
                numofGood++;
            }

            Checked += spice;
        }

        return numofGood;
        
    }

    public int getNumWrongQuantity() {
        int numofWrong = 0;
        String Checked = "";

        for (int i = 0; i < 5; i++) {
            char spice = this.solution.getSpice(i);
            if (Checked.indexOf(spice) != -1) {
                continue;
            }
            
            int sugQty2 = this.getQyt(spice, this.suggestion);
            int solQty2 = this.getQyt(spice, this.solution);
            
            if ((sugQty2 != solQty2) && (solQty2 > 0) && (sugQty2 > 0)) {
                numofWrong++;
            }

            Checked += spice;
        }

        return numofWrong;

    }

    public boolean isCorrect() {
        int Unique = 0; 
        
        String Checked = "";
        for (int i = 0; i < 5; i++) {
            char spice = this.solution.getSpice(i);

            if (Checked.indexOf(spice) == -1) {
                Unique++;
                Checked += spice;
            }
        }

        return this.getNumGood() == Unique;
    }

    public String toString() {
        return this.suggestion + " (Good " + this.getNumGood() + ", Wrong quantity " + this.getNumWrongQuantity() + ")";

    }
}
